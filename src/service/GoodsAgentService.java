/**   
 * Copyright © 2020 zongyue All rights reserved.
 * 
 * 功能描述：
 * @Package: service 
 * @author: zongyue   
 * @date: 2020年4月26日 下午8:36:01 
 */
package service;

import com.mongodb.DBCursor;

import dao.GoodsAgentDao;
import domain.BankDomain;
import domain.GoodsAgentDomain;

/**   
* Copyright: Copyright (c) 2020
*
* Date         Author          Version           ClassName 
*---------------------------------------------------------*
* 2020年4月26日     zongyue           v1.0.0           GoodsAgentService.java    
*
* @Description: 
*/
public class GoodsAgentService {

	GoodsAgentDao dao = new GoodsAgentDao();
	public DBCursor findGoodsAgentById(int id) throws Exception {
		// TODO Auto-generated method stub
		return dao.findGoodsAgentById(id);
	}
	public void updateGoodsAgent(GoodsAgentDomain goodsAgentDomain) throws Exception {
		dao.updateGoodsAgent(goodsAgentDomain);
	}
	public void addGoodsAgent(GoodsAgentDomain goodsAgentDomain) throws Exception {
		// TODO Auto-generated method stub
		dao.addGoodsAgent(goodsAgentDomain);
	}
	public void deleteGoodsAgentById(int id) throws Exception {
		// TODO Auto-generated method stub
		dao.deleteGoodsAgentById(id);
	}
}
