package com.gm.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gm.base.dao.IAdvDao;
import com.gm.base.model.Adv;
import com.gm.service.IAdvService;
import com.gm.base.dao.IBaseDao;
import com.gm.service.impl.BaseServiceImpl;

@Transactional
@Service("advSercive")
public class AdvServiceImpl extends BaseServiceImpl<Adv, Integer> implements IAdvService {
	@Resource
	private IAdvDao dao;

	@Override
	public IBaseDao<Adv, Integer> getDao() {
		return dao;
	}
}