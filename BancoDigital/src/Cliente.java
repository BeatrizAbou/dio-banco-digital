public class Cliente {
    private String nome;
    private String cpf;
    private String profissao;
    private String endereco;
    private String telefone;
    private String tipoConta;

    public Cliente(String nome, String cpf, String endereco, String profissao, String telefone, String tipoConta) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.profissao = profissao;
        this.telefone = telefone;
        this.tipoConta = tipoConta;
    }
}
