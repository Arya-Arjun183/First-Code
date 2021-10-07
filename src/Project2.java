import java.util.Scanner;

/**
 * This is project2
 */
public class Project2 {
    public static void main(String[] args){
        Scanner numOne_input = new Scanner(System.in);
        int numOne = numOne_input.nextInt();
        Scanner numTwo_input = new Scanner(System.in);
        int numTwo = numTwo_input.nextInt();
        Scanner numThree_input = new Scanner(System.in);
        int numThree = numThree_input.nextInt();
        Scanner numFour_input = new Scanner(System.in);
        int numFour = numFour_input.nextInt();
        Scanner numFive_input = new Scanner(System.in);
        int numFive = numFive_input.nextInt();
        int sum = numOne+numTwo+numThree+numFour+numFive;
        System.out.println(sum);

    }
}
