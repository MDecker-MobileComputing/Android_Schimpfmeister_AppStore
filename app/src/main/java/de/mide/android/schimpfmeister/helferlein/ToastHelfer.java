package de.mide.android.schimpfmeister.helferlein;

import static android.widget.Toast.LENGTH_LONG;

import android.content.Context;
import android.widget.Toast;


public class ToastHelfer {

    /**
     * Hilfsmethode zur Anzeigen eines Toasts mit {@code LENGTH_LONG}.
     *
     * @param context Selbstreferenz auf Activity
     *
     * @param stringResId ID der String-Ressource mit Anzeige-Text
     */
    public static void toastAnzeigen( Context context, int stringResId ) {

        Toast.makeText( context, stringResId, LENGTH_LONG).show();
    }

}
