package br.senai.aula.web.domain.game;

public record Round(Long id, Integer number) {

    public static Round newRound(Integer number, StatusRound status) {
        return new Round(null, number);
    }
}