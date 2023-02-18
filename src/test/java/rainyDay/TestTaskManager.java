package rainyDay;

import static org.junit.Assert.*;

import org.junit.Test;

import backend.TaskManager;
import dom2app.SimpleTableModel;

public class TestTaskManager {

    @Test
    public void testLoadRainy() {
        // Test for a file that does not exist
        TaskManager test = new TaskManager();
    	SimpleTableModel table = test.load("src/test/resources/input/DoesNotExist.tsv", "\t");
    	assertEquals(0, table.getData().size());
    	
    	// Non-valid delimiter
    	table = test.load("src/test/resources/input/Eggs.tsv", ",");
    	assertEquals(0, table.getData().size());
    }
    
    @Test
    public void testGetTopLevelTasksRainy() {
        // Test for a file that does not exist
        TaskManager test = new TaskManager();
        test.load("src/test/resources/input/DoesNotExist.tsv", "\t");
    	SimpleTableModel table = test.getTopLevelTasks();
    	assertEquals(0, table.getData().size());
    	
    	// Non-valid delimiter
    	test.load("src/test/resources/input/Eggs.tsv", ",");
    	table = test.getTopLevelTasks();
    	assertEquals(0, table.getData().size());
    }
    
    @Test
    public void testGetTasksByPrefixRainy() {
    	// Wrong prefix
        TaskManager test = new TaskManager();
    	test.load("src/test/resources/input/Eggs.tsv", "\t");
    	SimpleTableModel table = test.getTasksByPrefix("bla bla");
    	assertEquals(0, table.getData().size());
    }
    
    @Test
    public void testGetTaskByIdRainy() {
    	// Wrong id
        TaskManager test = new TaskManager();
    	test.load("src/test/resources/input/Eggs.tsv", "\t");
    	SimpleTableModel table = test.getTaskById(-1);
    	assertEquals(0, table.getData().size());
    }

}
