package avancado.data_hora;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class ConversaoStringParaDate {
    public static void main(String[] args) {
        //CONVERSÃO:
        LocalDate dataLocal1 = LocalDate.parse("2025-05-16"); //Conversão de uma String para uma data local
        System.out.println("Data Local 1 [Conversão de String para data - Formato no padrão ISO 8601]: " + dataLocal1);

        LocalTime horaLocal1 = LocalTime.parse("21:45:41.561900"); //Conversão de uma String para uma hora
        System.out.println("Hora Local 1 [Conversão de String para hora - Formato no padrão ISO 8601]: " + horaLocal1);

        LocalDateTime dataEHoraLocal1 = LocalDateTime.parse("2025-05-14T13:30:42.561900"); //Conversão de uma String para uma data e hora local
        System.out.println("Data e Hora Local 1 [Conversão de String para data e hora - Formato no padrão ISO 8601]: " + dataEHoraLocal1);

        Instant dataEHoraGlobal1 = Instant.parse("2025-05-08T23:00:12.116498600Z");
        System.out.println("Data e Hora Global 1 [Conversão de String para data e hora - Formato no padrão ISO 8601]: " + dataEHoraGlobal1); //Conversão de uma String para uma data e hora global

        Instant dataEHoraGlobal2 = Instant.parse("2025-05-08T21:00:00.00-03:00:00"); //Conversão de uma String para uma data e hora global considerando o horário do brasil local -3:00
        System.out.println("Data e Hora Global 1 [Conversão de String para data e hora - Formato no padrão ISO 8601]: " + dataEHoraGlobal2); //Conversão de uma String para uma data e hora global

        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault()); //Criando um formato com Fuso Horário
        System.out.println("Data e Hora Global 3 [Conversão de String para data e hora - Formato no padrão customizado com fuso horário] " + formatter1.format(dataEHoraGlobal1));

    }
}
