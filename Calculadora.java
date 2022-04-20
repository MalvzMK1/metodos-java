import java.util.Scanner;

class Calculadora {
    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);

        System.out.print("\nPrimeiro numero: ");
        double numero1 = ler.nextDouble();
        System.out.print("Segundo numero: ");
        double numero2 = ler.nextDouble();

        double soma = somar(numero1, numero2);
        double diferenca = subtrair(numero1, numero2);
        double produto = multiplicar(numero1, numero2);
        double quociente = dividir(numero1, numero2);

        System.out.println("\n" + numero1 + " + " + numero2 + " = " + soma);
        System.out.println(numero1 + " - " + numero2 + " = " + diferenca);
        System.out.println(numero1 + " x " + numero2 + " = " + produto);
        if (quociente == -1) {
            System.out.println("Impossível dividir por 0");
        } else {
            System.out.println(numero1 + " / " + numero2 + " = " + quociente);
        }
    }

    // Método somar
    public static double somar(double numero1, double numero2) {
        return(numero1 + numero2);
    }

    // Método subtrair
    public static double subtrair(double numero1, double numero2) {
        return(numero1 - numero2);
    }

    // Método multiplicar
    public static double multiplicar(double numero1, double numero2) {
        return(numero1 * numero2);
    }

    // Método dividir
    public static double dividir(double numero1, double numero2) {
        if (numero2 == 0) {
            return -1;
        }
        return(numero1 / numero2);
    }
}