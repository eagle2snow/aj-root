package com.gm.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gm.base.dao.ITenementDao;
import com.gm.base.model.Tenement;
import com.gm.service.ITenementService;
import com.gm.base.dao.IBaseDao;
import com.gm.service.impl.BaseServiceImpl;

@Transactional
@Service("tenementSercive")
public class TenementServiceImpl extends BaseServiceImpl<Tenement, Integer> implements ITenementService {
	@Resource
	private ITenementDao dao;

	@Override
	public IBaseDao<Tenement, Integer> getDao() {
		return dao;
	}
}