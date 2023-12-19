import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Data {
    private OffsetDateTime data;
    public Data(OffsetDateTime data){
        this.data = data;
    }

    public OffsetDateTime getData() {
        return data;
    }

    public void setData(OffsetDateTime data) {
        this.data = data;
    }

    public Integer getAnno(){
        return data.getYear();
    }

    public Integer getMese(){
        return  data.getMonthValue();
    }
    public Integer getGiorno(){
        return data.getDayOfMonth();
    }
    //non utilizzato il metodo getDayOfWeek per assicurarci che ritorni il giorno in italiano
    public String getGiornoSettimana(){
        return data.format(DateTimeFormatter.ofPattern("EEEE",Locale.ITALIAN));
    }
}
