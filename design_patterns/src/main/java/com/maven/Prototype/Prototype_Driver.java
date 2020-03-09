package com.maven.Prototype;

public class Prototype_Driver {
	public Prototype_Driver() {
		System.out.println();
		System.out.println("Prototype Pattern");
		ColorStore.getColor("blue").addColor(); 
        ColorStore.getColor("black").addColor(); 
        ColorStore.getColor("black").addColor(); 
        ColorStore.getColor("blue").addColor(); 
	}
}
