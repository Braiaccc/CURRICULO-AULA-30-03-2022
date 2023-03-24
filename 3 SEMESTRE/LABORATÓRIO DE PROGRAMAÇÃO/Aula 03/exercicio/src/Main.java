
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, i = 1, soma = 0;

        System.out.print("Digite um número inteiro positivo: ");
        num = input.nextInt();

        while(i <= num){
            soma += i;
            i++;
        }

        System.out.println("A soma dos números naturais até " + num + " é " + soma);

        input.close();
    }
    }

