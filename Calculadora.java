public abstract class Calculadora {
    public abstract double somar(double numeroUm, double numeroDois);
    public abstract double subtrair(double numeroUm, double numeroDois);
    public abstract double multiplicar(double numeroUm, double numeroDois);
    public abstract double dividir(double numeroUm, double numeroDois);
    public abstract double potencia(double numeroUm, double numeroDois);
    public abstract double raizQuadrada(double numeroUm);
}


public class CalculadoraImpl extends Calculadora {
    public double somar(double numeroUm, double numeroDois) {
        return numeroUm + numeroDois;
    }

    public double subtrair(double numeroUm, double numeroDois) {
        return numeroUm - numeroDois;
    }

    public double multiplicar(double numeroUm, double numeroDois) {
        return numeroUm * numeroDois;
    }

    public double dividir(double numeroUm, double numeroDois) {
        if (numeroDois == 0) {
            System.out.println("Impossível realizar uma divisão por zero.");
            return Double.NaN;
        }
        return numeroUm / numeroDois;
    }

    public double potencia(double numeroUm, double numeroDois) {
        return Math.pow(numeroUm, numeroDois);
    }

    public double raizQuadrada(double numeroUm) {
        if (numeroUm < 0) {
            System.out.println("Não existe raiz de número negativo.");
            return Double.NaN;
        }
        return Math.sqrt(numeroUm);
    }
}


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora = new CalculadoraImpl();

        while (true) {
            System.out.println("Escolha uma operação: +, -, *, /, ^, √ ou Q para sair.");
            String operacao = scanner.next();

            if (operacao.equalsIgnoreCase("Q")) {
                System.out.println("Encerrando calculadora.");
                break;
            }

            double numeroUm, numeroDois = 0;
            
            System.out.print("Informe o primeiro número: ");
            numeroUm = scanner.nextDouble();

            if (!operacao.equals("√")) {
                System.out.print("Informe o segundo número: ");
                numeroDois = scanner.nextDouble();
            }

            switch (operacao) {
                case "+" -> System.out.println("Resultado: " + calculadora.somar(numeroUm, numeroDois));
                case "-" -> System.out.println("Resultado: " + calculadora.subtrair(numeroUm, numeroDois));
                case "*" -> System.out.println("Resultado: " + calculadora.multiplicar(numeroUm, numeroDois));
                case "/" -> System.out.println("Resultado: " + calculadora.dividir(numeroUm, numeroDois));
                case "^" -> System.out.println("Resultado: " + calculadora.potencia(numeroUm, numeroDois));
                case "√" -> System.out.println("Resultado: " + calculadora.raizQuadrada(numeroUm));
                default -> System.out.println("Operação inválida.");
            }
        }

        scanner.close();
    }
}
