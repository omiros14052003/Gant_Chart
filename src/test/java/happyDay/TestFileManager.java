package happyDay;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import domainClasses.Task;
import fileManager.FileManager;

public class TestFileManager {
    
    @Test
    public void testReadFileHappy() {
        FileManager fm = new FileManager("src/test/resources/input/Eggs.tsv", "\t");
        ArrayList<Task> tasks = new ArrayList<>();
        tasks = fm.giveTasks();
        assertEquals("Prepare Fry", tasks.get(0).getName());
        assertEquals("Turn on burner (low)", tasks.get(1).getName());
        assertEquals("Break eggs and pour into fry", tasks.get(2).getName());
        assertEquals(100, tasks.get(0).getId());
        assertEquals(101, tasks.get(1).getId());
        assertEquals(102, tasks.get(2).getId());
        assertEquals(1, tasks.get(0).getStart());
        assertEquals(1, tasks.get(1).getStart());
    }

}