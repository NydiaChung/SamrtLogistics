/**   
 * Copyright © 2020 zongyue All rights reserved.
 * 
 * 功能描述：
 * @Package: domain 
 * @author: zongyue   
 * @date: 2020年4月26日 下午6:28:05 
 */
package domain;

import java.util.PrimitiveIterator;

/**   
* Copyright: Copyright (c) 2020
*
* Date         Author          Version           ClassName 
*---------------------------------------------------------*
* 2020年4月26日     zongyue           v1.0.0           GoodsAgentDomain.java    
*
* @Description: 
*/
public class GoodsAgentDomain {
	private int id;
	private String goodsInfo;
	private String carGoodsTrace;
	private String policy;
	private String need;
	private String pay;
	/**   
	* @Function: GoodsAgentDomain.java
	* @Description: 
	*
	* @param:
	* @author: zongyue
	* @date: 2020年4月26日 下午6:29:44 
	*/
	public GoodsAgentDomain() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**   
	* @Function: GoodsAgentDomain.java
	* @Description: 
	*
	* @param:
	* @author: zongyue
	* @date: 2020年4月26日 下午6:29:51 
	*/
	public GoodsAgentDomain(int id, String goodsInfo, String carGoodsTrace, String policy, String need, String pay) {
		super();
		this.id = id;
		this.goodsInfo = goodsInfo;
		this.carGoodsTrace = carGoodsTrace;
		this.policy = policy;
		this.need = need;
		this.pay = pay;
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
	 * @return the policy
	 */
	public String getPolicy() {
		return policy;
	}
	/**
	 * @param policy the policy to set
	 */
	public void setPolicy(String policy) {
		this.policy = policy;
	}
	/**
	 * @return the need
	 */
	public String getNeed() {
		return need;
	}
	/**
	 * @param need the need to set
	 */
	public void setNeed(String need) {
		this.need = need;
	}
	/**
	 * @return the pay
	 */
	public String getPay() {
		return pay;
	}
	/**
	 * @param pay the pay to set
	 */
	public void setPay(String pay) {
		this.pay = pay;
	}
	/** 
	* @see java.lang.Object#toString()  
	* @Function: GoodsAgentDomain.java
	* @Description: 
	*
	* @param:
	* @return：
	* @throws：
	*
	* @version: v1.0.0
	* @author: zongyue
	* @date: 2020年4月26日 下午6:30:10 
	*/
	@Override
	public String toString() {
		return "GoodsAgentDomain [id=" + id + ", goodsInfo=" + goodsInfo + ", carGoodsTrace=" + carGoodsTrace
				+ ", policy=" + policy + ", need=" + need + ", pay=" + pay + "]";
	}
	
	
}
