package manipulation;
import java.lang.StringBuilder;

public class hurufBesar extends abstractWord{
    private StringBuilder hasil = new StringBuilder();

    public StringBuilder getHasil() {
        return hasil;
    }

    public void setHasil(StringBuilder hasil) {
        this.hasil = hasil;
    }

    public void Action(Word kata){
        hasil = new StringBuilder(kata.getKata());
        for(int a = 0; a < kata.getKata().length(); a++){
            if(kata.getKata().charAt(a) >= 'a' && kata.getKata().charAt(a) <= 'z'){
                int change = (int)kata.getKata().charAt(a)-32;
                hasil.setCharAt(a, (char)change);

            }
        }
    }
}
