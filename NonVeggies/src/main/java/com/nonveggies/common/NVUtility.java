package com.nonveggies.common;

import org.springframework.beans.BeanUtils;

public class NVUtility {

	
	public void copyPOJO(Object sourceObject, Object targetObject){
		BeanUtils.copyProperties(sourceObject, targetObject);
	}
}
