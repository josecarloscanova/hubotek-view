package org.hubotek.view.cse;

import java.util.Date;

import javax.enterprise.context.Dependent;
import javax.inject.Named;

import org.hubotek.view.View;

@Named
@Dependent
public class GoogleCustomSearchEngineKey implements View{

	private Long id;
	
	private String key;
	
	private Date dateCreated;
	
	public GoogleCustomSearchEngineKey(){}
	

	public GoogleCustomSearchEngineKey(Long id, String key, Date dateCreated) {
		super();
		this.id = id;
		this.key = key;
		this.dateCreated = dateCreated;
	}


	@Override
	public View get() {
		return this;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getKey() {
		return key;
	}


	public void setKey(String key) {
		this.key = key;
	}


	public Date getDateCreated() {
		return dateCreated;
	}


	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}
	
	
}
