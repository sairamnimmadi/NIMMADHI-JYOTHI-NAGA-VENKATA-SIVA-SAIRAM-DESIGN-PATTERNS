package com.maven.TemplatePattern;

public class Template_Driver {
	public Template_Driver() {
		System.out.println("Template Pattern");
    	OrderProcess netOrder = new NetOrder(); 
        netOrder.processOrder(true); 
        System.out.println(); 
        OrderProcess storeOrder = new StoreOrder(); 
        storeOrder.processOrder(true); 
	}
}
