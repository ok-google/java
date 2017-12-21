package manipulation;
import java.lang.StringBuilder;

public class balikKalimat extends abstractWord{
    private StringBuilder hasil = new StringBuilder();

    public StringBuilder getHasil() {
        return hasil;
    }

    public void setHasil(StringBuilder hasil) {
        this.hasil = hasil;
    }

    public void Action(Word kata){
        int a = 0;
        hasil = new StringBuilder(kata.getKata());
        for(int kounter =(kata.getKata().length() - 1); kounter >= 0; kounter--){
            char tampung = kata.getKata().charAt(kounter);
            hasil.setCharAt(a, tampung);
            a++;
        }
    }
}
