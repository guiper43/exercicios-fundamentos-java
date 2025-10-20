package pessoa;

public class Pessoa {
    private String nome;
    private int idade;
    private String cidade;

    public void exibirDados() {
        System.out.println("Essa pessoa tem o nome : " + nome + " com a idade de: " + idade + " e vive na cidade de: " + cidade);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }



}
