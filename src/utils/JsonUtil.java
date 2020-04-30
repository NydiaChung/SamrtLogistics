/**   
 * Copyright © 2020 zongyue All rights reserved.
 * 
 * 功能描述：
 * @Package: utils 
 * @author: zongyue   
 * @date: 2020年4月26日 上午8:13:55 
 */
package utils;

import java.util.ArrayList;

import java.util.Collection;

import java.util.HashMap;

import java.util.Iterator;

import java.util.List;

import java.util.Map;

import net.sf.ezmorph.object.DateMorpher;
import net.sf.json.JSONArray;

import net.sf.json.JSONObject;

import net.sf.json.JsonConfig;

import net.sf.json.processors.JsDateJsonValueProcessor;

import net.sf.json.util.JSONUtils;


/**   
* Copyright: Copyright (c) 2020
*
* Date         Author          Version           ClassName 
*---------------------------------------------------------*
* 2020年4月26日     zongyue           v1.0.0           JsonUtil.java    
*
* @Description: 
*/
public class JsonUtil {


/**

 * @author ：

 * @date：2014.5.8

 * @reviser：lych

 * @reviseDate：2014.5.8

 * @description：操作Json格式的工具类

 * @version： 1.0

 */



	private static void setDataFormat2JAVA(){

		// 设定日期转换格式

		JSONUtils.getMorpherRegistry().registerMorpher(new DateMorpher(new String[] { "yyyy-MM-dd", "yyyy-MM-dd HH:mm:ss" }));

	}

 

	/**

	 * 将数据对象转换成Json格式字符串

	 * 

	 * @param object  POJO、Collection或Object[]

	 * @return String

	 */

	public static String beanToJson(Object object){

		String jsonString = null;

		// 日期值处理器

		JsonConfig jsonConfig = new JsonConfig();

		jsonConfig.registerJsonValueProcessor(java.util.Date.class, new JsDateJsonValueProcessor());

		if(object != null){

			if(object instanceof Collection || object instanceof Object[]){

				jsonString = JSONArray.fromObject(object, jsonConfig).toString();

			}else{

				jsonString = JSONObject.fromObject(object, jsonConfig).toString();

			}

		}

		return jsonString == null ? "{}" : jsonString;

	}

 

	/**

	 * 将Map数据对象转换成Json格式字符串

	 * 

	 * @param map

	 *            Map对象

	 * @return String

	 */

	public static String mapToJson(Map map){

		return beanToJson(map);

	}

 

	/**

	 * 将Collection数据对象转换成Json格式字符串

	 * 

	 * @param coll

	 *            Collection对象

	 * @return String

	 */

	public static String listToJson(Collection coll){

		return beanToJson(coll);

	}

 

	/**

	 * 将Object数组数据对象转换成Json格式字符串

	 * 

	 * @param objects

	 *            Object对象数组

	 * @return String

	 */

	public static String arrayToJson(Object[] objects){

		return beanToJson(objects);

	}

 

	/**

	 * 将Json格式字符串转换成Java对象

	 * 

	 * @param jsonString

	 *            Json格式字符串

	 * @param beanClass

	 *            Java对象Class

	 * @return Object

	 */

	public static Object jsonToBean(String jsonString,Class beanClass){

		JSONObject jsonObject = null;

		try{

			setDataFormat2JAVA();

			jsonObject = JSONObject.fromObject(jsonString);

		}

		catch (Exception e){

			e.printStackTrace();

		}

		return JSONObject.toBean(jsonObject, beanClass);

	}

 

	/**

	 * 将Json格式字符串转换成Java对象

	 * 

	 * @param jsonString

	 *            Json格式字符串

	 * @param beanClass

	 *            Java对象Class

	 * @param classMap

	 *            包含的对象集合中的Java对象Class

	 * @return Object

	 */

