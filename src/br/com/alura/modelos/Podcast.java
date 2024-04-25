package br.com.alura.modelos;

public class Podcast extends Audio {
    String host;
    String descricao;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }
    @Override
    public String info() {
        return """
                Você está reproduzindo: %s
                Host: %s
                Duração: %s
                Descrição: %s
                
                """.formatted(getTitulo(),getHost(),getDuracao(),getDescricao());
    }
}
