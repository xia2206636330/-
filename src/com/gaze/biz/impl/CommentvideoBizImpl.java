package com.gaze.biz.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gaze.biz.CommentvideoBiz;
import com.gaze.dao.CommentvideoDao;
import com.gaze.entity.Commentvideo;

/**
 * 视频评论——业务逻辑层实现类
 *@ClassName: CommentvideoBizImpl
 *@Description: TODO
 *@author 夏远新
 *@data 2019年11月24日 下午8:48:21
 */

@Service
@Transactional
public class CommentvideoBizImpl implements CommentvideoBiz {
	
	//调用数据访问层接口
	@Autowired
	private CommentvideoDao commentvideoDao;
	
	//查看视频评论
	@Override
	public List<Commentvideo> findAllCommentvideos(Integer videoId) {
		
		return commentvideoDao.findAllCommentvideos(videoId);
	}
	
	//添加评论
	@Override
	public int addCommentvideo(Commentvideo commentvideo) {
		int  count = commentvideoDao.addCommentvideo(commentvideo);
		return count;
	}

	

}
