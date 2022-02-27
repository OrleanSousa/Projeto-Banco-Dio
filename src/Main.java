public class Main {

    public static void main(String[] args) {
        Cliente orlean = new Cliente();
        orlean.setNome("Orlean");


        Conta cc = new ContaCorrente(orlean);

        Conta poupanca = new ContaPoupanca(orlean);

        cc.depositar(100);
        cc.transferir(50, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

    }
}
