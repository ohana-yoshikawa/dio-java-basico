public interface IConta {

    void sacar (double valor) throws SaldoInsuficienteExcecao;

    void depositar (double valor);

    void transferencia (Conta contaDestino, double valor) throws SaldoInsuficienteExcecao;

    void imprimirExtrato();
}
