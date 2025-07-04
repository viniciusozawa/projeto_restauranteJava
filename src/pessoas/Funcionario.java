/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pessoas;

/**
 *
 * @author 02338079698
 */
public abstract class Funcionario extends Usuarios{
    protected double salario;
    
    public Funcionario(String nome, String cpf, String telefone) {
        super(nome, cpf, telefone);
    }
    
    public Funcionario(String nome, String cpf, String telefone, double salario){
        super(nome, cpf, telefone);
        this.salario = salario;
    }
    

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
    public abstract void comissao();
    
}
