package com.jijiah.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import com.jijiah.dao.GoodsDao;
import com.jijiah.domain.Goods;
import com.jijiah.service.GoodsService;

@Service
public class GoodsServiceImpl implements GoodsService {

	@Resource
	private GoodsDao goodsDao;
	@Override
	public PageInfo<Goods> selects(Goods goods, Integer page, Integer pageSize) {
		
		PageHelper.startPage(page, pageSize);
		List<Goods> list = goodsDao.selects(goods);
		return new PageInfo<Goods>(list);
	}

}
