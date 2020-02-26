package com.jijiah.controller;
import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageInfo;

import com.jijiah.domain.Goods;
import com.jijiah.service.GoodsService;



@Controller
public class GoodsController {
	@Resource
	private GoodsService goodsService;
	
	@RequestMapping("goods")
	public String goods(Model model, Goods goods,@RequestParam(defaultValue = "1")Integer page,@RequestParam(defaultValue = "3") Integer pageSize) {
		PageInfo<Goods> info = goodsService.selects(goods, page, pageSize);
		model.addAttribute("info", info);
		model.addAttribute("goods", goods);
		return "goods";
	}

}
