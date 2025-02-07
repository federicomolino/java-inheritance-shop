package prodotto;

public class televisori extends prodotto {
    
    private double dimensione;

    private boolean smart;

    public televisori(String descrizione){
        super(descrizione);
    }

    public double getDimensione() {
        return dimensione;
    }

    public void setDimensione(double dimensione) {
        if (dimensione < 24) {
            System.out.println("La dimensione di un televisore deve essere almeno di 24 pollici");
        }else{
            this.dimensione = dimensione;
            System.out.println("la dimensione dello schermo è: " + dimensione + " pollici");
        }
    }

    public boolean isSmart() {
        return smart;
    }

    public void setSmart(boolean smart) {
        if (smart) {
            this.smart = smart;
            System.out.println("Hai la televione smart");
        }else{
            this.smart = smart;
            System.out.println("Non hai la televione smart");
        }
       
    }

    @Override
    public String toStringStampa(){
        return "Prodotto: " + descrizione;
    }

    
}
