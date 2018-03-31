package com.gm.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gm.base.dao.IVillaDao;
import com.gm.base.model.Villa;
import com.gm.service.IVillaService;
import com.gm.base.dao.IBaseDao;
import com.gm.service.impl.BaseServiceImpl;

@Transactional
@Service("villaSercive")
public class VillaServiceImpl extends BaseServiceImpl<Villa, Integer> implements IVillaService {
	@Resource
	private IVillaDao dao;

	@Override
	public IBaseDao<Villa, Integer> getDao() {
		return dao;
	}
}