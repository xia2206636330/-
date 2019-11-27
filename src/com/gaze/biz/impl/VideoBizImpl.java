package com.gaze.biz.impl;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gaze.biz.VideoBiz;
import com.gaze.dao.VideoDao;
import com.gaze.entity.Video;

/**
 * 班级视频——业务逻辑层实现类
 *@ClassName: VideoBizImpl
 *@Description: TODO
 *@author 夏远新
 *@data 2019年11月24日 下午3:40:42
 */
@Service
@Transactional
public class VideoBizImpl implements VideoBiz{
	
	//调用数据访问层
	@Autowired
	private VideoDao videoDao;
	
	//查询全部班级视频信息
	@Override
	public List<Video> findAllVideo() {
		
		/*List<Video> list = videoDao.findAllVideo();
		for (Video video : list) {
			Date create = video.getCreateDate();
			System.out.println(create);
		}*/
		
		
		
		return videoDao.findAllVideo();
	}
	
	//搜索视频
	@Override
	public List<Video> videoSearch(String videoName) {
		return videoDao.videoSearch(videoName);
	}
	
	
	//修改观看次数
	@Override
	public int updateVideoTime(Integer videoId, Integer videoTime) {
		
		return videoDao.updateVideoTime(videoId, videoTime);
	}
	
	//修改班级视频完成度
	@Override
	public int updateVideoSchedule(Double videoSchedule, Integer uid, Integer videoId) {
		
		return videoDao.updateVideoSchedule(videoSchedule, uid, videoId);
	}
	
	
	

}
