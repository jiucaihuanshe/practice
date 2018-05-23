package practice.set;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestJdbcTemplate {
	private static ClassPathXmlApplicationContext ctx;
	static void init(){
		ctx= new ClassPathXmlApplicationContext("set_applicationContext.xml");
	}
	static void close(){
		ctx.close();
	}
	public static void main(String[] args) {
		init();
		JDBCTemplate jt = ctx.getBean("jDBCTemplate", JDBCTemplate.class);
		System.out.println(jt.getDataSource());
		close();
	}
}
