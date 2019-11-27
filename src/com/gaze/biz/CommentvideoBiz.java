package com.gaze.biz;

import java.util.List;

import com.gaze.entity.Commentvideo;

/**
 * 视频评论——业务逻辑层接口
 *@ClassName: CommentvideoBiz
 *@Description: TODO
 *@author 夏远新
 *@data 2019年11月24日 下午8:45:00
 */
public interface CommentvideoBiz {
	
	//查看所有评论
	public List<Commentvideo> findAllCommentvideos(Integer videoId);
	
	//添加评论
	public int addCommentvideo(Commentvideo commentvideo);

}
