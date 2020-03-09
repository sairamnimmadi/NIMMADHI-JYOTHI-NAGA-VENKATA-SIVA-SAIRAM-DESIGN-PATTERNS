package com.maven.design_patterns;

import com.maven.Bridge_Pattern.DriverBridge;
import com.maven.CommandPattern.DriverCommand;
import com.maven.Prototype.Prototype_Driver;
import com.maven.SingleTon.SingleTon_Driver;
import com.maven.TemplatePattern.Template_Driver;
import Adapter_pattern.Adpter_Driver;

/**
 * Hello world!
 *
 */
public class App 
{
    @SuppressWarnings("unused")
	public static void main( String[] args )
    {
    	Template_Driver t = new Template_Driver();
    	SingleTon_Driver s = new SingleTon_Driver();
		DriverCommand c = new DriverCommand();
		DriverBridge b = new DriverBridge();
		Prototype_Driver p = new Prototype_Driver();
		Adpter_Driver a = new Adpter_Driver();
    }
}
