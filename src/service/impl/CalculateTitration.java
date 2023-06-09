package service.impl;

import model.Candidate;
import model.Titration;
import service.CalculatorService;

public class CalculateTitration implements CalculatorService {
    @Override
    public double calculateScore(Candidate candidate) {

        double score = 0;
        switch (candidate.getTitulacaoAcademica()) {
            case DOUTOR -> score = Titration.DOUTOR.getDescricao();
            case MESTRE -> score = Titration.MESTRE.getDescricao();
            case ESPECIALISTA -> score = Titration.ESPECIALISTA.getDescricao();
            default -> score = 0;
        }
        return score;
    }

}
