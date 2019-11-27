package com.gaze.entity;

/**
 * 视频详情表——实体类
 *@ClassName: Videoinfo
 *@Description: TODO
 *@author 夏远新
 *@data 2019年11月24日 下午2:50:42
 */
public class Videoinfo {
	
	//视频详情id
	private Integer vidInfold;
	//视频名
	private String videoName;
	//视频路径
	private String videoPath;
	//视频类型
	private String videoType;
	//班级视频id
	private Integer videoId;
	//总时长
	private String duration;
	//完成度
	private Double completeTime;
	//用户id
	private Integer uid;
	
	
	
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public Double getCompleteTime() {
		return completeTime;
	}
	public void setCompleteTime(Double completeTime) {
		this.completeTime = completeTime;
	}
	public Integer getVidInfold() {
		return vidInfold;
	}
	public void setVidInfold(Integer vidInfold) {
		this.vidInfold = vidInfold;
	}
	public String getVideoName() {
		return videoName;
	}
	public void setVideoName(String videoName) {
		this.videoName = videoName;
	}
	public String getVideoPath() {
		return videoPath;
	}
	public void setVideoPath(String videoPath) {
		this.videoPath = videoPath;
	}
	public String getVideoType() {
		return videoType;
	}
	public void setVideoType(String videoType) {
		this.videoType = videoType;
	}
	public Integer getVideoId() {
		return videoId;
	}
	public void setVideoId(Integer videoId) {
		this.videoId = videoId;
	}
	
	


}
