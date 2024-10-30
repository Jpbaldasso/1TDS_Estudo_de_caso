package br.dev.celso.fiap_games.test;

import br.dev.celso.fiap_games.dao.GameDaoImpl;
import br.dev.celso.fiap_games.model.Game;

import java.util.List;

public class GameTest {

    public static void main(String[] args) {
        Game game = new Game();
        game.setGameId(0);
        game.setTitulo("Game teste");
        game.setEstudio("Estudio teste");
        game.setAnoLancamento(1990);
        game.setFinalizado(false);

        GameDaoImpl gameDao = new GameDaoImpl();
        gameDao.save(game);

        List<Game> games = gameDao.findAll();
        for (Game g : games) {
            System.out.println(g.getTitulo());
        }
    }

}
