
import java.util.Scanner;
import prodotto.cuffie;
import prodotto.prodotto;
import prodotto.smartphone;
import prodotto.televisori;

public class carrello {
    public static void main(String[] args) {

            //All'interno verrà stampata la mia lista
            prodotto[] carrello = new prodotto[10];
            int count  = 0;

            Scanner scan = new Scanner(System.in);

            System.out.println("Quanti oggetti vuoi inserire? (MAX10)");
            int oggetti = scan.nextInt();
            scan.nextLine();

            if (oggetti > 10 || oggetti <= 0) {
                System.out.println("Puoi inserire un minimo di 1 o un massimo di 10");
                
            }else{
                //faccio inseririe gli oggetti che vuole l'utente
                for (int i = 0; i < oggetti; i++) {
                    
                    System.out.println("Che prodotto vuoi inserire?");
                    //la scelta inserita la trasformo tutta in minuscolo
                    String scelta = scan.nextLine().toLowerCase();

                    switch (scelta) {
                        case "smartphone":
                                System.out.println("Hai scelto il Smartphone");
                                smartphone telefono = new smartphone("telefono", 123456, 32.3);
                                telefono.setPrezzoIniziale(34.5);
                                carrello[count] = telefono;
                                count ++;
                            break;
                        case "televisore":
                            System.out.println("Hai scelto il Televisore");
                                televisori televisione = new televisori("SmartTV");
                                televisione.setPrezzoIniziale(33);
                                carrello[count] = televisione;
                                count ++;
                            break;
                        case "cuffie":
                            System.out.println("Hai scelto le Cuffie");
                            cuffie cuffia = new cuffie("cuffie");
                            cuffia.setPrezzoIniziale(33);
                            carrello[count] = cuffia;
                            count ++;
                            break;             
                        default:
                        System.out.println("Puoi inserire uno dei tre oggetti ('Smarphone', 'Televisore', 'Cuffie')");
                            break;
                    }
                }
            }
            
            for (int i = 0; i < count; i++) {
                System.out.println(carrello[i].toStringStampa());
            }
        }

    }

