/**   
 * Copyright © 2020 zongyue All rights reserved.
 * 
 * 功能描述：
 * @Package: service 
 * @author: zongyue   
 * @date: 2020年4月26日 下午8:38:07 
 */
package service;

import com.mongodb.DBCursor;

import dao.BankDao;
import dao.TradeDepartmentDao;
import domain.BankDomain;
import domain.TradeDepartmentDomain;

/**   
* Copyright: Copyright (c) 2020
*
* Date         Author          Version           ClassName 
*---------------------------------------------------------*
* 2020年4月26日     zongyue           v1.0.0           TradeDepartmentService.java    
*
* @Description: 
*/
public class TradeDepartmentService {
	TradeDepartmentDao dao = new TradeDepartmentDao();
	public DBCursor findTradeDepartmentById(int id) throws Exception {
		// TODO Auto-generated method stub
		return dao.findTradeDepartmentById(id);
	}
	public void updateTradeDepartment(TradeDepartmentDomain tradeDepartmentDomain) throws Exception {
		dao.updateTradeDepartment(tradeDepartmentDomain);
	}
	public void addbTradeDepartment(TradeDepartmentDomain tradeDepartmentDomain) throws Exception {
		// TODO Auto-generated method stub
		dao.addTradeDepartment(tradeDepartmentDomain);
	}
	public void deleteTradeDepartmentById(int id) throws Exception {
		// TODO Auto-generated method stub
		dao.deleteTradeDepartmentById(id);
	}
}
