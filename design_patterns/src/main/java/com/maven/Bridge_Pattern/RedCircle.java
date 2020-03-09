package com.maven.Bridge_Pattern;

public class RedCircle implements DrawAPI{
	public void drawCircle(int radius, int x, int y) {
	      System.out.println("Drawing Circle of [ color: red, radius: " + radius + ", x: " + x + ", " + y + "]");
	   }
}
