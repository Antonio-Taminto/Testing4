import java.time.OffsetDateTime;

public class Main {
    public static void main(String[] args) {
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");

        Data data1 = new Data(data);

        System.out.println(data1.getAnno());
        System.out.println(data1.getMese());
        System.out.println(data1.getGiorno());
        System.out.println(data1.getGiornoSettimana());
    }
}