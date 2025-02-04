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
    }
}
