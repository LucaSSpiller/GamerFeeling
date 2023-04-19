package br.com.fiap.game.dados;

import br.com.fiap.game.model.Genero;
import br.com.fiap.game.model.Game;

public record ListarGames(

    Long id,
    String titulo,
    String desenvolvedora,
    int numJogadores,
    Genero genero,
    int armazenamento
    ){
    public ListarGames(Game game){
        this (
                game.getId(),
                game.getTitulo(),
                game.getDesenvolvedora(),
                game.getNumJogadores(),
                game.getGenero(),
                game.getRequisitos().getArmazenamento()
        );
    }
}