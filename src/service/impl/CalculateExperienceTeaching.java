package service.impl;

import model.Candidate;
import model.ExperienceTeaching;
import service.CalculatorService;

public class CalculateExperienceTeaching  implements CalculatorService {
    @Override
    public double calculateScore(Candidate candidate) {
        double score = 0;

        switch (candidate.getExperienciaEnsino()) {
            case IFPB -> score += Math.min(candidate.getTempoEnsino(), 12);
            case SUPERIOR -> score += Math.min(candidate.getTempoEnsino(), 7);
            case MEDIO -> score += Math.min(candidate.getTempoEnsino(), 6);
            default -> score += 0;
        }
        return score;
    }
}
