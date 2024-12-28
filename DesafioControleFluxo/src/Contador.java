import java.util.*;

public class Contador{
    public static void main(String[] args)  {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Informe o primeiro valor: ");
        int numeroUm = terminal.nextInt();

        System.out.print("Informe o segundo valor: ");
        int numeroDois = terminal.nextInt();

        try {
            int contagem = contar(numeroUm, numeroDois);
            for (int i = 1; i <= contagem; i++) {
                System.out.println("Imprimindo o número " + i);
            }
        } catch (ParametrosInvalidosException exception) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
    }

    static Integer contar(int numeroUm, int numeroDois) throws ParametrosInvalidosException {
        if (numeroDois < numeroUm) {
            throw new ParametrosInvalidosException();
        }

        int contagem = numeroDois - numeroUm;

        return contagem;
    }
}
