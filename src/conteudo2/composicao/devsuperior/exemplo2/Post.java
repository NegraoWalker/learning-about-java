package conteudo2.composicao.devsuperior.exemplo2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Post {
    DateTimeFormatter formatoBR = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    private LocalDateTime moment;
    private String title;
    private String content;
    private Integer likes;

    private List<Comment> comments = new ArrayList<>();

    public Post() {
    }

    public Post(LocalDateTime moment, String title, Integer likes, String content) {
        this.moment = moment;
        this.title = title;
        this.likes = likes;
        this.content = content;
    }

    public LocalDateTime getMoment() {
        return moment;
    }

    public void setMoment(LocalDateTime moment) {
        this.moment = moment;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public List<Comment> getComments() {
        return comments;
    }

    //Adiciona um novo comentário na lista:
    public void addComment(Comment comment) {
        comments.add(comment);
    }

    //Remove um comentário da lista:
    public void removeComment(Comment comment) {
        comments.remove(comment);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.title).append("\n");
        stringBuilder.append(this.likes);
        stringBuilder.append(" Likes - ");
        stringBuilder.append(this.moment.format(formatoBR)).append("\n");
        stringBuilder.append(this.content).append("\n");
        stringBuilder.append("Comments:\n");
        for (Comment comment : this.comments) {
            stringBuilder.append(comment.getText()).append("\n");
        }
        return stringBuilder.toString();
    }
}
