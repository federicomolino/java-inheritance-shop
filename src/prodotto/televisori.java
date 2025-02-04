package prodotto;

public class televisori extends prodotto {
    
    private double dimensione;

    private boolean smart;

    public televisori(){
        codiceRandom();
    }

    public double getDimensione() {
        return dimensione;
    }

    public void setDimensione(double dimensione) {
        this.dimensione = dimensione;
    }

    public boolean isSmart() {
        return smart;
    }

    public void setSmart(boolean smart) {
        this.smart = smart;
    }

    
}
