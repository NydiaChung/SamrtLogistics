/**   
 * Copyright © 2020 zongyue All rights reserved.
 * 
 * 功能描述：
 * @Package: domain 
 * @author: zongyue   
 * @date: 2020年4月26日 下午7:02:37 
 */
package domain;

/**   
* Copyright: Copyright (c) 2020
*
* Date         Author          Version           ClassName 
*---------------------------------------------------------*
* 2020年4月26日     zongyue           v1.0.0           TradeDepartmentDomain.java    
*
* @Description: 
*/
public class TradeDepartmentDomain {
	private int id;
	private String development;
	private String currency;
	private String total;
	/**   
	* @Function: TradeDepartmentDomain.java
	* @Description: 
	*
	* @param:
	* @author: zongyue
	* @date: 2020年4月26日 下午7:04:55 
	*/
	public TradeDepartmentDomain() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**   
	* @Function: TradeDepartmentDomain.java
	* @Description: 
	*
	* @param:
	* @author: zongyue
	* @date: 2020年4月26日 下午7:04:57 
	*/
	public TradeDepartmentDomain(int id, String development, String currency, String total) {
		super();
		this.id = id;
		this.development = development;
		this.currency = currency;
		this.total = total;
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
	 * @return the development
	 */
	public String getDevelopment() {
		return development;
	}
	/**
	 * @param development the development to set
	 */
	public void setDevelopment(String development) {
		this.development = development;
	}
	/**
	 * @return the currency
	 */
	public String getCurrency() {
		return currency;
	}
	/**
	 * @param currency the currency to set
	 */
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	/**
	 * @return the total
	 */
	public String getTotal() {
		return total;
	}
	/**
	 * @param total the total to set
	 */
	public void setTotal(String total) {
		this.total = total;
	}
	/** 
	* @see java.lang.Object#toString()  
	* @Function: TradeDepartmentDomain.java
	* @Description: 
	*
	* @param:
	* @return：
	* @throws：
	*
	* @version: v1.0.0
	* @author: zongyue
	* @date: 2020年4月26日 下午7:05:07 
	*/
	@Override
	public String toString() {
		return "TradeDepartmentDomain [id=" + id + ", development=" + development + ", currency=" + currency
				+ ", total=" + total + "]";
	}
	
	
}
