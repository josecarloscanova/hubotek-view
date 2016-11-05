package org.hubotek.view.search.history;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.Dependent;
import javax.inject.Named;

@Dependent
@Named("searchDocuments")
public class SearchDocument {

	private List<HistoryDocument> historyDocuments;
	
	public SearchDocument(){}
	
	@PostConstruct
	public void prepare()
	{
	}
	
	public List<HistoryDocument> getHistoryDocuments() {
		return historyDocuments;
	}

	public void setHistoryDocuments(List<HistoryDocument> historyDocuments) {
		this.historyDocuments = historyDocuments;
	}

}
