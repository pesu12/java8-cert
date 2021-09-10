package com.per.abstractclasstest;

public abstract class AbstractBaseClass {
	
	public String CATEGORY = "NoCategory";
	
	public AbstractBaseClass() {
		System.out.println("AbstractBaseClass constructed");
	}
	
	public abstract void setCategory(int category);
	public abstract String getCategory();

}
