/**   
 * Copyright © 2020 zongyue All rights reserved.
 * 
 * 功能描述：
 * @Package: domain 
 * @author: zongyue   
 * @date: 2020年4月26日 下午6:35:25 
 */
package domain;

/**   
* Copyright: Copyright (c) 2020
*
* Date         Author          Version           ClassName 
*---------------------------------------------------------*
* 2020年4月26日     zongyue           v1.0.0           StoreCompanyDomain.java    
*
* @Description: 
*/
public class StoreCompanyDomain {
	private int id;
	private String storeInfo;
	private String orderInfo;
	private String traceInfo;
	private String feedBack;
	/**   
	* @Function: StoreCompanyDomain.java
	* @Description: 
	*
	* @param:
	* @author: zongyue
	* @date: 2020年4月26日 下午6:38:05 
	*/
	public StoreCompanyDomain() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**   
	* @Function: StoreCompanyDomain.java
	* @Description: 
	*
	* @param:
	* @author: zongyue
	* @date: 2020年4月26日 下午6:38:10 
	*/
	public StoreCompanyDomain(int id, String storeInfo, String orderInfo, String traceInfo, String feedBack) {
		super();
		this.id = id;
		this.storeInfo = storeInfo;
		this.orderInfo = orderInfo;
		this.traceInfo = traceInfo;
		this.feedBack = feedBack;
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
	 * @return the storeInfo
	 */
	public String getStoreInfo() {
		return storeInfo;
	}
	/**
	 * @param storeInfo the storeInfo to set
	 */
	public void setStoreInfo(String storeInfo) {
		this.storeInfo = storeInfo;
	}
	/**
	 * @return the orderInfo
	 */
	public String getOrderInfo() {
		return orderInfo;
	}
	/**
	 * @param orderInfo the orderInfo to set
	 */
	public void setOrderInfo(String orderInfo) {
		this.orderInfo = orderInfo;
	}
	/**
	 * @return the traceInfo
	 */
	public String getTraceInfo() {
		return traceInfo;
	}
	/**
	 * @param traceInfo the traceInfo to set
	 */
	public void setTraceInfo(String traceInfo) {
		this.traceInfo = traceInfo;
	}
	/**
	 * @return the feedBack
	 */
	public String getFeedBack() {
		return feedBack;
	}
	/**
	 * @param feedBack the feedBack to set
	 */
	public void setFeedBack(String feedBack) {
		this.feedBack = feedBack;
	}
	/** 
	* @see java.lang.Object#toString()  
	* @Function: StoreCompanyDomain.java
	* @Description: 
	*
	* @param:
	* @return：
	* @throws：
	*
	* @version: v1.0.0
	* @author: zongyue
	* @date: 2020年4月26日 下午6:38:15 
	*/
	@Override
	public String toString() {
		return "StoreCompanyDomain [id=" + id + ", storeInfo=" + storeInfo + ", orderInfo=" + orderInfo + ", traceInfo="
				+ traceInfo + ", feedBack=" + feedBack + "]";
	}
	
	
}
