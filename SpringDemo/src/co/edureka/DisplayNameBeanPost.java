package co.edureka;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class DisplayNameBeanPost implements BeanPostProcessor{

public Object postProcessAfterInitialization(Object Bean,String beanName) throws BeansException
{
	System.out.println("In After Initialization method BeanName is "+beanName);
	
	return Bean;
}

public Object postProcessBeforeInitialization(Object Bean,String beanName) throws BeansException
{
	System.out.println("In before Initialization method BeanName is "+beanName);
	
	return Bean;
}


}
