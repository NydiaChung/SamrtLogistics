/**   
 * Copyright © 2020 zongyue All rights reserved.
 * 
 * 功能描述：
 * @Package: service 
 * @author: zongyue   
 * @date: 2020年4月26日 下午8:36:12 
 */
package service;

import com.mongodb.DBCursor;

import dao.PersonDao;
import domain.PersonDomain;


/**   
* Copyright: Copyright (c) 2020
*
* Date         Author          Version           ClassName 
*---------------------------------------------------------*
* 2020年4月26日     zongyue           v1.0.0           PersonService.java    
*
* @Description: 
*/
public class PersonService {
	PersonDao dao = new PersonDao();
	public DBCursor findPersonById(int id) throws Exception {
		// TODO Auto-generated method stub
		return dao.findPersonById(id);
	}
	public void updatePerson(PersonDomain personDomain) throws Exception {
		dao.updatePerson(personDomain);
	}
	public void addPerson(PersonDomain personDomain) throws Exception {
		// TODO Auto-generated method stub
		dao.addPerson(personDomain);
	}
	public void deletePersonById(int id) throws Exception {
		// TODO Auto-generated method stub
		dao.deletePersonById(id);
	}
	
}
