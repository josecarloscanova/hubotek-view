package org.hubotek.view.search.history;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.inject.Inject;

@ManagedBean
@RequestScoped
public class SearchHistory {

	@Inject
	private SearchDocument searchDocument;

	public SearchHistory(){}
	
	@PostConstruct
	public void prepare(){
	}

	public SearchDocument getSearchDocument() {
		return searchDocument;
	}

	public void setSearchDocument(SearchDocument searchDocument) {
		this.searchDocument = searchDocument;
	}
	
}
