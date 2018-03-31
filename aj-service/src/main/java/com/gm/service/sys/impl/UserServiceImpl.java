package com.gm.service.sys.impl;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.w3c.dom.css.ElementCSSInlineStyle;

import com.gm.base.dao.IBaseDao;
import com.gm.base.dao.sys.IUserDao;
import com.gm.base.model.sys.User;
import com.gm.service.impl.BaseServiceImpl;
import com.gm.service.sys.IUserService;
import com.gm.utils.StringUtil;

@Transactional
@Service("userSercive")
public class UserServiceImpl extends BaseServiceImpl<User, Integer> implements IUserService {

	Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

	@Resource
	private IUserDao dao;

	@Override
	public IBaseDao<User, Integer> getDao() {
		return dao;
	}

	@Override
	public Map<String, Object> login(String username, String password, String imei) {

		Map<String, Object> map = new HashMap<>();
		User u = getOne(
				"from user u where u.deleted=1 and u.username='" + username + " 'and u.password='" + password + "'");
		if (null == u) {
			map.put("s", -1);// 用户名密码不正确
		}

		else if (StringUtil.strNullOrEmpty(u.getImei())) {// 首次登录
			if (exist("imei", imei)) {
				map.put("s", 3);// 设备已被其他账号绑定
			} else {
				update("imei", imei, u.getId());
				map.put("s", 1);// 登录成功
				map.put("userId", u.getId());
				map.put("avatar", u.getAvatar());
			}
		} else if (!imei.equals(u.getImei())) {
			map.put("s", 4);// 账号不在常用设备登录
		}

		else if (u.getEnable() == 2) {
			map.put("s", 0);// 账号已被禁用
		} else if (u.getEnable() == 3) {
			map.put("s", 2);// 账号等待管理员审核
		} else {
			map.put("s", 1);// 登录成功
			map.put("userId", u.getId());
			map.put("avatar", u.getAvatar());
		}
		return map;
	}

	@Override
	public User login(String username, String password) {

		User u = getOne(
				"from user u where u.deleted=1 and u.username='" + username + " 'and u.password='" + password + "'");
		return u;
	}
}