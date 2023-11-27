import lombok.Getter;

import java.util.ArrayList;

public class Student {
    // returns the student's name
    @Getter
    private String name;
    // returns the student's id
    @Getter
    private long id;
    @Getter
    private ArrayList<Integer> grades;

    public Student(String name, long id, ArrayList<Integer> grades) {
        this.name = name;
        this.id = id;
        this.grades = grades;
    }

    // adds the given grade to the grades list
    public void addGrade(int grade) {
        grades.add(grade);
    }

    // returns the average of the students grades
    public double getGradeAverage() {
        double sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }
}
