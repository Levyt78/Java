package src;
// import Scanner 
// Scanner is a input for java
import java.util.Scanner;

public class introctionJava{
    public static void main(String[] args) {
        // print and got to next line
        System.out.println("Hello world");

        //Declaration of Scanner beacause Scanner is a object
        Scanner sc = new Scanner(System.in);

        System.out.println("Please write your name.");

        // Declaration variable String and reciving 
        // user is typing
        String nome = sc.next();

        // Concatenation 
        System.out.format("Hello: "+nome);

        // closing scanner (to save memory)
        sc.close();
    }

}