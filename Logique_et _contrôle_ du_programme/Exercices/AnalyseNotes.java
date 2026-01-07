public class AnalyseNotes {
  
 public static void main(String[] args) {

        // Série de notes (certaines sont invalides)
        int[] notes = {12, 15, -3, 18, 22, 9, 14};

        int somme = 0;
        int compteurNotesValides = 0;
        int NOTE_MAX = 20;

        // Parcours des notes
        for (int i = 0; i < notes.length; i++) {

            // Ignorer les notes invalides
            if (notes[i] < 0 || notes[i] > NOTE_MAX) {
                continue;
            }

            // Notes valides
            System.out.println("Note prise en compte : " + notes[i]);
            somme += notes[i];
            compteurNotesValides++;
        }

        // Affichage du résultat final
        if (compteurNotesValides > 0) {
            double moyenne = (double) somme / compteurNotesValides;
            System.out.println("Moyenne des notes valides : " + moyenne);
        } else {
            System.out.println("Aucune note valide.");
        }
    }
}
