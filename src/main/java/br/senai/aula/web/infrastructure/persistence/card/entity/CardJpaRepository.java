package br.senai.aula.web.infrastructure.persistence.card.entity;

import org.springframework.data.jpa.repository.JpaRepository;
import br.senai.aula.web.infrastructure.persistence.card.entity.CardEntity;


public interface CardJpaRepository extends JpaRepository<CardEntity, Long> {
}