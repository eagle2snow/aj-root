package com.gm.base.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.gm.gencode.annotation.M;

/**
 * 资讯分类
 * 
 * @author ying
 *
 */
@M("资讯分类")
@Entity(name = "newsCat")
@Table(name = "aj_news_cat")
public class NewsCat extends Model {
}
