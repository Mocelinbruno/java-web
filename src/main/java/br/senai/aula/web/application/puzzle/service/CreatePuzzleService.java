package br.senai.aula.web.application.puzzle.service;

import br.senai.aula.web.application.puzzle.port.in.CreatePuzzleUseCase;
import br.senai.aula.web.application.puzzle.port.out.PuzzleRepositoryPort;
import br.senai.aula.web.domain.puzzle.Puzzle;

public class CreatePuzzleService implements CreatePuzzleUseCase {

    private final PuzzleRepositoryPort puzzleRepository;

    public CreatePuzzleService(PuzzleRepositoryPort puzzleRepository) {
        this.puzzleRepository = puzzleRepository;
    }

    @Override
    public Puzzle create(String[] alternativas, Integer alternativaCorreta) {
        return puzzleRepository.save(Puzzle.newPuzzle(alternativas, alternativaCorreta));
    }
}
