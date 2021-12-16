import java.util.*;

public class userPassword {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String userID = 'hello';
        Scanner passInput = new Scanner(System.in);
        HashMap<String, String> IDStore = new HashMap<>();
        while (userID != 'exit'){
            String userID = userInput.nextLine();
            String passCode = passInput.nextLine();
            IDStore.put(userID, passCode);
        }
        Scanner logIn = new Scanner(System.in);
        String userLog = logIn.nextLine();
        if (IDStore.get(userLog) == True) {
            System.out.println("Username is correct! Passcode: ");
            String passCodeLog = logIn.nextLine();
            if (IDStore.get(userLog) == passCodeLog) {
                System.out.println("Login Successful! ");
                System.out.println("Exit?");
                Scanner exitIn = new Scanner(System.in);
                String exit = exitIn.nextLine();
                if (exit == "yes") {
                    System.out.println("Log out Successful")
                    break
                }
            }
        }
        else{
            System.out.println("Incorrect. Please rerun to retry.")
        }
    }
} 