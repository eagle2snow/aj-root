package com.gm.service.sys;

import java.util.Map;

import com.gm.base.model.sys.User;
import com.gm.service.IBaseService;

/**
 * 代码生成器生成代码<br/>
 * IUserService
 * 
 * @author guet
 *
 */
public interface IUserService extends IBaseService<User, Integer> {

	/**
	 * 用户登录
	 * 
	 * @return
	 */
	Map<String, Object> login(String username, String password, String imei);

	User login(String username, String password);

}