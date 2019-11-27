package com.gaze.controller;


import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.alibaba.fastjson.JSON;
import com.gaze.biz.CommentvideoBiz;
import com.gaze.entity.Commentvideo;

/**
 * 视频评论——业务处理层
 *@ClassName: CommentvideoController
 *@Description: TODO
 *@author 夏远新
 *@data 2019年11月24日 下午8:51:39
 */
@Controller
public class CommentvideoController {
	
	//调用业务逻辑层接口
	@Autowired
	private CommentvideoBiz commentvideoBiz;
	
	//查询全部视频评论信息
	@RequestMapping("/findAllCommentvideo")
	@ResponseBody
	public String  findALLComment(Integer videoId){
		List<Commentvideo> list = commentvideoBiz.findAllCommentvideos(videoId);
		
		String json = JSON.toJSONString(list);
		
		return json;
	}
	
	//添加评论
	@RequestMapping("/addCommentvideo")
	@ResponseBody
	public String addCommentvideo(String content,int uid,int vid) {
		
		
		//将信息传入对象中
		Commentvideo commentvideo = new Commentvideo();
		commentvideo.setContent(content);
		commentvideo.setVid(vid);
		commentvideo.setUid(uid);
		commentvideo.setCommentTime(new Date());
	
		int count = commentvideoBiz.addCommentvideo(commentvideo);
		
		System.out.println(count);
		String message="";
		 if(count>0) {
		    	message="{\"msg\":\"true\"}" ;
		    }else {
				message="{\"msg\":\"false\"}";
			}
		
		return message;
	}
}
