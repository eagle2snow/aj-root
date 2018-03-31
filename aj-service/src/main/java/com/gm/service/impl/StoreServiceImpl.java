package com.gm.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gm.base.dao.IStoreDao;
import com.gm.base.model.Store;
import com.gm.service.IStoreService;
import com.gm.base.dao.IBaseDao;
import com.gm.service.impl.BaseServiceImpl;

@Transactional
@Service("storeSercive")
public class StoreServiceImpl extends BaseServiceImpl<Store, Integer> implements IStoreService {
	@Resource
	private IStoreDao dao;

	@Override
	public IBaseDao<Store, Integer> getDao() {
		return dao;
	}
}