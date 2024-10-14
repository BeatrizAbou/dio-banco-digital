public class Main {

    public static void main(String[] args) {
        Cliente ana = new Cliente(null, null, null, null, null, null);
        ana.setNome("Ana", "44448282422", "Casa Azul", "marceneira", "21221222", "cp");

        Conta cc = new ContaCorrente(ana);
        Conta cp = new ContaPoupanca(ana);

        cc.depositar(150);
        cc.transferir(100, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
    
}
