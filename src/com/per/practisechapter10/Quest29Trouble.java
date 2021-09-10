package com.per.practisechapter10;

class Big {
	public Big(boolean stillIn) {
		super();
	}
}

public class Quest29Trouble extends Big{

	//Not valid since super does not have no-arg constructor.
	//public Quest29Trouble() {}
	
	public Quest29Trouble(int deep) {
		super(false);
		
		//this(); this not valid since it must be first.
		//this(); and super(); can not be in the same constructor at the same time
		//this(); is not valid since it will continue forever....
	}
}
