package aleatorio;

public class Pessoa {
    private String nome;
    private String email;
    private String telefone;

    //Atribuindo dados e métodos para obter os dados
    void setNome(String nome){
        this.nome = nome;
    }

    String getNome(){
        return nome;
    }

    void setEmail(String email){
        this.email = email;
    }

    String getEmail(){
        return email;
    }

    void setTelefone(String telefone){
        this.telefone = telefone;
    }

    String getTelefone(){
        return telefone;
    }
}
