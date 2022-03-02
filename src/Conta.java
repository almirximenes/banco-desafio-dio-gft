public abstract class Conta implements IConta {

    protected int agencia;
    protected int numeroConta;
    protected double saldo;
    protected Cliente cliente;
    private static final int AgenciaPadrao = 1;
    private static int Sequencial = 1;

    protected void imprimirInfosComuns() {

        System.out.printf("Titular: %s%n", this.cliente.getNome());
        System.out.printf("Agência: %d", this.agencia);
        System.out.printf("Conta: %d%n", this.numeroConta);
        System.out.printf("Saldo: R$ %.2f", this.saldo);
    }
    public Conta(Cliente cliente) {
        this.agencia = AgenciaPadrao;
        this.numeroConta = Sequencial++;
        this.cliente = cliente;
    }

    public void  emitirComprovante(){
        System.out.printf("Operação realizada com sucesso, saldo atual: R$%.2f%n", this.saldo);
    }

    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
        System.out.printf("Transferência de R$%.2f realizada com sucesso da conta %d para a conta %d, saldo restante:%.2f%n", valor, this.numeroConta, contaDestino.numeroConta, this.saldo);

    }


    public int getAgencia() {
        return agencia;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }
}


