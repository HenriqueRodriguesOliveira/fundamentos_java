package pessoa;

public class Pessoa {
    private String nome;
    private int idade;
    private String cpf;

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    String imprimirDadosDaPessoa() {
        return "O nome da pessoa é " + nome + " a idade é " + idade + " o documento é " + cpf;
    }
}
