/**   
 * Copyright © 2020 zongyue All rights reserved.
 * 
 * 功能描述：
 * @Package: service 
 * @author: zongyue   
 * @date: 2020年4月26日 下午5:14:08 
 */
package service;

import com.mongodb.DBCursor;

import dao.BankDao;
import dao.TransportCompanyDao;
import domain.BankDomain;
import domain.TransportCompanyDomain;

/**   
* Copyright: Copyright (c) 2020
*
* Date         Author          Version           ClassName 
*---------------------------------------------------------*
* 2020年4月26日     zongyue           v1.0.0           BankService.java    
*
* @Description: 
*/
public class BankService {

	BankDao dao = new BankDao();
	public DBCursor findBankById(int id) throws Exception {
		// TODO Auto-generated method stub
		return dao.findBankById(id);
	}
	public void updatebank(BankDomain bankDomain) throws Exception {
		dao.updatebank(bankDomain);
	}
	public void addbank(BankDomain bankDomain) throws Exception {
		// TODO Auto-generated method stub
		dao.addbank(bankDomain);
	}
	public void deleteBankById(int id) throws Exception {
		// TODO Auto-generated method stub
		dao.deleteBankById(id);
	}
}
