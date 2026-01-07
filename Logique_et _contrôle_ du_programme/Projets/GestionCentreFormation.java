import java.util.Scanner;

public class GestionCentreFormation {

    public static void main(String[] args) {

        // =========================
        // CONSTANTES (final)
        // =========================
        final int NB_ETUDIANTS = 5;
        final int NB_MATIERES = 3;
        final double NOTE_MAX = 20.0;

        final double SEUIL_ADMIS = 10.0;
        final double SEUIL_AJOURNE = 8.0; // entre 8 et <10 : ajourné

        // =========================
        // DONNÉES (tableaux 1D et 2D)
        // =========================
        String[] etudiants = {
                "Amina",
                "Yanis",
                "Chloé",
                "Karim",
                "Lina"
        };

        // notes[étudiant][matière]
        // -1 signifie "note non renseignée"
        double[][] notes = new double[NB_ETUDIANTS][NB_MATIERES];

        // Initialisation des notes à -1 (aucune note)
        for (int i = 0; i < NB_ETUDIANTS; i++) {
            for (int j = 0; j < NB_MATIERES; j++) {
                notes[i][j] = -1;
            }
        }

        // On pré-remplit quelques notes (optionnel, pour avoir de la matière dès le début)
        notes[0][0] = 12; notes[0][1] = 14; notes[0][2] = 9;
        notes[1][0] = 8;  notes[1][1] = 7;  notes[1][2] = 10;
        notes[2][0] = 16; notes[2][1] = 15; notes[2][2] = 18;
        // notes[3] reste vide (-1)
        notes[4][0] = 10; notes[4][1] = 10; notes[4][2] = 10;

        // =========================
        // SCANNER + MENU
        // =========================
        Scanner scanner = new Scanner(System.in);

        int choix = -1;

        do {
            System.out.println();
            System.out.println("============================================");
            System.out.println("   CENTRE DE FORMATION — GESTION CONSOLE");
            System.out.println("============================================");
            System.out.println("1) Afficher la liste des étudiants");
            System.out.println("2) Afficher les notes");
            System.out.println("3) Calculer la moyenne d’un étudiant");
            System.out.println("4) Afficher les résultats (admis / ajourné / refusé)");
            System.out.println("5) Saisir / modifier une note");
            System.out.println("0) Quitter");
            System.out.println("--------------------------------------------");
            System.out.print("Votre choix : ");

            // Sécuriser la saisie du menu (while)
            while (!scanner.hasNextInt()) {
                System.out.print("Entrée invalide. Merci de saisir un nombre : ");
                scanner.next(); // on jette l'entrée invalide
            }
            choix = scanner.nextInt();

            switch (choix) {

                case 1: {
                    System.out.println();
                    System.out.println("---- LISTE DES ÉTUDIANTS ----");
                    for (int i = 0; i < etudiants.length; i++) {
                        System.out.println((i + 1) + ". " + etudiants[i]);
                    }
                    break;
                }

                case 2: {
                    System.out.println();
                    System.out.println("---- NOTES PAR ÉTUDIANT ----");
                    System.out.println("(Matières : " + NB_MATIERES + " | NOTE MAX : " + NOTE_MAX + ")");
                    System.out.println("--------------------------------------------");

                    for (int i = 0; i < NB_ETUDIANTS; i++) {
                        System.out.print(etudiants[i] + " : ");

                        boolean auMoinsUneNote = false;

                        for (int j = 0; j < NB_MATIERES; j++) {
                            if (notes[i][j] < 0) {
                                System.out.print("[M" + (j + 1) + ": -] ");
                                continue; // note absente : on passe à la suivante
                            }
                            auMoinsUneNote = true;
                            System.out.print("[M" + (j + 1) + ": " + notes[i][j] + "] ");
                        }

                        if (!auMoinsUneNote) {
                            System.out.print("=> Aucune note renseignée");
                        }
                        System.out.println();
                    }

                    break;
                }

                case 3: {
                    System.out.println();
                    System.out.println("---- MOYENNE D'UN ÉTUDIANT ----");

                    // Choix de l'étudiant
                    int indexEtudiant = -1;

                    System.out.println("Choisissez un étudiant :");
                    for (int i = 0; i < NB_ETUDIANTS; i++) {
                        System.out.println((i + 1) + ") " + etudiants[i]);
                    }
                    System.out.print("Numéro (1-" + NB_ETUDIANTS + ") : ");

                    while (!scanner.hasNextInt()) {
                        System.out.print("Entrée invalide. Saisissez un numéro : ");
                        scanner.next();
                    }
                    int num = scanner.nextInt();

                    if (num < 1 || num > NB_ETUDIANTS) {
                        System.out.println("Étudiant introuvable.");
                        break;
                    }
                    indexEtudiant = num - 1;

                    // Calcul de moyenne (for)
                    double somme = 0;
                    int count = 0;

                    for (int j = 0; j < NB_MATIERES; j++) {
                        if (notes[indexEtudiant][j] < 0) {
                            continue; // pas de note : on ignore
                        }
                        somme += notes[indexEtudiant][j];
                        count++;
                    }

                    if (count == 0) {
                        System.out.println("Aucune note pour " + etudiants[indexEtudiant] + ". Moyenne impossible.");
                        break;
                    }

                    double moyenne = somme / count;
                    System.out.println("Étudiant : " + etudiants[indexEtudiant]);
                    System.out.println("Moyenne : " + String.format("%.2f", moyenne) + " / " + NOTE_MAX);
                    break;
                }

                case 4: {
                    System.out.println();
                    System.out.println("---- RÉSULTATS ----");
                    System.out.println("Règles :");
                    System.out.println("- moyenne >= " + SEUIL_ADMIS + " : ADMIS");
                    System.out.println("- moyenne >= " + SEUIL_AJOURNE + " et < " + SEUIL_ADMIS + " : AJOURNÉ");
                    System.out.println("- moyenne < " + SEUIL_AJOURNE + " : REFUSÉ");
                    System.out.println("--------------------------------------------");

                    for (int i = 0; i < NB_ETUDIANTS; i++) {

                        double somme = 0;
                        int count = 0;

                        for (int j = 0; j < NB_MATIERES; j++) {
                            if (notes[i][j] < 0) {
                                continue;
                            }
                            somme += notes[i][j];
                            count++;
                        }

                        // Étudiant sans notes : on l'ignore (continue)
                        if (count == 0) {
                            System.out.println(etudiants[i] + " : (aucune note) => Résultat non calculable");
                            continue;
                        }

                        double moyenne = somme / count;

                        String statut;
                        if (moyenne >= SEUIL_ADMIS) {
                            statut = "ADMIS";
                        } else if (moyenne >= SEUIL_AJOURNE) {
                            statut = "AJOURNÉ";
                        } else {
                            statut = "REFUSÉ";
                        }

                        System.out.println(etudiants[i] + " : moyenne = " + String.format("%.2f", moyenne) + " => " + statut);
                    }

                    break;
                }

                case 5: {
                    System.out.println();
                    System.out.println("---- SAISIR / MODIFIER UNE NOTE ----");

                    // Choisir étudiant
                    System.out.println("Choisissez un étudiant :");
                    for (int i = 0; i < NB_ETUDIANTS; i++) {
                        System.out.println((i + 1) + ") " + etudiants[i]);
                    }
                    System.out.print("Numéro (1-" + NB_ETUDIANTS + ") : ");

                    while (!scanner.hasNextInt()) {
                        System.out.print("Entrée invalide. Saisissez un numéro : ");
                        scanner.next();
                    }
                    int numEtudiant = scanner.nextInt();

                    if (numEtudiant < 1 || numEtudiant > NB_ETUDIANTS) {
                        System.out.println("Étudiant introuvable.");
                        break;
                    }
                    int iEtu = numEtudiant - 1;

                    // Choisir matière
                    System.out.print("Choisissez la matière (1-" + NB_MATIERES + ") : ");
                    while (!scanner.hasNextInt()) {
                        System.out.print("Entrée invalide. Saisissez un numéro : ");
                        scanner.next();
                    }
                    int numMatiere = scanner.nextInt();

                    if (numMatiere < 1 || numMatiere > NB_MATIERES) {
                        System.out.println("Matière introuvable.");
                        break;
                    }
                    int iMat = numMatiere - 1;

                    // Saisir note
                    System.out.print("Saisissez la note (0 à " + NOTE_MAX + ") ou -1 pour effacer : ");

                    while (!scanner.hasNextDouble()) {
                        System.out.print("Entrée invalide. Saisissez une note (ex: 12.5) : ");
                        scanner.next();
                    }
                    double note = scanner.nextDouble();

                    // Ignorer les notes invalides (continue) : ici on va réessayer dans une petite boucle
                    // (on reste dans main, pas de méthode)
                    while (true) {
                        if (note == -1) {
                            notes[iEtu][iMat] = -1;
                            System.out.println("Note effacée pour " + etudiants[iEtu] + " (M" + (numMatiere) + ").");
                            break; // on sort de la boucle de validation
                        }

                        if (note < 0 || note > NOTE_MAX) {
                            System.out.print("Note invalide. Re-saisissez (0-" + NOTE_MAX + ") ou -1 : ");

                            while (!scanner.hasNextDouble()) {
                                System.out.print("Entrée invalide. Saisissez une note : ");
                                scanner.next();
                            }
                            note = scanner.nextDouble();
                            continue; // on recommence la validation
                        }

                        // Note valide
                        notes[iEtu][iMat] = note;
                        System.out.println("Note enregistrée : " + etudiants[iEtu] + " (M" + (numMatiere) + ") = " + note);
                        break;
                    }

                    break;
                }

                case 0: {
                    System.out.println();
                    System.out.println("Au revoir !");
                    break; // break du switch
                }

                default: {
                    System.out.println("Choix invalide. Merci de choisir une option du menu.");
                    break;
                }
            }

        } while (choix != 0);

        scanner.close();
    }
}
