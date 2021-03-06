package com.phyling.test;

import com.phyling.app.Appconfig;
import com.phyling.service.IndexService;
import com.phyling.service.Phyling;
import com.phyling.service.OrderService;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.cglib.core.SpringNamingPolicy;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.reflect.Method;

public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationConfigApplicationContext
				= new AnnotationConfigApplicationContext();
		//System.out.println(annotationConfigApplicationContext.getBean(IndexService.class));
		annotationConfigApplicationContext.register(Appconfig.class);
		annotationConfigApplicationContext.refresh();
		annotationConfigApplicationContext.getBean(IndexService.class);


//
//		Enhancer enhancer = new Enhancer();
//		//增强父类，地球人都知道cglib是基于继承来的
//		enhancer.setSuperclass(Appconfig.class);
//
//		//不继承Factory接口
//		enhancer.setUseFactory(false);
//		enhancer.setNamingPolicy(SpringNamingPolicy.INSTANCE);
//		// BeanFactoryAwareGeneratorStrategy是一个生成策略
//		// 主要为生成的CGLIB类中添加成员变量$$beanFactory
//		// 同时基于接口EnhancedConfiguration的父接口BeanFactoryAware中的setBeanFactory方法，
//		// 设置此变量的值为当前Context中的beanFactory,这样一来我们这个cglib代理的对象就有了beanFactory
//		//有了factory就能获得对象，而不用去通过方法获得对象了，因为通过方法获得对象不能控制器过程
//		//该BeanFactory的作用是在this调用时拦截该调用，并直接在beanFactory中获得目标bean
//		//enhancer.setStrategy(new ConfigurationClassEnhancer.BeanFactoryAwareGeneratorStrategy(classLoader));
//		//过滤方法，不能每次都去new
//		enhancer.setCallback(new MethodInterceptor() {
//			@Override
//			public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
//				return null;
//			}
//		});
//
//		Appconfig chil = (Appconfig) enhancer.create();
//		chil.indexDao();
//
//		chil.indexDao();


	}
}
