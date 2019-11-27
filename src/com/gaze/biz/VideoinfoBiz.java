package com.gaze.biz;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gaze.entity.Videoinfo;

/**
 * 视频详情——业务逻辑层接口
 *@ClassName: VideoinfoBiz
 *@Description: TODO
 *@author 夏远新
 *@data 2019年11月24日 下午4:18:21
 */
public interface VideoinfoBiz {
	
		//查询视频详情表全部信息
		public List<Videoinfo> findAllVideoinfo(Integer videoId);

		//查询视频路径
		public String findByvideoPath(Integer vidInfold);
		
		//修改当前视频完成度
		public int updateBycompleteTime(Double completeTime,Integer uid,Integer vidInfold);
}
