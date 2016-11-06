package org.hubotek.view.search.history;


public class HistoryDocumentItem {

	private Long id;
	private String title; 
	private String link; 
	private String category;
	private String pubDate;
	private String description;
	
	public HistoryDocumentItem(){}
	
	public HistoryDocumentItem(Long id, String title, String link, 
			String category, String pubDate, String description) {
		super();
		this.id = id;
		this.title = title;
		this.link = link;
		this.category = category;
		this.pubDate = pubDate;
		this.description = description;
	}
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getPubDate() {
		return pubDate;
	}
	public void setPubDate(String pubDate) {
		this.pubDate = pubDate;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}
