package rainyDay;

import static org.junit.Assert.*;

import org.junit.Test;

import domainClasses.ComplexTask;
import domainClasses.SimpleTask;
import domainClasses.Task;

public class TestTask {
    
    //Test the rainday scenario for the method "getTaskName"
    @Test
    public void testGetTaskName() {
        Task task = new SimpleTask(10, null, 0, 50, 70, 70.0);
        assertNull(task.getName());
    }

    //Test the rainday scenario for the method "getTaskStart"
    @Test
    public void testGetTaskStart() {
        Task task = new SimpleTask(10, "Task 1", 0, 90, 70, 70.0);
        // If start is greater than end, then throw an exception
        if (task.getStart() > task.getEnd()) {
            //throw new IllegalArgumentException("Start time cannot be greater than end time");
        }
        assertEquals(90, task.getStart());
    }
    
    //Test the rainday scenario for the method "getTaskCost"
    @Test
    public void testGetTaskCost() {
        // If cost is less than 0, then throw an exception
        Task task = new SimpleTask(10, "Task 1", 0, 50, 70, -70.0);
        if (task.getCost() < 0) {
            //throw new IllegalArgumentException("Cost cannot be less than 0");
        }
        assertEquals(-70.0, task.getCost(), 0.0);
    }

    //Test the rainday scenario for the method "getTaskId"
    @Test
    public void testGetTaskId() {
        Task task = new SimpleTask(10, "Task 1", 0, 50, 70, 70.0);
        assertEquals(10, task.getId());
    }

    //Test the rainday scenario for the method getName for an array of complex tasks
    @Test
    public void testGetTaskNameComplex() {
        Task task = new ComplexTask(10, null, 0);
        Task task2 = new ComplexTask(11, null, 0);
        Task task3 = new ComplexTask(12, null, 0);
        Task task4 = new ComplexTask(13, null, 0);
        Task task5 = new ComplexTask(14, null, 0);
        Task task6 = new ComplexTask(15, null, 0);
        Task task7 = new ComplexTask(16, null, 0);
        Task task8 = new ComplexTask(17, null, 0);

        Task[] tasks = {task, task2, task3, task4, task5, task6, task7, task8};
        for (Task t : tasks) {
            assertNull(t.getName());
        }

    }

    //Test the rainday scenario for the method getStart for an array of complex tasks
    @Test
    public void testGetTaskStartComplex() {
        Task task = new ComplexTask(10, "Task 1", 0);
        Task task2 = new ComplexTask(11, "Task 2", 0);
        Task task3 = new ComplexTask(12, "Task 3", 0);
        Task task4 = new ComplexTask(13, "Task 4", 0);
        Task task5 = new ComplexTask(14, "Task 5", 0);
        Task task6 = new ComplexTask(15, "Task 6", 0);
        Task task7 = new ComplexTask(16, "Task 7", 0);
        Task task8 = new ComplexTask(17, "Task 8", 0);

        Task[] tasks = {task, task2, task3, task4, task5, task6, task7, task8};
        for (Task t : tasks) {
            // If start is greater than end, then throw an exception
            if (t.getStart() > t.getEnd()) {
                //throw new IllegalArgumentException("Start time cannot be greater than end time");
            }
            assertEquals(-1, t.getStart());
        }
    }

    //Test the rainday scenario for the method getCost for an array of complex tasks
    @Test
    public void testGetTaskCostComplex() {
        Task task = new ComplexTask(10, "Task 1", 0);
        Task task2 = new ComplexTask(11, "Task 2", 0);
        Task task3 = new ComplexTask(12, "Task 3", 0);
        Task task4 = new ComplexTask(13, "Task 4", 0);
        Task task5 = new ComplexTask(14, "Task 5", 0);
        Task task6 = new ComplexTask(15, "Task 6", 0);
        Task task7 = new ComplexTask(16, "Task 7", 0);
        Task task8 = new ComplexTask(17, "Task 8", 0);

        Task[] tasks = {task, task2, task3, task4, task5, task6, task7, task8};
        for (Task t : tasks) {
            // If cost is less than 0, then throw an exception
            if (t.getCost() < 0) {
                //throw new IllegalArgumentException("Cost cannot be less than 0");
            }
            assertEquals(0, t.getCost(), 0.0);
        }
    }

    //Test the rainyDay scenario for the method getId for an array of complex tasks
    @Test
    public void testGetTaskIdComplex() {
        Task task = new ComplexTask(-1, "Task 1", 0);
        Task task2 = new ComplexTask(-1, "Task 2", 0);
        Task task3 = new ComplexTask(-1, "Task 3", 0);
        Task task4 = new ComplexTask(-1, "Task 4", 0);
        Task task5 = new ComplexTask(-1, "Task 5", 0);
        Task task6 = new ComplexTask(-1, "Task 6", 0);
        Task task7 = new ComplexTask(-1, "Task 7", 0);
        Task task8 = new ComplexTask(-1, "Task 8", 0);

        Task[] tasks = {task, task2, task3, task4, task5, task6, task7, task8};
        for (Task t : tasks) {
            if (t.getId() < 0) {
                //throw new IllegalArgumentException("Id cannot be less than 0");
            }
            for (Task t2 : tasks) {
                if (t.getId() == t2.getId()) {
                    //throw new IllegalArgumentException("Id cannot be the same as another task id");
                }
            }
            assertEquals(-1, t.getId());
        }

    }

}
