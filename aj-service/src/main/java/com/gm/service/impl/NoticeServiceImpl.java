package com.gm.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gm.base.dao.INoticeDao;
import com.gm.base.model.Notice;
import com.gm.service.INoticeService;
import com.gm.base.dao.IBaseDao;
import com.gm.service.impl.BaseServiceImpl;

@Transactional
@Service("noticeSercive")
public class NoticeServiceImpl extends BaseServiceImpl<Notice, Integer> implements INoticeService {
	@Resource
	private INoticeDao dao;

	@Override
	public IBaseDao<Notice, Integer> getDao() {
		return dao;
	}
}