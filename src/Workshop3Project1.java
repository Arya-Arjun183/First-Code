import java.util.*;

public class Workshop3Project1 {
    public static void main(String[] args){
        var grocerListInput = new Scanner(System.in);
        String groceries = grocerListInput.nextLine();
        ArrayList<String> listGroceries = new ArrayList<>();
        
        if (groceries == "finished"){
            System.out.println(listGroceries.size());
            System.out.println(listGroceries);
        }
        else {
            listGroceries.add(groceries);
        }

    }
}