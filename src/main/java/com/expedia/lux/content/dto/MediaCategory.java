package com.expedia.lux.content.dto;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/*
*CREATE TABLE "MediaCategory" (MCategoryID int,LangID int,PhotoRankID int,VirtualTourID int, SubMCategoryName varchar, PRIMARY KEY(MCategoryID,LangID, PhotoRankID, VirtualTourID));
 *
 **/



@Entity
@Table(name = "MediaCategory", schema = "KunderaExamples@cassandra_pu")
public class MediaCategory {
	@Column
	private String submcategoryname;
	public String getsubmcategoryname() {
		return submcategoryname;
	}
	@EmbeddedId
	private MediaCategoryCompoundKey key;

	public MediaCategoryCompoundKey getKey() {
		return key;
	}
	public void setKey(MediaCategoryCompoundKey key) {
		this.key = key;
	}
	
	@ManyToOne(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinColumn(name="mcategoryid")
	private MediaCategoryGroup mcg;
	
	public void setSubmcategoryname(String submcategoryname) {
		this.submcategoryname = submcategoryname;
	}
	public MediaCategoryGroup getMcg() {
		return mcg;
	}
	public void setMcg(MediaCategoryGroup mcg) {
		this.mcg = mcg;
	}
	public MediaCategory(MediaCategoryCompoundKey key, String submcategoryname) {
		super();
		this.key = key;
		this.submcategoryname = submcategoryname;
	}
	public MediaCategory() {
		super();
	}
	@Override
	public String toString() {
		return "MediaCategory [key=" + key + ", submcategoryname="
				+ submcategoryname + "]";
	}
	
	
	
	
}
