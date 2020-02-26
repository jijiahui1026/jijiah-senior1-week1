package com.jijiah.domain;


public class Goods {
	
		private Integer id;
		private String name;
		private String ename;
		private Brand brand;//品牌
		private Type type;//类型
		private Double price;
		private Integer num;
		private String pic;
		
		private Integer bid;
		private Integer tid;
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getEname() {
			return ename;
		}
		public void setEname(String ename) {
			this.ename = ename;
		}
		public Brand getBrand() {
			return brand;
		}
		public void setBrand(Brand brand) {
			this.brand = brand;
		}
		public Type getType() {
			return type;
		}
		public void setType(Type type) {
			this.type = type;
		}
}