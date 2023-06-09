package model;

public enum ExperienceTeaching {
    IFPB(12),
    SUPERIOR(7),
    MEDIO(6),
    NO_EXPERIENCE(0);


    private final int valor;

    private ExperienceTeaching(int valor){
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }
}
