package com.expedia.lux.content.dto;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/*CREATE TABLE "ChangeRequest" ( "ChangeRequestID" uuid, "ChangeStatusID" int, "ChangeRequestCreateDateTime" timestamp, 
 * "ChangeRequestUpdateDateTime" timestamp, "SubmissionID" uuid, "SubmissionDateTime" timestamp, "SKUGroupID" int, 
 * "CreateUser" varchar, "UpdateUser" varchar, "PhotoID" int, PRIMARY KEY("ChangeRequestID", "SubmissionID", "PhotoID") );
 */
@Embeddable
public class ChangeRequestCompoundKey {
	@Column
	private UUID ChangeRequestID;
	@Column
	private UUID SubmissionID;
	@Column
	private int PhotoID;

	public UUID getChangeRequestID() {
		return ChangeRequestID;
	}

	public void setChangeRequestID(UUID changeRequestID) {
		ChangeRequestID = changeRequestID;
	}

	public UUID getSubmissionID() {
		return SubmissionID;
	}

	public void setSubmissionID(UUID submissionID) {
		SubmissionID = submissionID;
	}

	public int getPhotoID() {
		return PhotoID;
	}

	public void setPhotoID(int photoID) {
		PhotoID = photoID;
	}

	public ChangeRequestCompoundKey(UUID changeRequestID, UUID submissionID,
			int photoID) {

		ChangeRequestID = changeRequestID;
		SubmissionID = submissionID;
		PhotoID = photoID;
	}

}
