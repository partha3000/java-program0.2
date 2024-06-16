import java.util.Scanner;

public class ifElse {
    public static void main (String[] args){
        int user;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the all number");
        user = scanner.nextInt();

        if (user % 2 ==0)
        {
            System.out.println("Enter the Even number ");
        }else {
            System.out.println("Enter the odd number ");
        }

    }
}
