import java.util.LinkedList;

public class Student {
    String firstName;
    String lastName;
    int ID;
    String major;
    String classStanding;
    Double gpa;
    LinkedList<String> courses = new LinkedList<>();

    public Student(String firstName, String lastName, int ID, String major, Double gpa, String classStanding){
        this.firstName = firstName;
        this.lastName = lastName;
        this.ID = ID;
        this.major = major;
        this.gpa = gpa;
        this.classStanding = classStanding;
    }

    public void addCourse(String course){
        courses.add(course);
    }

    public void removeCourse(String course){
        courses.remove(course);
    }

    public String getStudentInfo(){
        return String.format("First name: %s%n Last name: %s%n ID: %d%n Major: %s%n GPA: %f%n Class Standing %s%n", firstName, lastName, ID, major, gpa, classStanding);
    }

    public void displayStudentCourses(){
        System.out.printf("Course: %s%n", courses);
    }


}
