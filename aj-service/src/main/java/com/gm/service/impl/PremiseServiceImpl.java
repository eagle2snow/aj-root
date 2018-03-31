package com.gm.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gm.base.dao.IPremiseDao;
import com.gm.base.model.Premise;
import com.gm.service.IPremiseService;
import com.gm.base.dao.IBaseDao;
import com.gm.service.impl.BaseServiceImpl;

@Transactional
@Service("premiseSercive")
public class PremiseServiceImpl extends BaseServiceImpl<Premise, Integer> implements IPremiseService {
	@Resource
	private IPremiseDao dao;

	@Override
	public IBaseDao<Premise, Integer> getDao() {
		return dao;
	}
}