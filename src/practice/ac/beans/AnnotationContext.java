package practice.ac.beans;

import java.io.File;
import java.io.FileFilter;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

//�Լ���дһ����̬����
public class AnnotationContext {
	/**
	 * ����һ���������м�����
	 * ����һ��������ɨ��ָ�����е���
	 * ���ڷ��乹��������Ķ���
	 * ������洢�ڹ������ڵ�������(Map����)
	 */
	//��ȡkey��������ƣ�����ĸСд
	//��ȡvalue�����ʵ��
	private Map<String, Object> beanMap = new HashMap<>();
	public AnnotationContext() {
		//����һ����
		String pkg = "practice.ac.service";
		//����ɨ��
		scanPkg(pkg);
	}

	private void scanPkg(String pkg) {
		//�滻.Ϊ/ ��ȡ��Դ·���µ�λ��
		String pgkDir = pkg.replaceAll("\\.", "/");
		URL url = getClass().getClassLoader().getResource(pgkDir);
		//�����ļ�����
		File file = new File(url.getFile());
		//��ȡ��׼�ļ�
		File[] fs = file.listFiles(new FileFilter() {
			
			@Override
			public boolean accept(File file) {
				String fName = file.getName();
				//�ݹ�
				if(file.isDirectory()){
					scanPkg(pkg+"."+fName);
				}
				if(fName.endsWith(".class")){
					return true;//���е��ļ�����
				}
				return false;
			}
		});
		for(File f : fs){
			String fName = f.getName();//������.class
			fName = fName.substring(0, fName.lastIndexOf("."));//��ȡ����
			String key = String.valueOf(fName.charAt(0)).toLowerCase()+fName.substring(1);//��ȡ����ĸСд������
			String clsName =pkg+"."+fName;//��.����
			try {
				//ͨ�����乹������
				Class<?> c = Class.forName(clsName);
				if(c.isAnnotationPresent(CGB1803.class)){
					Object obj = c.newInstance();//����ʵ��
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
