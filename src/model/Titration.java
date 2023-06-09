package model;

public enum Titration {
    DOUTOR(25),
    MESTRE(18),
    ESPECIALISTA(10),
    NO_EXPERIENCE(0);

    private final int descricao;

    private Titration(int descricao) {
        this.descricao = descricao;
    }

    public int getDescricao() {
        return descricao;
    }
}
