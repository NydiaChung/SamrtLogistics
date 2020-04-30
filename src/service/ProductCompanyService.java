/**   
 * Copyright © 2020 zongyue All rights reserved.
 * 
 * 功能描述：
 * @Package: service 
 * @author: zongyue   
 * @date: 2020年4月26日 下午8:36:30 
 */
package service;

import com.mongodb.DBCursor;

import dao.BankDao;
import dao.ProductCompanyDao;
import domain.BankDomain;
import domain.ProductCompanyDomain;

/**   
* Copyright: Copyright (c) 2020
*
* Date         Author          Version           ClassName 
*---------------------------------------------------------*
* 2020年4月26日     zongyue           v1.0.0           ProductCompany.java    
*
* @Description: 
*/
public class ProductCompanyService {
	ProductCompanyDao dao = new ProductCompanyDao();
	public DBCursor findProductCompanyById(int id) throws Exception {
		// TODO Auto-generated method stub
		return dao.findProductCompanyById(id);
	}
	public void updateProductCompany(ProductCompanyDomain productCompanyDomain) throws Exception {
		dao.updateProductCompany(productCompanyDomain);
	}
	public void addProductCompany(ProductCompanyDomain productCompanyDomain) throws Exception {
		// TODO Auto-generated method stub
		dao.addProductCompany(productCompanyDomain);
	}
	public void deleteProductCompanyById(int id) throws Exception {
		// TODO Auto-generated method stub
		dao.deleteProductCompanyById(id);
	}
	
}
