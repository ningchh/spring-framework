package com.nch.aop;

import com.nch.aop.beans.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {


		AnnotationConfigApplicationContext aopConfig = new AnnotationConfigApplicationContext(AopConfig.class);

		UserService bean = aopConfig.getBean(UserService.class);

		bean.Test();

		System.out.println("啦啦啦啦啦");

	}
}
