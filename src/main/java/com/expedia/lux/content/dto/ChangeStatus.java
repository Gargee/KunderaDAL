package com.expedia.lux.content.dto;

import javax.persistence.Column;
import javax.persistence.Id;

/*
 * CREATE TABLE "ChangeStatus" ( "ChangeStatusID" int, "ChangeStatusName" varchar, PRIMARY KEY("ChangeStatusID") );
*/

public class ChangeStatus {
	@Id
	private int ChangeStatusID;
	@Column
	private String ChangeStatusName;
	public int getChangeStatusID() {
		return ChangeStatusID;
	}
	public void setChangeStatusID(int changeStatusID) {
		ChangeStatusID = changeStatusID;
	}
	public String getChangeStatusName() {
		return ChangeStatusName;
	}
	public void setChangeStatusName(String changeStatusName) {
		ChangeStatusName = changeStatusName;
	}

}
