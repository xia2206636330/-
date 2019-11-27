package com.gaze.dao;

import java.util.List;

import com.gaze.entity.Commentvideo;

/**
 * 视频评论——数据访问层
 *@ClassName: CommentvideoDao
 *@Description: TODO
 *@author 夏远新
 *@data 2019年11月24日 下午8:08:43
 */
public interface CommentvideoDao {
	
	//查看所有评论
	public List<Commentvideo> findAllCommentvideos(Integer videoId);
	
	//添加评论
	public int addCommentvideo(Commentvideo commentvideo);

}
