package prodotto;

import java.util.Random;

public class prodotto {
    
    //Mi creo i vari attributi
    private int codice;

    private double prezzo;

    public String descrizione;

    private int iva;

    private String nomeProdotto;

    public prodotto(String descrizione){
        this.descrizione = descrizione;
        Random ran = new Random();
        int max = 3000;
        codice = ran.nextInt(max);
        System.out.println("Il tuo codice: " + codice);
    }
    
    //utilizzata per fare in modo che le classi figlie possano avere un proprio costruttore
    //senza richiamare il costruttore del padre
    /*public prodotto(){

    }
    
    //Creo un metodo che andrà a generare un numero randomico fino a 3000
    public int codiceRandom(){
        Random ran = new Random();
        int max = 3000;
        codice = ran.nextInt(max);
        return codice;
    }*/

    public int getCodice() {
        return codice;
    }

    public double setPrezzoIniziale (double prezzo){
        this.prezzo = prezzo;
        System.out.println("Il prezzo iniziale è: " + this.prezzo);
        return this.prezzo;
    }

    public int setDefaultIva(int iva){
        if (iva != 4 && iva != 5 && iva != 10 && iva != 22) {
            System.out.println("L'iva deve avere uno dei seguenti valori: 4, 5, 10, 22");
        }else{
            this.iva = iva;
        }
        return this.iva;
    }

    public void prezzoIva (){
        double prezzoConIvaAggiunta = (prezzo * iva)/100;
        double prezzoFinale = prezzo + prezzoConIvaAggiunta;
        System.out.println("Il prezzo con iva aggiunta è: " + prezzoFinale);
    }

    public String setNomeEsteso(String nomeProdotto){
        this.nomeProdotto = nomeProdotto.trim();
        System.out.println("Il prodotto inserito è: "+ this.nomeProdotto +"\nil codice associato è: " + codice);
        return this.nomeProdotto;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public int getIva() {
        return iva;
    }

    public String getNomeProdotto() {
        return nomeProdotto;
    }

    public String toStringStampa(){
        return "Prodotto: " + descrizione + ", Codice: " + codice;
    }

    
}
