package rainyDay;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import org.junit.Test;

import backend.ReportType;
import backend.TaskManager;

public class TestReporter {
    
	 @Test
	    public void testReporterRainy() {
	        TaskManager taskManager = new TaskManager();
	        taskManager.load("src/test/resources/input/DoesNotExist.tsv", "\t");
	        taskManager.createReport("src/test/resources/output/testReportTXTRainy", ReportType.TEXT);
	        taskManager.createReport("src/test/resources/output/testReportMDRainy", ReportType.MD);
	        taskManager.createReport("src/test/resources/output/testReportHTMLRainy", ReportType.HTML);
	        
	        try {
	  	      File file = new File("src/test/resources/output/testReportTXTRainy.txt");
	  	      Scanner myReader = new Scanner(file);
	  	      myReader.nextLine();                              // This is the columns line
	  	      assertEquals(false,myReader.hasNextLine());
	  	      myReader.close();
	  	    } catch (FileNotFoundException e) {
	  	      System.out.println("An error occurred.");
	  	      e.printStackTrace();
	  	    }
	        
	        try {
	    	      File file = new File("src/test/resources/output/testReportMDRainy.md");
	    	      Scanner myReader = new Scanner(file);
	    	      myReader.nextLine();                         // This is the columns line
	    	      assertEquals(false,myReader.hasNextLine());
	    	      myReader.close();
	    	    } catch (FileNotFoundException e) {
	    	      System.out.println("An error occurred.");
	    	      e.printStackTrace();
	    	    }
	        
	        try {
	  	      File file = new File("src/test/resources/output/testReportHTMLRainy.html");
	  	      Scanner myReader = new Scanner(file);
	  	      String line = myReader.nextLine();
	  	      for (int i = 0; i < 12; i ++) {
	  	    	line = myReader.nextLine();
	  	      }
	  	      String[] test = line.split("</td>");
	  	      assertEquals(test[0],"<html>");
	  	      myReader.close();
	  	    } catch (FileNotFoundException e) {
	  	      System.out.println("An error occurred.");
	  	      e.printStackTrace();
	  	    }
	    }
}