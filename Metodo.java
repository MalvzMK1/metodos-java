import javax.swing.JOptionPane;
import java.util.Scanner;

class Metodo {
    public static void main(String args[]) {
        JOptionPane jp = new JOptionPane();
        Scanner ler = new Scanner(System.in);

        while (true) {
            System.out.println("\nVocê deseja usar o modo grafico ou modo texto? [grafico/texto]");
            String op = ler.next();

            if (op.equals("grafico")) {
                double n1 = Double.parseDouble(jp.showInputDialog(null, "Insira um valor"));
                double n2 = Double.parseDouble(jp.showInputDialog(null, "Insira outro valor"));

                jp.showMessageDialog(null, "Soma = " + somar(n1, n2));
                jp.showMessageDialog(null, "Subtração = " + subtra(n1, n2));
                jp.showMessageDialog(null, "Divisão = " + divis(n1, n2));
                jp.showMessageDialog(null, "Multiplicação = " + multip(n1, n2));
            }
            else if (op.equals("texto")) {
                System.out.print("Insira um valor: ");
                double scan1 = ler.nextDouble();
                System.out.print("Insira outro valor: ");
                double scan2 = ler.nextDouble();

                System.out.println("Soma = " + somar(scan1, scan2));
                System.out.println("Subtração = " + subtra(scan1, scan2));
                System.out.println("Divisao = " + divis(scan1, scan2));
                System.out.println("Multiplicacao = " + multip(scan1, scan2));
            }  
            else {
                System.out.println("DECO DEDECO BIRICUTECO NA BATIDA DO CANECO TA CHEGANDO O TRAMPOLIM");
            }
            System.out.println("\nDeseja continuar? [s/n]");
            char sn = ler.next().charAt(0);
            if (sn != 's') {
                break;
            }
        }   
    }
    public static double somar(double n1, double n2) {
        return(n1 + n2);
    }
    public static double subtra(double n1, double n2) {
        return(n1 - n2);
    }
    public static double divis(double n1, double n2) {
        return(n1 / n2);
    }
    public static double multip(double n1, double n2) {
        return(n1 * n2);
    }
}