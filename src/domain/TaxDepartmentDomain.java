/**   
 * Copyright © 2020 zongyue All rights reserved.
 * 
 * 功能描述：
 * @Package: domain 
 * @author: zongyue   
 * @date: 2020年4月26日 下午6:39:26 
 */
package domain;

/**   
* Copyright: Copyright (c) 2020
*
* Date         Author          Version           ClassName 
*---------------------------------------------------------*
* 2020年4月26日     zongyue           v1.0.0           TaxDepartmentDomain.java    
*
* @Description: 
*/
public class TaxDepartmentDomain {
	private int id;
	private String companyInfo;
	private String taxSubmit;
	private String taxOnline;
	/**   
	* @Function: TaxDepartmentDomain.java
	* @Description: 
	*
	* @param:
	* @author: zongyue
	* @date: 2020年4月26日 下午6:41:36 
	*/
	public TaxDepartmentDomain() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**   
	* @Function: TaxDepartmentDomain.java
	* @Description: 
	*
	* @param:
	* @author: zongyue
	* @date: 2020年4月26日 下午6:41:39 
	*/
	public TaxDepartmentDomain(int id, String companyInfo, String taxSubmit, String taxOnline) {
		super();
		this.id = id;
		this.companyInfo = companyInfo;
		this.taxSubmit = taxSubmit;
		this.taxOnline = taxOnline;
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
	 * @return the companyInfo
	 */
	public String getCompanyInfo() {
		return companyInfo;
	}
	/**
	 * @param companyInfo the companyInfo to set
	 */
	public void setCompanyInfo(String companyInfo) {
		this.companyInfo = companyInfo;
	}
	/**
	 * @return the taxSubmit
	 */
	public String getTaxSubmit() {
		return taxSubmit;
	}
	/**
	 * @param taxSubmit the taxSubmit to set
	 */
	public void setTaxSubmit(String taxSubmit) {
		this.taxSubmit = taxSubmit;
	}
	/**
	 * @return the taxOnline
	 */
	public String getTaxOnline() {
		return taxOnline;
	}
	/**
	 * @param taxOnline the taxOnline to set
	 */
	public void setTaxOnline(String taxOnline) {
		this.taxOnline = taxOnline;
	}
	/** 
	* @see java.lang.Object#toString()  
	* @Function: TaxDepartmentDomain.java
	* @Description: 
	*
	* @param:
	* @return：
	* @throws：
	*
	* @version: v1.0.0
	* @author: zongyue
	* @date: 2020年4月26日 下午6:41:51 
	*/
	@Override
	public String toString() {
		return "TaxDepartmentDomain [id=" + id + ", companyInfo=" + companyInfo + ", taxSubmit=" + taxSubmit
				+ ", taxOnline=" + taxOnline + "]";
	}
	
}
