package com.gaze.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.gaze.biz.VideoBiz;
import com.gaze.biz.VideoinfoBiz;
import com.gaze.entity.Video;
import com.gaze.entity.Videoinfo;

/**
 * 班级视频——逻辑处理层
 *@ClassName: VideoController
 *@Description: TODO
 *@author 夏远新
 *@data 2019年11月24日 下午3:44:49
 */
@Controller
public class VideoController {
	
	//调用班级视频业务逻辑层
	@Autowired
	private VideoBiz videoBiz;
	
	//查看全部班级视频并向前台发送所有数据
	@RequestMapping("/findAllVideo")
	@ResponseBody//使用json传参
	public String findAllVideo() {
		List<Video> list = videoBiz.findAllVideo();
		System.out.println(list);
		String json = JSON.toJSONString(list);
		
		return json;
	}
	
	//搜索视频
	@RequestMapping("/videoSearch")
	@ResponseBody
	public String videoSearch(String videoName) {
		List<Video> list = videoBiz.videoSearch(videoName);
		String json = JSON.toJSONString(list);
		return json ;
	}
	
	//修改观看次数
	@RequestMapping("/updateVideoTime")
	@ResponseBody
	public String updateVideoTime(Integer videoId,Integer videoTime) {
		int count = videoBiz.updateVideoTime(videoId, videoTime);
		String json = JSON.toJSONString(count);
		return json;
	}
	
	//修改班级视频完成度
	@RequestMapping("/updateVideoSchedule")
	@ResponseBody
	public String updateVideoSchedule(Double videoSchedule,Integer uid,Integer videoId) {
		int counts =videoBiz.updateVideoSchedule(videoSchedule, uid, videoId);
		String json = JSON.toJSONString(counts);
		return json;
	}
	

}
