import java.io.StringReader;
import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        NumberFormat valores = NumberFormat.getCurrencyInstance();

        String nome = "Pedro";
        double saldoInicial = 2000;
        int opcao = 0;
        String opcoes = " Digite sua opção\n" +
                        " 1- Consultar meu saldo\n" +
                        " 2- Transferir valor\n" +
                        " 3- Receber uma transferência\n" +
                        " 4- Sair\n";

        while(opcao != 4) {
            System.out.println(opcoes);
            opcao = ler.nextInt();

            if (opcao == 1) {
                System.out.println("Olá " + nome + ", seu saldo inicial é: "  + valores.format(saldoInicial));
            } else if (opcao == 2) {
                System.out.println("Qual valor deseja transferir, " + nome + "?");
                double valor = ler.nextDouble();
                if (valor > saldoInicial) {
                    System.out.println("Seu saldo é insuficiente para esta transação");
                } else saldoInicial -= valor;
                System.out.println("Seu saldo atual é: " + valores.format(saldoInicial));
            } else if (opcao == 3 ) {
                System.out.println("Qual valor recebeu? ");
                double valor = ler.nextDouble();
                saldoInicial += valor;
                System.out.println("Seu saldo atualizado é: " + valores.format(saldoInicial));
            } else if (opcao != 4) {
                System.out.println("Comando inválido");
            }
        }
    }
}