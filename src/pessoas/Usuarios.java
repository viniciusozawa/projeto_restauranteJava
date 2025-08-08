/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pessoas;

/**
 *
 * @author Otávio
 */
public abstract class Usuarios {
    private String nome;
    private String cpf;
    private String id;
    private String telefone;

    public Usuarios(String nome, String cpf, String telefone) {
        
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome não pode ser vazio.");
        }
        if (cpf == null || cpf.trim().isEmpty()) {
            throw new IllegalArgumentException("CPF não pode ser vazio.");
        }
        if (telefone == null || telefone.trim().isEmpty()) {
            throw new IllegalArgumentException("Telefone não pode ser vazio.");
        }
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
    }
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getId() {
        return id;
    }

    protected void setId(String id) {
        this.id = id;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    public void mostrarInfoPessoais(){
        System.out.println(getCpf());
        System.out.println(getNome());
        System.out.println(getTelefone());
        System.out.println(getId());
    }
    
    public abstract void exibirPerfil();
    
}
