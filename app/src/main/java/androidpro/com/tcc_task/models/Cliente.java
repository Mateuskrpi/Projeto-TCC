package androidpro.com.tcc_task.models;

public class Cliente {
    private String nome;
    private int idade;

    public Cliente(String nome, int idade){
        this.nome = nome;
        this.idade = idade;

    }
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public boolean idadeCliente(){
        return this.idade >=18;
    }


}
