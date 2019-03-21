package com.itshidu.web.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
@Entity
@Table(name="blog_article")
public class Article {
	

	private long id;
	private String title;
	private User user;
	private Date createTime;
	private long hits;
	private String content;
	private Group group;
	
	
	@ManyToOne
	@JoinColumn(name="group_id")
	@Cascade(CascadeType.SAVE_UPDATE)
	public Group getGroup() {
		return group;
	}



	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public long getId() {
		return id;
	}
	
	@Column(columnDefinition="TEXT")
	public String getContent() {
		return content;
	}
	@ManyToOne
	@JoinColumn(name="user_id")
	@Cascade(CascadeType.SAVE_UPDATE)
	public User getUser() {
		return user;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public void setUser(User user) {
		this.user = user;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public long getHits() {
		return hits;
	}
	public void setHits(long hits) {
		this.hits = hits;
	}
	public void setGroup(Group group) {
		this.group = group;
	}

	public void setContent(String content) {
		this.content = content;
	}
}
