package jrx.practise.collections;

import java.io.Serializable;

public class Person2 implements Serializable {
	private String name;
    private int age;
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}

    public Person2(String name, int age)
    {
    	this.name = name;
    	this.age = age;
    }
}
