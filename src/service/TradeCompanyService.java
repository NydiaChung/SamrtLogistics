/**   
 * Copyright © 2020 zongyue All rights reserved.
 * 
 * 功能描述：
 * @Package: service 
 * @author: zongyue   
 * @date: 2020年4月26日 下午8:37:24 
 */
package service;

import com.mongodb.DBCursor;

import dao.BankDao;
import dao.TradeCompanyDao;
import domain.BankDomain;
import domain.TradeCompanyDomain;

/**   
* Copyright: Copyright (c) 2020
*
* Date         Author          Version           ClassName 
*---------------------------------------------------------*
* 2020年4月26日     zongyue           v1.0.0           TradeCompanyService.java    
*
* @Description: 
*/
public class TradeCompanyService {
	TradeCompanyDao dao = new TradeCompanyDao();
	public DBCursor findTradeCompanyById(int id) throws Exception {
		// TODO Auto-generated method stub
		return dao.findTradeCompanyById(id);
	}
	public void updateTradeCompany(TradeCompanyDomain tradeCompanyDomain) throws Exception {
		dao.updateTradeCompany(tradeCompanyDomain);
	}
	public void addTradeCompany(TradeCompanyDomain tradeCompanyDomain) throws Exception {
		// TODO Auto-generated method stub
		dao.addTradeCompany(tradeCompanyDomain);
	}
	public void deleteTradeCompanyById(int id) throws Exception {
		// TODO Auto-generated method stub
		dao.deleteTradeCompanyById(id);
	}
}
