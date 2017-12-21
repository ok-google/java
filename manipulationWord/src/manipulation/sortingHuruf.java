package manipulation;

public class sortingHuruf extends abstractWord{
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
            for(int b = 0; b < kata.getKata().length(); b++){
                if(hasil.charAt(a) < hasil.charAt(b)){
                    char tempA = hasil.charAt(a);
                    char tempB = hasil.charAt(b);
                    hasil.setCharAt(a, tempB);
                    hasil.setCharAt(b, tempA);
                }
            }
        }
    }
}
