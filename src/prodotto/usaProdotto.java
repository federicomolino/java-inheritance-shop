package prodotto;

public class usaProdotto {
    public static void main(String[] args) throws Exception {

        prodotto giacca = new prodotto("freddo?");
        System.out.println("il codice è: " + giacca.codiceRandom() +"\n" + giacca.descrizione);

        //Richiamo il metodo per il prezzo iniziale
        giacca.setPrezzoIniziale(22.5);

        //Richiamo per settare l'iva
        giacca.setDefaultIva(22);

        //Richiamo il metodo che mi riporta il prezzo con aggiunta iva
        giacca.prezzoIva();
    
        //Richiamo metodo relativo alla stampa del nome e codice
        giacca.setNomeEsteso("giacca");


        smartphone iphone = new smartphone(123456);
        System.out.println("Il tuo codice IMEI: " + iphone.getImei());
        //setto nuovo codice imei
        iphone.setImei(123454567);
        System.out.println("Il tuo codice IMEI: " + iphone.getImei());
        //setto quantità di memoria
        iphone.setMemoria(256);
        System.out.println("Il tuo codice IMEI: " + iphone.getMemoria());
        //creo codice (eridatato da prodotto)
        iphone.codiceRandom();
        //prezzo + iva + prezzo totale (ereditate da prodotto)
        iphone.setPrezzoIniziale(500);
        iphone.setDefaultIva(22);
        iphone.prezzoIva();


        televisori smartTV = new televisori();
        System.out.println("Il tuo codice: " + smartTV.codiceRandom());
        smartTV.setDimensione(75);
        System.out.println("la dimensione dello schermo è: " + smartTV.getDimensione() + " pollici");
        smartTV.setSmart(true);


        cuffie airpods = new cuffie();
        System.out.println("Il tuo codice: " + airpods.codiceRandom());
        airpods.setColore("bianco");
        airpods.setWireless(true);
        System.out.println("le cuffie sono di colore: " + airpods.getColore());

    }
}
