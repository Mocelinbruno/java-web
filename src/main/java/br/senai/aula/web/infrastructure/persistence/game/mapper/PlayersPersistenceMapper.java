package br.senai.aula.web.infrastructure.persistence.game.mapper;

import br.senai.aula.web.domain.game.Players;
import br.senai.aula.web.infrastructure.persistence.game.entity.GameJpaEntity;
import br.senai.aula.web.infrastructure.persistence.game.entity.PlayersJpaEntity;
import br.senai.aula.web.infrastructure.persistence.user.mapper.UserPersistenceMapper;

public final class PlayersPersistenceMapper {

    private PlayersPersistenceMapper() {
    }

    public static PlayersJpaEntity toEntity(
            Players players,
            GameJpaEntity game
    ) {
        return new PlayersJpaEntity(
                players.id(),
                UserPersistenceMapper.toEntity(players.user()),
                game
        );
    }

    public static Players toDomain(PlayersJpaEntity entity) {
        return new Players(
                entity.getId(),
                UserPersistenceMapper.toDomain(entity.getUser())
        );
    }
}