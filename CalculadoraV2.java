import java.util.Scanner;

class CalculadoraV2 {
    public static void main(String args[]) {
        double numero1 = entradaUsuario();
        double numero2 = entradaUsuario();

        double soma = somar(numero1, numero2);
        double diferenca = subtrair(numero1, numero2);
        double produto = multiplicar(numero1, numero2);
        double quociente = dividir(numero1, numero2);

        exibirNaTela(numero1, '+', numero2, soma);
        exibirNaTela(numero1, '-', numero2, diferenca);
        exibirNaTela(numero1, 'x', numero2, produto);
        if (quociente == -1) {
            System.out.println("ERRO: Impossivel dividir por 0 ou numero negativo");
        } else {
            exibirNaTela(numero1, '/', numero2, quociente);
        }
    }

    // Entrada de dados
    public static double entradaUsuario() {
        Scanner ler = new Scanner(System.in);
        System.out.print("Insira um valor: ");
        double numero = ler.nextDouble();
        return(numero);
    }

    public static double somar(double numero1, double numero2) {
        return(numero1 + numero2);
    }

    public static double subtrair(double numero1, double numero2) {
        return(numero1 - numero2);
    }

    public static double multiplicar(double numero1, double numero2) {
        return(numero1 * numero2);
    }

    public static double dividir(double numero1, double numero2) {
        if (numero2 <= 0) {
            return -1;
        }
        return(numero1 / numero2);
    }

    // Saída de dados
    public static void exibirNaTela(double numero1,char operador, double numero2, double resultado) {
        System.out.println(numero1 + " " + operador + " " + numero2 + " = " + resultado);
    }
}