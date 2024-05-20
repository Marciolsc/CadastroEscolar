package classes_base;

public class Disciplina {
    private int id;
    private String nome;
    private String anoLetivo;
    private boolean aprovado;
    private float av1;
    private float av2;
    private float media;
    private int idAluno;

    public Disciplina(int id, String nome, float av1, float av2,
                      float media, String anoLetivo, boolean aprovado, int idAluno) {
        this.id = id;
        this.nome = nome;
        this.anoLetivo = anoLetivo;
        this.av1 = av1;
        this.av2 = av2;
        this.media = media;
        this.aprovado = aprovado;
        this.idAluno = idAluno;
    }

    public Disciplina() {}

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getAv1() {
        return av1;
    }

    public void setAv1(float av1) {
        this.av1 = av1;
    }

    public float getAv2() {
        return av2;
    }

    public void setAv2(float av2) {
        this.av2 = av2;
    }

    public int getIdAluno() {
        return idAluno;
    }

    public void setIdAluno(int idAluno) {
        this.idAluno = idAluno;
    }

    public String getAnoLetivo() {
        return anoLetivo;
    }

    public void setAnoLetivo(String anoLetivo) {
        this.anoLetivo = anoLetivo;
    }

    public boolean isAprovado() {
        return aprovado;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }

    public float getMedia() {
        return media;
    }

    public void setMedia(float media) {
        this.media = media;
    }
}
