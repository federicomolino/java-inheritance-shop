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


        smartphone iphone = new smartphone(0);
        //setto quantità di memoria
        iphone.setMemoria(0);
        //creo codice (eridatato da prodotto)
        iphone.codiceRandom();
        //prezzo + iva + prezzo totale (ereditate da prodotto)
        iphone.setPrezzoIniziale(500);
        iphone.setDefaultIva(22);
        iphone.prezzoIva();


        televisori smartTV = new televisori();
        smartTV.setDimensione(75);
        smartTV.getDimensione();
        smartTV.setSmart(false);

        cuffie airpods = new cuffie();
        airpods.setColore(null);
        airpods.getColore();
        airpods.setWireless(true);

    }
}
