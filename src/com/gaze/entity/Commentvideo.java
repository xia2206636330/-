package com.gaze.entity;

import java.util.Date;

/**
 * 视频评论表——实体类
 *@ClassName: Commentvideo
 *@Description: TODO
 *@author 夏远新
 *@data 2019年11月24日 下午3:03:59
 */
public class Commentvideo {
	
	//视频评论id
	private Integer commentId;
	//评论内容
	private String content;
	//用户id
	private Integer uid;
	//班级视频id
	private Integer vid;
	//评论时间
	private Date  commentTime;
	//映射用户表
	private User user;
	//评论数
	/*private Integer commentNum;*/
	

	
	
	/*public Integer getCommentNum() {
		return commentNum;
	}
	public void setCommentNum(Integer commentNum) {
		this.commentNum = commentNum;
	}*/
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Integer getCommentId() {
		return commentId;
	}
	public void setCommentId(Integer commentId) {
		this.commentId = commentId;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public Integer getVid() {
		return vid;
	}
	public void setVid(Integer vid) {
		this.vid = vid;
	}
	public Date getCommentTime() {
		return commentTime;
	}
	public void setCommentTime(Date commentTime) {
		this.commentTime = commentTime;
	}
	
	
}
