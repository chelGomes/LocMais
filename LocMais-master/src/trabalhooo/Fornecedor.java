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
public class Fornecedor {
    
    private String nomeFornecedor;
    private String endereco;
    private String telefone;
    private String cnpj;
    private static int numeroDeFornecedores = 0;
   
   
    public Fornecedor(){}

 
     /* @return the nomeFornecedor
     */
    public String getNomeFornecedor() {
        return nomeFornecedor;
    }

    /**
     * @param nomeFornecedor the nomeFornecedor to set
     */
    public void setNomeFornecedor(String nomeFornecedor) {
        this.nomeFornecedor = nomeFornecedor;
    }

    /**
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * @return the telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * @return the cnpj
     */
    public String getCnpj() {
        return cnpj;
    }

    /**
     * @param cnpj the cnpj to set
     */
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
    public Fornecedor(String nomeFornecedor,String cnpj, String telefone, String endereco){
        super();
        //this.idFornecedor = idFornecedor;
        this.nomeFornecedor = nomeFornecedor;
        this.cnpj = cnpj;
        this.telefone = telefone;
        this.endereco = endereco;
        numeroDeFornecedores ++;
        
    }
    
    Scanner teclado = new Scanner(System.in);
    
    public void alterarFornecedor(Fornecedor fornecedor){
       String nomeFornecedor = fornecedor.getNomeFornecedor();
       
        try {
            fornecedor.getCnpj();
            fornecedor.getEndereco();
            fornecedor.getTelefone();
            
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    public void excluirFornecedor(Fornecedor fornecedor){
        try{
            fornecedor.getNomeFornecedor();
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }
    @Override
    public String toString() {
        return " Nome do fornecedor: "+ nomeFornecedor + "\n Endereço: "+endereco+"\n CNPJ: "+cnpj+"\n telefone: "+telefone + "\n Quantidade de fornecedores: "+numeroDeFornecedores;
    }
}
    