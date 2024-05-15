package classes_base;

import java.util.*;

public class Aluno extends Pessoa {

    final String matricula;
    Map<String, Float> notasDeProva = new HashMap<>();

    public Aluno(String nome, String telefone, Date dataNascimento, String email, String matricula){
        this.matricula = matricula;
        notasDeProva.put("AV1", 0.0f);
        notasDeProva.put("AV2", 0.0f);
    }

    public String getMatricula() {
        return matricula;
    }

    public Map<String, Float> getNotas() {
        return notasDeProva;
    }

    public void setNota(String prova, float nota) {
        notasDeProva.put(prova, nota);
    }

    public float calcularMedia() {
        // A maravilha que é programação funcional
        return getNotas()
                .values()
                .stream()
                .reduce(0.0F, Float::sum) / getNotas().size();
    }
}
