package happyDay;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import org.junit.Test;

import backend.ReportType;
import backend.TaskManager;

public class TestReporter {
    
    @Test
    public void testReporterHappy() {
        TaskManager taskManager = new TaskManager();
        taskManager.load("src/test/resources/input/Eggs.tsv", "\t");
        taskManager.createReport("src/test/resources/output/testReportTXT1", ReportType.TEXT);
        taskManager.createReport("src/test/resources/output/testReportMD1", ReportType.MD);
        taskManager.createReport("src/test/resources/output/testReportHTML1", ReportType.HTML);
        
        try {
  	      File file = new File("src/test/resources/output/testReportTXT1.txt");
  	      Scanner myReader = new Scanner(file);
  	      String line = myReader.nextLine();
  	      line = myReader.nextLine();
  	      String[] test = line.split("\t");
  	      assertEquals(test[1],"Prepare Fry");
  	      myReader.close();
  	    } catch (FileNotFoundException e) {
  	      System.out.println("An error occurred.");
  	      e.printStackTrace();
  	    }
        
        try {
    	      File file = new File("src/test/resources/output/testReportMD1.md");
    	      Scanner myReader = new Scanner(file);
    	      String line = myReader.nextLine();
    	      line = myReader.nextLine();
    	      String[] test = line.split(" ");
    	      assertEquals(test[0],"**100**");
    	      myReader.close();
    	    } catch (FileNotFoundException e) {
    	      System.out.println("An error occurred.");
    	      e.printStackTrace();
    	    }
        
        try {
  	      File file = new File("src/test/resources/output/testReportHTML1.html");
  	      Scanner myReader = new Scanner(file);
  	      String line = myReader.nextLine();
  	      for (int i = 0; i < 12; i ++) {
  	    	line = myReader.nextLine();
  	      }
  	      String[] test = line.split("</td>");
  	      assertEquals(test[0],"<td>	100");
  	      myReader.close();
  	    } catch (FileNotFoundException e) {
  	      System.out.println("An error occurred.");
  	      e.printStackTrace();
  	    }
    }
    
}