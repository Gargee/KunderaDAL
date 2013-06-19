package com.expedia.lux.content.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/*CREATE TABLE "ChangeRequest" ( "ChangeRequestID" uuid, "ChangeStatusID" int, "ChangeRequestCreateDateTime" timestamp, 
 * "ChangeRequestUpdateDateTime" timestamp, "SubmissionID" uuid, "SubmissionDateTime" timestamp, "SKUGroupID" int, 
 * "CreateUser" varchar, "UpdateUser" varchar, "PhotoID" int, PRIMARY KEY("ChangeRequestID", "SubmissionID", "PhotoID") );
 */
@Entity
@Table(name = "ChangeRequest", schema = "KunderaExamples@cassandra_pu")
public class ChangeRequest {
	@EmbeddedId
	private ChangeRequestCompoundKey crcc;
	@Column
	private int ChangeStatusID;
	@Column
	private Date ChangeRequestCreateDateTime;
	@Column
	private Date ChangeRequestUpdateDateTime;
	@Column
	private Date SubmissionDateTime;
	@Column
	private int SKUGroupID;
	@Column
	private String CreateUser;
	@Column
	private String UpdateUser;
	public ChangeRequestCompoundKey getCrcc() {
		return crcc;
	}
	public void setCrcc(ChangeRequestCompoundKey crcc) {
		this.crcc = crcc;
	}
	public int getChangeStatusID() {
		return ChangeStatusID;
	}
	public void setChangeStatusID(int changeStatusID) {
		ChangeStatusID = changeStatusID;
	}
	public Date getChangeRequestCreateDateTime() {
		return ChangeRequestCreateDateTime;
	}
	public void setChangeRequestCreateDateTime(Date changeRequestCreateDateTime) {
		ChangeRequestCreateDateTime = changeRequestCreateDateTime;
	}
	public Date getChangeRequestUpdateDateTime() {
		return ChangeRequestUpdateDateTime;
	}
	public void setChangeRequestUpdateDateTime(Date changeRequestUpdateDateTime) {
		ChangeRequestUpdateDateTime = changeRequestUpdateDateTime;
	}
	public Date getSubmissionDateTime() {
		return SubmissionDateTime;
	}
	public void setSubmissionDateTime(Date submissionDateTime) {
		SubmissionDateTime = submissionDateTime;
	}
	public int getSKUGroupID() {
		return SKUGroupID;
	}
	public void setSKUGroupID(int sKUGroupID) {
		SKUGroupID = sKUGroupID;
	}
	public String getCreateUser() {
		return CreateUser;
	}
	public void setCreateUser(String createUser) {
		CreateUser = createUser;
	}
	public String getUpdateUser() {
		return UpdateUser;
	}
	public void setUpdateUser(String updateUser) {
		UpdateUser = updateUser;
	}
	public ChangeRequest(ChangeRequestCompoundKey crcc, int changeStatusID,
			Date changeRequestCreateDateTime, Date changeRequestUpdateDateTime,
			Date submissionDateTime, int sKUGroupID, String createUser,
			String updateUser) {
		
		this.crcc = crcc;
		ChangeStatusID = changeStatusID;
		ChangeRequestCreateDateTime = changeRequestCreateDateTime;
		ChangeRequestUpdateDateTime = changeRequestUpdateDateTime;
		SubmissionDateTime = submissionDateTime;
		SKUGroupID = sKUGroupID;
		CreateUser = createUser;
		UpdateUser = updateUser;
	}
	public ChangeRequest() {
	
	}
	
	
	

}
