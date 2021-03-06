package com.maven.SingleTon;

public class SingleTon_Driver {
	public SingleTon_Driver() {
		System.out.println();
		System.out.println("Singleton Pattern");
		
		Singleton x = Singleton.Singleton(); 
        Singleton y = Singleton.Singleton(); 
        Singleton z = Singleton.Singleton(); 
        x.s = (x.s).toUpperCase(); 
        System.out.println("String from x is " + x.s); 
        System.out.println("String from y is " + y.s); 
        System.out.println("String from z is " + z.s);  
        z.s = (z.s).toLowerCase();
        System.out.println("String from x is " + x.s); 
        System.out.println("String from y is " + y.s); 
        System.out.println("String from z is " + z.s); 
        System.out.println("Object of x if :"+x);
        System.out.println("Object of y if :"+y);
        System.out.println("Object of z if :"+z);
	}
}
