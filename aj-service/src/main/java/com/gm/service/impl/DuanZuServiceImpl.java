package com.gm.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gm.base.dao.IDuanZuDao;
import com.gm.base.model.DuanZu;
import com.gm.service.IDuanZuService;
import com.gm.base.dao.IBaseDao;
import com.gm.service.impl.BaseServiceImpl;

@Transactional
@Service("duanZuSercive")
public class DuanZuServiceImpl extends BaseServiceImpl<DuanZu, Integer> implements IDuanZuService {
	@Resource
	private IDuanZuDao dao;

	@Override
	public IBaseDao<DuanZu, Integer> getDao() {
		return dao;
	}
}