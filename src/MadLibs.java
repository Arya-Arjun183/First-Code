import java.util.Scanner;

/**
 * Project 3
 */
public class MadLibs {
    public static void main(String[] args){
        Scanner foodInput = new Scanner(System.in);
        System.out.println("Please enter a food item: ");
        String food = foodInput.nextLine();
        Scanner adjInput = new Scanner(System.in);
        System.out.println("Please enter an adjective: ");
        String adj = adjInput.nextLine();
        Scanner sportInput = new Scanner(System.in);
        System.out.println("Please enter a sport: ");
        String sport = sportInput.nextLine();
        Scanner hobInput = new Scanner(System.in);
        System.out.println("Please enter a hobby: ");
        String hob = hobInput.nextLine();
        Scanner socteamInput = new Scanner(System.in);
        System.out.println("Please enter a Soccer team: ");
        String socteam = socteamInput.nextLine();
        Scanner animInput = new Scanner(System.in);
        System.out.println("Please enter an animal: ");
        String anim = animInput.nextLine();
        System.out.println("At our school cafeteria, I usually buy " + food + ". It tastes very " + adj + ". My school is really good at " +
                sport + ". I enjoy " + hob + ". My favorite soccer team is " + socteam + ". My friend can make a noise like a " +
                anim + ".");
    }
}
