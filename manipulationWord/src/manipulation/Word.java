package manipulation;
import java.lang.StringBuilder;


public class Word {
    private StringBuilder kata = new StringBuilder();

    public StringBuilder getKata() {
        return kata;
    }

    public void setKata(String kata) {
        this.kata = new StringBuilder(kata);
    }
}
