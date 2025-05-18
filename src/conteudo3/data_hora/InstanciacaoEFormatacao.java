package conteudo3.data_hora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class InstanciacaoEFormatacao {
    public static void main(String[] args) {

        //INSTANCIAÇÃO:
        LocalDate data1 = LocalDate.now(); //Data Local agora
        System.out.println("Data Local 1 [Formato no padrão ISO 8601]: " + data1);

        LocalTime hora1 = LocalTime.now(); //Hora Local agora
        System.out.println("Hora Local 1 [Formato no padrão ISO 8601]: " + hora1);

        LocalDateTime dataHora1 = LocalDateTime.now(); //Data e Hora Local agora
        System.out.println("Data e Hora Local 1 [Formato no padrão ISO 8601]: " + dataHora1);

        Instant dataHora2 = Instant.now(); //Data e Hora Global UTC agora
        System.out.println("Data e Hora Global 1 [Formato no padrão ISO 8601]: " + dataHora2);

        LocalDate data2 = LocalDate.of(2026, 1, 12); //Data Local passando ano, mês e dia
        System.out.println("Data Local 2 [Formato no padrão ISO 8601 - Passando ano, mês e dia separadamente]: " + data2);

        LocalDateTime dataHora3 = LocalDateTime.of(2032, 9, 23, 8,32,55); //Data Local passando ano, mês, dia, hora, minutos e segundos
        System.out.println("Data Local 3 [Formato no padrão ISO 8601 - Passando ano, mês, dia, hora, minutos e segundos separadamente]: " + dataHora3);

        //FORMATAÇÃO:
        DateTimeFormatter formatoBR1 = DateTimeFormatter.ofPattern("dd/MM/yyyy"); //Formato BR para data
        DateTimeFormatter formatoBR2 = DateTimeFormatter.ofPattern("HH:mm:ss"); //Formato BR para hora
        DateTimeFormatter formatoBR3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"); //Formato BR para data e hora

        System.out.println("Data Local 1 [Formato personalizado BR]: " + data1.format(formatoBR1));
        System.out.println("Hora Local 1 [Formato personalizado BR]: " + hora1.format(formatoBR2));
        System.out.println("Data e Hora Local 1 [Formato personalizado BR]: " + dataHora1.format(formatoBR3));






    }
}
