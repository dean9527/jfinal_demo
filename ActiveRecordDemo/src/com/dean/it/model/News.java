package com.dean.it.model;

import com.jfinal.plugin.activerecord.Model;

@SuppressWarnings("serial")
public class News extends Model<News>{
	public static final News dao = new News().dao();
	private Long id;
	private String title;
	private String content;
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
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
}
