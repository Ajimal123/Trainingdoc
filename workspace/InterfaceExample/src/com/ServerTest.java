package com;

public class ServerTest {

	public static void main(String[] args) {
		
//		Server ss = new Server();
//		
//		System.out.println("add "+ss.add(100, 200));
//		System.out.println("sub "+ss.sub(200, 50));
//		ss.ownMethod();
		Team1 team1 = new Server();	// creating object and assigning in interface reference. 
		System.out.println("Team1 "+team1.add(100, 200));
	
		//System.out.println("Team1 "+team1.sub(200,40));
		Team2 team2 = new Server();
		System.out.println("Team1 "+team2.sub(100, 20));
	}

}
