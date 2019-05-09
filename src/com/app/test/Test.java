package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.bean.Project;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("config.xml");
		Project p=ac.getBean("pobj",Project.class);
		System.out.println(p);
		System.out.println("Done"); 
		//test done

	}

}
