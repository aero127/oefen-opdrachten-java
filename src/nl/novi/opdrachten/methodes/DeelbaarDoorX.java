package nl.novi.opdrachten.methodes;

/**
 * Schrijf een methode die twee Integers ontvangt.
 * De eerste parameter heet 'number', de tweede 'divisible'
 *
 * Het is de bedoeling dat je checkt of 'number' deelbaar is door 'divisible'
 *
 * Wanneer het deelbaar is, return het volgende:
 * Het getal: %HIER GETAL% is deelbaar door %HIER DIVISIBLE%.
 * Wanneer het niet deelbaar is:
 * Het getal: %HIER GETAL% is niet deelbaar door %HIER DIVISIBLE%. Verlaag of verhoog het getal
 * %HET GETAL WAARMEE HET VERHOOGT OF VERLAAGD MOET WORDEN%
 *
 * VOORBEELD:
 *
 * De methode ontvangt de getallen 13 en 3, dan zou het resultaat moeten zijn:
 * Het getal: 13 is niet deelbaar door 3. Verlaag het getal met 1.
 *
 * VOORBEELD 2:
 * De methode ontvangt de getallen 14 en 3, dan zou het resultaat moeten zijn:
 * Het getal: 14 is niet deelbaar door 3. Verhoog het getal met 1.
 *
 */

public class DeelbaarDoorX {

    public static void main(String[] args) {
        int number = 14;
        int divisble = 3;
        checkAnswer(number, divisble);
    }

    private static void checkAnswer(int number, int divisble) {
        if (number % divisble == 0) {
            System.out.println("Het getal " + number + " is WEL deelbaar door " + divisble);
        } else if (number % divisble == 1) {
            System.out.println("Het getal " + number + " is NIET deelbaar door " + divisble);
            System.out.println("Verlaag je getal met 1");
        } else if(number % divisble == 2) {
            System.out.println("Het getal " + number + " is NIET deelbaar door " + divisble);
            System.out.println("Verhoog je getal met 1");
        }
    }
}
