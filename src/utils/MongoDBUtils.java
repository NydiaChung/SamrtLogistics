/**   
 * Copyright © 2020 zongyue All rights reserved.
 * 
 * 功能描述：
 * @Package: utils 
 * @author: zongyue   
 * @date: 2020年4月25日 上午10:49:19 
 */
package utils;

import java.net.UnknownHostException;

import javax.xml.bind.DataBindingException;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.Mongo;
import com.mongodb.MongoException;

/**   
* Copyright: Copyright (c) 2020
*
* Date         Author          Version           ClassName 
*---------------------------------------------------------*
* 2020年4月25日     zongyue           v1.0.0           MongoDBUtils.java    
*
* @Description: 连接数据库
*/
public class MongoDBUtils {
	//1.使用connection用来保存Mongo数据库来连接对象
	static Mongo connection = null;
	//2.使用db接受具体的数据库连接
	static DB db = null;
	//3.定义collection接收数据表的连接
	static DBCollection collection=null;
	
	public static DB getDB(String dbName) throws Exception {
		//创建一个Mongo的数据库连接
		connection = new Mongo("127.0.0.1:27017");
		//通过获取数据库的连接对象connection根据传递的数据库名dbName来连接具体的数据库
		db = connection.getDB(dbName);
		//将具体的数据库连接返回给调用者
		return db;
	}
	
	public static DBCollection getCollection(String dbName,String collName) throws Exception {
		//创建一个Mongo的数据库连接
		connection = new Mongo("127.0.0.1:27017");
		//通过获取数据库的连接对象connection根据传递的数据库名dbName来连接具体的数据库
		db = connection.getDB(dbName);
		collection=db.getCollection(collName);
		//将具体的数据库连接返回给调用者
		return collection;
	}
}
