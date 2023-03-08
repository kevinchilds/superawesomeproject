import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a num: ");

        String input = sc.nextLine();

        int num;

        try{
            num = Integer.parseInt(input);
        }catch(Exception e){
            System.out.println("invalid input...");
            return;
        }
        
        if(num % 2 == 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }

    }
}