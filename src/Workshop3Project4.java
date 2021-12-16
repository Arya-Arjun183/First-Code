import java.util.*;

class Main {
  public static void main(String[] args) {

    Scanner numInput = new Scanner(System.in);
    String num = numInput.nextLine();
    int n = Integer.parseInt(num);
    int firstTerm = 0, secondTerm = 1;
    ArrayList<Integer> fibonnacciList = new ArrayList<>();
    for (int i = 1; i <= n; i++) {

      int nextTerm = firstTerm + secondTerm;
      firstTerm = secondTerm;
      secondTerm = nextTerm;
      fibonnacciList.add(nextTerm);
      
    }
    System.out.println(fibonnacciList.get(n-1));
  }
}
