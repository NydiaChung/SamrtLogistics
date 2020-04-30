/**   
 * Copyright © 2020 zongyue All rights reserved.
 * 
 * 功能描述：
 * @Package: domain 
 * @author: zongyue   
 * @date: 2020年4月26日 下午6:33:11 
 */
package domain;

/**   
* Copyright: Copyright (c) 2020
*
* Date         Author          Version           ClassName 
*---------------------------------------------------------*
* 2020年4月26日     zongyue           v1.0.0           ProductCompanyDomain.java    
*
* @Description: 
*/
public class ProductCompanyDomain {
	private int id;
	private String storageStatus;
	private String carGoodsTrace;
	private String market;
	/**   
	* @Function: ProductCompanyDomain.java
	* @Description: 
	*
	* @param:
	* @author: zongyue
	* @date: 2020年4月26日 下午6:34:22 
	*/
	public ProductCompanyDomain() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**   
	* @Function: ProductCompanyDomain.java
	* @Description: 
	*
	* @param:
	* @author: zongyue
	* @date: 2020年4月26日 下午6:34:26 
	*/
	public ProductCompanyDomain(int id, String storageStatus, String carGoodsTrace, String market) {
		super();
		this.id = id;
		this.storageStatus = storageStatus;
		this.carGoodsTrace = carGoodsTrace;
		this.market = market;
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
	 * @return the storageStatus
	 */
	public String getStorageStatus() {
		return storageStatus;
	}
	/**
	 * @param storageStatus the storageStatus to set
	 */
	public void setStorageStatus(String storageStatus) {
		this.storageStatus = storageStatus;
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
	 * @return the market
	 */
	public String getMarket() {
		return market;
	}
	/**
	 * @param market the market to set
	 */
	public void setMarket(String market) {
		this.market = market;
	}
	/** 
	* @see java.lang.Object#toString()  
	* @Function: ProductCompanyDomain.java
	* @Description: 
	*
	* @param:
	* @return：
	* @throws：
	*
	* @version: v1.0.0
	* @author: zongyue
	* @date: 2020年4月26日 下午6:34:36 
	*/
	@Override
	public String toString() {
		return "ProductCompanyDomain [id=" + id + ", storageStatus=" + storageStatus + ", carGoodsTrace="
				+ carGoodsTrace + ", market=" + market + "]";
	}
	
	
}
