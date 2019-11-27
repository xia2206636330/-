package Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.gaze.biz.VideoinfoBiz;


public class Test4 {
	public static void main(String[] args) {
		
	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	VideoinfoBiz  videoinfoBiz = (VideoinfoBiz)context.getBean("videoinfoBizImpl");
	String path = videoinfoBiz.findByvideoPath(1);
	
	System.out.println(path);
	
	}
}
