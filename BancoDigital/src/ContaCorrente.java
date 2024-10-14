public class ContaCorrente extends Conta{

    public ContaCorrente(Cliente cliente){
        super(cliente);
    }

    @Override
    public void imprimirExtrato(){
        System.err.println("=== EXTRATO DA CONTA CORRENTE ===");
        super.imprimirInfos();
    }

}