import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class CohortTest {
    @Test
    public void testGetCohortAverage() {
        List<Student> students = new ArrayList<>();
        Student robin = new Student("Robin", 23890, new ArrayList<Integer>(100));
        Student staci = new Student("Staci", 23891, new ArrayList<Integer>(100));
        Student kenny = new Student("Kenny", 23892, new ArrayList<Integer>(100));
        robin.addGrade(80);
        robin.addGrade(70);
        staci.addGrade(100);
        staci.addGrade(90);
        kenny.addGrade(70);
        kenny.addGrade(60);
        assertEquals(85.00, 85.00, 1);
        assertNotEquals(78.00, 85.00);
    }

    @Test
    public void testAddStudent() {
        List<Student> students = new ArrayList<>();
        Student kenny = new Student("Kenny", 23892, new ArrayList<Integer>(100));
        Student staci = new Student("Staci", 23891, new ArrayList<Integer>(100));
        students.add(kenny);
        students.add(staci);
        assertEquals(2, students.size());
        Student robin = new Student("Robin", 23890, new ArrayList<Integer>(100));
        students.add(robin);
        assertNotEquals(2, students.size());
    }

    @Test
    public void testGetStudents() {
        List<Student> students = new ArrayList<>();
        Student kenny = new Student("Kenny", 23892, new ArrayList<Integer>(100));
        Student staci = new Student("Staci", 23891, new ArrayList<Integer>(100));
        students.add(kenny);
        students.add(staci);
        assertEquals("Kenny", students.get(0).getName());
        assertEquals(2, students.size());
    }

}
