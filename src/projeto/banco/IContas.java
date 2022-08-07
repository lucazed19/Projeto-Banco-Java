package projeto.banco;

public interface IContas {
    void sacar(double valor);

    void depoitar(double valor);

    void transferir(double valor, Conta contaDestino);

    void imprimirExtrato();
}
