package Test;

import java.sql.Date;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gaze.biz.CommentvideoBiz;
import com.gaze.biz.VideoBiz;
import com.gaze.entity.Commentvideo;
import com.gaze.entity.Video;

public class Test1 {

	public static void main(String[] args) {
	
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		CommentvideoBiz commentvideoBiz =(CommentvideoBiz)context.getBean("commentvideoBizImpl");
		List<Commentvideo> list = commentvideoBiz.findAllCommentvideos(2);
		for (Commentvideo commentvideo : list) {
			System.out.println(commentvideo.getContent());
			System.out.println(commentvideo.getCommentTime());
			System.out.println(commentvideo.getUser().getUsername());
			System.out.println(commentvideo.getUser().getHeadImg());
		}
		
			
		}
		 

	}


