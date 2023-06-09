import model.Candidate;
import model.ExperienceManagement;
import model.ExperienceTeaching;
import model.Titration;
import service.CalculatorService;
import service.impl.CalculateExperienceManagement;
import service.impl.CalculateExperienceTeaching;
import service.impl.CalculateFinalScore;
import service.impl.CalculateTitration;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Candidate> listCandidate = new ArrayList<>();

        CalculatorService calculateExprerienteManagement = new CalculateExperienceManagement();
        CalculatorService calculateExprerienteTeaching = new CalculateExperienceTeaching();
        CalculatorService calculateTitration = new CalculateTitration();

        CalculateFinalScore calculateFinalScore = new CalculateFinalScore(calculateTitration, calculateExprerienteTeaching, calculateExprerienteManagement);

        Candidate candidate = new Candidate("Ryan", "4396027", 3, 5);
        candidate.setTitulacaoAcademica(Titration.DOUTOR);
        candidate.setExperienciaEnsino(ExperienceTeaching.IFPB);
        candidate.setExperienciaGestao(ExperienceManagement.DIRECAO);
        candidate.setNotaDesempenho(90.00);
        listCandidate.add(candidate);

        Candidate candidate2 = new Candidate("Nicolas", "1234124", 4, 2);
        candidate2.setTitulacaoAcademica(Titration.ESPECIALISTA);
        candidate2.setExperienciaEnsino(ExperienceTeaching.MEDIO);
        candidate2.setExperienciaGestao(ExperienceManagement.NO_EXPERIENCE);
        candidate2.setNotaDesempenho(40.00);
        listCandidate.add(candidate2);

        Candidate candidate3 = new Candidate("Roni", "1234124", 5, 2);
        candidate3.setTitulacaoAcademica(Titration.ESPECIALISTA);
        candidate3.setExperienciaEnsino(ExperienceTeaching.SUPERIOR);
        candidate3.setExperienciaGestao(ExperienceManagement.NO_EXPERIENCE);
        candidate3.setNotaDesempenho(70.00);
        listCandidate.add(candidate3);

        Candidate candidate4 = new Candidate("Alexadra", "1234124", 5, 2);
        candidate4.setTitulacaoAcademica(Titration.MESTRE);
        candidate4.setExperienciaEnsino(ExperienceTeaching.IFPB);
        candidate4.setExperienciaGestao(ExperienceManagement.DIRECAO);
        candidate4.setNotaDesempenho(100.00);
        listCandidate.add(candidate4);

        Candidate candidate5 = new Candidate("Teste", "1234124", 5, 2);
        candidate5.setTitulacaoAcademica(Titration.ESPECIALISTA);
        candidate5.setExperienciaEnsino(ExperienceTeaching.SUPERIOR);
        candidate5.setExperienciaGestao(ExperienceManagement.COORDENACAO);
        candidate5.setNotaDesempenho(50.00);
        listCandidate.add(candidate5);
/*================================================================================================*/
        List<String> ListaReprovados = listCandidate
                .stream()
                .filter(c -> !calculateFinalScore.evaluationPerformance(c.getNotaDesempenho()))
                .map(c2 -> c2.getNome() + " - Nota: " + c2.getNotaDesempenho())
                .toList();
        listCandidate.forEach(ca -> ca.setPontuacaoFinal(calculateFinalScore.calcularPontuacaoFinal(ca)));
        listCandidate.sort((c1, c2) -> Double.compare(c2.getPontuacaoFinal(), c1.getPontuacaoFinal()));
        List<String> listaResultados = new ArrayList<>();
        for (Candidate candidato : listCandidate) {
            listaResultados.add(candidato.getNome() +" nota-> " + candidato.getPontuacaoFinal());
        }
        for (String resultado : listaResultados) {
            System.out.println(resultado);
        }
        for(String repro : ListaReprovados){
            System.out.println(repro);
        }

    }
}