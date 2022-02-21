package com.technicalinterview.instagramclone.Entity;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="Comment")
public class Comment {
	
	@Id
	@GeneratedValue
	private int id;
	
	
	private String commentId;
	private String userId;
	private String postId;
	private Timestamp timestamp;
	private String comment;
	private String userName;
	public Comment(int id, String commentId, String userId, String postId, Timestamp timestamp, String comment,
			String userName) {
		super();
		this.id = id;
		this.commentId = commentId;
		this.userId = userId;
		this.postId = postId;
		this.timestamp = timestamp;
		this.comment = comment;
		this.userName = userName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getCommentId() {
		return commentId;
	}
	public void setCommentId(String commentId) {
		this.commentId = commentId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPostId() {
		return postId;
	}
	public void setPostId(String postId) {
		this.postId = postId;
	}
	public Timestamp getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public Comment(int id, String commentId, String userId, String postId, Timestamp timestamp, String comment) {
		super();
		this.id = id;
		this.commentId = commentId;
		this.userId = userId;
		this.postId = postId;
		this.timestamp = timestamp;
		this.comment = comment;
	}
	public Comment() {
		super();
		// TODO Auto-generated constructor stub
	}

}
