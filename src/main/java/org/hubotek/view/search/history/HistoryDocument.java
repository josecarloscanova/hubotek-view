package org.hubotek.view.search.history;

import javax.persistence.Column;

import org.hubotek.view.BaseView;


/** 
 * 
 * @author JoseCanova
 *
 */
@SuppressWarnings("serial")
public class HistoryDocument extends BaseView<HistoryDocument>{

	private Long id;
	
	//LegacyDocumentType
	private String legacyDocumentyType;
	
	@Column(name="title" , length=255 , insertable=true , updatable=false)
	private String title;
	private String link;
	private String language; 
	private String webMaster; 
	private String copyright;
	private String pubDate; 
	private String lastBuildDate; 
	
	
	public HistoryDocument(Long id, String legacyDocumentyType, String title,
			String link, String language, String webMaster, String copyright,
			String pubDate, String lastBuildDate) {
		super();
		this.id = id;
		this.legacyDocumentyType = legacyDocumentyType;
		this.title = title;
		this.link = link;
		this.language = language;
		this.webMaster = webMaster;
		this.copyright = copyright;
		this.pubDate = pubDate;
		this.lastBuildDate = lastBuildDate;
	}

	public String getLegacyDocumentyType() {
		return legacyDocumentyType;
	}

	public void setLegacyDocumentyType(String legacyDocumentyType) {
		this.legacyDocumentyType = legacyDocumentyType;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public HistoryDocument(){}
	
	@Override
	public HistoryDocument get() {
		return this;
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

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getWebMaster() {
		return webMaster;
	}

	public void setWebMaster(String webMaster) {
		this.webMaster = webMaster;
	}

	public String getCopyright() {
		return copyright;
	}

	public void setCopyright(String copyright) {
		this.copyright = copyright;
	}

	public String getPubDate() {
		return pubDate;
	}

	public void setPubDate(String pubDate) {
		this.pubDate = pubDate;
	}

	public String getLastBuildDate() {
		return lastBuildDate;
	}

	public void setLastBuildDate(String lastBuildDate) {
		this.lastBuildDate = lastBuildDate;
	}

}
