package avancado.data_hora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class ConversaoDataGlobalParaDataLocal {
    public static void main(String[] args) {
        // for (String s : ZoneId.getAvailableZoneIds()) //FUSO HORÁRIOS LISTADOS QUE PODEM SER USADOS
        // System.out.println(s);

        //CONVERSÃO DE UMA DATA GLOBAL PARA DATA LOCAL:
        Instant dataEHoraGlobal1 = Instant.now();

        LocalDateTime dataEHoraLocal1 = LocalDateTime.ofInstant(dataEHoraGlobal1, ZoneId.systemDefault());
        LocalDate dataLocal1 = LocalDate.ofInstant(dataEHoraGlobal1, ZoneId.of("Portugal"));


        System.out.println("Data e Hora Local 1 [Conversão de Data e Hora Global para Data e Hora Local - Usando o fuso horário do sistema] " + dataEHoraLocal1);
        System.out.println("Data e Hora Local 2 [Conversão de Data e Hora Global para Data e Hora Local - Usando o fuso horário do Portugal] " + dataLocal1);

        //OBTER DIA, MÊS, ANO, HORA, MINUTOS E SEGUNDOS DE UMA DATA LOCAL:
        LocalDate dataLocal2 = LocalDate.now();
        LocalDateTime dataEHoraLocal2 = LocalDateTime.now();

        System.out.println("Data Local 2 [dia] " + dataLocal2.getDayOfMonth());
        System.out.println("Data Local 2 [mês] " + dataLocal2.getMonth());
        System.out.println("Data Local 2 [mês] " + dataLocal2.getMonthValue());
        System.out.println("Data Local 2 [ano] " + dataLocal2.getYear());

        System.out.println("Data e Hora Local 2 [hora] " + dataEHoraLocal2.getHour());
        System.out.println("Data e Hora Local 2 [Minutos] " + dataEHoraLocal2.getMinute());
        System.out.println("Data e Hora Local 2 [Segundos] " + dataEHoraLocal2.getSecond());
    }
}
