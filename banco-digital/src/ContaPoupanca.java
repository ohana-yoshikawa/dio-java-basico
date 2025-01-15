public class ContaPoupanca extends Conta {


    public ContaPoupanca(Clientes cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
            System.out.println("***Extrato Conta poupança***");
            super.imprimirInfosComuns();

    }


}
