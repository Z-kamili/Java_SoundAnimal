package com.Animaux.app;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myInput = new Scanner(System.in);
		int choix,quity = 2;
		while(quity == 2) {
		System.out.println("Sound Lion choice     1 : ");
		System.out.println("Sound Sauvage  choice 2 : ");
		System.out.println("Sound Animal  choice  3 : ");
		choix = myInput.nextInt();
		
		
			switch(choix){
			case 1:
				Lion L1 = new Lion("Lion","cat 2",200,100);
				String path  = "C:\\Users\\Admin\\Downloads\\LionGrowlAngryGene-PE931903.wav";
			try{
				
				
			L1.ReadSound(path);
			
				
			}catch(Exception e){
				
				System.err.println(e);
				
			}
			break;
			
			case 2 : 
				Sauvage S1 = new Sauvage("Lion","cat_3",200);
				String path_2  = "C:\\Users\\Admin\\Downloads\\Horse-Neighing-Twice.wav";
			try {
				
				
				S1.ReadSound(path_2);
			
				
			}catch(Exception e) {
				
				System.err.println(e);
				
			}
			break;
			
			case 3 :
				Animal A1 = new Animal("Lion","cat_4",200);
				String path_3  = "C:\\Users\\Admin\\Downloads\\beautiful-birds-singing.wav";
			try {
				
				
			A1.ReadSound(path_3);
			
				
			}catch(Exception e){
				
				System.err.println(e);
				
			}
			break;
			default : System.out.println("error !!!!");
			
			}
			
			System.out.println("if you want to quity choice 1:yes 2:No");
			quity = myInput.nextInt();
			
		}
		
		System.out.println("Finish !!!!");

	

		
		
		
		

	}

}
