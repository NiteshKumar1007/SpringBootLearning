package com.Nitesh.JavaFullStack.SpringBoot.Week_1.Introduction_Week_1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DBService {


              //  this is  Field Injection , which is less use
//    @Autowired
//    private DB db;


            // this is Constructor Injection , high use
    final private DB db;

    public DBService(DB db){
        this.db = db;
    }

    String getData(){
        return db.getData();
    }
}
