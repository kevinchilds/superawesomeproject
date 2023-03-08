import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //This is DEVS comment
        boolean running = true;
        int num;
        while(running){
            System.out.print("Enter a num: ");

            String input = sc.nextLine();

            try{
                num = Integer.parseInt(input);
                running = false;

                if(num % 2 == 0){
                    System.out.println("Even");
                }else{
                    System.out.println("Odd");
                }
            }catch(Exception e){
                System.out.println("invalid input...");
                continue;
            }
        }        
       

    }
}