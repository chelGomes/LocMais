/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhooo;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author miche
 */
public class Locacao {

    Cliente cliente;
    Filme filme1;
    Date dataLocacao;
    Calendar dataDevolucao;
    float valorTotal;
    public static int quantidadeLocacoes = 0;

    public Locacao(Cliente cliente, Filme filme1, float valorTotal) {
        this.cliente = cliente;
        this.filme1 = filme1;
        this.dataLocacao = new Date();// data atual
        this.dataDevolucao = Calendar.getInstance();
        dataDevolucao.setTime(dataLocacao);
        dataDevolucao.add(Calendar.DATE, +3);//3 dias acrescentado a data atual
        this.valorTotal = valorTotal;
        this.quantidadeLocacoes ++;
    }

    /**
     * @return the dataLocacao
     */
    public Date getDataLocacao() {
        return dataLocacao;
    }

    /**
     * @param dataLocacao the dataLocacao to set
     */
    public void setDataLocacao(Date dataLocacao) {
        this.dataLocacao = dataLocacao;
    }

    /**
     * @return the dataDevolucao
     */
    public Calendar getDataDevolucao() {
        return dataDevolucao;
    }

    /**
     * @param dataDevolucao the dataDevolucao to set
     */
    public void setDataDevolucao(Calendar dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    /*public Locacao alugar(List<Filme> filmes, List<Cliente> clientes) {
        ArrayList<String> nomeFilmes = new ArrayList<>();
        String nomeCliente;
        Scanner teclado = new Scanner(System.in);
        ArrayList<Filme> filmesSelecionados = new ArrayList<>();
        filmesSelecionados = null;
        Cliente clienteSelecionado = null;
        String parador = null;
        for (int i = 0; parador != "N"; i++) {
            System.out.println("Digite o nome do filme:" + i + 1);
            nomeFilmes.add(teclado.nextLine());
            System.out.println("Se Deseja alugar mais filmes digite 'S' senão digite 'N'");
            parador = teclado.nextLine();
        }
        System.out.println("Digite o nome do cliente:");
        nomeCliente = teclado.nextLine();

        for (Cliente cliente : clientes) {
            if (cliente.nome.equals(nomeCliente)) {
                clienteSelecionado = cliente;
                break;
            }
        }
        float valorTotal = 0;
        for (int i = 0; i < nomeFilmes.size(); i++) {
            for (int j = 0; j < filmes.size(); j++) {
                if (filmes.get(j).titulo.equals(nomeFilmes.get(i))) {
                    if (filmes.get(j).quantDisponivel > 0) {
                        if (filmes.get(j).classificacaoIndicativa <= clienteSelecionado.idade) {
                            filmesSelecionados.add(filmes.get(j));
                            valorTotal = valorTotal + filmes.get(j).valorAlocacao;
                            filmes.get(j).quantDisponivel--;
                            break;
                        } else {
                            System.out.println("Sua idade é menor que a classificacao indicativa");
                        }
                    } else {
                        System.out.println("Não existe estoque no momento");
                    }
                }
            }
        }

        if (clienteSelecionado != null && filmesSelecionados != null) {
            List<Filme> filmesAlugados = new ArrayList<>();
            filmesAlugados = filmesSelecionados;
            return new Locacao(clienteSelecionado, filmesAlugados, valorTotal);
        } else {
            return null;
        }
    }*/

    public void devolver(List<Filme> filmes, List<Cliente> clientes) {
        ArrayList<String> nomeFilmes = new ArrayList<>();
        String nomeCliente;
        Scanner teclado = new Scanner(System.in);
        ArrayList<Filme> filmesSelecionados = new ArrayList<>();
        filmesSelecionados = null;
        Cliente clienteSelecionado = null;
        String parador = null;
        for (int i = 0; parador != "N"; i++) {
            System.out.println("Digite o nome do filme:" + i + 1);
            nomeFilmes.add(teclado.nextLine());
            System.out.println("Se Deseja devolver mais filmes digite 'S' senão digite 'N'");
            parador = teclado.nextLine();
        }
        System.out.println("Digite o nome do cliente:");
        nomeCliente = teclado.nextLine();

        for (Cliente cliente : clientes) {
            if (cliente.nome.equals(nomeCliente)) {
                clienteSelecionado = cliente;
                break;
            }
        }

        float valorMulta = 0;
        //repõe estoque
        for (int i = 0; i < nomeFilmes.size(); i++) {
            for (int j = 0; j < filmes.size(); j++) {
                if (filmes.get(j).titulo.equals(nomeFilmes.get(i))) {
                    filmesSelecionados.add(filmes.get(j));
                    filmes.get(j).quantDisponivel++;
                    break;
                }

            }

        }
        //procura falta de filmes na devolucao e aplica multa
        for (int i = 0; i < filmesSelecionados.size(); i++) {
            for (int j = 0; j < filmes.size(); j++) {
                if (filmes.get(j).titulo.equals(filmesSelecionados.get(i))) {
                    filmesSelecionados.remove(i);
                }
            }
        }
        //apliacao da multa 5 reais por filme
        valorMulta = 5 * filmesSelecionados.size();
        
    }
    @Override
    public String toString(){
        return "Locacao: {" + quantidadeLocacoes + "\nNome do cliente: "+ this.cliente.nome + "\nNome do filme alugado: "+ this.filme1.titulo + "\nData de Devolucao: " + dataDevolucao.getTime() + "}";
    }
    public String toString2(){
        return "Devolução = "+ dataDevolucao.getTime();
    }
}
