/**   
 * Copyright © 2020 zongyue All rights reserved.
 * 
 * 功能描述：
 * @Package: dao 
 * @author: zongyue   
 * @date: 2020年4月26日 下午7:08:32 
 */
package dao;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;

import domain.PersonDomain;
import utils.MongoDBUtils;

/**   
* Copyright: Copyright (c) 2020
*
* Date         Author          Version           ClassName 
*---------------------------------------------------------*
* 2020年4月26日     zongyue           v1.0.0           PersonDao.java    
*
* @Description: 
*/
public class PersonDao {
	public DBCursor findPersonById(int id) throws Exception {
		// TODO Auto-generated method stub
		//根据工具类中的方法获取数据库连接
		DB db = MongoDBUtils.getDB("smart_logistics");
		//根据数据库连接获取对应集合
		DBCollection collection = db.getCollection("person");
		//创建对象DBObject属于BasicDBObject类父接口
		//BasicDBObject底层是hashmap{“_id”：id}
		DBObject basicDBObject = new BasicDBObject();
		//将id添加到BasicDBObject中
		basicDBObject.put("id", id);
		//将basicDBObject作为参数添加到数据库中查询
		DBCursor cursor = collection.find(basicDBObject);
		return cursor;
	}

	
	
	public void updatePerson(PersonDomain personDomain) throws Exception {
		// TODO Auto-generated method stub
		//获取集合连接
		DBCollection collection=MongoDBUtils.getCollection("smart_logistics", "person");
		//创建对象
		//创建对象DBObject属于BasicDBObject类父接口
		//BasicDBObject底层是hashmap{“_id”：id}
		DBObject basicDBObject = new BasicDBObject();
		DBObject basicDBObject1 = new BasicDBObject();
		//添加数据
		basicDBObject1.put("id", personDomain.getId());
		basicDBObject.put("payOnline", personDomain.getPayOnline());
		basicDBObject.put("payQuerry", personDomain.getPayQuerry());
		//使用集合连接将数据库插入到数据库中
		collection.update(basicDBObject1, basicDBObject);

	}

	public void addPerson(PersonDomain personDomain) throws Exception {
		// TODO Auto-generated method stub
		//获取集合连接
				DBCollection collection=MongoDBUtils.getCollection("smart_logistics", "person");
				//创建对象
				//创建对象DBObject属于BasicDBObject类父接口
				//BasicDBObject底层是hashmap{“_id”：id}
				DBObject basicDBObject = new BasicDBObject();
				//添加数据
				basicDBObject.put("id", personDomain.getId());
				basicDBObject.put("payOnline", personDomain.getPayOnline());
				basicDBObject.put("payQuerry", personDomain.getPayQuerry());
				//使用集合连接将数据库插入到数据库中
				collection.insert(basicDBObject);
	}

	
	public void deletePersonById(int id) throws Exception {
		// TODO Auto-generated method stub
		//获取集合连接
				DBCollection collection=MongoDBUtils.getCollection("smart_logistics", "person");
				//创建对象
				//创建对象DBObject属于BasicDBObject类父接口
				//BasicDBObject底层是hashmap{“_id”：id}
				DBObject basicDBObject = new BasicDBObject();
				//将id添加到BasicDBObject中
				basicDBObject.put("id", id);
				//使用集合连接对象collection调用方法进行删除
				collection.remove(basicDBObject);
	}
}
