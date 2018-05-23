package practice;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import practice.ac.service.UserService;

public class TestBean {
	private static ClassPathXmlApplicationContext ctx;
	static void init(){
		ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
	}
	static void close(){
		ctx.close();
	}
	public static void main(String[] args) {
		init();
		UserService us = ctx.getBean("userService", UserService.class);
		System.out.println(us);
		close();
	}
}
