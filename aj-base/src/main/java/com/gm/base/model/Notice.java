package com.gm.base.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.gm.gencode.annotation.M;

/**
 * 公告
 * 
 * @author ying
 *
 */
@Entity(name = "notice")
@Table(name = "aj_notice")
@M("公告")
public class Notice extends Model {

}
