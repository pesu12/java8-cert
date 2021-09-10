package com.per.practisechapter10;

interface MakesNoise{
}

abstract class Instrument implements MakesNoise{
	public Instrument() {};	
	public Instrument(int beats) {}
	public void play() {}
}

public class Quest69Drum extends Instrument{

	public void play(int count) {}
	public void concert() {
		//super.play(5);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MakesNoise mn = new Quest69Drum();
		//If concert is to be used polymorphicly then it needs to be declared at Makenoice as well.
		//mn.concert();
	}

}
