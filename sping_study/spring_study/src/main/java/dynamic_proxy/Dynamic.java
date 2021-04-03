package dynamic_proxy;

/**
 * @Author sf
 * @File DynamicTest
 * @Time 2021-03-31 21:30
 * @Description
 */
public class Dynamic {
	
		public static void main(String[] args){
			// UserService 业务
			dynamic_proxy.UserServiceImpl userService = new UserServiceImpl();
			//代理类
	        UserServiceProxy proxy = new UserServiceProxy();
			//使用代理类实现日志功能！
			proxy.setUserService(userService);
			// 动态生成对应的代理类！
			UserService userService1 = (UserService) proxy.getProxy();
			userService1.update();
		}
        
}
