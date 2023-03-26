
// EXERCICIO 1
/* public class mediaPonderada {
    public static void main(String[] args) {
        double nota1 = 8.5;
        double peso1 = 3.0;

        double nota2 = 7.5;
        double peso2 = 2.0;

        double nota3 = 6.0;
        double peso3 = 5.0;

        double media = (nota1*peso1 + nota2*peso2 + nota3*peso3) / (peso1 + peso2 + peso3);

        System.out.println("A média do aluno é: " + media);
    }
}

*/

// EXERCICIO 2 

/* public class Exercicio {
    public static void main(String[] args) {
        // Tarefa 1
        System.out.println("Tarefa 1:");
        for (int i = 10; i <= 25; i++) {
            System.out.println(i);
        }

        // Tarefa 2
        System.out.println("Tarefa 2:");
        int soma = 0;
        for (int i = 1; i <= 100; i += 2) {
            soma += i;
        }
        System.out.println("A soma é: " + soma);

        // Tarefa 3
        System.out.println("Tarefa 3:");
        int somaAtual = 0;
        int num = 0;
        while (somaAtual < 100) {
            System.out.println(num);
            somaAtual += num;
            num++;
        }

        // Tarefa 4
        System.out.println("Tarefa 4:");
        for (int i = 1; i <= 10; i++) {
            System.out.println("9 x " + i + " = " + (9*i));
        }
    }
} */

// EXERCICIO 3

/* public class Fibonacci {
    public static void main(String[] args) {
       int n = 15, t1 = 0, t2 = 1;
       System.out.print("Série de Fibonacci: ");
 
       for (int i = 1; i <= n; ++i) {
          System.out.print(t1 + ", ");
 
          int sum = t1 + t2;
          t1 = t2;
          t2 = sum;
       }
    }
 }
  */

// EXERCICIO 4

/* public class ExercicioIfElse {
    public static void main(String[] args) {
        int x = 10; // valor inicial escolhido por mim

        while (x <= 1000) {
            System.out.println("x = " + x);
            if (x % 2 == 0) {
                x += 5;
            } else {
                x *= 2;
            }
        }
    }
} */

/* public class exercicioSwitch {
    public static void main(String[] args) {
        int x = 10; // valor inicial escolhido por mim

        while (x <= 1000) {
            System.out.println("x = " + x);
            switch (x % 2) {
                case 0:
                    x += 5;
                    break;
                case 1:
                    x *= 2;
                    break;
            }
        }
    }
} */

// EXERCICIO 5 

/* public class VerificaData {
    public static void main(String[] args) {
        int dia = 29;
        int mes = 2;
        int ano = 2022;

        // Verifica se o ano é bissexto
        boolean bissexto = ((ano % 4 == 0) && (ano % 100 != 0)) || (ano % 400 == 0);

        // Verifica se a data é válida
        boolean dataValida = false;

        if (mes >= 1 && mes <= 12) {
            if (mes == 2) {
                if (bissexto && dia >= 1 && dia <= 29) {
                    dataValida = true;
                } else if (!bissexto && dia >= 1 && dia <= 28) {
                    dataValida = true;
                }
            } else if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia >= 1 && dia <= 30) {
                dataValida = true;
            } else if (dia >= 1 && dia <= 31) {
                dataValida = true;
            }
        }

        // Imprime a mensagem informando se a data é válida ou inválida
        if (dataValida) {
            System.out.println("Data válida.");
        } else {
            System.out.println("Data inválida.");
        }
    }
}
 */
