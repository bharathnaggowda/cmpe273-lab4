package edu.sjsu.cmpe.cache.client;

import com.mashape.unirest.http.Unirest;

import java.util.*;
import java.lang.*;
import java.io.*;

public class Client {

    public static void main(String[] args) throws Exception {
        System.out.println("Starting Cache Client...");
        CRDTClient crdtClient = new CRDTClient();
	System.out.println("putting value a to key 1");
        crdtClient.put(1, "a"); 
	System.out.println("sleeping for 30sec");
        Thread.sleep(30*1000);
       
	System.out.println("putting value b to key 1");
	crdtClient.put(1, "b");
	System.out.println("sleeping for 30sec");
        Thread.sleep(30*1000);
        
        String final_value = crdtClient.get(1);
        System.out.println("get(1) is --" + final_value);

        System.out.println("Exiting Client...");
        Unirest.shutdown();
    }

}
