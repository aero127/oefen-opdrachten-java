package nl.novi.opdrachten.methodes;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Schrijf een methode  die een List<Integer> ontvangt.
 *
 * Wanneer er twee getallen of meer in zijn:
 * Return het volgende:
 * "Het hoogste getal van de gegeven getallen is: %GETAL%"
 *
 * Je mag hier geen Collections.sort of java.streams gebruiken.
 *
 */
public class HoogsteGetalAbstract {

    private static Object Integer;

    public static void main(String[] argeblabla) {
        List<Integer> hoogsteGetal = new ArrayList<>(Arrays.asList(99, 2455, 414));
        sizeCheck(hoogsteGetal);
    }

    public static void sizeCheck(List<Integer> hoogsteGetal) {

        Integer nummerEen = hoogsteGetal.get(0);
        Integer nummerTwee = hoogsteGetal.get(1);
        Integer nummerDrie = hoogsteGetal.get(2);

        if (nummerEen > nummerTwee) {
            if (nummerEen > nummerDrie) {
                System.out.println(nummerEen + " is het hoogste getal!");
            }
        } else if (nummerTwee > nummerDrie) {
            if (nummerTwee > nummerEen) {
                System.out.println(nummerTwee + " is het hoogste getal!");
            }
        } else if (nummerDrie > nummerTwee) {
            if (nummerDrie > nummerEen) {
                System.out.println(nummerDrie + " is het hoogste getal!");
            }
        }

    }
}
