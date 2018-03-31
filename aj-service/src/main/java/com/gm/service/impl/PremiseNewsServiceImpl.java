package com.gm.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gm.base.dao.IPremiseNewsDao;
import com.gm.base.model.PremiseNews;
import com.gm.service.IPremiseNewsService;
import com.gm.base.dao.IBaseDao;
import com.gm.service.impl.BaseServiceImpl;

@Transactional
@Service("premiseNewsSercive")
public class PremiseNewsServiceImpl extends BaseServiceImpl<PremiseNews, Integer> implements IPremiseNewsService {
	@Resource
	private IPremiseNewsDao dao;

	@Override
	public IBaseDao<PremiseNews, Integer> getDao() {
		return dao;
	}
}