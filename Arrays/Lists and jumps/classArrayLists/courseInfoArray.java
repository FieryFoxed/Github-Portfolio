package classArrayLists;

import java.util.ArrayList;

public class courseInfoArray {
    static ArrayList<String> names = new ArrayList<>();
    static ArrayList<Character> letterGrade = new ArrayList<>();
    static ArrayList<Double> gpa = new ArrayList<>();
    static ArrayList<Integer> score = new ArrayList<>();

    public void addName(String name)
    {
        names.add(name);
    }

    public void addLetterGrade(Character grade)
    {
        letterGrade.add(grade);
    }

    public void addGpa(Double GPA)
    {
        gpa.add(GPA);
    }

    public void addScore(Integer Score)
    {
        score.add(Score);
    }

    public static void displayChart(){
        System.out.println("Name\tGPA\tLetter Grade\tScore");
        for(int i = 0; i < names.size(); i++){
            System.out.printf("%s\t%.2f\t%c\t\t%d%n", names.get(i), gpa.get(i), letterGrade.get(i), score.get(i));
        }
    }

}



