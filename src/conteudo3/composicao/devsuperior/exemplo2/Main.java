package conteudo3.composicao.devsuperior.exemplo2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        DateTimeFormatter formatoBR = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        Comment comment1 = new Comment("Have a nice trip!");
        Comment comment2 = new Comment("Wow that's awesome!");

        Post post1 = new Post(LocalDateTime.parse("21/06/2018 13:05:44",formatoBR),"Traveling to New Zealand",12,"I'm going to visit this wonderful country!");
        post1.addComment(comment1);
        post1.addComment(comment2);

        System.out.println(post1);

        Comment comment3 = new Comment("Good night");
        Comment comment4 = new Comment("May the Force be with you");

        Post post2 = new Post(LocalDateTime.parse("28/07/2018 23:14:19",formatoBR),"Good night guys",5,"See you tomorrow");
        post2.addComment(comment3);
        post2.addComment(comment4);

        System.out.println(post2);
    }
}
