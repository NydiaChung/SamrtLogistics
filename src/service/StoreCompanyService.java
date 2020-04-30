/**   
 * Copyright © 2020 zongyue All rights reserved.
 * 
 * 功能描述：
 * @Package: service 
 * @author: zongyue   
 * @date: 2020年4月26日 下午8:37:01 
 */
package service;

import com.mongodb.DBCursor;

import dao.BankDao;
import dao.StoreCompanyDao;
import domain.BankDomain;
import domain.StoreCompanyDomain;

/**   
* Copyright: Copyright (c) 2020
*
* Date         Author          Version           ClassName 
*---------------------------------------------------------*
* 2020年4月26日     zongyue           v1.0.0           StoreCompanyService.java    
*
* @Description: 
*/
public class StoreCompanyService {
	StoreCompanyDao dao = new StoreCompanyDao();
	public DBCursor findStoreCompanyById(int id) throws Exception {
		// TODO Auto-generated method stub
		return dao.findStoreCompanyById(id);
	}
	public void updateStoreCompany(StoreCompanyDomain storeCompanyDomain) throws Exception {
		dao.updateStoreCompany(storeCompanyDomain);
	}
	public void addStoreCompany(StoreCompanyDomain storeCompanyDomain) throws Exception {
		// TODO Auto-generated method stub
		dao.addStoreCompany(storeCompanyDomain);
	}
	public void deleteStoreCompanyById(int id) throws Exception {
		// TODO Auto-generated method stub
		dao.deleteStoreCompanyById(id);
	}
}
