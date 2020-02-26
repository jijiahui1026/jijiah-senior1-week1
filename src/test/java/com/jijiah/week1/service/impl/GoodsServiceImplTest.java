package com.jijiah.week1.service.impl;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.github.pagehelper.PageInfo;
import com.jijiah.domain.Goods;
import com.jijiah.service.GoodsService;

public class GoodsServiceImplTest {

	
	@Test
	public void testSelects() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring-beans.xml");
		
		GoodsService service = ac.getBean(GoodsService.class);
		PageInfo<Goods> info = service.selects(null, 1, 3);
		System.out.println(info);
		
		
	}

}
