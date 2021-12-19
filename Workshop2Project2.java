public class Workshop2Project2 {
    public static void main(String[] args){
        for (int i = 1948; i<= 2068; i++){
            if (i%4 == 0){
                System.out.println(i + " Leap Year !");
            } else if (i == 2007){
                System.out.println(i+" is my birth year! ");
            } else {
                System.out.println(i+" is not noteworthy. :( ");
            }
        }
    }
}
