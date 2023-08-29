// Definição da interface para operações matemáticas
interface Operacao {
    double calcular(double... numeros);
}

// Implementações das operações
class Soma implements Operacao {
    @Override
    public double calcular(double... numeros) {
        double resultado = 0;
        for (double numero : numeros) {
            resultado += numero;
        }
        return resultado;
    }
}

class Subtracao implements Operacao {
    @Override
    public double calcular(double... numeros) {
        if (numeros.length == 0) {
            throw new IllegalArgumentException("Pelo menos um número é necessário.");
        }
        double resultado = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            resultado -= numeros[i];
        }
        return resultado;
    }
}

class Multiplicacao implements Operacao {
    @Override
    public double calcular(double... numeros) {
        double resultado = 1;
        for (double numero : numeros) {
            resultado *= numero;
        }
        return resultado;
    }
}

class Divisao implements Operacao {
    @Override
    public double calcular(double... numeros) {
        if (numeros.length == 0) {
            throw new IllegalArgumentException("Pelo menos um número é necessário.");
        }
        double resultado = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] == 0) {
                throw new ArithmeticException("Divisão por zero não é permitida.");
            }
            resultado /= numeros[i];
        }
        return resultado;
    }
}

// Classe principal que representa a calculadora
class Calculadora {
    private Operacao operacao;

    public Calculadora(Operacao operacao) {
        this.operacao = operacao;
    }

    public double executarOperacao(double... numeros) {
        return operacao.calcular(numeros);
    }
}

public class Main {
    public static void main(String[] args) {
        Operacao soma = new Soma();
        Operacao subtracao = new Subtracao();
        Operacao multiplicacao = new Multiplicacao();
        Operacao divisao = new Divisao();

        Calculadora calculadoraSoma = new Calculadora(soma);
        Calculadora calculadoraSubtracao = new Calculadora(subtracao);
        Calculadora calculadoraMultiplicacao = new Calculadora(multiplicacao);
        Calculadora calculadoraDivisao = new Calculadora(divisao);

        double[] numeros = {10.0, 5.0, 2.0};

        System.out.println("Resultado da soma: " + calculadoraSoma.executarOperacao(numeros));
        System.out.println("Resultado da subtração: " + calculadoraSubtracao.executarOperacao(numeros));
        System.out.println("Resultado da multiplicação: " + calculadoraMultiplicacao.executarOperacao(numeros));
        System.out.println("Resultado da divisão: " + calculadoraDivisao.executarOperacao(numeros));
    }
}
