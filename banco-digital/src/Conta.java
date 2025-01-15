public abstract class Conta implements IConta {

    private static final int AGENCIAPADRAO = 0001;

    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Clientes cliente;


    public Conta(Clientes cliente) {
        this.agencia = AGENCIAPADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    @Override
    public void sacar(double valor) throws SaldoInsuficienteExcecao {
        SaldoInsuficienteExcecao.verificarSaldo(valor, saldo);
        saldo -= valor;
        System.out.println("Saque realizado com sucesso.");

    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferencia(Conta ContaDestino, double valor) throws SaldoInsuficienteExcecao {
        SaldoInsuficienteExcecao.verificarSaldo(valor, this.saldo);
        this.sacar(valor);
        ContaDestino.depositar(valor);
    }

    public void depositar() {}

    public void transferir(){}

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void imprimirInfosComuns() {
        System.out.println("Titular: " + this.cliente.getNome());
        System.out.println("Agencia: " + this.agencia);
        System.out.println("Conta: " + this.numero);
        System.out.println("Saldo: " + this.saldo);
    }

}
