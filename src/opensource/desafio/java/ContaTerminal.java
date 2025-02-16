package opensource.desafio.java;
import java.sql.SQLOutput;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        int numeroDaContaBancaria = 1021;
        int agenciaBancaria = 607-9;
        String nomeCliente = "Mario Andrade";
        double saldo = 237.48;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Programa: Por favor, digite o número da Agência !");
        int numeroAgencia = entrada.nextInt();
        System.out.println("Usuário: " + numeroAgencia + "(Pressione enter para prosseguir)");
        System.out.println("Digite o número da agência!");
        int agenciaBanco = entrada.nextInt();
        System.out.println("Sua agência é: " + agenciaBanco + "(Pressione enter para prosseguir)" );
        System.out.println("Digite seu nome e sobrenome:");
        String nomeSobrenomeCliente = entrada.next();
        System.out.println("Seu nome e sobrenome é: " + nomeSobrenomeCliente + "(Pressione enter para prosseguir)");
        System.out.println("Digite seu saldo atual: ");
        double saldoClienteBanco = entrada.nextDouble();
        System.out.println("Seu saldo atual é de: " + saldoClienteBanco + "(Pressione enter para prosseguir)");
        System.out.println("Questionário finalizado !");
    }
}
