package vetores;

import java.util.Scanner;

public class Vetores {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("Digite a quantidade de elementos do vetor");
        n = sc.nextInt();

        int[] numeros = new int[n];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite o " + (i + 1) + "° número do vetor ");
            numeros[i] = sc.nextInt();

        }

        int[] par = new int[n], impar = new int[n];

        for (int i = 0; i < numeros.length; i++) {

            if (numeros[i] % 2 == 0 || numeros[i] == 0) {
                par[i] = numeros[i];
                
                System.out.println("O número "+ par[i] +" de índice " + i + " é par");
                
            } else if (numeros[i] % 2 != 0) {
                impar[i] = numeros[i];  
                
                System.out.println("O número "+ impar[i] +" de índice " + i + " é impar");
            }
            
            

        }

    }

}
