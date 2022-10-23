package com.ganesh.apurva;

import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

public class SurpriseWish {
	
	public static void main(String[] args) {
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<|| Please Enter Your Date Baby ||>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		Scanner scan = new Scanner(System.in);
		//System.out.println("===========================================");

		int birthDate = scan.nextInt();
		System.out.println("============================================================================================================================");
        Month birthMonth = Month.OCTOBER;

	   
	    LocalDate currentDate = LocalDate.now();
	    System.out.println("Todays Date: " + currentDate);

	  
	    int date = currentDate.getDayOfMonth();
	    Month month = currentDate.getMonth();

	    if(date == birthDate && month == birthMonth) {
	      System.out.println(" ____  ____                                           ______      _              _     __              __                    \r\n"
	      		+ "|_   ||   _|                                         |_   _ \\    (_)            / |_  [  |            |  ]                   \r\n"
	      		+ "  | |__| |    ,--.    _ .--.    _ .--.     _   __      | |_) |   __    _ .--.  `| |-'  | |--.     .--.| |   ,--.     _   __  \r\n"
	      		+ "  |  __  |   `'_\\ :  [ '/'`\\ \\ [ '/'`\\ \\  [ \\ [  ]     |  __'.  [  |  [ `/'`\\]  | |    | .-. |  / /'`\\' |  `'_\\ :   [ \\ [  ] \r\n"
	      		+ " _| |  | |_  // | |,  | \\__/ |  | \\__/ |   \\ '/ /     _| |__) |  | |   | |      | |,   | | | |  | \\__/  |  // | |,   \\ '/ /  \r\n"
	      		+ "|____||____| \\'-;__/  | ;.__/   | ;.__/  [\\_:  /     |_______/  [___] [___]     \\__/  [___]|__]  '.__.;__] \\'-;__/ [\\_:  /   \r\n"
	      		+ "                     [__|      [__|       \\__.'                                                                     \\__.' ");
			System.out.println("============================================================================================================================");

	    try {
	    	Thread.sleep(3000);
		} catch (Exception e) {
		}  
	    
	    System.out.println("                    ~~\r\n"
	    		+ "                       ||\r\n"
	    		+ "                       ||\r\n"
	    		+ "                 ~~~~~~~~~~~~~~~~~   \r\n"
	    		+ "               |       Hello!     |\r\n"
	    		+ "               |        My!       |\r\n"
	    		+ "            ___|      Apurva !    |___\r\n"
	    		+ "           |     `````````````````    |\r\n"
	    		+ "           |     Congratulations!     |\r\n"
	    		+ "     ______|                          |_____   \r\n"
				+ "     |      ```````````````````````````     | \r\n"
				+ "     |       Happy 23rd Birthday ❤❤!       | \r\n"
				+ "     |______________________________________|     ");
		System.out.println("============================================================================================================================");

	    
	    try {
	    	Thread.sleep(3000);
		} catch (Exception e) {
		}  
	     
	    
	    System.out.println("                                                       \r\n"
	      		+ "     / \\                                                    \r\n"
	      		+ "    / _ \\      _ .--.    __   _    _ .--.   _   __   ,--.   \r\n"
	      		+ "   / ___ \\    [ '/'`\\ \\ [  | | |  [ `/'`\\] [ \\ [  ] `'_\\ :  \r\n"
	      		+ " _/ /   \\ \\_   | \\__/ |  | \\_/ |,  | |      \\ \\/ /  // | |, \r\n"
	      		+ "|____| |____|  | ;.__/   '.__.'_/ [___]      \\__/   \\'-;__/ \r\n"
	      		+ "              [__|                                "); 
	    
		System.out.println("============================================================================================================================");

		
		 try {
		    	Thread.sleep(3000);
			} catch (Exception e) {
			}  
	    
	    System.out.println("Happy Birthday to the love of my life! I promise to stay by your side through thick and thin.\r\n"
	    		+ "\r\n"
	    		+ "                               ♥💏♥💏♥💏♥💏♥💏♥💏♥💏♥💏♥💏♥💏♥\r\n"
	    		+ "\r\n"
	    		+ "You are my everything. My life would have been incomplete without you. Happy Birthday dear, May God bless you.\r\n"
	    		+ "\r\n"
	    		+ "                               ♥💏♥💏♥💏♥💏♥💏♥💏♥💏♥💏♥💏♥💏♥\r\n"
	    		+ "\r\n"
	    		+ "My love for you will never go down, no matter what! You are the biggest reason behind my zeal to move ahead and enjoy life! \r\n"
	    		+ "Happy birthday, dear! I wish you are always with me!\r\n"
	    		+ "\r\n"
	    		+ "                               ♥💏♥💏♥💏♥💏♥💏♥💏♥💏♥💏♥💏♥💏♥\r\n");
	    
	    System.out.println("============================================================================================================================");
	    
	    System.out.println("                                                 💑 Be Always Happy 💑                                                       ");

	    }
	    else {
	      System.out.println("Today is not my birthday.");
	    }
	   }
	}


