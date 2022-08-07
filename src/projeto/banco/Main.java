package projeto.banco;

public class Main {
    public static void main(String[] args) {
        Conta cc = new ContaCorrente();
        cc.depoitar(100);

        Conta cp = new ContaPoupanca();
        cc.transferir(50,cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}
