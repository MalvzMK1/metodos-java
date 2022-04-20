import java.util.Scanner;

class AreaFormas {
    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);


        while (true) {
        System.out.println("\nDeseja calcular a área de qual forma? [quadrado, triangulo, retangulo, circulo, trapezio ou losango]");
        String opForma = ler.next();
        
            if (opForma.equals("quadrado")) {

                System.out.print("\nValor do lado: ");
                double lado = ler.nextDouble();

                System.out.println("\nA área desse quadrado é: " + quadrado(lado));

                System.out.println("\nDeseja continuar? [s/n]");
                String sn = ler.next();

                if (!sn.equals("s")) {
                    System.exit(0);
                }

            } else if (opForma.equals("triângulo") || opForma.equals("triangulo")) {

                System.out.print("\nValor da altura: ");
                double altura = ler.nextDouble();

                System.out.print("Valor da base: ");
                double base = ler.nextDouble();

                System.out.println("\nA área desse triangulo é: " + triangulo(altura, base));

                System.out.println("\nDeseja continuar? [s/n]");
                String sn = ler.next();

                if (!sn.equals("s")) {
                    System.exit(0);
                }

            } else if (opForma.equals("retângulo") || opForma.equals("retangulo")) {

                System.out.print("\nValor da altura: ");
                double altura = ler.nextDouble();

                System.out.print("Valor da base: ");
                double base = ler.nextDouble();

                System.out.println("\nA área desse retangulo é: " + retangulo(altura, base));

                System.out.println("\nDeseja continuar? [s/n]");
                String sn = ler.next();

                if (!sn.equals("s")) {
                    System.exit(0);
                }

            } else if (opForma.equals("círculo") || opForma.equals("circulo")) {

                System.out.print("\nValor do raio: ");
                double raio = ler.nextDouble();

                System.out.println("\nA área desse circulo é: " + circulo(raio));

                System.out.println("\nDeseja continuar? [s/n]");
                String sn = ler.next();

                if (!sn.equals("s")) {
                    System.exit(0);
                }

            } else if (opForma.equals("trapézio") || opForma.equals("trapezio")) {

                System.out.print("\nValor da primeira base: ");
                double base1 = ler.nextDouble();
                System.out.print("Valor da segunda base: ");
                double base2 = ler.nextDouble();
                System.out.print("Valor da altura:");
                double altura = ler.nextDouble();

                System.out.println("\nA área desse trapezio é: " + trapezio(base1, base2, altura));

                System.out.println("\nDeseja continuar? [s/n]");
                String sn = ler.next();

                if (!sn.equals("s")) {
                    System.exit(0);
                }

            } else if (opForma.equals("losango")) {
                
                System.out.print("\nValor da diagonal maior: ");
                double diagonalMaior = ler.nextDouble();
                System.out.print("Valor da diagonal menor: ");
                double diagonalMenor = ler.nextDouble();

                System.out.print("\nA área do losango é: " + losango(diagonalMaior, diagonalMenor));

                System.out.println("\nDeseja continuar? [s/n]");
                String sn = ler.next();

                if (!sn.equals("s")) {
                    System.exit(0);
                }

            } else {

                System.out.println("\nInsira uma forma válida");

            }

        }
    }

    public static double quadrado(double lado) {
        double area = Math.pow(lado, 2);
        return(area);
    }

    public static double retangulo(double altura, double base) {
        double area = altura * base;
        return(area);
    }

    public static double triangulo(double altura, double base) {
        double area = altura * base / 2;
        return(area);
    }

    public static double circulo(double raio) {
        double area = 3.14*Math.pow(raio, 2);
        return(area);
    }

    public static double trapezio(double base1, double base2, double altura) {
        double area = (base1 + base2) * altura / 2;
        return(area);
    }

    public static double losango(double diagonalMaior, double diagonalMenor) {
        double area = diagonalMaior * diagonalMenor / 2;
        return(area);
    }
}