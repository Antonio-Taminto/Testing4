import java.time.OffsetDateTime;

import static org.junit.jupiter.api.Assertions.*;

class DataTest {
    private Data testing = new Data(OffsetDateTime.parse("2023-03-01T13:00:00Z"));

    @org.junit.jupiter.api.Test
    void getAnno() {
        Integer result  = testing.getAnno();
        assertEquals(2023,result,
                "ci aspettiamo come risultato 2023");
    }

    @org.junit.jupiter.api.Test
    void getMese() {
        Integer result = testing.getMese();
        assertEquals(3,result,
                "ci aspettiamo come risultato 3 per marzo");
    }

    @org.junit.jupiter.api.Test
    void getGiorno() {
        Integer result = testing.getGiorno();
        assertEquals(1 ,result,
                "ci aspettiamo il giorno 1 come risultato");
    }

    @org.junit.jupiter.api.Test
    void getGiornoSettimana() {
        String result = testing.getGiornoSettimana();
        assertEquals("mercoledì",result,
                "ci aspettiamo mercoledì come giorno della settimana");
    }
}