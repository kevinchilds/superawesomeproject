import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //This is DEVS comment
        boolean running = true;
        int num;
        while(running){
            System.out.print("Enter a num: ");
            //this is my comment
            String input = sc.nextLine();

            try{
                num = Integer.parseInt(input);
                running = false;

                System.out.println("The number " + num);
                if(num % 2 == 0){
                    System.out.println(" is even");
                }else{
                    System.out.println(" is odd");
                }
            }catch(Exception e){
                System.out.println("invalid input...");
                continue;
            }
        }        
       

    }
}