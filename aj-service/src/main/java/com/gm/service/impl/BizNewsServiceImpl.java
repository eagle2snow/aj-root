package com.gm.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gm.base.dao.IBizNewsDao;
import com.gm.base.model.BizNews;
import com.gm.service.IBizNewsService;
import com.gm.base.dao.IBaseDao;
import com.gm.service.impl.BaseServiceImpl;

@Transactional
@Service("bizNewsSercive")
public class BizNewsServiceImpl extends BaseServiceImpl<BizNews, Integer> implements IBizNewsService {
	@Resource
	private IBizNewsDao dao;

	@Override
	public IBaseDao<BizNews, Integer> getDao() {
		return dao;
	}
}