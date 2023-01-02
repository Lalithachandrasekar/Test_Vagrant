package PageObjects;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.JSONException;
import org.json.JSONObject;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class TestVagrant extends Thread {
	
	public void ForeignPlayer() throws  IOException, JSONException, ParseException  
	{
		
	FileReader reader = new FileReader("src/test/resources/Files/TeamJson.txt");                        
        JSONParser jsonParser = new JSONParser();
        Object obj =  jsonParser.parse(reader);
        
        JSONObject testObject1 = (JSONObject) obj;
   
        JSONArray Player =  (JSONArray) testObject1.get("player"); 
        
        int ForeignPlayerCount=0;
        System.out.println("Size of Object : "+testObject1.length());
        System.out.println("Total no.of Players : "+Player.size());
       
       for(int i=0;i<Player.size();i++)
        {
    	   if(testObject1.get("player.country")!="India")
    	   {
    		   ForeignPlayerCount++;
    	   }
    	   }
         System.out.println("Total no.of Foreign Players : "+ForeignPlayerCount);	
        
	if(ForeignPlayerCount==4)
	{
		System.out.println("The Team has only 4 Foreign Players ");	
        
	}else 
	{
		System.out.println("The Team has more than 4 Foreign Players ");
	}
	}
	
	public void WicketKeeper() throws IOException, ParseException, JSONException
	{
		FileReader reader = new FileReader("src/test/resources/Files/TeamJson.txt");                        
        JSONParser jsonParser = new JSONParser();
        Object obj =  jsonParser.parse(reader);
        
        JSONObject testObject1 = (JSONObject) obj;
        
        JSONArray Player =  (JSONArray) testObject1.get("player");            
        int WicketKeeper=0;

        for(int i=0;i<Player.size();i++)
         {
     	   if(testObject1.get("player.role")=="Wicket-keeper"||testObject1.get("player.role")=="All-Rounder")
     	   {
     		  WicketKeeper++;
     	   }
     	   }
          System.out.println("Total no.of WicketKeepers in the Team : "+WicketKeeper);
          
          if (WicketKeeper>0)
          {
        	  System.out.println("Team has "+WicketKeeper +"  WicketKeepers ");  
          }
          else {
        	  System.out.println("Team has "+WicketKeeper +"  WicketKeepers ");  
          }
	}
}