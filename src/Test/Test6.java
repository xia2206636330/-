package Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gaze.biz.VideoBiz;
import com.gaze.biz.VideoinfoBiz;

/**
 * 修改视频完成度
 *@ClassName: Test5
 *@Description: TODO
 *@author 夏远新
 *@data 2019年11月27日 上午8:25:19
 */
public class Test6 {
	public static void main(String[] args) {
		
	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	VideoinfoBiz  videoinfoBiz = (VideoinfoBiz)context.getBean("videoinfoBizImpl");
	int counts = videoinfoBiz.updateBycompleteTime(0.04, 1, 1);
	
	System.out.println("修改成功"+counts+"条数据！");
	
	}
}
