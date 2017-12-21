package manipulation;

public class Vokal {
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
            if(kata.getKata().charAt(a) == 'a' || kata.getKata().charAt(a) == 'i' || kata.getKata().charAt(a) == 'u' ||
               kata.getKata().charAt(a) == 'e' || kata.getKata().charAt(a) == 'o' || kata.getKata().charAt(a) == 'A' ||
               kata.getKata().charAt(a) == 'I' || kata.getKata().charAt(a) == 'U' || kata.getKata().charAt(a) == 'E' ||
               kata.getKata().charAt(a) == 'O'){
                hasil.setCharAt(a, kata.getKata().charAt(a));
            }
            else{
                hasil.setCharAt(a, ' ');
            }
        }
    }
}
