package service.impl;

import model.Candidate;
import service.CalculatorService;

public class CalculateFinalScore {
    private final CalculatorService calculatorTitration;
    private final CalculatorService calculatorExperienceTeaching;
    private final CalculatorService calculatorExperienteManagement;

    public CalculateFinalScore(CalculatorService calculateTitration,
                                     CalculatorService calculateExperienceManagement,
                                     CalculatorService calculateExperienceTeaching) {
        this.calculatorTitration = calculateTitration;
        this.calculatorExperienceTeaching = calculateExperienceTeaching;
        this.calculatorExperienteManagement = calculateExperienceManagement;
    }

    public boolean evaluationPerformance(double noteRating){
        return noteRating >= 70;
    }
    public double calcularPontuacaoFinal(Candidate candidate) {
        double finalScore = candidate.getNotaDesempenho();
        finalScore += calculatorTitration.calculateScore(candidate);
        finalScore += calculatorExperienceTeaching.calculateScore(candidate);
        finalScore += calculatorExperienteManagement.calculateScore(candidate);
        return finalScore > 75? finalScore : 75;
    }
}
