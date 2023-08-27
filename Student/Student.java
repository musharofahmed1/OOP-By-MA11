import java.util.Scanner;
public class Student {
    private String name;
    private double average;

    //constructor 
    public Student(String name, double average){
        this.name = name;
        if(average > 0.0)
            if(average <= 100)
                this.average = average;
    }
    
    //set the student name
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    //set student average
    public double getAverage(){
        return average;
    }
    //get letter
    public String getLetterGrade(){
        String letterGrade = "";

        if(average >= 90.0)
            letterGrade = "A";
        else if(average >= 80.0)
            letterGrade = "A-";
        else if(average >= 70.0)
            letterGrade = "B";
        else if(average >= 60.0)
            letterGrade = "B-";
        else
            letterGrade = "F";
        return letterGrade;
    }
    
    public static void main(String[] args){
        Student student1 = new Student("Musa", 99);
        Student student2 = new Student("Monsur", 59);

        System.out.printf("%s letter grade is : %s%n",student1.getName(),student1.getLetterGrade());

        System.out.printf("%s letter grade is : %s%n",student2.getName(),student2.getLetterGrade());

        //create a Scanner to obtain user input
         Scanner input = new Scanner(System.in);

    }
}
