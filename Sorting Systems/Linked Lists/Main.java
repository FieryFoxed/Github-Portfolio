public class Main {
    public static void main(String[] args) {
        Student info = new Student("Kyle", "Jacobs", 1, "Comp Sci", 3.7, "Freshman");
        info.addCourse("Math");
        info.addCourse("English");
        info.addCourse("Art");

        System.out.printf(info.getStudentInfo());
        info.displayStudentCourses();
        info.removeCourse("Math");
        info.displayStudentCourses();


        Student info2 = new Student("Ellie", "Simons", 2, "Art and Theatre", 4.01, "Junior");
        info2.addCourse("Dance");
        info2.addCourse("Theatre");
        info2.addCourse("Art");

        System.out.printf(info2.getStudentInfo());
        info2.displayStudentCourses();
        info2.removeCourse("Art");
        info2.displayStudentCourses();
    }
}
