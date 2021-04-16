package nl.novi.opdrachten.methodes;

/**
 * Schrijf een methode die een Integer ontvangt.
 * Wanneer het getal deelbaar is door 5, laat hem de volgende tekst returnen:
 * 'deelbaar door vijf'
 * Wanneer het getal niet deelbaar is door vijf:
 * 'ondeelbaar door vijf'
 */
public class DeelbaarDoorVijf {

    public static void main(String[] args) {
        int chosenNumber = 48;
        checkAnswer(chosenNumber);
    }

    private static void checkAnswer(int chosenNumber) {
        if(chosenNumber % 5 == 0){
            System.out.println("Het getal is deelbaar door 5!");
        } else if (chosenNumber % 5 != 0){
            System.out.println("Het getal is niet deelbaar door 5!");
        }

    }
}
