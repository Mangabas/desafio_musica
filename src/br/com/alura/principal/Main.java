package br.com.alura.principal;

import br.com.alura.modelos.Audio;
import br.com.alura.modelos.Musica;
import br.com.alura.modelos.Podcast;

public class Main {
    public static void main(String[] args) {
    Musica musica = new Musica();
    musica.setTitulo("Cant stop");
    musica.setDuracao("02:50 Minutos");
    musica.setArtista("Red hot chili peppers");
    musica.setAlbum("By the way");
    musica.setGenero("Rock alternativo");
    System.out.println(musica.info());
    musica.reproduzir();
    System.out.println(musica.avaliacao());

    Podcast meupodcast = new Podcast();
    meupodcast.setTitulo("PodPah: Neymar");
    meupodcast.setDuracao("02:00 Horas");
    meupodcast.setHost("Igão e Mítico");
    meupodcast.setDescricao("""
            Entrevista exclusiva com Neymar Jr. Revelações sobre sua jornada no futebol, desafios 
            superados e visões inspiradoras. Descubra o homem por trás do jogador, suas paixões e aspirações.
            Uma conversa imperdível que mostra Neymar além das quatro linhas.
            """);
    System.out.println(meupodcast.info());
    meupodcast.reproduzir();
    System.out.println(meupodcast.avaliacao());
    }
}
