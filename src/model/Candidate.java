package model;

public class Candidate {
    private String nome;
    private String rg;
    private int tempoEnsino;
    private int tempoGestao;
    private double pontuacaoFinal;
    private double notaDesempenho;
    private Titration titulacaoAcademica;
    private ExperienceTeaching experienciaEnsino;
    private ExperienceManagement experienciaGestao;

    public Candidate(String nome, String rg, int tempoEnsino, int tempoGestao) {
        this.nome = nome;
        this.rg = rg;
        this.tempoEnsino = tempoEnsino;
        this.tempoGestao = tempoGestao;
    }

    public int getTempoGestao() {
        return tempoGestao;
    }

    public void setTempoGestao(int tempoGestao) {
        this.tempoGestao = tempoGestao;
    }

    public int getTempoEnsino() {
        return tempoEnsino;
    }

    public void setTempoEnsino(int tempoEnsino) {
        this.tempoEnsino = tempoEnsino;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public double getNotaDesempenho() {
        return notaDesempenho;
    }

    public void setNotaDesempenho(double notaDesempenho) {
        this.notaDesempenho = notaDesempenho;
    }

    public Titration getTitulacaoAcademica() {
        return titulacaoAcademica;
    }

    public void setTitulacaoAcademica(Titration titulacaoAcademica) {
        this.titulacaoAcademica = titulacaoAcademica;
    }

    public ExperienceTeaching getExperienciaEnsino() {
        return experienciaEnsino;
    }

    public void setExperienciaEnsino(ExperienceTeaching experienciaEnsino) {
        this.experienciaEnsino = experienciaEnsino;
    }

    public ExperienceManagement getExperienciaGestao() {
        return experienciaGestao;
    }

    public void setExperienciaGestao(ExperienceManagement experienciaGestao) {
        this.experienciaGestao = experienciaGestao;
    }

    public double getPontuacaoFinal() {
        return pontuacaoFinal;
    }

    public void setPontuacaoFinal(double pontuacaoFinal) {
        this.pontuacaoFinal = pontuacaoFinal;
    }




}
