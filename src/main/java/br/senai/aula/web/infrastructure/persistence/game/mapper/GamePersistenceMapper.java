package br.senai.aula.web.infrastructure.persistence.game.mapper;

import br.senai.aula.web.domain.game.Game;
import br.senai.aula.web.infrastructure.persistence.game.entity.GameJpaEntity;

public final class GamePersistenceMapper {

    private GamePersistenceMapper() {
    }

    public static GameJpaEntity toEntity(Game game) {
        return new GameJpaEntity(
                game.id(),
                game.name(),
                game.maxPlayers()
        );
    }

    public static Game toDomain(GameJpaEntity entity) {
        return new Game(
                entity.getId(),
                entity.getName(),
                entity.getMaxPlayers()
        );
    }
}