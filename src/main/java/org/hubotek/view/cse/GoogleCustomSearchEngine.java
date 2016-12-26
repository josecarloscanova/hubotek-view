package org.hubotek.view.cse;

import java.util.Date;

public class GoogleCustomSearchEngine {

	private String identification;

	private String description;
	
	private Date dateCreated;

	public GoogleCustomSearchEngine() {
		super();
	}


	public GoogleCustomSearchEngine(String identification, String description,
			Date dateCreated) {
		super();
		this.identification = identification;
		this.description = description;
		this.dateCreated = dateCreated;
	}


	public String getIdentification() {
		return identification;
	}


	public void setIdentification(String identification) {
		this.identification = identification;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public Date getDateCreated() {
		return dateCreated;
	}


	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}
	
}
