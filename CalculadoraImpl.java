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
