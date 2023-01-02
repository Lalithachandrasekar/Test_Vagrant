package Utilities;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {
	static String logFileName;
	
	 public static void log(String message) { 
	     PrintWriter out=null;
		try {
			System.out.println(logFileName);
		   	out = new PrintWriter(new FileWriter(System.getProperty("user.dir")+"//Reports//"+logFileName, true), true);
			  out.write(message);
			  out.close();
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Exception while writing to Log file="+ e);
			e.printStackTrace();
		}
	   
	   }

	 public static void createLogFile() {
		 System.out.println("Creating a new log file...");
		  //String randomNumber = Integer.toString(getRandomIntegerBetweenRange(1, 99));
		  logFileName = (new SimpleDateFormat("'LogFile_'ddMMyy_HHmm").format(new Date()));
		 
	 }
	 
	 public static void closeLogFile() {
		 System.out.println("Closing log file...");
		  log("************Close****************");
		  
		
	 }
}
