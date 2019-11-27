package com.gaze.biz.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gaze.biz.VideoBiz;
import com.gaze.biz.VideoinfoBiz;
import com.gaze.dao.VideoinfoDao;
import com.gaze.entity.Video;
import com.gaze.entity.Videoinfo;

/**
 * 视频详情信息——业务逻辑层实现类
 *@ClassName: VideoinfoBizImpl
 *@Description: TODO
 *@author 夏远新
 *@data 2019年11月24日 下午4:21:08
 */
@Service
public class VideoinfoBizImpl implements VideoinfoBiz {
	
	//调用数据访问层接口
	@Autowired
	private VideoinfoDao videoinfoDao;

	//查询全部视频详情信息
	@Override
	public List<Videoinfo> findAllVideoinfo(Integer videoId) {
		return videoinfoDao.findAllVideoinfo(videoId);
	}
	
	//查询当前视频信息路径
	@Override
	public String findByvideoPath(Integer vidInfold) {
		
		return videoinfoDao.findByvideoPath(vidInfold);
	}
	
	//修改当前视频完成度
	@Override
	public int updateBycompleteTime(Double completeTime, Integer uid, Integer vidInfold) {
		
		return videoinfoDao.updateBycompleteTime(completeTime, uid, vidInfold);
	}

	

}
