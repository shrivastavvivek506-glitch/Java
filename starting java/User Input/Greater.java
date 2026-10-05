import java.util.Scanner;

public class Greater {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Number:");
        
        int a = sc.nextInt();
        System.out.print("Enter Second Number:");

        int b = sc.nextInt();

        if (a > b) {
            System.out.println("a is the Greater then:");

            if (b > a) {
                System.out.println("b is ther Greater then:");

            }

        } else {
            System.out.println("You are Enter the invaled value:");
        }

    }
}
