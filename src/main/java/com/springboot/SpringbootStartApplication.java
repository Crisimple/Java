package com.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * @SpringBootApplication
 *      作用：标注在某个类上说明这个类是SpringBoot的主配置类 ， SpringBoot就应该运行这个类的main方法来启动SpringBoot应用；
 *      许多 Spring Boot 开发人员的主类始终带有@Configuration，@EnableAutoConfiguration和@ComponentScanComments。
 *      由于这些注解经常一起使用(特别是如果您遵循上面的best practices)，因此 Spring Boot 提供了一个方便的@SpringBootApplication替代方案
 *      @SpringBootApplicationComments 等效于将@Configuration，@EnableAutoConfiguration和@ComponentScan及其默认属性一起使用
 *      @SpringBootApplication还提供别名以自定义@EnableAutoConfiguration和@ComponentScan的属性。
 *      
 * 进入注解@SpringBootApplication中内的注解解释：
 *      @EnableAutoConfiguration 开启自动配置功能；告诉SpringBoot开启自动配置功能，这样自动配置才能生效
 *      @AutoConfigurationPackage ：自动配置包；
 *      @import ：Spring底层注解@import ， 给容器中导入一个组件
 *      @ComponentScan  
 *              这个注解在Spring中很重要 ,它对应XML配置中的元素。
 *              作用：自动扫描并加载符合条件的组件或者bean ， 将这个bean定义加载到IOC容器中
 *              
 *      @SpringBootConfiguration
 *              作用：SpringBoot的配置类 ，标注在某个类上 ， 表示这是一个SpringBoot的配置类；  
 *         进入到注解@SpringBootConfiguration中内的注解解释：
 *              @Configuration  -- @Configuration，说明这是一个配置类 ，配置类就是对应Spring的xml 配置文件
 *              public @interface SpringBootConfiguration{}
 *                 进入到注解@Configuration中内的注解解释：
 *                       @Component 这就说明，启动类本身也是Spring中的一个组件而已，负责启动应用！
 *              
 */
@SpringBootApplication
public class SpringbootStartApplication {

	public static void main(String[] args) {
		// 将 SpringBoot 应用程序启动
		SpringApplication.run(SpringbootStartApplication.class, args);
	}

}
