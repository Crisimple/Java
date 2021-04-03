package dynamic_proxy;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author sf
 * @File UserServiceProxy
 * @Time 2021-03-31 21:21
 * @Description 代理角色: UserServiceProxy
 */
public class UserServiceProxy implements InvocationHandler {
	
	private UserService userService;

	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	// 生成代理类，重点是第二个参数，获取要代理的抽象角色！之前都是一个角色，现在可以代理一类角色
	public Object getProxy(){
		return Proxy.newProxyInstance(
				this.getClass().getClassLoader(),
				userService.getClass().getInterfaces(),
				this
		);
	}
	
	// proxy : 代理类 method : 代理类的调用处理程序的方法对象
	//      处理代理实例上的方法调用并返回结果
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable{
		init_user();
		//核心：本质利用反射实现！
		Object result = method.invoke(userService, args);
		final_user();
		return result;
	}
	
	public void init_user(){
		System.out.println("初始化用户");
	}
	
	public void final_user(){
		System.out.println("结束用户");
	}
}
