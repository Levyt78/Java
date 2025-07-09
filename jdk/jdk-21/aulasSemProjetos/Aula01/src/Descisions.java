package src;

import java.util.Scanner;

public class Descisions{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um numero >> ");

        int numero = input.nextInt();

        if(numero % 2 == 0 ){
            System.out.format("O numero %d é par", numero);
        }else{
            System.out.format("O numero %d é impar",numero);
        }

        input.close();
    }

}