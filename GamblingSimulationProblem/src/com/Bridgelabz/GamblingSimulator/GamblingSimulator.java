package com.Bridgelabz.GamblingSimulator;

public class GamblingSimulator {
	
    final int STAKE = 100;
    final int BETS = 1; 
    int GOAL = 50;
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to Gambling");
		GamblingSimulator Gambling = new GamblingSimulator();
		Gambling.winOrLoose();
		Gambling.calculativeGambler();

		}	
		
	public void winOrLoose() {
		
		int Random = (int)Math.round(Math.random()*10)%2;
		if(Random == 1)
			System.out.println("Player is Winner");
		else
			System.out.println("Player Loose the game");
	}
	
	public void calculativeGambler() {

		
		int RandomCheck = (int)Math.round(Math.random()*100);
		
		if(GOAL < RandomCheck)
			System.out.println("player will continue game");
		else
			System.out.println("player will drop out");

	    
		
    }

}
