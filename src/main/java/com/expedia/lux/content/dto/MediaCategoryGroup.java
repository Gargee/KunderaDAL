package com.expedia.lux.content.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
/*
*CREATE TABLE "MediaCategoryGroup" (MCategoryID int, MCategoryName varchar, PRIMARY KEY(MCategoryID));
* * */


@Entity
@Table(name = "MediaCategoryGroup", schema = "KunderaExamples@cassandra_pu")
public class MediaCategoryGroup {

	@Id
	private int mcategoryid;
	@Column(name = "mcategoryname")
	private String mcategoryname;
	public MediaCategoryGroup() {

	}

	public MediaCategoryGroup(int mcategoryid, String mcategoryname) {
		super();
		this.mcategoryid = mcategoryid;
		this.mcategoryname = mcategoryname;
	}

	public int getmcategoryid() {
		return mcategoryid;
	}

	public void setmcategoryid(int mcategoryid) {
		this.mcategoryid = mcategoryid;
	}

	public String getmcategoryname() {
		return mcategoryname;
	}

	public void setmcategoryname(String mcategoryname) {
		this.mcategoryname = mcategoryname;
	}
  
	public String toString() {
		return "User [mcategoryid=" + mcategoryid + ", mcategoryname=" + mcategoryname + "]";
	}

}
