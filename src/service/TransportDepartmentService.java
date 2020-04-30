/**   
 * Copyright © 2020 zongyue All rights reserved.
 * 
 * 功能描述：
 * @Package: service 
 * @author: zongyue   
 * @date: 2020年4月26日 下午8:38:40 
 */
package service;

import com.mongodb.DBCursor;

import dao.BankDao;
import dao.TransportDepartmentDao;
import domain.BankDomain;
import domain.TransportDepartmentDomain;

/**   
* Copyright: Copyright (c) 2020
*
* Date         Author          Version           ClassName 
*---------------------------------------------------------*
* 2020年4月26日     zongyue           v1.0.0           TransportDepartmentService.java    
*
* @Description: 
*/
public class TransportDepartmentService {
	TransportDepartmentDao dao = new TransportDepartmentDao();
	public DBCursor findTransportDepartmentById(int id) throws Exception {
		// TODO Auto-generated method stub
		return dao.findTransportDepartmentById(id);
	}
	public void updateTransportDepartment(TransportDepartmentDomain transportDepartmentDomain) throws Exception {
		dao.updateTransportDepartment(transportDepartmentDomain);
	}
	public void addTransportDepartment(TransportDepartmentDomain transportDepartmentDomain) throws Exception {
		// TODO Auto-generated method stub
		dao.addTransportDepartment(transportDepartmentDomain);
	}
	public void deleteTransportDepartmentById(int id) throws Exception {
		// TODO Auto-generated method stub
		dao.deleteTransportDepartmentById(id);
	}
}
