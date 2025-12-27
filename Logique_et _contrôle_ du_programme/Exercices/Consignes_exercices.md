# Exercices Java — Structures conditionnelles

## Exercice 1 — Validation d’un accès (IF / ELSE IF / ELSE)

## Objectif

Créer un programme Java qui valide l’accès à un service selon l’âge et le statut de l’utilisateur.

## Contexte

Tu développes un programme qui décide du **niveau d’accès à un service en ligne**.

## Travail demandé

### Classe

- Créer une classe nommée **AccesService**
- Respecter la convention PascalCase

### Données

Dans `main`, créer :

- l’**âge de l’utilisateur** (`int`)
- le **statut premium** (`boolean`)

(Les valeurs peuvent être initialisées directement ou lues avec `Scanner`.)

### Conditions à gérer

Implémenter les règles suivantes avec `if / else if / else` :

- moins de 18 ans → accès refusé
- 18 ans ou plus **et** premium → accès complet
- 18 ans ou plus mais non premium → accès limité
- sinon → message par défaut

Utilisation obligatoire de `&&`.

### Affichage

Afficher :

- l’âge
- le statut premium
- le message correspondant à la situation

## Exercice 2 — Menu utilisateur (SWITCH)

## Objectif

Créer un menu simple en console.

## Contexte

Tu développes un menu pour une application console.
L’utilisateur choisit une option et le programme affiche l’action correspondante.

## Travail demandé

### Classe

- Créer une classe nommée **MenuApplication**

### Donnée utilisateur

- Créer une variable représentant le **choix utilisateur**
- Type au choix : `int` ou `String`
- (`Scanner` recommandé mais non obligatoire)

### Menu

Afficher un menu avec plusieurs options, par exemple :

- Voir le profil
- Modifier le profil
- Supprimer le compte
- Quitter

### SWITCH obligatoire

Utiliser un `switch` pour :

- gérer chaque option
- prévoir un `default` pour un choix invalide

### Affichage

Afficher un message clair correspondant à chaque choix.
