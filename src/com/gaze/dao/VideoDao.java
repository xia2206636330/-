package com.gaze.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gaze.entity.Video;

/**
 * 班级视频——数据访问层
 *@ClassName: VideoDao
 *@Description: TODO
 *@author 夏远新
 *@data 2019年11月24日 下午3:24:30
 */
public interface VideoDao {
	
	//查询视频表全部信息
	public List<Video> findAllVideo();
	
	//搜索视频
	public List<Video> videoSearch(String videoName);
	
	//查询视频播放页头部信息
	/*public List<Video> findByTitle(Video video);*/
	
	//修改观看次数
	public int updateVideoTime(@Param("videoId")Integer videoId,@Param("videoTime")Integer videoTime);
	
	//修改班级视频完成度
	public int updateVideoSchedule(@Param("videoSchedule")Double videoSchedule,@Param("uid")Integer uid,@Param("videoId")Integer videoId);
}
