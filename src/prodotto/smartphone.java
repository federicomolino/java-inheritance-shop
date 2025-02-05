package prodotto;

public class smartphone extends prodotto{
    private int imei;

    protected double memoria;

    public smartphone(int imei){
        if (imei == 0) {
            System.out.println("Il codice IEMEI non può essere 0, ma parte da 1");
        }else{
            this.imei = imei;
            System.out.println("Il tuo codice IMEI: " + imei);
        }
    }

    public int getImei() {
        return imei;
    }

    public void setImei(int imei) {
        this.imei = imei;
    }

    public double getMemoria() {
        return memoria;
    }

    public void setMemoria(double memoria) {
        if (memoria == 0) {
            System.out.println("La memoria deve essere impostata almeno ad 1!");
        }else{
            this.memoria = memoria;
            System.out.println("La memoria impostato totale è: " + memoria);
        }
    }

    

}
