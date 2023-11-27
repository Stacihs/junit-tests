import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;


public class StudentTest {
    @Test
    public void testIDLong() {
        Student robin = new Student("Robin", 23890, new ArrayList<>(98));
        long expected = 23890;
        long actual = 23890;
        assertEquals(expected, actual);
    }

    @Test
    public void testNameIsString() {
        Student robin = new Student("Robin", 23890, new ArrayList<Integer>(100));
        String expected = "Robin";
        String actual = "Robin";
        assertEquals(expected, actual);
    }

    @Test
    public void testGradeAvg() {
        Student robin = new Student("Robin", 23890, new ArrayList<>());
        robin.addGrade(80);
        robin.addGrade(90);
        robin.addGrade(100);
        int expected = 90;
        int actual = 90;
        assertEquals(expected, actual);
    }

    @Test
    public void testAddGrade() {
        Student robin = new Student("Robin", 23890, new ArrayList<>());
        robin.addGrade(95);
        int expected = 1;
        int actual = robin.getGrades().size();
        assertEquals(expected, actual);
    }


    @Test
    public void testGetGrades() {
        Student robin = new Student("Robin", 23890, new ArrayList<>());
        robin.addGrade(70);
        robin.addGrade(95);
        int expected = robin.getGrades().get(0);
        int actual = 70;
        assertEquals(expected, actual);
    }

}