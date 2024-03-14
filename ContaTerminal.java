import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("SEU SALDO É: ");
        double saldo = sc.nextDouble();
        System.out.println("Entre com o valor a ser sacado: ");
        double valor_soliciado = sc.nextDouble();

        if (saldo > valor_soliciado) {
            double resultado = saldo - valor_soliciado;
            System.out.println("SEU SALDO AGORA É DE: " + resultado);
        } else {
            System.out.println("SALDO INSUFICIENTE!");
        }
        sc.close();
    }
}