	public static Object jsonToBean(String jsonString,Class beanClass,Map classMap){

		JSONObject jsonObject = null;

		try{

			setDataFormat2JAVA();

			jsonObject = JSONObject.fromObject(jsonString);

		}

		catch (Exception e){

			e.printStackTrace();

		}

		return JSONObject.toBean(jsonObject, beanClass, classMap);

	}

 

	/**

	 * 将Json格式字符串转换成Java对象数组

	 * 

	 * @param jsonString

	 *            Json格式字符串

	 * @param beanClass

	 *            Java对象Class

	 * @return Object[]

	 */

	public static Object[] jsonToArray(String jsonString,Class beanClass){

		setDataFormat2JAVA();

		JSONArray array = JSONArray.fromObject(jsonString);

		Object[] obj = new Object[array.size()];

		for(int i = 0;i < array.size();i++){

			JSONObject jsonObject = array.getJSONObject(i);

			obj[i] = JSONObject.toBean(jsonObject, beanClass);

		}

		return obj;

	}

 

	/**

	 * 将Json格式字符串转换成Java对象数组

	 * 

	 * @param jsonString

	 *            Json格式字符串

	 * @param beanClass

	 *            Java对象Class

	 * @param classMap

	 *            包含的对象集合中的Java对象Class

	 * @return Object[]

	 */

	public static Object[] jsonToArray(String jsonString,Class beanClass,Map classMap){

		setDataFormat2JAVA();

		JSONArray array = JSONArray.fromObject(jsonString);

		Object[] obj = new Object[array.size()];

		for(int i = 0;i < array.size();i++){

			JSONObject jsonObject = array.getJSONObject(i);

			obj[i] = JSONObject.toBean(jsonObject, beanClass, classMap);

		}

		return obj;

	}

 

	/**

	 * 将Json格式字符串转换成Java对象集合
	 * @param jsonString

	 *            Json格式字符串

	 * @param beanClass

	 *            Java对象Class

	 * @return List

	 */

	public static List jsonToList(String jsonString,Class beanClass){

		setDataFormat2JAVA();

		JSONArray array = JSONArray.fromObject(jsonString);

		List list = new ArrayList();

		for(Iterator iter = array.iterator();iter.hasNext();){

			JSONObject jsonObject = (JSONObject) iter.next();

			list.add(JSONObject.toBean(jsonObject, beanClass));

		}

		return list;

	}

 

	/**

	 * 将Json格式字符串转换成Java对象集合

	 * 

	 * @param jsonString

	 *            Json格式字符串

	 * @param beanClass

	 *            Java对象Class

	 * @param classMap

	 *            包含的对象集合中的Java对象Class

	 * @return

	 */

	public static List jsonToList(String jsonString,Class beanClass,Map classMap){

		setDataFormat2JAVA();

		JSONArray array = JSONArray.fromObject(jsonString);

		List list = new ArrayList();

		for(Iterator iter = array.iterator();iter.hasNext();){

			JSONObject jsonObject = (JSONObject) iter.next();

			list.add(JSONObject.toBean(jsonObject, beanClass, classMap));

		}

		return list;

	}

 

	/**

	 * 将Json格式字符串转换成Map对象

	 * 

	 * @param jsonString

	 *            Json格式字符串

	 * @return Map

	 */

	public static Map jsonToMap(String jsonString){

		setDataFormat2JAVA();

		JSONObject jsonObject = JSONObject.fromObject(jsonString);

		Map map = new HashMap();

		for(Iterator iter = jsonObject.keys();iter.hasNext();){

			String key = (String) iter.next();

			map.put(key, jsonObject.get(key));

		}

		return map;

	}

 

	/**

	 * 将Json格式字符串转换成Object对象数组

	 * 

	 * @param jsonString

	 *            Json格式字符串

	 * @return Object[]

	 */

	public static Object[] jsonToArray(String jsonString){

		JSONArray jsonArray = JSONArray.fromObject(jsonString);

		return jsonArray.toArray();

	}

	

	

}

