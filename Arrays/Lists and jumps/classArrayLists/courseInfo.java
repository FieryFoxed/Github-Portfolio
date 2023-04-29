package classArrayLists;
import java.util.Scanner;
public class courseInfo {
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        courseInfoArray course = new courseInfoArray();


        while(true) {
            System.out.println("What is the student's name or press q to quit: ");
            String name = keyboard.nextLine();
            if(name.equals("q")) {
                break;
            }
            else {
                course.addName(name);
                System.out.println("What is the student's gpa or press q to quit: ");
                String gpa = keyboard.nextLine();
                if(gpa.equals("q")){
                    break;
                }
                else {
                    double GPA = Double.parseDouble(gpa);
                    course.addGpa(GPA);
                    System.out.println("What letter grade did the student receive or press q to quit: ");
                    String letterGrade = keyboard.next();
                    if (letterGrade.equals("q")){
                        break;
                    }
                    else {
                        Character LetterGrade = letterGrade.charAt(0);
                        course.addLetterGrade(LetterGrade);
                        System.out.println("What is the score the student received or press q to quit: ");
                        String score = keyboard.nextLine();
                        if (score.equals("q")) {
                            break;
                        } else {
                            int Score = Integer.parseInt(score);
                            course.addScore(Score);
                        }
                    }
                }
            }
        }


    course.displayChart();



    }
}
