import java.util.Scanner;

/*
*Project 1
 */
public class Project1 {
    public static void main(String[] args){
    // Name
    Scanner nameInput = new Scanner(System.in);
    System.out.println("Please enter your name: ");
    String name = nameInput.nextLine();
    System.out.println("Hello " + name);
    //Age
    Scanner ageInput = new Scanner(System.in);
    System.out.println("Please enter your age: ");
    String age = ageInput.nextLine();
    System.out.println(age);
    // Grade
    Scanner gradeInput = new Scanner(System.in);
    System.out.println("Please enter your grade: ");
    String grade = gradeInput.nextLine();
    System.out.println(grade);
    //School
    Scanner schoolInput = new Scanner(System.in);
    System.out.println("Please enter your school: ");
    String school = schoolInput.nextLine();
    System.out.println(school);
    //City
    Scanner cityInput = new Scanner(System.in);
    System.out.println("Please enter your city: ");
    String city = cityInput.nextLine();
    System.out.println(city);
}}

