package ioc_create_object;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author sf
 * @File UserTest
 * @Time 2021-03-24 21:20
 * @Description
 */
public class UserTest {
	
	@Test
	public void userTest(){
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ioc_create_object.xml");
		
		//在执行getBean的时候, user已经创建好了（也就是我们bean中的id） , 通过无参构造
		User user = (User) applicationContext.getBean("user");
		
		// 调用对象的方法
		user.show();
	}
}
