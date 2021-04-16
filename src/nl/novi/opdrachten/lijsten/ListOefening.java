package nl.novi.opdrachten.lijsten;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListOefening {

    public static void main(String[] uitlegList) {

        //We hebben een list die de namen van voetbalclubs bevat
        List<String> clubNames = new ArrayList<>();
        //Die vullen we alvast voor de opdracht
        clubNames.add("Ajax");
        clubNames.add("PSV");
        clubNames.add("Feyenoord");
        clubNames.add("Fc Utrecht");
        clubNames.add("Fc Groningen");
        clubNames.add("FC Twente");

        //System.out.println(clubNames);

        for(int i = 0; i < clubNames.size(); i++){
            System.out.println(i + " - " + clubNames.get(i));
        }
        // Vraag -1: Maak een methode die al taak heeft om de list per regel uit te printen.

        // Vraag 0: Maak een methode die als taak heeft om de list uit te printen: positie + inhoud.
        // Bovenstaande list zou dan dit zijn:
        // 0 - Ajax
        // 1 - PSv
        // etc...

        // Vraag 1: Maak een methode die checkt of een club al in de lijst zit en voeg deze anders toe.
        boolean isAanwezig = clubNames.contains("Cambuur");
        System.out.println(isAanwezig);
        // Vraag 2: Maak een methode die de positie van de club in de lijst teruggeeft.
        Integer positionClub = clubNames.indexOf("FC Twente");
        System.out.println(positionClub);
        // Vraag 3: Maak een methode die de lijst alfabetisch sorteert. Wanneer Ajax niet op positie 1 staat, moeten de
        // clubs die voor Ajax staan verwijderd worden.
        // We voegen nog wat clubs toe om de code te kunnen testen.
        clubNames.add("AA Aachen");
        clubNames.add("AFC Amsterdam");
        clubNames.add("AFC");
        Collections.sort(clubNames);
        System.out.println(clubNames);
        for(int i = 0; i < clubNames.size(); i++){
            System.out.println(i + " - " + clubNames.get(i));
        }
        clubNames.set(0, "Ajax");
        for(int i = 0; i < clubNames.size(); i++){
            System.out.println(i + " - " + clubNames.get(i));
        }

        // Vraag 4: Kun je hetzelfde doen als hierboven, maar PSV moet dan laatste zijn.
        clubNames.add("Zlotty FC");
        clubNames.add("SC Eindhoven");



    }

}
