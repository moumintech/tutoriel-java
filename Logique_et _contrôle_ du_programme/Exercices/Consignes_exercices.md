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

# Exercices Java — Boucles

Aucun code fourni. Tu implémentes tout toi-même.

Ces exercices permettent de pratiquer :

- `while`
- `do while`
- `for`
- `break`
- `continue`

## Exercice 1 — Gestion d’un code PIN (WHILE + BREAK)

## Objectif

Créer un programme Java qui vérifie un **code PIN** avec un nombre limité de tentatives.

## Contexte

Un utilisateur doit entrer un code PIN pour accéder à son compte.
Après plusieurs tentatives incorrectes, l’accès est refusé.

## Travail demandé

### Classe

- Créer une classe nommée **VerificationCodePin**

### Données

- un **code PIN correct** (stocké dans une variable)
- un **code saisi** par l’utilisateur (`Scanner`)
- un **compteur de tentatives**

### Boucle

- Utiliser une boucle `while`
- Tant que :
  - le code est incorrect
  - et que les tentatives ne sont pas dépassées
- redemander le code

### Contrôle

- Si le code est correct :
  - afficher un message de succès
  - interrompre la boucle avec `break`

### Affichage final

- accès accordé ou refusé
- nombre de tentatives utilisées

## Exercice 2 — Menu interactif (DO WHILE)

## Objectif

Créer un menu console qui s’affiche **au moins une fois** et se répète jusqu’à quitter.

## Contexte

Tu développes un menu simple pour une application console.

## Travail demandé

### Classe

- Créer une classe nommée **MenuInteractif**

### Menu

Afficher un menu avec des options, par exemple :

- 1 → Message de bienvenue
- 2 → Afficher une information
- 3 → Afficher une donnée fictive
- 0 → Quitter

### Boucle

- Utiliser obligatoirement `do while`
- Le menu se répète tant que l’utilisateur ne choisit pas `0`

### Logique

- Gérer les choix avec `if / else` ou `switch`
- Le programme se termine proprement

## Exercice 3 — Analyse de notes (FOR + CONTINUE)

## Objectif

Parcourir des données et ignorer les valeurs invalides.

## Contexte

Un enseignant analyse une série de notes.
Certaines notes sont invalides et doivent être ignorées.

## Travail demandé

### Classe

- Créer une classe nommée **AnalyseNotes**

### Données

- une série de notes définies dans le programme
- une variable pour calculer un total ou une moyenne

### Boucle

- Parcourir les notes avec une boucle `for`

### Contrôle

- Si une note est :
  - négative
  - ou supérieure à la valeur maximale autorisée
- l’ignorer avec `continue`

### Affichage

- afficher les notes prises en compte
- afficher le résultat final (total ou moyenne)

## Résultat attendu

Trois programmes :

- fonctionnels
- bien structurés
- utilisant correctement chaque type de boucle Java
