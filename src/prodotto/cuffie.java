package prodotto;

public class cuffie extends prodotto{
    
    private String colore;

    private boolean wireless;

    public cuffie(){
        codiceRandom();
    }

    public String getColore() {
        return colore;
    }

    public void setColore(String colore) {
        this.colore = colore;
    }

    public boolean isWireless() {
        return wireless;
    }

    public void setWireless(boolean wireless) {
        this.wireless = wireless;
    }
}
