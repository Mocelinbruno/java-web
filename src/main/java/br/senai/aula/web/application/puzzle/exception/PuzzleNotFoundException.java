package br.senai.aula.web.application.puzzle.exception;

public class PuzzleNotFoundException extends RuntimeException {

    public PuzzleNotFoundException(Long puzzleId) {
        super("Puzzle [" + puzzleId + "] not found");
    }
}
