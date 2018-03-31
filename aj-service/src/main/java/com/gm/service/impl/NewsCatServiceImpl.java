package com.gm.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gm.base.dao.INewsCatDao;
import com.gm.base.model.NewsCat;
import com.gm.service.INewsCatService;
import com.gm.base.dao.IBaseDao;
import com.gm.service.impl.BaseServiceImpl;

@Transactional
@Service("newsCatSercive")
public class NewsCatServiceImpl extends BaseServiceImpl<NewsCat, Integer> implements INewsCatService {
	@Resource
	private INewsCatDao dao;

	@Override
	public IBaseDao<NewsCat, Integer> getDao() {
		return dao;
	}
}