/**   
 * Copyright © 2020 zongyue All rights reserved.
 * 
 * 功能描述：
 * @Package: dao 
 * @author: zongyue   
 * @date: 2020年4月26日 下午7:09:09 
 */
package dao;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;

import domain.TaxDepartmentDomain;
import utils.MongoDBUtils;

/**   
* Copyright: Copyright (c) 2020
*
* Date         Author          Version           ClassName 
*---------------------------------------------------------*
* 2020年4月26日     zongyue           v1.0.0           TaxDepartmentDao.java    
*
* @Description: 
*/
public class TaxDepartmentDao {
	public DBCursor findTaxDepartmentById(int id) throws Exception {
		// TODO Auto-generated method stub
		//根据工具类中的方法获取数据库连接
		DB db = MongoDBUtils.getDB("smart_logistics");
		//根据数据库连接获取对应集合
		DBCollection collection = db.getCollection("tax_department");
		//创建对象DBObject属于BasicDBObject类父接口
		//BasicDBObject底层是hashmap{“_id”：id}
		DBObject basicDBObject = new BasicDBObject();
		//将id添加到BasicDBObject中
		basicDBObject.put("id", id);
		//将basicDBObject作为参数添加到数据库中查询
		DBCursor cursor = collection.find(basicDBObject);
		return cursor;
	}

	
	public void updateTaxDepartment(TaxDepartmentDomain taxDepartmentDomain) throws Exception {
		// TODO Auto-generated method stub
		//获取集合连接
		DBCollection collection=MongoDBUtils.getCollection("smart_logistics", "tax_department");
		//创建对象
		//创建对象DBObject属于BasicDBObject类父接口
		//BasicDBObject底层是hashmap{“_id”：id}
		DBObject basicDBObject = new BasicDBObject();
		DBObject basicDBObject1 = new BasicDBObject();
		//添加数据
		basicDBObject1.put("id", taxDepartmentDomain.getId());
		basicDBObject.put("companyInfo", taxDepartmentDomain.getCompanyInfo());
		basicDBObject.put("taxSubmit", taxDepartmentDomain.getTaxSubmit());
		basicDBObject.put("taxOnline", taxDepartmentDomain.getTaxOnline());
		//使用集合连接将数据库插入到数据库中
		collection.update(basicDBObject1, basicDBObject);

	}

	public void addTaxDepartment(TaxDepartmentDomain taxDepartmentDomain) throws Exception {
		// TODO Auto-generated method stub
		//获取集合连接
				DBCollection collection=MongoDBUtils.getCollection("smart_logistics", "tax_department");
				//创建对象
				//创建对象DBObject属于BasicDBObject类父接口
				//BasicDBObject底层是hashmap{“_id”：id}
				DBObject basicDBObject = new BasicDBObject();
				//添加数据
				basicDBObject.put("id", taxDepartmentDomain.getId());
				basicDBObject.put("companyInfo", taxDepartmentDomain.getCompanyInfo());
				basicDBObject.put("taxSubmit", taxDepartmentDomain.getTaxSubmit());
				basicDBObject.put("taxOnline", taxDepartmentDomain.getTaxOnline());
				//使用集合连接将数据库插入到数据库中
				collection.insert(basicDBObject);
	}

	
	public void deleteTaxDepartmentById(int id) throws Exception {
		// TODO Auto-generated method stub
		//获取集合连接
				DBCollection collection=MongoDBUtils.getCollection("smart_logistics", "tax_department");
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
