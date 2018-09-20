package co.edureka;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class DrawingApp {

	public static void main(String[] args) {
	// Triangle t=new Triangle();
	 //t.draw();
		//BeanFactory factory=new XmlBeanFactory(new FileSystemResource("spring.xml"));
	 //Triangle triangle=(Triangle)factory.getBean("triangle");
		/*ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		Triangle triangle=(Triangle)context.getBean("triangle");
	    triangle.draw();
	((AbstractApplicationContext) context).close();

	}*/
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		Shape shape=(Shape)context.getBean("circle");
	    shape.draw();
	((AbstractApplicationContext) context).close();

	}
	/*AbstractApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
	context.registerShutdownHook();
	Triangle triangle=(Triangle)context.getBean("triangle");
    triangle.draw();*/

}

