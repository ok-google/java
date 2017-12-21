package manipulation;

public class jumlahHuruf extends abstractWord{
    private int hasil;

    public int getHasil() {
        return hasil;
    }

    public void setHasil(int hasil) {
        this.hasil = hasil;
    }

    public void Action(Word kata){
        setHasil(kata.getKata().length());
    }
}
