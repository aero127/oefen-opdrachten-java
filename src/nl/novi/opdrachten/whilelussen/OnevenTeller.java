package nl.novi.opdrachten.whilelussen;

public class OnevenTeller {
    public static void main(String[] oneven) {
        /*
        Maak een while-lus.
        Deze while-lus moet net zo lang lopen tot en met de teller op 10 staat.
        Print alleen de oneven getallen uit!
         */
        int teller = 1;
        System.out.println("Dit zijn de oneven nummers t/m 10");
        while (teller <=10){
            System.out.println(teller);
            teller = (teller+=2);
        }
    }
}
