import java.util.Scanner;

public class UserInput {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scanner.nextLine();

        System.out.println("What is your age?");
        int age = scanner.nextInt();

        scanner.nextLine();

        System.out.println("What is your fav food?");
        String food = scanner.nextLine();
        System.out.println("======================================================");
        System.out.println("Name: "+ name+"\nAge: "+ age + "\nFood: "+food);
        System.out.println("======================================================");

    }
}
