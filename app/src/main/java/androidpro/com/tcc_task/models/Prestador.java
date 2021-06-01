package androidpro.com.tcc_task.models;

public class Prestador {
    private String nome;
    private int idade;

    public Prestador(String nome, int idade){
        this.nome = nome;
        this.idade = idade;

    }
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
    public boolean idadePrestador(){
        return this.idade >=18;
    }


}
