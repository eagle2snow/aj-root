package com.gm.base.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.gm.base.model.sys.User;
import com.gm.gencode.annotation.FormField;
import com.gm.gencode.annotation.M;
import com.gm.gencode.util.DataNature;
import com.gm.gencode.util.FieldType;

/**
 * 楼盘动态
 * 
 * @author ying
 *
 */
@M("楼盘动态")
@Entity(name = "premiseNews")
@Table(name = "aj_premiseNews")
public class PremiseNews extends Model {
	@FormField(type = FieldType.SELECT, dataNature = DataNature.MODEL, ds = Premise.class, label = "所属楼盘")
	private Premise premise;
	private User user;

	@ManyToOne
	public Premise getPremise() {
		return premise;
	}

	public void setPremise(Premise premise) {
		this.premise = premise;
	}

	@ManyToOne
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}
