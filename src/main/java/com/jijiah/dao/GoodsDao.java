package com.jijiah.dao;

import java.util.List;

import com.jijiah.domain.Goods;

public interface GoodsDao {

	List<Goods> selects(Goods goods);

}
