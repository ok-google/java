package manipulation;

public class hurufKecil extends abstractWord{
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
            if(kata.getKata().charAt(a) >= 'A' && kata.getKata().charAt(a) <= 'Z'){
                int change = (int)kata.getKata().charAt(a)+32;
                hasil.setCharAt(a, (char)change);
            }
        }
    }
}
