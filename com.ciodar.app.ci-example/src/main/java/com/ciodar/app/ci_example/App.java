package com.ciodar.app.ci_example;

/**
 * Hello world!
 *
 */
public class App 
{

	public String sayHello(String name) {
		if (name==null)
			return "Hello";
		else
			return "Hello " + name; 
	}
	
	public String sayHello() {
		return sayHello(null);
	}
}
