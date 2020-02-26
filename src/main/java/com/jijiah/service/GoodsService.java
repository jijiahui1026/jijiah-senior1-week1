package com.jijiah.service;

import com.github.pagehelper.PageInfo;

import com.jijiah.domain.Goods;

public interface GoodsService {

	PageInfo<Goods> selects(Goods goods, Integer page, Integer pageSize);

}
