/**   
 * Copyright © 2020 zongyue All rights reserved.
 * 
 * 功能描述：
 * @Package: domain 
 * @author: zongyue   
 * @date: 2020年4月26日 上午5:20:58 
 */
package domain;

import org.bson.types.ObjectId;

/**   
* Copyright: Copyright (c) 2020
*
* Date         Author          Version           ClassName 
*---------------------------------------------------------*
* 2020年4月26日     zongyue           v1.0.0           TransportCompanyDomain.java    
*
* @Description: 
*/
public class TransportCompanyDomain {
	private ObjectId obj_id;
	private int id;
	private String goodsInfo;
	private String carGoodsMatch;
	private String carGoodsTrace;
	private String deviceInfo;
	private String transit;
	
	
	public TransportCompanyDomain() {
		super();
		// TODO Auto-generated constructor stub
	}


	/**   
	* @Function: TransportCompanyDomain.java
	* @Description: 
	*
	* @param:
	* @author: zongyue
	* @date: 2020年4月26日 下午4:20:57 
	*/
	public TransportCompanyDomain(ObjectId obj_id, int id, String goodsInfo, String carGoodsMatch, String carGoodsTrace,
			String deviceInfo, String transit) {
		super();
		this.obj_id = obj_id;
		this.id = id;
		this.goodsInfo = goodsInfo;
		this.carGoodsMatch = carGoodsMatch;
		this.carGoodsTrace = carGoodsTrace;
		this.deviceInfo = deviceInfo;
		this.transit = transit;
	}


	/**
	 * @return the obj_id
	 */
	public ObjectId getObj_id() {
		return obj_id;
	}


	/**
	 * @param obj_id the obj_id to set
	 */
	public void setObj_id(ObjectId obj_id) {
		this.obj_id = obj_id;
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
	 * @return the goodsInfo
	 */
	public String getGoodsInfo() {
		return goodsInfo;
	}


	/**
	 * @param goodsInfo the goodsInfo to set
	 */
	public void setGoodsInfo(String goodsInfo) {
		this.goodsInfo = goodsInfo;
	}


	/**
	 * @return the carGoodsMatch
	 */
	public String getCarGoodsMatch() {
		return carGoodsMatch;
	}


	/**
	 * @param carGoodsMatch the carGoodsMatch to set
	 */
	public void setCarGoodsMatch(String carGoodsMatch) {
		this.carGoodsMatch = carGoodsMatch;
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
	 * @return the deviceInfo
	 */
	public String getDeviceInfo() {
		return deviceInfo;
	}


	/**
	 * @param deviceInfo the deviceInfo to set
	 */
	public void setDeviceInfo(String deviceInfo) {
		this.deviceInfo = deviceInfo;
	}


	/**
	 * @return the transit
	 */
	public String getTransit() {
		return transit;
	}


	/**
	 * @param transit the transit to set
	 */
	public void setTransit(String transit) {
		this.transit = transit;
	}


	/** 
	* @see java.lang.Object#toString()  
	* @Function: TransportCompanyDomain.java
	* @Description: 
	*
	* @param:
	* @return：
	* @throws：
	*
	* @version: v1.0.0
	* @author: zongyue
	* @date: 2020年4月26日 下午4:21:18 
	*/
	@Override
	public String toString() {
		return "TransportCompanyDomain [obj_id=" + obj_id + ", id=" + id + ", goodsInfo=" + goodsInfo
				+ ", carGoodsMatch=" + carGoodsMatch + ", carGoodsTrace=" + carGoodsTrace + ", deviceInfo=" + deviceInfo
				+ ", transit=" + transit + "]";
	}
	
	
}
