package com.nonveggies.product.dao;

import org.springframework.stereotype.Repository;

import com.nonveggies.android.dto.AndroidProductDTO;
import com.nonveggies.common.CommonBaseDAOImpl;
import com.nonveggies.entity.NvProduct;

@Repository("productDAO")
public class ProductDAO extends CommonBaseDAOImpl<NvProduct, Integer> {
	
	private void createProduct(AndroidProductDTO transientInstance) {
		NvProduct tnvInstance = new NvProduct();
		createNVProduct(tnvInstance, transientInstance);
		create(tnvInstance);
		
	}

	private void createNVProduct(NvProduct tnvInstance, AndroidProductDTO transientInstance) {
		// TODO Auto-generated method stub
		
	}

}
