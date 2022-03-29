package com.nch.aop;

import com.nch.aop.advice.CustomThrowsAdvice;
import com.nch.aop.advice.CustomerAroundAdvice;
import com.nch.aop.advice.CustomerBeforeAdvice;
import com.nch.aop.advisor.PointCutAdvisor;
import com.nch.aop.beans.UserService;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {


		AnnotationConfigApplicationContext aopConfig = new AnnotationConfigApplicationContext(AopConfig.class);

		/**
		 * 方式1
		 */
//		UserService bean = aopConfig.getBean(UserService.class);
//		bean.Test();

		/**
		 * 方式2
		 */
		UserService userService = new UserService();

		ProxyFactory proxyFactory = new ProxyFactory();
		proxyFactory.setTarget(userService);
//		proxyFactory.addAdvice(new CustomerBeforeAdvice());
//		proxyFactory.addAdvice(new CustomerAroundAdvice());
//		proxyFactory.addAdvice(new CustomThrowsAdvice());
		proxyFactory.addAdvisor(new PointCutAdvisor());

		UserService proxy = (UserService)proxyFactory.getProxy();
		proxy.Test();

	}
}
