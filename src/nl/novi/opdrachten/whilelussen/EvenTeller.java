package nl.novi.opdrachten.whilelussen;

public class EvenTeller {
    public static void main(String[] even) {
        /*
        Maak een while-lus.
        Deze while-lus moet net zo lang lopen tot en met de teller op 10 staat.
        Print alleen de even getallen uit!
         */
        int teller = 0;
        System.out.println("Dit zijn de even nummers t/m 10");
        while (teller <=10){
            System.out.println(teller);
            teller = (teller+=2);
        }
    }
}
