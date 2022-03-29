package com.nch.aop;


import com.nch.aop.advice.CustomerBeforeAdvice;
import org.springframework.aop.framework.autoproxy.BeanNameAutoProxyCreator;
import org.springframework.aop.framework.autoproxy.DefaultAdvisorAutoProxyCreator;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.aop.support.NameMatchMethodPointcut;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;

/**
 * @EnableAspectJAutoProxy 和 @Import(DefaultAdvisorAutoProxyCreator.class) 选其一
 * @EnableAspectJAutoProxy aspect的注解
 * @Import(DefaultAdvisorAutoProxyCreator.class)
 */
@ComponentScan("com.nch.aop")
@EnableAspectJAutoProxy
//@Import(DefaultAdvisorAutoProxyCreator.class)
public class AopConfig {

//	@Bean
//	public BeanNameAutoProxyCreator beanNameAutoProxyCreator(){
//		BeanNameAutoProxyCreator beanNameAutoProxyCreator = new BeanNameAutoProxyCreator();
//		beanNameAutoProxyCreator.setBeanNames("*userServ*");
//		beanNameAutoProxyCreator.setInterceptorNames("customerBeforeAdvice");
//		return beanNameAutoProxyCreator;
//	}

//	@Bean
//	public DefaultPointcutAdvisor defaultPointcutAdvisor(){
//		NameMatchMethodPointcut pointcut = new NameMatchMethodPointcut();
//		pointcut.addMethodName("Test");
//
//		DefaultPointcutAdvisor pointcutAdvisor = new DefaultPointcutAdvisor();
//		pointcutAdvisor.setPointcut(pointcut);
//		pointcutAdvisor.setAdvice(new CustomerBeforeAdvice());
//		return pointcutAdvisor;
//	}

	/**
	 * @Import(DefaultAdvisorAutoProxyCreator.class)
	 */
//	@Bean
//	public DefaultAdvisorAutoProxyCreator defaultAdvisorAutoProxyCreator(){
//
//		DefaultAdvisorAutoProxyCreator defaultAdvisorAutoProxyCreator = new DefaultAdvisorAutoProxyCreator();
//
//		return defaultAdvisorAutoProxyCreator;
//	}

}
