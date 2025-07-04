import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        while (true) {
            
            System.out.println("1 - Addition\n2 - Subtraction\n3 - Avarage");
            System.out.print("Select a option >> ");

            int choice = input.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.println("option 1");
                    break;
                case 2:
                    System.out.println("option 2");
                    break;
                case 3:
                    System.out.println("option 3");
                    break;
                default:
                    System.out.println("Error invalid input, program aborted");
                    break;
            }

            System.out.println("You want to continue?");
            System.out.print(">>> ");

            choice = input.nextInt();
            if (choice == 2){ System.out.println("Program aborted");input.close();;break;}
            else{System.out.println("Ok");}

        }

    }
}
