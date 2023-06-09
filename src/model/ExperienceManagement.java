package model;

public enum ExperienceManagement {
    DIRECAO(15),
    COORDENACAO(10),
    NO_EXPERIENCE(0);

    private final int descricao;

    private ExperienceManagement(int descricao) {
        this.descricao = descricao;
    }

    public int getDescricao() {
        return descricao;
    }
}
