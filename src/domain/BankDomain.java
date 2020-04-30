/**   
 * Copyright © 2020 zongyue All rights reserved.
 * 
 * 功能描述：
 * @Package: domain 
 * @author: zongyue   
 * @date: 2020年4月26日 下午5:10:37 
 */
package domain;

/**   
* Copyright: Copyright (c) 2020
*
* Date         Author          Version           ClassName 
*---------------------------------------------------------*
* 2020年4月26日     zongyue           v1.0.0           BankInfo.java    
*
* @Description: 
*/
public class BankDomain {
	private int id;
	private String qualification;
	private String payInfo;
	private String sevice;
	/**
	 * @return the id
	 */
	
	/**   
	* @Function: BankInfo.java
	* @Description: 
	*
	* @param:
	* @author: zongyue
	* @date: 2020年4月26日 下午5:11:49 
	*/
	public BankDomain() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**   
	* @Function: BankInfo.java
	* @Description: 
	*
	* @param:
	* @author: zongyue
	* @date: 2020年4月26日 下午5:11:57 
	*/
	public BankDomain(int id, String qualification, String payInfo, String sevice) {
		super();
		this.id = id;
		this.qualification = qualification;
		this.payInfo = payInfo;
		this.sevice = sevice;
	}
	
	
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
	 * @return the qualification
	 */
	public String getQualification() {
		return qualification;
	}
	/**
	 * @param qualification the qualification to set
	 */
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	/**
	 * @return the payInfo
	 */
	public String getPayInfo() {
		return payInfo;
	}
	/**
	 * @param payInfo the payInfo to set
	 */
	public void setPayInfo(String payInfo) {
		this.payInfo = payInfo;
	}
	/**
	 * @return the sevice
	 */
	public String getSevice() {
		return sevice;
	}
	/**
	 * @param sevice the sevice to set
	 */
	public void setSevice(String sevice) {
		this.sevice = sevice;
	}

}
