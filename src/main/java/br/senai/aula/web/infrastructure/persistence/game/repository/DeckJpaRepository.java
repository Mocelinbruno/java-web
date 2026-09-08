package br.senai.aula.web.infrastructure.persistence.game.repository;

import br.senai.aula.web.infrastructure.persistence.game.entity.DeckJpaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeckJpaRepository
        extends JpaRepository<DeckJpaEntity, Long> {
}