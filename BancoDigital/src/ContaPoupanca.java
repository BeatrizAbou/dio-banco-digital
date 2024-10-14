public class ContaPoupanca extends Conta{
    public ContaPoupanca(Cliente cliente){
        super(cliente);
    }

    @Override
    public void imprimirExtrato(){
        System.err.println("=== EXTRATO DA CONTA POUPANÇA ===");
        super.imprimirInfos();
    }
    
}
