import java.util.Scanner;

public class contaTerminal {


    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int numero;
        String agencia, nomeCliente;
        double saldo;

        System.out.println("Por favor, digite o número da conta! ");
        numero = Integer.parseInt(sc.nextLine());
        
        System.out.println("Por favor, digite o número da Agẽncia! ");
        agencia = sc.nextLine();
        
        System.out.println("Por favor, digite o seu nome! ");
        nomeCliente = sc.nextLine();
        
        System.out.println("Por favor, digite o saldo da conta! ");
        saldo = Double.parseDouble(sc.nextLine());

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque", nomeCliente, agencia, numero, saldo);

    }
}
