package com.gm.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gm.base.dao.IAdviserDao;
import com.gm.base.model.Adviser;
import com.gm.service.IAdviserService;
import com.gm.base.dao.IBaseDao;
import com.gm.service.impl.BaseServiceImpl;

@Transactional
@Service("adviserSercive")
public class AdviserServiceImpl extends BaseServiceImpl<Adviser, Integer> implements IAdviserService {
	@Resource
	private IAdviserDao dao;

	@Override
	public IBaseDao<Adviser, Integer> getDao() {
		return dao;
	}
}