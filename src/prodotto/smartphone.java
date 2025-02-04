package prodotto;

public class smartphone extends prodotto{
    private int imei;

    protected double memoria;

    public smartphone(int imei){
        this.imei = imei;
    }

    public int getImei() {
        return imei;
    }

    public void setImei(int imei) {
        this.imei = imei;
    }

    public void stampaImei(){
        System.out.println("Il tuo codice IMEI: " + imei);
    }

    public double getMemoria() {
        return memoria;
    }

    public void setMemoria(double memoria) {
        this.memoria = memoria;
    }

    

}
