/**   
 * Copyright © 2020 zongyue All rights reserved.
 * 
 * 功能描述：
 * @Package: domain 
 * @author: zongyue   
 * @date: 2020年4月26日 下午7:05:30 
 */
package domain;

/**   
* Copyright: Copyright (c) 2020
*
* Date         Author          Version           ClassName 
*---------------------------------------------------------*
* 2020年4月26日     zongyue           v1.0.0           TransportDepartmentDomain.java    
*
* @Description: 
*/
public class TransportDepartmentDomain {
	private int id;
	private String needInfo;
	private String carStatistics;
	private String border;
	/**   
	* @Function: TransportDepartmentDomain.java
	* @Description: 
	*
	* @param:
	* @author: zongyue
	* @date: 2020年4月26日 下午7:06:53 
	*/
	public TransportDepartmentDomain() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**   
	* @Function: TransportDepartmentDomain.java
	* @Description: 
	*
	* @param:
	* @author: zongyue
	* @date: 2020年4月26日 下午7:06:55 
	*/
	public TransportDepartmentDomain(int id, String needInfo, String carStatistics, String border) {
		super();
		this.id = id;
		this.needInfo = needInfo;
		this.carStatistics = carStatistics;
		this.border = border;
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
	 * @return the needInfo
	 */
	public String getNeedInfo() {
		return needInfo;
	}
	/**
	 * @param needInfo the needInfo to set
	 */
	public void setNeedInfo(String needInfo) {
		this.needInfo = needInfo;
	}
	/**
	 * @return the carStatistics
	 */
	public String getCarStatistics() {
		return carStatistics;
	}
	/**
	 * @param carStatistics the carStatistics to set
	 */
	public void setCarStatistics(String carStatistics) {
		this.carStatistics = carStatistics;
	}
	/**
	 * @return the border
	 */
	public String getBorder() {
		return border;
	}
	/**
	 * @param border the border to set
	 */
	public void setBorder(String border) {
		this.border = border;
	}
	/** 
	* @see java.lang.Object#toString()  
	* @Function: TransportDepartmentDomain.java
	* @Description: 
	*
	* @param:
	* @return：
	* @throws：
	*
	* @version: v1.0.0
	* @author: zongyue
	* @date: 2020年4月26日 下午7:07:04 
	*/
	@Override
	public String toString() {
		return "TransportDepartmentDomain [id=" + id + ", needInfo=" + needInfo + ", carStatistics=" + carStatistics
				+ ", border=" + border + "]";
	}
	
	
}
