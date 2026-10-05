import java.util.Scanner;

public class age {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the your age:");

        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("Eglible");


        }

        else{
            System.out.println("Not Eglible Becuse your age is so little in agwe Elglioble n Voting in our country:");
        }
    }
    
}
