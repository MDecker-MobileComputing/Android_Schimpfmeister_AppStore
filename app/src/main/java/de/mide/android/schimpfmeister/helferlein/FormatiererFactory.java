package de.mide.android.schimpfmeister.helferlein;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;


public class FormatiererFactory {

    /**
     * Dezimalformierer mit Ganzzahlen mit Punkt als Tausendertrennzeichen
     * (unabhängig von der Sprache/Locale des Geräts).
     *
     * @return Formatierer für Ganzzahlen, z.B. "1.234" statt "1234"; immer
     *         mit Punkt, weil die App nur auf Deutsch funktioniert
     */
    public static DecimalFormat getGanzzahlenFormatierer() {

        DecimalFormatSymbols symbole = new DecimalFormatSymbols();
        symbole.setGroupingSeparator( '.' );
        return  new DecimalFormat( "#,###", symbole );
    }

}
