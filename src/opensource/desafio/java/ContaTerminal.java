package opensource.desafio.java;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        //TODO:"CONHECER e importar a classe Scanner"
        //Exibir as mensagens para o nosso usuário
        //Obter pela scanner os valores digitados no terminal
        //Exibir a mensagem da conta criada

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a agência bancária !");
        String agencia = entrada.nextLine();

        System.out.println("Agora, digite o número da Agência !");
        int numero = entrada.nextInt();


        entrada.nextLine();

        System.out.println("Digite seu nome e sobrenome: ");
        String nomeDoCliente = entrada.nextLine();

        System.out.println("Digite seu saldo atual: ");
        double saldoClienteBanco = entrada.nextDouble();

        System.out.println("Olá nobre, " + nomeDoCliente + ", agradecemos por escolher o melhor e maior banco, " + " sua agência é " + agencia + ", conta " + numero + " e seu saldo atual é de " + saldoClienteBanco + " e já está disponível para o saque! " + " Agradecemos por a escolha.");

        System.out.println("Conta criada com sucesso!");

        entrada.close();
    }
}
