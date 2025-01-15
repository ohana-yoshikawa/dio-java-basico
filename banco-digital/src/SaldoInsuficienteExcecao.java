public class SaldoInsuficienteExcecao extends Exception{




    public SaldoInsuficienteExcecao(String mensagem) {
        super(mensagem);
    }

    static void verificarSaldo(double valor, double saldo) throws SaldoInsuficienteExcecao{
        if (saldo < valor) {
            throw new SaldoInsuficienteExcecao("Saldo insuficiente");
        }

    }
}
