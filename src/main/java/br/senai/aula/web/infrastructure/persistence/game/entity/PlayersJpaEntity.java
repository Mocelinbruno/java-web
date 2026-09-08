package br.senai.aula.web.infrastructure.persistence.game.entity;

import br.senai.aula.web.infrastructure.persistence.user.entity.UserJpaEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "players")
public class PlayersJpaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_id", nullable = false)
    private UserJpaEntity user;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "game_id", nullable = false)
    private GameJpaEntity game;

    protected PlayersJpaEntity() {
    }

    public PlayersJpaEntity(
            Long id,
            UserJpaEntity user,
            GameJpaEntity game
    ) {
        this.id = id;
        this.user = user;
        this.game = game;
    }

    public Long getId() {
        return id;
    }

    public UserJpaEntity getUser() {
        return user;
    }

    public GameJpaEntity getGame() {
        return game;
    }
}