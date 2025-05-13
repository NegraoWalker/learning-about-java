package conteudo3.data_hora;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class CalculosComDataEHora {
    public static void main(String[] args) {
        //ADICIONANDO|SUBTRAINDO TEMPO:
        LocalDate dataLocal1 = LocalDate.parse("2025-05-10");
        LocalDate dataLocal2 = LocalDate.now();
        LocalDateTime dataEHoraLocal1 = LocalDateTime.parse("2025-05-14T13:30:42.561900");
        LocalDateTime dataEHoraLocal2 = LocalDateTime.now();
        Instant dataEHoraGlobal1 = Instant.parse("2025-05-08T23:00:12.116498600Z");
        Instant dataEHoraGlobal2 = Instant.now();

        System.out.println("Data Local 2 atual [Menos 3 dias]: " + dataLocal2.minusDays(3));
        System.out.println("Data Local 2 atual [Mais 10 dias]: " + dataLocal2.plusDays(10));
        System.out.println("Data Local 2 atual [Menos 1 mês]: " + dataLocal2.minusMonths(1));
        System.out.println("Data Local 2 atual [Mais 2 ano]: " + dataLocal2.plusYears(2));

        System.out.println("Data Local 3 atual [Menos 2 horas]: " + dataEHoraLocal1.minusHours(2));
        System.out.println("Data Local 3 atual [Mais 30 minutos]: " + dataEHoraLocal1.plusMinutes(30));
        System.out.println("Data Global 1 atual [Menos 2 dias]: " + dataEHoraGlobal2.minus(2, ChronoUnit.DAYS));
        System.out.println("Data Global 1 atual [Menos 1 minuto]: " + dataEHoraGlobal2.minus(1, ChronoUnit.MINUTES));

        //DURAÇÃO:
        Duration duration1 = Duration.between(dataLocal1.atStartOfDay(), dataLocal2.atStartOfDay());
        System.out.println("Duração 1 entre dataLoca1 e dataLocal2: " + duration1.toDays());

        Duration duration2 = Duration.between(dataEHoraLocal2, dataEHoraLocal1);
        System.out.println("Duração 2 entre dataEHoraLocal1 e dataEHoraLocal2: " + duration2.toHours());

        Duration duration3 = Duration.between(dataEHoraGlobal1, dataEHoraGlobal2);
        System.out.println("Duração 3 entre dataEHoraGlobal1 e dataEHoraGlobal2: " + duration3.toMinutes());

    }
}
