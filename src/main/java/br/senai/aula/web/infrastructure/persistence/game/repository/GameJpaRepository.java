package br.senai.aula.web.infrastructure.persistence.game.repository;

import br.senai.aula.web.infrastructure.persistence.game.entity.GameJpaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameJpaRepository
        extends JpaRepository<GameJpaEntity, Long> {
}