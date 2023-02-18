package happyDay;

import static org.junit.Assert.*;

import org.junit.Test;

import backend.TaskManager;
import dom2app.SimpleTableModel;

public class TestTaskManager {
    
    private final String FILEPATH = "src/test/resources/input/Eggs.tsv";
    private final String DELIMITER = "\t";

    @Test
    public void testLoadHappy() {
    	TaskManager test = new TaskManager();
    	SimpleTableModel table = test.load(FILEPATH, DELIMITER);
    	assertEquals("Prepare Fry", table.getValueAt(0,1));
        assertEquals("Turn on burner (low)", table.getValueAt(1,1));
        assertEquals("Break eggs and pour into fry", table.getValueAt(2,1));
        assertEquals("100", table.getValueAt(0,0));
        assertEquals("101", table.getValueAt(1,0));
        assertEquals("102", table.getValueAt(2,0));
        assertEquals("1", table.getValueAt(0,3));
        assertEquals("1", table.getValueAt(1,3));
    	
    }
    
    @Test
    public void testGetTopLevelTasksHappy() {
    	TaskManager test = new TaskManager();
    	test.load(FILEPATH, DELIMITER);
    	SimpleTableModel table = test.getTopLevelTasks();
        assertEquals("Prepare Fry", table.getValueAt(0,1));
        assertEquals("Prepare the bread", table.getValueAt(1,1));
        assertEquals("Serve eggs", table.getValueAt(2,1));
        assertEquals("100", table.getValueAt(0,0));
        assertEquals("200", table.getValueAt(1,0));
        assertEquals("300", table.getValueAt(2,0));
        assertEquals("1", table.getValueAt(0,3));
        assertEquals("10", table.getValueAt(1,3));
    }

    @Test
    public void testGetTaskByIdHappy() {
        TaskManager tm = new TaskManager();
        tm.load(FILEPATH, DELIMITER);
        SimpleTableModel stm = tm.getTaskById(100);
        assertEquals("Prepare Fry", stm.getValueAt(0, 1));
        assertEquals("100", stm.getValueAt(0, 0));
        assertEquals("0", stm.getValueAt(0, 2));
    
    }

    @Test
    public void testGetTaskByPrefixHappy() {
        TaskManager tm = new TaskManager();
        tm.load(FILEPATH, DELIMITER);
        SimpleTableModel stm = tm.getTasksByPrefix("Pr");
        assertEquals("Prepare Fry", stm.getValueAt(0, 1));
        assertEquals("100", stm.getValueAt(0, 0));
        assertEquals("0", stm.getValueAt(0, 2));
    }



}
