package com.offcn.entity;

import java.io.Serializable;
import java.util.List;

public class ItemSpec implements Serializable{

	private String attributeName;
	private List<String> attributeValue;
	public String getAttributeName() {
		return attributeName;
	}
	public void setAttributeName(String attributeName) {
		this.attributeName = attributeName;
	}
	public List<String> getAttributeValue() {
		return attributeValue;
	}
	public void setAttributeValue(List<String> attributeValue) {
		this.attributeValue = attributeValue;
	}
	
}
