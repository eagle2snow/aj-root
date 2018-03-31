package com.gm.base.test;

import java.io.IOException;

import com.gm.base.model.AppInfo;
import com.gm.base.model.BizNews;
import com.gm.base.model.Comment;
import com.gm.base.model.PremiseNews;
import com.gm.base.model.VideoNews;
import com.gm.gencode.Build;

import freemarker.template.TemplateException;

public class CreateCode {

	public static void main(String[] args) throws IOException, TemplateException {

		/** ====================================================== **/
		/*
		 * 生成选项 idao,dao,si,is,c,add,update,list ，null则全部生成
		 * ======================================================
		 **/

		// Build.buildCode(Notice.class, "idao,dao,si,is,c,add,update,list");
		// Build.buildCode(News.class, "idao,dao,si,is,c,add,update,list");

		// Build.buildCode(AppInfo.class, "idao,dao,si,is,c,add,update,list");
		Build.buildCode(Comment.class, null);
	}

}
