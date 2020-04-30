/**   
 * Copyright © 2020 zongyue All rights reserved.
 * 
 * 功能描述：
 * @Package: dao 
 * @author: zongyue   
 * @date: 2020年4月26日 上午7:44:02 
 */
package dao;

import org.apache.commons.collections.map.StaticBucketMap;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;

import domain.TransportCompanyDomain;
import utils.MongoDBUtils;

/**   
* Copyright: Copyright (c) 2020
*
* Date         Author          Version           ClassName 
*---------------------------------------------------------*
* 2020年4月26日     zongyue           v1.0.0           TransportCompanyDao.java    
*
* @Description: 
*/
public class TransportCompanyDao {

//	public DBCursor findAllTransportCopmpany() throws Exception{
//		//根据工具类中的方法获取数据库连接
//		DB db = MongoDBUtils.getDB("smart_logistics");
//		//根据数据库连接获取对应集合
//		DBCollection collection = db.getCollection("transport_company");
//		//使用colection对象调用方法获取数据
//		DBCursor cursor = collection.find();
//		return cursor;
//	}

	public DBCursor findTransportCopmpanyById(int id) throws Exception {
		//根据工具类中的方法获取数据库连接
		DB db = MongoDBUtils.getDB("smart_logistics");
		//根据数据库连接获取对应集合
		DBCollection collection = db.getCollection("transport_company");
		//创建对象DBObject属于BasicDBObject类父接口
		//BasicDBObject底层是hashmap{“_id”：id}
		DBObject basicDBObject = new BasicDBObject();
		//将id添加到BasicDBObject中
		basicDBObject.put("id", id);
		//将basicDBObject作为参数添加到数据库中查询
		DBCursor cursor = collection.find(basicDBObject);
		return cursor;
	}

	/**   
	* @Function: TransportCompanyDao.java
	* @Description: 
	*
	* @param:
	* @return：
	* @throws：
	*
	* @author: zongyue
	 * @throws Exception 
	* @date: 2020年4月26日 下午2:04:57 
	*/
	public void addTransportCompany(TransportCompanyDomain tcd) throws Exception {
		//获取集合连接
		DBCollection collection=MongoDBUtils.getCollection("smart_logistics", "transport_company");
		//创建对象
		//创建对象DBObject属于BasicDBObject类父接口
		//BasicDBObject底层是hashmap{“_id”：id}
		DBObject basicDBObject = new BasicDBObject();
		//添加数据
		basicDBObject.put("id", tcd.getId());
		basicDBObject.put("goodsInfo", tcd.getGoodsInfo());
		basicDBObject.put("carGoodsMatch", tcd.getCarGoodsMatch());
		basicDBObject.put("carGoodsTrace", tcd.getCarGoodsTrace());
		basicDBObject.put("deviceInfo", tcd.getDeviceInfo());
		basicDBObject.put("transit", tcd.getTransit());
		//使用集合连接将数据库插入到数据库中
		collection.insert(basicDBObject);
	}

	/**   
	* @Function: TransportCompanyDao.java
	* @Description: 
	*
	* @param:
	* @return：
	* @throws：
	*
	* @author: zongyue
	 * @throws Exception 
	* @date: 2020年4月26日 下午2:49:20 
	*/
	public void deleteTransportCompanyById(int id) throws Exception {
		//获取集合连接
		DBCollection collection=MongoDBUtils.getCollection("smart_logistics", "transport_company");
		//创建对象
		//创建对象DBObject属于BasicDBObject类父接口
		//BasicDBObject底层是hashmap{“_id”：id}
		DBObject basicDBObject = new BasicDBObject();
		//将id添加到BasicDBObject中
		basicDBObject.put("id", id);
		//使用集合连接对象collection调用方法进行删除
		collection.remove(basicDBObject);
	}

	/**   
	* @Function: TransportCompanyDao.java
	* @Description: 
	*
	* @param:
	* @return：
	* @throws：
	*
	* @author: zongyue
	 * @throws Exception 
	* @date: 2020年4月26日 下午4:30:54 
	*/
	public void updateTransportCompany(TransportCompanyDomain tcd) throws Exception {
		// TODO Auto-generated method stub
		//获取集合连接
				DBCollection collection=MongoDBUtils.getCollection("smart_logistics", "transport_company");
				//创建对象
				//创建对象DBObject属于BasicDBObject类父接口
				//BasicDBObject底层是hashmap{“_id”：id}
				DBObject basicDBObject = new BasicDBObject();
				DBObject basicDBObject1 = new BasicDBObject();
				//添加数据
				basicDBObject1.put("id", tcd.getId());
				basicDBObject.put("goodsInfo", tcd.getGoodsInfo());
				basicDBObject.put("carGoodsMatch", tcd.getCarGoodsMatch());
				basicDBObject.put("carGoodsTrace", tcd.getCarGoodsTrace());
				basicDBObject.put("deviceInfo", tcd.getDeviceInfo());
				basicDBObject.put("transit", tcd.getTransit());
				//使用集合连接将数据库插入到数据库中
				collection.update(basicDBObject1, basicDBObject);
	}
	
}
