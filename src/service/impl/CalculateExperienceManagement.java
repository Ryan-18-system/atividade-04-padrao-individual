package service.impl;

import model.Candidate;
import service.CalculatorService;

public class CalculateExperienceManagement implements CalculatorService {
    @Override
    public double calculateScore(Candidate candidate) {
        double score = 0;

        switch (candidate.getExperienciaGestao()) {
            case DIRECAO -> score = Math.min(candidate.getTempoGestao(), 15);
            case COORDENACAO -> score = Math.min(candidate.getTempoGestao(), 2);
            default -> score = 0;
        }
        return score;
    }
}
