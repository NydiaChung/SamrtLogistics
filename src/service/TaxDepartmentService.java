/**   
 * Copyright © 2020 zongyue All rights reserved.
 * 
 * 功能描述：
 * @Package: service 
 * @author: zongyue   
 * @date: 2020年4月26日 下午8:37:11 
 */
package service;

import com.mongodb.DBCursor;

import dao.BankDao;
import dao.TaxDepartmentDao;
import domain.BankDomain;
import domain.TaxDepartmentDomain;

/**   
* Copyright: Copyright (c) 2020
*
* Date         Author          Version           ClassName 
*---------------------------------------------------------*
* 2020年4月26日     zongyue           v1.0.0           TaxDepartment.java    
*
* @Description: 
*/
public class TaxDepartmentService {
	TaxDepartmentDao dao = new TaxDepartmentDao();
	public DBCursor findTaxDepartmentById(int id) throws Exception {
		// TODO Auto-generated method stub
		return dao.findTaxDepartmentById(id);
	}
	public void updateTaxDepartment(TaxDepartmentDomain taxDepartmentDomain) throws Exception {
		dao.updateTaxDepartment(taxDepartmentDomain);
	}
	public void addTaxDepartment(TaxDepartmentDomain taxDepartmentDomain) throws Exception {
		// TODO Auto-generated method stub
		dao.addTaxDepartment(taxDepartmentDomain);
	}
	public void deleteTaxDepartmentById(int id) throws Exception {
		// TODO Auto-generated method stub
		dao.deleteTaxDepartmentById(id);
	}
}
