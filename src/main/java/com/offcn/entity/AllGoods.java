package com.offcn.entity;

import java.io.Serializable;
import java.util.List;

import com.offcn.pojo.TbGoods;
import com.offcn.pojo.TbGoodsDesc;
import com.offcn.pojo.TbItem;
import com.offcn.pojo.TbItemCat;

public class AllGoods implements Serializable {

	private TbGoods goods;
	private TbGoodsDesc goodsDesc;
	private List<TbItem> items;
	
	public TbGoods getGoods() {
		return goods;
	}
	public void setGoods(TbGoods goods) {
		this.goods = goods;
	}
	public TbGoodsDesc getgoodsDesc() {
		return goodsDesc;
	}
	public void setgoodsDesc(TbGoodsDesc goodsDesc) {
		this.goodsDesc = goodsDesc;
	}
	public List<TbItem> getItems() {
		return items;
	}
	public void setItems(List<TbItem> items) {
		this.items = items;
	}
	
}
