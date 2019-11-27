package com.gaze.entity;

import java.sql.Date;

/**
 * 班级视频表实体类
 *@ClassName: Video
 *@Description: TODO
 *@author 夏远新
 *@data 2019年11月24日 下午2:38:26
 */
public class Video {
	
	//视频班级id
	private Integer videoId;
	//视频名称
	private String videoName;
	//视频类型
	private String videType;
	//发布日期
	private Date createDate;
	//观看次数
	private Integer videoTime;
	//点赞数
	private Integer likeNum;
	//视频所属班级
	private Integer classId;
	//授课老师
	private String videoTeacher;
	//视频展示图片
	private String videoImg;
	//班级视频完成度
	public Double videoSchedule;
	//用户ID
	public Integer uid;
	
	
	
	
	
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public String getVideoImg() {
		return videoImg;
	}
	public void setVideoImg(String videoImg) {
		this.videoImg = videoImg;
	}
	public String getVideoTeacher() {
		return videoTeacher;
	}
	public void setVideoTeacher(String videoTeacher) {
		this.videoTeacher = videoTeacher;
	}
	public Integer getVideoId() {
		return videoId;
	}
	public void setVideoId(Integer videoId) {
		this.videoId = videoId;
	}
	public String getVideoName() {
		return videoName;
	}
	public void setVideoName(String videoName) {
		this.videoName = videoName;
	}
	public String getVideType() {
		return videType;
	}
	public void setVideType(String videType) {
		this.videType = videType;
	}
	public Double getVideoSchedule() {
		return videoSchedule;
	}
	public void setVideoSchedule(Double videoSchedule) {
		this.videoSchedule = videoSchedule;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Integer getVideoTime() {
		return videoTime;
	}
	public void setVideoTime(Integer videoTime) {
		this.videoTime = videoTime;
	}
	public Integer getLikeNum() {
		return likeNum;
	}
	public void setLikeNum(Integer likeNum) {
		this.likeNum = likeNum;
	}
	public Integer getClassId() {
		return classId;
	}
	public void setClassId(Integer classId) {
		this.classId = classId;
	}
	
	
}
