package com.gm.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gm.base.dao.INewsDao;
import com.gm.base.model.News;
import com.gm.service.INewsService;
import com.gm.base.dao.IBaseDao;
import com.gm.service.impl.BaseServiceImpl;

@Transactional
@Service("newsSercive")
public class NewsServiceImpl extends BaseServiceImpl<News, Integer> implements INewsService {
	@Resource
	private INewsDao dao;

	@Override
	public IBaseDao<News, Integer> getDao() {
		return dao;
	}
}