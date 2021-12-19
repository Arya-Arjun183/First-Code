import java.util.*;

public class Workshop2Project1 {
    public static void main(String[] args){
        int min = 1;
        int max = 10;
        Scanner userInput = new Scanner(System.in);

        for (int i=min; i <= max; i++){
            int ranVal = (int) (Math.random()*(max-min)) + min;
            if (userInput.nextInt() == ranVal) {
                System.out.println("Correct!");
            }else {
                System.out.println("Try again, you probably shouldn't play lol");
            }
        }
    }
}
