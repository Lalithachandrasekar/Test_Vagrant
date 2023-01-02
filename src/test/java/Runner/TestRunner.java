package Runner;


import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;


import Utilities.LogFileGenerator;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
					features= {"src/test/resources/Features"},
										
					glue= {"StepDefinition"},
						tags= "@RCB",							
					monochrome = true,
					dryRun=false 					
                )

public class TestRunner {
	
	@BeforeClass 
	 public static void intialSetup() throws IOException
	 {
		 LogFileGenerator.toStartWriteLogFile();  
	 }

	 @AfterClass
	 public static void reportsetup() throws IOException
	 {		
	   LogFileGenerator.toStopWriteLogFile();
	 }
}



