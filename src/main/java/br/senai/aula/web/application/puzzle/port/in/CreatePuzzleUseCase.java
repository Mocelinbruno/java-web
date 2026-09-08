package br.senai.aula.web.application.puzzle.port.in;

import br.senai.aula.web.domain.puzzle.Puzzle;

public interface CreatePuzzleUseCase {

    Puzzle create(String[] alternativas, Integer alternativaCorreta);
}

