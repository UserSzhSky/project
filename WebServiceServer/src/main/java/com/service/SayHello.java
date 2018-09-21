package com.service;

import javax.jws.WebService;
import javax.xml.ws.Endpoint;

@WebService
public class SayHello {
    
    //该方法为客户端调用的方法，方法名任意
    public String say(String name){
        Integer x = Integer.valueOf(name);
    	for(int i = 1;i<x;i++) {
    		System.out.println(i);
    	}
    	return x+"";
    }

    public static void main(String[] args) {
        //第一个参数是访问时的url，9091是任意一个不占用的端口
        Endpoint.publish("http://localhost:9091/Service/SayHello", new SayHello());
        System.out.println("service success !");
    }
}