package com.gaze.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.gaze.biz.VideoinfoBiz;
import com.gaze.entity.Videoinfo;

/**
 * 视频详情信息——业务处理层
 *@ClassName: VideoinfoController
 *@Description: TODO
 *@author 夏远新
 *@data 2019年11月24日 下午5:26:26
 */
@Controller
public class VideoinfoController {
	
		//调用视频详情信息业务逻辑层
		@Autowired
		private VideoinfoBiz videoinfoBiz;
		
		//查看视频详情表全部信息并向前台发送所有数据
		@RequestMapping("/findAllVideoInfo")
		@ResponseBody//使用json传参
		public String FindAllVideoInfo(Integer videoId) {
			List<Videoinfo> list = videoinfoBiz.findAllVideoinfo(videoId);
			String json = JSON.toJSONString(list);
			return json;
		}

		//查看当前视频信息路径
		@RequestMapping("/findByPath")
		@ResponseBody
		public String findByvidInfoId(Integer vidInfold) {
			String  path = videoinfoBiz.findByvideoPath(vidInfold);
			String json =JSON.toJSONString(path);
			return json;
		}
		
		
		//修改当前视频完成度
		@RequestMapping("/updateBycomleteTime")
		@ResponseBody
		public String updateBycompleteTime(Double completeTime, Integer uid, Integer vidInfold) {
			int counts = videoinfoBiz.updateBycompleteTime(completeTime, uid, vidInfold);
			String json = JSON.toJSONString(counts);
			return json;
		}
}
