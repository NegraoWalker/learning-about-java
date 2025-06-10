package exercicios.devsuperior.desafios.plataforma_de_ensino;

public abstract class Lesson {
    private String title;

    public Lesson() {
    }

    public Lesson(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public abstract Integer duration();
}
