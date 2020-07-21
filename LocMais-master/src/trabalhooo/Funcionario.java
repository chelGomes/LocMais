/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhooo;

import java.util.Scanner;

/**
 *
 * @author miche
 */
public class Funcionario extends Pessoa{
    private float salario;
    private String cargo;
    private String loginUsuario;
    
    public Funcionario(){}
    
    
    public Funcionario(float salario,String cargo,String loginUsuario,String nome,String cpf,String endereco,String telefone,boolean tipo){
        System.out.println("Digite a senha do funcionario");
        Scanner teclado = new Scanner(System.in);
        this.loginUsuario = loginUsuario;
        this.salario = salario;
        this.cargo = cargo;
        super.nome = nome;
        super.endereco = endereco;
        super.idade = idade;
        super.tipo = tipo;
        super.telefone = telefone;
        super.cpf = cpf;
        
    }

    /**
     * @return the salario
     */
    public float getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(float salario) {
        this.salario = salario;
    }

    /**
     * @return the cargo
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * @param cargo the cargo to set
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    /**
     * @return the loginUsuario
     */
    public String getLoginUsuario() {
        return loginUsuario;
    }

    /**
     * @param loginUsuario the loginUsuario to set
     */
    public void setLoginUsuario(String loginUsuario) {
        this.loginUsuario = loginUsuario;
    }
    public String toString(){
       return "Cargo = " + cargo + "\nNome = " + super.nome + "\nCPF = " + super.cpf + "\nLoginUsuario = " + loginUsuario + "\nsalario = "+salario +"\ntelefone = "+super.telefone; 
    }
}
