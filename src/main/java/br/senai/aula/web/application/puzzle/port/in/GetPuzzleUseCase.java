package br.senai.aula.web.application.puzzle.port.in;

import br.senai.aula.web.domain.puzzle.Puzzle;

import java.util.Optional;

public interface GetPuzzleUseCase {

    Optional<Puzzle> findById(Long id);

    Puzzle[] findAll();
}

