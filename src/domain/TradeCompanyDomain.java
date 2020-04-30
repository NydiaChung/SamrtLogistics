/**   
 * Copyright © 2020 zongyue All rights reserved.
 * 
 * 功能描述：
 * @Package: domain 
 * @author: zongyue   
 * @date: 2020年4月26日 下午6:42:57 
 */
package domain;

/**   
* Copyright: Copyright (c) 2020
*
* Date         Author          Version           ClassName 
*---------------------------------------------------------*
* 2020年4月26日     zongyue           v1.0.0           TradeCompanyDomain.java    
*
* @Description: 
*/
public class TradeCompanyDomain {
	private int id;
	private String carGoodsTrace;
	private String orderOnline;
	/**   
	* @Function: TradeCompanyDomain.java
	* @Description: 
	*
	* @param:
	* @author: zongyue
	* @date: 2020年4月26日 下午6:43:43 
	*/
	public TradeCompanyDomain() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**   
	* @Function: TradeCompanyDomain.java
	* @Description: 
	*
	* @param:
	* @author: zongyue
	* @date: 2020年4月26日 下午6:43:46 
	*/
	public TradeCompanyDomain(int id, String carGoodsTrace, String orderOnline) {
		super();
		this.id = id;
		this.carGoodsTrace = carGoodsTrace;
		this.orderOnline = orderOnline;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the carGoodsTrace
	 */
	public String getCarGoodsTrace() {
		return carGoodsTrace;
	}
	/**
	 * @param carGoodsTrace the carGoodsTrace to set
	 */
	public void setCarGoodsTrace(String carGoodsTrace) {
		this.carGoodsTrace = carGoodsTrace;
	}
	/**
	 * @return the orderOnline
	 */
	public String getOrderOnline() {
		return orderOnline;
	}
	/**
	 * @param orderOnline the orderOnline to set
	 */
	public void setOrderOnline(String orderOnline) {
		this.orderOnline = orderOnline;
	}
	/** 
	* @see java.lang.Object#toString()  
	* @Function: TradeCompanyDomain.java
	* @Description: 
	*
	* @param:
	* @return：
	* @throws：
	*
	* @version: v1.0.0
	* @author: zongyue
	* @date: 2020年4月26日 下午6:43:55 
	*/
	@Override
	public String toString() {
		return "TradeCompanyDomain [id=" + id + ", carGoodsTrace=" + carGoodsTrace + ", orderOnline=" + orderOnline
				+ "]";
	}
	
	
}
