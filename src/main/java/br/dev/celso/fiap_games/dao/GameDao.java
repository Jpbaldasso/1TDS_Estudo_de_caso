package br.dev.celso.fiap_games.dao;

import br.dev.celso.fiap_games.model.Game;

import java.util.List;

public interface GameDao {

    void save(Game game);
    Game findById(Long id);
    List<Game> findAll();

}
