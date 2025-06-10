package exercicios.devsuperior.desafios.plataforma_de_ensino;

public class Task extends Lesson{
   private String description;
   private Integer questionCount;

   private static int TIME_QUESTION_MINUTES = 5; //minutos

    public Task(String title, String description, Integer questionCount) {
        super(title);
        this.description = description;
        this.questionCount = questionCount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getQuestionCount() {
        return questionCount;
    }

    public void setQuestionCount(Integer questionCount) {
        this.questionCount = questionCount;
    }

    @Override
    public Integer duration() {
        return this.questionCount * TIME_QUESTION_MINUTES * 60;
    }
}
