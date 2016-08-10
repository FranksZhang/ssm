package base;

import org.springframework.context.support.FileSystemXmlApplicationContext;

public class BaseTest<T> {
	
	private FileSystemXmlApplicationContext fsxac;

	public T target;
	
	@SuppressWarnings("unchecked")
	public void initTarget(String beanId) {
		if(target == null) {
			String[] strs = new String[] {"src/main/resources/spring-*.xml"};
			fsxac = new FileSystemXmlApplicationContext(strs);
			target = (T) fsxac.getBean(beanId);
		}
	}
}
