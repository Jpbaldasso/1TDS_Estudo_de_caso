package br.dev.celso.fiap_games.controller;

import br.dev.celso.fiap_games.dao.GameDaoImpl;
import br.dev.celso.fiap_games.model.Game;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/game")
public class GameServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // Recuperamos os dados do form
        String titulo = req.getParameter("titulo");
        String estudio = req.getParameter("estudio");
        int ano = Integer.parseInt(req.getParameter("lancamento"));
        String finalizado = req.getParameter("finalizado");
        boolean finalizadoBoolean = false;

        if (finalizado != null) {
            finalizadoBoolean = true;
        }

        System.out.println(finalizado);

        // Criamos um objeto com os dados do form
        Game game = new Game();
        game.setTitulo(titulo);
        game.setEstudio(estudio);
        game.setAnoLancamento(ano);
        game.setFinalizado(finalizadoBoolean);

        // Chamar o GameDaoImpl
        GameDaoImpl gameDao = new GameDaoImpl();
        gameDao.save(game);

        req.setAttribute("mensagem", "Game cadastrado com sucesso!");

        req.getRequestDispatcher("/games-list.jsp").forward(req, resp);

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Game> games = new ArrayList<>();
        GameDaoImpl gameDao = new GameDaoImpl();
        games = gameDao.findAll();
        req.setAttribute("games", games);
        req.getRequestDispatcher("game").forward(req, resp);
    }
}
