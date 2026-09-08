package br.senai.aula.web.domain.game;

import br.senai.aula.web.domain.user.User;

public record Players(
        Long id,
        User user
) {
}