package Test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gaze.biz.CommentvideoBiz;
import com.gaze.biz.VideoBiz;
import com.gaze.entity.Commentvideo;
import com.gaze.entity.Video;

public class Test2 {

	public static void main(String[] args) {
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		VideoBiz  videoBiz = (VideoBiz)context.getBean("videoBizImpl");
		List<Video> list = videoBiz.findAllVideo();
		for (Video video : list) {
			System.out.println(video.getVideoName()+"=="+video.getVideoImg()+"=="+video.getVideoTeacher()+"=="+video.getVideType()+"=="+video.getVideoTime());
		}
	}

}
