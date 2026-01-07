# Mini-projet Java — Gestion d’un centre de formation

Ce n’est pas un exercice isolé, mais un **mini-projet pédagogique structuré**.  
 Aucun code fourni. Tu implémentes tout toi-même.

## Objectif

Créer un programme Java en console permettant de **gérer des étudiants, leurs notes et leurs résultats**, via un **menu interactif**.

Ce projet permet de mettre en pratique :

- structure complète d’un programme Java
- variables et types
- constantes (`final`)
- opérateurs
- conditions (`if / else if / else`)
- `switch`
- boucles (`for`, `while`, `do while`)
- tableaux 1D et 2D
- `break` et `continue`
- logique métier simple et réaliste

## Contexte

Un **centre de formation** souhaite un outil simple pour :

- stocker des étudiants
- gérer leurs notes
- calculer des moyennes
- afficher des résultats
- décider de l’admission ou non

Tout se fait **en console**.

## Structure du projet

### 1️ Classe

- Une seule classe
- Nom explicite lié à la formation ou aux étudiants
- Respect de la convention **PascalCase**

### Méthode `main`

- Tout le programme est contenu dans `main`
- Aucune méthode supplémentaire

## Données du projet

### Étudiants

- Tableau 1D de `String`
- Chaque élément représente un étudiant

### Notes

- Tableau **2D de `double`**
  - lignes → étudiants
  - colonnes → notes (ex : plusieurs matières)

Les données peuvent être :

- initialisées dans le code
- et/ou partiellement saisies avec `Scanner`

## Menu interactif (DO WHILE + SWITCH)

Le programme affiche un **menu répété** tant que l’utilisateur ne quitte pas.

Exemples d’options :

1. Afficher la liste des étudiants
2. Afficher les notes
3. Calculer la moyenne d’un étudiant
4. Afficher les résultats (admis / ajourné / refusé)
5. Quitter

Utilisation obligatoire de :

- `do while`
- `switch`
- `case`
- `break`
- `default`

## Boucles à utiliser

### `for`

- parcourir les tableaux
- afficher les notes
- calculer les moyennes

### `while` / `do while`

- gérer le menu
- gérer la saisie utilisateur

### `continue`

- ignorer une note invalide
- ignorer un étudiant sans notes

### `break`

- quitter le menu
- sortir d’une boucle selon un cas précis

## Conditions

Déterminer le résultat d’un étudiant selon sa moyenne :

- admis
- ajourné
- refusé

Logique attendue :

- moyenne ≥ seuil → admis
- moyenne intermédiaire → ajourné
- moyenne < seuil → refusé

Utilisation obligatoire de :

- `if`
- `else if`
- `else`
- opérateurs de comparaison et logiques

## Constantes (`final`)

Définir des constantes pour :

- seuil de validation
- nombre de matières
- note maximale

Convention :

- **MAJUSCULES + `_`**

## Affichage

L’affichage doit être :

- clair
- structuré
- compréhensible pour un utilisateur non technique

Exemples :

- titres
- séparateurs
- messages explicites

## Contraintes

- Pas de classes multiples
- Pas de méthodes personnalisées
- Pas de notions non vues
- `Scanner` autorisé
- tableaux, conditions, boucles et `switch` obligatoires

## Résultat attendu

Un programme :

- complet
- structuré
- logique
- réaliste
- représentatif d’un **mini-projet Java de fin de module**
