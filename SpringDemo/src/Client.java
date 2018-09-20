


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

import co.edureka.Triangle;

public class Client {
	public static void main(String[] args) {
	// Triangle t=new Triangle();
	 //t.draw();
		//BeanFactory factory=new XmlBeanFactory(new FileSystemResource("spring.xml"));
	 //Triangle triangle=(Triangle)factory.getBean("triangle");
		ApplicationContext context=new ClassPathXmlApplicationContext("New.xml");
		Triangle triangle=(Triangle)context.getBean("triangle");
	 triangle.draw();
	 ((AbstractApplicationContext) context).close();

	}

}

