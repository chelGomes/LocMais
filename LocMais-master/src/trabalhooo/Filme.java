/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhooo;

import java.util.Scanner;

//concluida

/**
 *
 * @author michel,Christian 
 */
public class Filme {
     public String titulo;
     String anoLancamento;
     int classificacaoIndicativa;
     public int quantDisponivel;
     float valorAlocacao;
     public static int numeroDeTitulos;
     public Filme(){}
     
     //Construtor da classe
     public Filme(String titulo,String anoLancamento,int classificacaoIndicativa,int quantDisponivel,float valorAlocacao){
         this.titulo = titulo;
         this.anoLancamento = anoLancamento;
         this.classificacaoIndicativa = classificacaoIndicativa;
         this.quantDisponivel = quantDisponivel;
         this.valorAlocacao = valorAlocacao;
         this.numeroDeTitulos ++;
     }
    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the anoLancamento
     */
    public String getAnoLancamento() {
        return anoLancamento;
    }

    /**
     * @param anoLancamento the anoLancamento to set
     */
    public void setAnoLancamento(String anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    /**
     * @return the classificacaoIndicativa
     */
    public int getClassificacaoIndicativa() {
        return classificacaoIndicativa;
    }

    /**
     * @param classificacaoIndicativa the classificacaoIndicativa to set
     */
    public void setClassificacaoIndicativa(int classificacaoIndicativa) {
        this.classificacaoIndicativa = classificacaoIndicativa;
    }

    /**
     * @return the quantDisponivel
     */
    public int getQuantDisponivel() {
        return quantDisponivel;
    }

    /**
     * @param quantDisponivel the quantDisponivel to set
     */
    public void setQuantDisponivel(int quantDisponivel) {
        this.quantDisponivel = quantDisponivel;
    }

    /**
     * @return the valorAlocacao
     */
    public float getValorAlocacao() {
        return valorAlocacao;
    }

    /**
     * @param valorAlocacao the valorAlocacao to set
     */
    public void setValorAlocacao(float valorAlocacao) {
        this.valorAlocacao = valorAlocacao;
    }
    
    public static Filme addFilme(){
        Filme filme;
        Scanner teclado = new Scanner(System.in);
        String titulo;
        String ano;
        int classificacaoIndicativa;
        int quantDisponivel;
        float valorAlocacao;
        
        System.out.print("Digite o nome do filme: ");
        titulo = teclado.nextLine();
        System.out.print("Digite o ano de lancamento: ");
        ano = teclado.nextLine();
        System.out.print("Digite a classificacao indicativa: ");
        classificacaoIndicativa = teclado.nextInt();
        System.out.print("Digite a quantidade disponivel: ");
        quantDisponivel = teclado.nextInt();
        System.out.print("Digite o valor de alocação: ");
        valorAlocacao = teclado.nextFloat();
        
        filme = new Filme(titulo,ano,classificacaoIndicativa,quantDisponivel,valorAlocacao);
        
        return filme;
    }
    @Override
    public String toString() {
        return "Filme{\n" + " nome = " + this.titulo +  "\n quantidade disponivel = " + this.quantDisponivel + "\n Preço para alugar R$"+ this.valorAlocacao + "\n Classificacao indicativa: " + this.classificacaoIndicativa + " anos" + "\n Numero de titulos = " + numeroDeTitulos+'}';
    }
}
 