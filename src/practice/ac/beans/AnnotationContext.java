package practice.ac.beans;

import java.io.File;
import java.io.FileFilter;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

//自己手写一个动态工厂
public class AnnotationContext {
	/**
	 * 给定一个包，包中几个类
	 * 定义一个工厂，扫描指定包中的类
	 * 基于反射构建所有类的对象
	 * 将对象存储于工厂对于的容器中(Map类型)
	 */
	//获取key：类的名称，首字母小写
	//获取value：类的实例
	private Map<String, Object> beanMap = new HashMap<>();
	public AnnotationContext() {
		//定义一个包
		String pkg = "practice.ac.service";
		//创建扫描
		scanPkg(pkg);
	}

	private void scanPkg(String pkg) {
		//替换.为/ 获取资源路径下的位置
		String pgkDir = pkg.replaceAll("\\.", "/");
		URL url = getClass().getClassLoader().getResource(pgkDir);
		//构建文件对象
		File file = new File(url.getFile());
		//获取标准文件
		File[] fs = file.listFiles(new FileFilter() {
			
			@Override
			public boolean accept(File file) {
				String fName = file.getName();
				//递归
				if(file.isDirectory()){
					scanPkg(pkg+"."+fName);
				}
				if(fName.endsWith(".class")){
					return true;//所有的文件对象
				}
				return false;
			}
		});
		for(File f : fs){
			String fName = f.getName();//类名称.class
			fName = fName.substring(0, fName.lastIndexOf("."));//获取类名
			String key = String.valueOf(fName.charAt(0)).toLowerCase()+fName.substring(1);//获取首字母小写的类名
			String clsName =pkg+"."+fName;//包.类名
			try {
				//通过反射构建对象
				Class<?> c = Class.forName(clsName);
				if(c.isAnnotationPresent(CGB1803.class)){
					Object obj = c.newInstance();//创建实例
					beanMap.put(key, obj);
				}
			} catch (Exception e) {
				e.printStackTrace();
				throw new RuntimeException(e);
			}
		}
	}
	public Object getBean(String key){
		return beanMap.get(key);
	}
	public void close(){
		beanMap.clear();
		beanMap=null;
	}
	public static void main(String[] args) {
		AnnotationContext ctx = new AnnotationContext();
		Object obj =ctx.getBean("userService");
		System.out.println(obj);
		ctx.close();
	}
}
