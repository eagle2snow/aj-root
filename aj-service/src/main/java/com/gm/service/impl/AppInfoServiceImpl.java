package com.gm.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gm.base.dao.IAppInfoDao;
import com.gm.base.model.AppInfo;
import com.gm.service.IAppInfoService;
import com.gm.base.dao.IBaseDao;
import com.gm.service.impl.BaseServiceImpl;

@Transactional
@Service("appInfoSercive")
public class AppInfoServiceImpl extends BaseServiceImpl<AppInfo, Integer> implements IAppInfoService {
	@Resource
	private IAppInfoDao dao;

	@Override
	public IBaseDao<AppInfo, Integer> getDao() {
		return dao;
	}
}