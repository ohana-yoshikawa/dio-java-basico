public class Main {

    public static void main(String[] args) throws SaldoInsuficienteExcecao {
        Clientes venilton = new Clientes();
        venilton.setNome("Venilton");

        Conta cc = new ContaCorrente(venilton);
        Conta cp = new ContaPoupanca(venilton);

        cc.depositar(100);

     try {
         cc.sacar(150);
      } catch (SaldoInsuficienteExcecao e) {
         System.out.println("erro: " + e.getMessage());
     }

        cc.imprimirExtrato();
        cp.imprimirExtrato();

     try {
         cc.transferencia(cp, 150);
     } catch (SaldoInsuficienteExcecao e) {
         System.out.println("erro: " + e.getMessage());
     }

    }
}
