package org.mongodb;



import java.util.List;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.Mongo;

public class helloMongoDB {

	public static void main(String[] args) {
		Mongo mongo=null;
		DB db=null;
		DBCollection table=null;
		System.out.println("Im in");
		
		try {
			mongo=new Mongo("localhost",27017);
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		db=mongo.getDB("testdb");
		table=db.getCollection("testcoll");
		
		table.drop();
		//list all database
		System.out.println("\n Databases");
		List<String> dbs=mongo.getDatabaseNames();
		for(String dbset:dbs) {
			System.out.println(dbset);
		}
		
		
	}
	
}
