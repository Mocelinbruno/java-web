package br.senai.aula.web.application.puzzle.service;

import br.senai.aula.web.application.puzzle.port.in.GetPuzzleUseCase;
import br.senai.aula.web.application.puzzle.port.out.PuzzleRepositoryPort;
import br.senai.aula.web.application.puzzle.exception.PuzzleNotFoundException;
import br.senai.aula.web.domain.puzzle.Puzzle;
import java.util.Optional;

public class GetPuzzleService implements GetPuzzleUseCase {

    private final PuzzleRepositoryPort puzzleRepository;

    public GetPuzzleService(PuzzleRepositoryPort puzzleRepository) {
        this.puzzleRepository = puzzleRepository;
    }

    @Override
    public Optional<Puzzle> findById(Long puzzleId) {
        return Optional.of(puzzleRepository.findById(puzzleId)
                .orElseThrow(() -> new PuzzleNotFoundException(puzzleId)));
    }

    @Override
    public Puzzle[] findAll() {
        return puzzleRepository.findAll();
    }
}
