package boletin17_3;

public class Alumno implements Comparable {

    private String nome;
    private int nota;

    public Alumno() {
    }

    public Alumno(String nome, int nota) {
        this.nome = nome;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public int getNota() {
        return nota;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Alumno: " + "\nnome: " + nome + "  nota: " + nota;
    }

    @Override
    public int compareTo(Object o) {
        Alumno alum = (Alumno) o;
        if (nota > alum.getNota()) {
            return 1;
        } else if (nota == alum.getNota()) {
            return 0;
        } else {
            return -1;
        }
    }

}
