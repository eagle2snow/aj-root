package com.gm.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gm.base.dao.IVideoNewsDao;
import com.gm.base.model.VideoNews;
import com.gm.service.IVideoNewsService;
import com.gm.base.dao.IBaseDao;
import com.gm.service.impl.BaseServiceImpl;

@Transactional
@Service("videoNewsSercive")
public class VideoNewsServiceImpl extends BaseServiceImpl<VideoNews, Integer> implements IVideoNewsService {
	@Resource
	private IVideoNewsDao dao;

	@Override
	public IBaseDao<VideoNews, Integer> getDao() {
		return dao;
	}
}