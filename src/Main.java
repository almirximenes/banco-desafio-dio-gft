public class Main {
    public static void main(String[] args) {
        Cliente almir = new Cliente();
        almir.setNome("Almir");
        Conta cc = new ContaCorrente(almir);
        cc.depositar(50);
        cc.emitirComprovante();
        cc.depositar(70);
        cc.emitirComprovante();
        Conta poupanca = new ContaPoupanca(almir);
        cc.transferir(30, poupanca);
        poupanca.transferir(15, cc);
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
