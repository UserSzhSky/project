package com.client;

import java.net.URL;
import java.util.List;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import webUtil.SayHello;
import webUtil.SayHelloService;

public class HelloClient {

	public static void main(String[] args) {
		SayHello sayHello = new SayHelloService().getSayHelloPort();
        //调用SayHello接口的say方法
        String result = sayHello.say("10");
        //输出返回内容
        System.out.println(result);
	}
}
