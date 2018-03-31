package com.gm.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gm.base.dao.ICommentDao;
import com.gm.base.model.Comment;
import com.gm.service.ICommentService;
import com.gm.base.dao.IBaseDao;
import com.gm.service.impl.BaseServiceImpl;

@Transactional
@Service("commentSercive")
public class CommentServiceImpl extends BaseServiceImpl<Comment, Integer> implements ICommentService {
	@Resource
	private ICommentDao dao;

	@Override
	public IBaseDao<Comment, Integer> getDao() {
		return dao;
	}
}