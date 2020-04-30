/**   
 * Copyright © 2020 zongyue All rights reserved.
 * 
 * 功能描述：
 * @Package: domain 
 * @author: zongyue   
 * @date: 2020年4月26日 下午6:31:01 
 */
package domain;

/**   
* Copyright: Copyright (c) 2020
*
* Date         Author          Version           ClassName 
*---------------------------------------------------------*
* 2020年4月26日     zongyue           v1.0.0           PersonDomain.java    
*
* @Description: 
*/
public class PersonDomain {
	private int id;
	private String payOnline;
	private String payQuerry;
	/**   
	* @Function: PersonDomain.java
	* @Description: 
	*
	* @param:
	* @author: zongyue
	* @date: 2020年4月26日 下午6:32:04 
	*/
	public PersonDomain() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**   
	* @Function: PersonDomain.java
	* @Description: 
	*
	* @param:
	* @author: zongyue
	* @date: 2020年4月26日 下午6:32:13 
	*/
	public PersonDomain(int id, String payOnline, String payQuerry) {
		super();
		this.id = id;
		this.payOnline = payOnline;
		this.payQuerry = payQuerry;
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
	 * @return the payOnline
	 */
	public String getPayOnline() {
		return payOnline;
	}
	/**
	 * @param payOnline the payOnline to set
	 */
	public void setPayOnline(String payOnline) {
		this.payOnline = payOnline;
	}
	/**
	 * @return the payQuerry
	 */
	public String getPayQuerry() {
		return payQuerry;
	}
	/**
	 * @param payQuerry the payQuerry to set
	 */
	public void setPayQuerry(String payQuerry) {
		this.payQuerry = payQuerry;
	}
	/** 
	* @see java.lang.Object#toString()  
	* @Function: PersonDomain.java
	* @Description: 
	*
	* @param:
	* @return：
	* @throws：
	*
	* @version: v1.0.0
	* @author: zongyue
	* @date: 2020年4月26日 下午6:32:25 
	*/
	@Override
	public String toString() {
		return "PersonDomain [id=" + id + ", payOnline=" + payOnline + ", payQuerry=" + payQuerry + "]";
	}
	
	
}
