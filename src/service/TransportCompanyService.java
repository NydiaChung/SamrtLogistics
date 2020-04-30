/**   
 * Copyright © 2020 zongyue All rights reserved.
 * 
 * 功能描述：
 * @Package: service 
 * @author: zongyue   
 * @date: 2020年4月26日 上午5:51:56 
 */
package service;

import com.mongodb.DBCursor;

import dao.TransportCompanyDao;
import domain.TransportCompanyDomain;

/**   
* Copyright: Copyright (c) 2020
*
* Date         Author          Version           ClassName 
*---------------------------------------------------------*
* 2020年4月26日     zongyue           v1.0.0           TransportCompanyService.java    
*
* @Description: 
*/
public class TransportCompanyService {

		//创建dao层对象
		TransportCompanyDao dao = new TransportCompanyDao();

	/**   
	* @Function: TransportCompanyService.java
	* @Description: 按id查询指定数据
	*/
	
	public DBCursor findTransportCopmpanyById(int id) throws Exception {
		// TODO Auto-generated method stub
		return dao.findTransportCopmpanyById(id);
	}
	public void addTransportCompany(TransportCompanyDomain tcd) throws Exception{
		dao.addTransportCompany(tcd);
	}
	/**   
	* @throws Exception 
	 * @Function: TransportCompanyService.java
	* @Description: 按照id删除商品
	*/
	public void deleteTransportCompanyById(int id) throws Exception {
		// TODO Auto-generated method stub
		dao.deleteTransportCompanyById(id);
		
	}
	public void updateTransportCompany(TransportCompanyDomain transportCompanyDomain) throws Exception {
		// TODO Auto-generated method stub
		dao.updateTransportCompany(transportCompanyDomain);
	}
}
