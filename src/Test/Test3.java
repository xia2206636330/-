package Test;

import java.util.Date;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gaze.biz.CommentvideoBiz;
import com.gaze.entity.Commentvideo;

public class Test3 {

	public static void main(String[] args) {

		
		//测试添加评论
ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		CommentvideoBiz commentvideoBiz =(CommentvideoBiz)context.getBean("commentvideoBizImpl");
		Commentvideo commentvideo = new Commentvideo();
		commentvideo.setContent("添加评论2");
		commentvideo.setUid(2);
		commentvideo.setVid(1);
		
		
		int count = commentvideoBiz.addCommentvideo(commentvideo);
		System.out.println(count);
		
		
		
		
	}
}
