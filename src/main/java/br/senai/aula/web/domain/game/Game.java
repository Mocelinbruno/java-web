package br.senai.aula.web.domain.game;

public record Game(
        Long id,
        String name,
        Integer maxPlayers
) {

    public Game {
        if (maxPlayers < 2 || maxPlayers > 6) {
            throw new IllegalArgumentException(
                    "O jogo deve ter entre 2 e 6 jogadores."
            );
        }
    }
}