package prodotto;

public class cuffie extends prodotto{
    
    private String colore;

    private boolean wireless;

    public cuffie(){
        System.out.println("Il tuo codice: " + codiceRandom());
    }

    public String getColore() {
        return colore;
    }

    public void setColore(String colore) {
        if (colore != null && colore.length() > 2) {
            this.colore = colore;
            System.out.println("le cuffie sono di colore: " + getColore());
        }else{
            System.out.println("Il colore inserito non è valido");
        }
    }

    public boolean isWireless() {
        return wireless;
    }

    public void setWireless(boolean wireless) {
        this.wireless = wireless;
    }
}
