package exercicios.devsuperior.desafios.plataforma_de_ensino;

public class Video extends Lesson{
    private String url;
    private Integer seconds;

    public Video(String title, String url, Integer seconds) {
        super(title);
        this.url = url;
        this.seconds = seconds;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getSeconds() {
        return seconds;
    }

    public void setSeconds(Integer seconds) {
        this.seconds = seconds;
    }

    @Override
    public Integer duration() {
        return this.seconds;
    }
}
