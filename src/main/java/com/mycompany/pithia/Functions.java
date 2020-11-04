package com.mycompany.pithia;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;

public class Functions {

    DB db;
    MongoClient mongoClient;
    MongoClientURI uri = new MongoClientURI("mongodb://mongo:password@pithia-shard-00-00.jepfn.gcp.mongodb.net:27017,pithia-shard-00-01.jepfn.gcp.mongodb.net:27017,pithia-shard-00-02.jepfn.gcp.mongodb.net:27017/Pithia?ssl=true&replicaSet=atlas-12saty-shard-0&authSource=admin&w=majority");
    DBCursor cursor;
    BasicDBObject query;
    DBCollection collection;
    
    
    public Functions(){
        MongoClient mongoClient = new MongoClient(uri);
        db = mongoClient.getDB("Pithia");
    }
    
    
    public boolean checkIfExists(String coll, String field, String value){
                            
        int count = 0;
            
        collection = db.getCollection(coll);  
        query = new BasicDBObject(field, new BasicDBObject("$eq", value));
        cursor = collection.find(query);
            
        try {
            while (cursor.hasNext()) {
                count++;
            }
        } finally {
            cursor.close();
        }
        
        if(count > 0){
            return true;
        }else{
            return false;
        }
        
    }
    
    
    public String getValue(String coll, String field, String value){
                
        collection = db.getCollection(coll);  
        query = new BasicDBObject(field, new BasicDBObject("$eq", value));
        cursor = collection.find(query);
        
        return cursor.next().get(field).toString();           
        
    }
    
    
    public DBCursor getValues(String coll, String field, String value){
        
        collection = db.getCollection(coll);  
        query = new BasicDBObject(field, new BasicDBObject("$eq", value));
        cursor = collection.find(query);
        
        return cursor;

    }
    
    public DBCursor getArrayValues(String coll, String field, String value){
        
        collection = db.getCollection(coll);  
        query = new BasicDBObject(field, new BasicDBObject("$elemMatch", value));
        cursor = collection.find(query);
        
        return cursor;

    }
    
    public void updateValue(String coll, String queryField, String queryValue, String field, String value){
        
        BasicDBObject searchQuery = new BasicDBObject();
        searchQuery.append(queryField, queryValue);

        BasicDBObject updateQuery = new BasicDBObject();
        updateQuery.append("$set", new BasicDBObject().append(field, value));
    
        db.getCollection(coll).update(searchQuery, updateQuery);
                
    }
    
    public void addField(String coll, String documentID, String newField, String fieldValue){
        
        BasicDBObject update = new BasicDBObject();
        update.put("$set", new BasicDBObject(documentID, new BasicDBObject(newField, fieldValue)));

        db.getCollection("customerCollection").update(query, update);
                
    }
    
    public void removeField(String coll, String documentID, String field){
        
        BasicDBObject update = new BasicDBObject();
        update.put("$unset", new BasicDBObject(documentID, new BasicDBObject(field, null)));

        db.getCollection("customerCollection").update(query, update);
                
    }
    
}
