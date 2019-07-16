package com.offcn.entity;

import java.io.Serializable;
import java.util.List;

/**
 * 分页返回的数据
 * {rows:[{},{},{}],total:100}
 * @author luoyanpeng
 *
 */
public class PageResult implements Serializable{
	
	private long total; // 总共的条目数
	private List rows;  // 每一页的数据
	
	public PageResult(long total, List rows) {
		super();
		this.total = total;
		this.rows = rows;
	}
	public long getTotal() {
		return total;
	}
	public void setTotal(long total) {
		this.total = total;
	}
	public List getRows() {
		return rows;
	}
	public void setRows(List rows) {
		this.rows = rows;
	}
	
}
