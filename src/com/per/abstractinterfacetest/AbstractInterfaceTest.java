package com.per.abstractinterfacetest;

interface Shell {
	abstract int getNumberOfSections();
}
abstract class Insect implements Shell {
	abstract int getNumberOfLegs();
}

public class AbstractInterfaceTest extends Insect{
	int getNumberOfLegs() {
		return 6;
	}

	@Override
	public int getNumberOfSections() {
		// TODO Auto-generated method stub
		return 0;
	}

}
