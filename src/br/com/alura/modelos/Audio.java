package br.com.alura.modelos;

import java.util.Scanner;

public class Audio implements Info {
    private String titulo;
    private String duracao;
    private int totalDeReproducoes;
    private int curtidas;
    String curtiu;
    private String classificacao;
    Scanner leitura = new Scanner(System.in);

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public int getTotalDeReproducoes() {
        return totalDeReproducoes;
    }

    public int getCurtidas(int i) {
        return curtidas;
    }

    public String getClassificacao() {
        return classificacao;
    }

    public String avaliacao() {
        if (curtidas <= totalDeReproducoes * 0.2) {
            classificacao = "Este título possui 1 estrela";
        } else if (curtidas <= totalDeReproducoes * 0.5 && curtidas >= totalDeReproducoes * 0.2) {
            classificacao = "Este título possui 2.5 estrelas";
        } else if (curtidas <= totalDeReproducoes * 0.7 && curtidas >= totalDeReproducoes * 0.5) {
            classificacao = "Este título possui 4 estrelas";
        } else if (curtidas <= totalDeReproducoes * 1 && curtidas >= totalDeReproducoes * 0.7) {
            classificacao = "Este título possui 5 estrelas";
        }
        return classificacao;
    }
    public void reproduzir(){
        System.out.println("Reproduzindo...");
        totalDeReproducoes++;
        System.out.println("Deseja curtir este título?");
        curtiu = leitura.nextLine().trim();
        if (curtiu.equals("sim") || curtiu.equals("Sim")){
            curtidas++;
            System.out.println("Curtido");
        }else if (curtiu.equals("não") || curtiu.equals("Não")){
            System.out.println("Veja outras opções");
        }
    }

    @Override
    public String info() {
        return "";
    }
}
