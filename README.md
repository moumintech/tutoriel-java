
# Apprentisage Java - Débutante

Ce dépot regroupe mes leçons , exercices pratiquues et mes projet en Java
Objectif: progresser étape par étapeavec des exercice concrets .

## Sommaire

## Concepts de base

- [Introduction](#introduction)
- [Les variables](#les-variables)
- [Les opérateurs arithmétiques](#Les-Opérateurs-arithmétiques)
- [Les commentaires](#Les-commentaires)

## Logique et exécution du programme

- [Les entrées utilisateur](#Les-entrées-utilisateurs)
- [Les structures conditionnelles](#Les-structures-conditionnelles)
- [Les structures conditionnelles itéraction](#Les-structures-conditionnelless-iteraction)
- [Les tableaux](#Les-tableaux)

## Leçons rapides

## Introduction

Java est l’un des langages de programmation les plus populaires. Il peut s’exécuter sur différentes plateformes, y compris les ordinateurs, les systèmes embarqués et le mobile. On peut utiliser Java pour développer des applications, des jeux, des logiciels bancaires, des applications web et bien plus encore. Son slogan bien connu est : " Write once, run anywhere!"
On genere des sorties avec l'instruction
`System.out.println()`

En Java, on peut écrire plusieurs instructions à la suite.
Chaque instruction doit se terminer par un point-virgule ;.
Java est également sensible à la casse : Main, main et MAIN sont considérés comme différents.

**Excercice pratique**[INSTRUCTION](INSTRUCTION.md/)

**_La structure des programmes Java_** :
La ligne suivante définit une classe appelée **Meteo** :
`class Meteo{ } `
En Java, chaque ligne de code exécutable doit se trouver à \*\*l’intérieur d’une classe.\*\*
Une classe s’ouvre et se ferme avec des accolades { }.

Le point d’entrée de tout programme Java est la méthode main :
`public static void main ( String[]args ){ Systeme.out.println( "Salut");}`
La méthode main fonctionne comme une classe : elle s’ouvre et se ferme aussi avec des accolades.
Elle contient le code qui sera exécuté lorsque le programme démarre.
Dans cet exemple, l’instruction println sera exécutée, ce qui affichera **Salut** à l’écran.

**Excercice pratique: Debug & fix** la consigne ici [INSTRUCTION](INSTRUCTION.md/)

## Les variables

#### Les variables en programmation

Dans un programme, nous travaillons constamment avec des valeurs : du texte, des nombres, des données diverses.
Une variable sert à stocker une valeur en lui attribuant un nom. Ce nom permet ensuite de réutiliser la valeur plus tard dans le programme.

Exemple : dans un jeu vidéo, on peut créer une variable pour stocker le nombre de points du joueur
Le type d’une variable

Chaque variable possède un **type**, c’est-à-dire la catégorie de valeur qu’elle peut contenir :

- du texte (String)

- un nombre entier (int)

- un nombre décimal (double)

- etc.

Pour le texte, on utilise les **guillemets**. Le texte écrit entre guillemets est appelé une String.

#### Créer une variable de type String

Pour déclarer une variable, on indique d’abord son type, puis son nom :
`String nom;` ici
Ici, on crée une variable appelée name de type String.

**Important** : En Java, String commence toujours par une majuscule.
string en minuscules provoquera une erreur

#### Attribuer une valeur à une variable

Après avoir déclaré la variable, on peut lui donner une valeur grâce à l’opérateur d’affectation = :

`nom = Zam `
À présent, la variable name contient la valeur "Zam".

On peut aussi déclarer et affecter en une seule ligne :
`String nom = "Zam"; `

#### Modifier la valeur d’une variable

Une variable peut changer de valeur au cours du programme :
`String nom = "Zam"; nom= "Moumin ;`
À la fin, name contient "Moumin".
Si l’on affiche la variable :
`System.out.println(name);`
Le programme affichera :
`Moumin`
**Exercice pratique : Stocker le titre d'un film** trouver la consigne ici [INSTRUCTION](INSTRUCTION.md/)
**Les types de variables en Java**

En Java, il existe plusieurs types de données que l’on peut utiliser pour déclarer des variables.
Chaque type sert à stocker un genre précis de valeur.
_Le type int_

Le type int est utilisé pour stocker des nombres entiers (sans décimales), appelés integers en programmation.
`int prix = 5;`
**Les types pour les nombres décimaux**
Le type **_double_**

Pour travailler avec des nombres décimaux, on utilise généralement le type double.
`double prix = 5.5;`
Le type **_float_**

Il existe aussi le type float, qui permet également de stocker des nombres décimaux.
Lorsqu’on utilise un float, il est obligatoire d’ajouter le suffixe f à la valeur.
`float prix = 5.5f;`

**Différence entre float et double**

float :

- Utilise moins de mémoire

- Est moins précis

- Les calculs sont légèrement plus rapides

double :

- Utilise plus de mémoire

- Est plus précis

- Recommandé pour la majorité des cas

Règle générale :

Utilisez float lorsque la mémoire est critique.

Utilisez double pour des calculs précis, par exemple pour des devises ou des calculs financiers.

**Le type char**

Le type char permet de stocker un seul caractère.

Contrairement au type String, il utilise des guillemets simples
`char  lettre = 'Z';`
Le type boolean

Le type boolean est utilisé pour représenter des valeurs logiques.
Il ne peut contenir que deux valeurs : true ou false.

Ce type est très utile pour gérer des conditions ou des états.
`boolean uneReine =true; `
`boolean uneParesseuse =false; `

## Les Opérateurs arithmétiques

Java permet d’effectuer des calculs grâce à des opérateurs mathématiques courants.

### Addition (`+`)

L’opérateur `+` permet d’additionner deux valeurs.

```java
int x = 5;
int y = 3;
System.out.println(x + y);
```

Résultat affiché : `8`

Vous pouvez aussi stocker le résultat dans une variable :

```java
double prix1 = 24.99;
double prix2 = 19.45;
double somme = prix1 + prix2;
System.out.println(somme);
```

Résultat affiché : `44.44`

### Soustraction (`-`)

L’opérateur `-` permet de soustraire une valeur à une autre.

```java
int salaire = 9000;
int taxe = 500;
int resultat = salaire - taxe;
System.out.println(resultat);
```

Résultat affiché : `8500`

### Multiplication (`*`)

L’astérisque `*` permet de multiplier deux valeurs.

Exemple : calculer 20 % d’un prix.

```java
int prix = 1200;
System.out.println(prix * 0.2);
```

Résultat affiché : `240.0`

### Division (`/`)

L’opérateur `/` permet de diviser une valeur par une autre.

```java
int montant = 9000;
int prix = 49;
int resultat = montant / prix;
System.out.println(resultat);
```

Résultat affiché : `183`

Avec des `int`, le résultat est un **nombre entier**.
Pour obtenir un résultat avec des décimales, utilisez `double` :

```java
double resultat = (double) montant / prix;
System.out.println(resultat);
```

### Modulo (`%`)

L’opérateur modulo `%` permet d’obtenir le **reste d’une division**.

Exemple : combien d’articles restent si on les range par boîtes de 5 ?

```java
int items = 23;
int reste = items % 5;
System.out.println(reste);
```

Résultat affiché : `3`

### Concaténation de chaînes de caractères

En Java, l’opérateur `+` permet aussi d’assembler des **chaînes de caractères** (String).
Ce processus s’appelle la **concaténation**.

```java
String nom = "John";
String prenon = "Doe";
String nomComplet = nom + " " + prenom;
System.out.println(nomComplet);
```

Résultat affiché : `John Doe`

Voici une **leçon améliorée, claire et bien structurée** sur les **commentaires en Java**, avec des ajouts utiles et des exemples corrigés.

**Excercice pratique: Calculs dans un stand de barbe à papa ** la consigne ici [INSTRUCTION](INSTRUCTION.md/)

## Les commentaires

### Qu’est-ce qu’un commentaire ?

Les commentaires sont des **annotations écrites dans le code** pour expliquer ce que fait le programme.

Le **code** est destiné à l’ordinateur.
Les **commentaires** sont destinés aux humains (développeurs, enseignants, collègues, ou vous-même plus tard).

Les commentaires **ne sont jamais exécutés** par le programme.

### Commentaires sur une seule ligne

Un commentaire sur une ligne commence par **deux barres obliques `//`**.
Tout ce qui se trouve après `//` sur la même ligne est ignoré par Java.

```java
// Ceci est un commentaire sur une seule ligne
int age = 20; // Déclaration de l’âge de l’utilisateur
```

### Commentaires sur plusieurs lignes

Lorsque vous avez besoin d’écrire un commentaire plus long ou de commenter plusieurs lignes, vous pouvez utiliser :

`/*` pour commencer
`*/` pour terminer

```java
/*
Ceci est un commentaire
sur plusieurs lignes.
Il permet d’expliquer
une partie importante du programme.
*/
```

### Commenter temporairement du code

Les commentaires peuvent aussi servir à **désactiver du code temporairement**, par exemple lorsqu’une fonctionnalité est en cours de développement ou en test.

```java
/*
int resultat = calculerTotal();
System.out.println(resultat);
*/
```

Le code est conservé mais **non exécuté**.

## Les entrées utilisateur

### Introduction : qu’est-ce qu’une entrée utilisateur ?

Certains programmes ont besoin de **données fournies par l’utilisateur** pour fonctionner.

Exemples :

- Un **jeu** peut demander un surnom (pseudo) au joueur.
- Un **convertisseur** peut demander une valeur à convertir (euros → dollars).
- Un **programme de calcul** peut demander deux nombres.

Pour cela, Java permet de lire ce que l’utilisateur tape au clavier : on parle **d’entrée utilisateur**.

### La classe Scanner

En Java, l’une des façons les plus courantes de récupérer une entrée utilisateur est d’utiliser la **classe `Scanner`**.

Avant de l’utiliser, il faut **l’importer**.

```java
import java.util.Scanner;
```

Cette ligne doit toujours être placée **en haut du fichier**, avant la déclaration de la classe.

### Création d’un objet Scanner

Après l’importation, on doit créer un **objet Scanner** pour lire les données entrées au clavier.

```java
Scanner sc = new Scanner(System.in);
```

- `Scanner` : le type de l’objet
- `sc` : le nom de l’objet (on peut choisir un autre nom)
- `System.in` : indique que l’entrée vient du clavier

Pour l’instant, retiens simplement **la syntaxe**.

### Lire une entrée de type String

Pour lire un texte (par exemple un nom ou un pseudo), on utilise :

```java
nextLine()
```

#### Exemple : demander un pseudo à l’utilisateur

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Entrez votre pseudo : ");
        String pseudo = sc.nextLine();

        System.out.println("Bienvenue " + pseudo + " !");
    }
}
```

Ici :

- l’utilisateur tape un texte
- le texte est stocké dans la variable `pseudo`

### Lire une entrée de type entier (int)

Pour lire un nombre entier, on utilise :

```java
nextInt()
```

#### Exemple : demander l’âge de l’utilisateur

```java
Scanner sc = new Scanner(System.in);

System.out.print("Entrez votre âge : ");
int age = sc.nextInt();

System.out.println("Vous avez " + age + " ans.");
```

### Lire plusieurs entrées avec un seul Scanner

Un **même objet Scanner** peut être utilisé pour lire plusieurs valeurs.

#### Exemple : nom + âge

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Entrez votre nom : ");
        String nom = sc.nextLine();

        System.out.print("Entrez votre âge : ");
        int age = sc.nextInt();

        System.out.println("Nom : " + nom);
        System.out.println("Âge : " + age);
    }
}
```

## Les structures conditionnelles

### Introduction : la prise de décision en programmation

En programmation, les **instructions conditionnelles** permettent à un programme de **prendre des décisions** et d’exécuter des actions différentes **selon une condition**.

Exemple :

- Un jeu autorise l’accès à un niveau **si l’âge ou le score est suffisant**.
- Un système affiche un message différent selon une **note**.

### L’instruction `if`

L’instruction `if` est la **structure conditionnelle la plus utilisée** en Java.

**Principe :**

- Si la condition est **vraie (`true`)**, le code dans le bloc `if` est exécuté.
- Si la condition est **fausse (`false`)**, le bloc est ignoré.

#### Syntaxe générale

```java
if (condition) {
    // code exécuté si la condition est vraie
}
```

### Les opérateurs de comparaison

Les conditions utilisent des **opérateurs de comparaison** :

| Opérateur | Signification       |
| --------- | ------------------- |
| `==`      | égal à              |
| `!=`      | différent de        |
| `<`       | inférieur à         |
| `>`       | supérieur à         |
| `<=`      | inférieur ou égal à |
| `>=`      | supérieur ou égal à |

**Attention**

- `=` → opérateur d’affectation
- `==` → opérateur de comparaison (test d’égalité)

### Exemple simple avec `if`

```java
int age = 18;

if (age >= 18) {
    System.out.println("Accès autorisé");
}
```

Ici, le message s’affiche **uniquement si l’âge est supérieur ou égal à 18**.

### L’instruction `if...else`

Une instruction `if` peut être suivie d’un `else`.

**Principe :**

- Le bloc `if` s’exécute si la condition est vraie.
- Sinon, le bloc `else` s’exécute.

#### Syntaxe

```java
if (condition) {
    // code si vrai
} else {
    // code si faux
}
```

#### Exemple

```java
int note = 9;

if (note >= 10) {
    System.out.println("Admis");
} else {
    System.out.println("Ajourné");
}
```

### Les conditions imbriquées (if dans if)

Il est possible de placer une instruction `if` **à l’intérieur d’une autre**.

#### Exemple

```java
int heure = 17;

if (heure > 0) {
    if (heure <= 16) {
        System.out.println("Welcome");
    } else {
        System.out.println("Too late");
    }
} else {
    System.out.println("Erreur");
}
```

Cette méthode fonctionne mais peut rendre le code **moins lisible**.

### L’instruction `else if`

Pour tester **plusieurs conditions**, on utilise `else if`.

C’est souvent **préférable aux if imbriqués**.

#### Syntaxe

```java
if (condition1) {
    // code
} else if (condition2) {
    // code
} else {
    // code par défaut
}
```

### Exemple clair avec `if / else if / else`

```java
int heure = 15;

if (heure <= 0) {
    System.out.println("Erreur");
} else if (heure <= 16) {
    System.out.println("Welcome");
} else {
    System.out.println("Too late, too young");
}
```

Le programme vérifie les conditions **dans l’ordre**, et exécute **un seul bloc**.

### Exemple concret : programme de facturation

```java
double total = 120.0;

if (total >= 100) {
    total = total * 0.9; // remise de 10 %
    System.out.println("Remise appliquée");
} else {
    System.out.println("Pas de remise");
}

System.out.println("Total à payer : " + total + " €");
```

### L’instruction conditionnelle switch

### Introduction

Dans certains programmes, il est nécessaire de **tester une même variable contre plusieurs valeurs possibles**.

Exemple :

- Un programme reçoit un **numéro de jour** et affiche le **jour de la semaine correspondant**.
- Un menu propose plusieurs **choix numérotés**.
- Un système attribue une action selon un **code**.

Lorsque l’on utilise plusieurs `if / else if`, le code peut devenir **long et difficile à lire**.
Dans ce cas, on utilise l’instruction **`switch`**.

### Qu’est-ce qu’un `switch` ?

L’instruction `switch` permet de **comparer une variable à plusieurs valeurs possibles** (appelées `case`).

Principe :

- La valeur testée est comparée à chaque `case`.
- Lorsque la valeur correspond, le code associé s’exécute.
- L’exécution s’arrête lorsqu’un `break` est rencontré.

### Syntaxe générale du `switch`

```java
switch (variable) {
    case valeur1:
        // code
        break;
    case valeur2:
        // code
        break;
    default:
        // code exécuté si aucun cas ne correspond
}
```

### Exemple simple : jours de la semaine (partiel)

```java
int jour = 1;

switch (jour) {
    case 1:
        System.out.println("Lundi");
        break;
    case 2:
        System.out.println("Mardi");
        break;
    case 3:
        System.out.println("Mercredi");
        break;
    default:
        System.out.println("Jour invalide");
}
```

Ici, seules les **trois premières valeurs** sont vérifiées.
Tu peux continuer jusqu’à `7` pour couvrir toute la semaine.

### Exemple complet : 7 jours de la semaine

```java
int jour = 5;

switch (jour) {
    case 1:
        System.out.println("Lundi");
        break;
    case 2:
        System.out.println("Mardi");
        break;
    case 3:
        System.out.println("Mercredi");
        break;
    case 4:
        System.out.println("Jeudi");
        break;
    case 5:
        System.out.println("Vendredi");
        break;
    case 6:
        System.out.println("Samedi");
        break;
    case 7:
        System.out.println("Dimanche");
        break;
    default:
        System.out.println("Numéro de jour invalide");
}
```

### Rôle important du `break`

Le mot-clé **`break` est essentiel**.

Sans `break`, le programme continue d’exécuter **les cas suivants**, même si la valeur ne correspond plus.

#### Exemple sans `break` (comportement indésirable)

```java
int jour = 1;

switch (jour) {
    case 1:
        System.out.println("Lundi");
    case 2:
        System.out.println("Mardi");
    case 3:
        System.out.println("Mercredi");
}
```

Résultat :

```
Lundi
Mardi
Mercredi
```

C’est pourquoi **chaque `case` doit généralement se terminer par un `break`**.

### Le `default case`

Le `default` est **optionnel**, mais fortement recommandé.

Il s’exécute lorsque **aucun `case` ne correspond** à la valeur testée.

```java
default:
    System.out.println("Valeur non reconnue");
```

Il permet de gérer les **erreurs ou cas imprévus**.

### Exemple concret : menu utilisateur

```java
int choix = 2;

switch (choix) {
    case 1:
        System.out.println("Nouvelle partie");
        break;
    case 2:
        System.out.println("Charger la partie");
        break;
    case 3:
        System.out.println("Quitter le jeu");
        break;
    default:
        System.out.println("Choix invalide");
}
```

### Quand utiliser `switch` plutôt que `if / else` ?

Utilise `switch` quand :

- Tu testes **une seule variable**
- Tu compares cette variable à **plusieurs valeurs précises**
- Tu veux un code **plus lisible et structuré**

Évite `switch` si :

- Les conditions sont complexes (`>`, `<`, `&&`, `||`)
- Les tests ne sont pas basés sur l’égalité

### Conditions multiples et boucles en Java

## Les conditions multiples

### Introduction

Dans certains cas, une **seule condition n’est pas suffisante**.
On a souvent besoin de **combiner plusieurs conditions** pour prendre une décision.

Exemple :

- Vérifier si un âge est **supérieur à 18 ET inférieur à 50**
- Vérifier si un utilisateur est **majeur OU administrateur**
- Vérifier qu’une condition est **fausse**

Pour cela, Java fournit des **opérateurs logiques**.

### Les opérateurs logiques en Java

| Opérateur | Nom       | Signification                             |         |                                        |
| --------- | --------- | ----------------------------------------- | ------- | -------------------------------------- |
| `&&`      | AND (ET)  | Toutes les conditions doivent être vraies |         |                                        |
| `         |           | `                                         | OR (OU) | Au moins une condition doit être vraie |
| `!`       | NOT (NON) | Inverse la condition                      |         |                                        |

### L’opérateur AND (`&&`)

L’opérateur **ET** vérifie si **toutes les conditions sont vraies**.

#### Exemple

```java
int age = 25;

if (age > 18 && age < 50) {
    System.out.println("Âge valide");
}
```

Le message s’affiche uniquement si **les deux conditions sont vraies**.

### L’opérateur OR (`||`)

L’opérateur **OU** vérifie si **au moins une condition est vraie**.

#### Exemple

```java
boolean estAdmin = true;
int age = 16;

if (age >= 18 || estAdmin) {
    System.out.println("Accès autorisé");
}
```

Ici, l’accès est autorisé même si l’âge est inférieur à 18, car l’utilisateur est administrateur.

### L’opérateur NOT (`!`)

L’opérateur **NOT** inverse une condition :

- `true` devient `false`
- `false` devient `true`

#### Exemple

```java
boolean estConnecte = false;

if (!estConnecte) {
    System.out.println("Veuillez vous connecter");
}
```

### Combiner plusieurs conditions

On peut combiner plusieurs conditions avec des **parenthèses** pour plus de clarté.

#### Exemple

```java
int age = 30;
boolean permis = true;

if ((age >= 18 && age <= 65) && permis) {
    System.out.println("Autorisé à conduire");
}
```

## Les structures itératives (boucle)

### Introduction aux boucles

Les **boucles** permettent de **répéter un bloc de code plusieurs fois** tant qu’une condition est vraie.

Exemple :

- Afficher les nombres de 1 à 10
- Calculer une somme
- Parcourir une liste

### La boucle `while`

La boucle `while` s’exécute **tant que la condition est vraie**.

#### Syntaxe

```java
while (condition) {
    // code répété
}
```

### Exemple simple de boucle `while`

```java
int x = 5;

while (x > 0) {
    System.out.println(x);
    x = x - 1;
}
```

La ligne `x = x - 1` est **essentielle**.
Sans elle, la condition ne deviendrait jamais fausse → **boucle infinie**.

### Incrémentation et décrémentation

Java fournit des **opérateurs raccourcis** :

| Opération   | Forme longue | Forme courte |
| ----------- | ------------ | ------------ |
| Décrémenter | `x = x - 1`  | `x--`        |
| Incrémenter | `x = x + 1`  | `x++`        |

#### Exemple

```java
int x = 5;

while (x > 0) {
    System.out.println(x);
    x--;
}
```

### Autres opérateurs abrégés

Java permet aussi :

```java
x += 2;  // x = x + 2
x -= 3;  // x = x - 3
x *= 9;  // x = x * 9
x /= 2;  // x = x / 2
```

### Exemple : afficher les nombres pairs

```java
int x = 0;

while (x <= 10) {
    System.out.println(x);
    x += 2;
}
```

### Exemple : calculer la somme de 1 à 100

```java
int num = 1;
int somme = 0;

while (num <= 100) {
    somme += num;
    num++;
}

System.out.println("La somme est : " + somme);
```

La dernière instruction `print` est **en dehors** de la boucle.

### La boucle `do while`

La boucle `do while` est une **variation de la boucle while**.

Différence principale :

- Le code s’exécute **au moins une fois**, même si la condition est fausse.

#### Syntaxe

```java
do {
    // code exécuté au moins une fois
} while (condition);
```

Note le **point-virgule `;`** à la fin.

### Exemple avec condition fausse

```java
int x = 0;

do {
    System.out.println("Ce message s'affiche une fois");
} while (x > 5);
```

Même si la condition est fausse, le code s’exécute **une fois**.

### Différence entre `while` et `do while`

| while                     | do while                    |
| ------------------------- | --------------------------- |
| Condition testée avant    | Condition testée après      |
| Peut ne jamais s’exécuter | S’exécute au moins une fois |

# La boucle `for` en Java

## Introduction à la boucle `for`

La boucle `for` est un **autre type de boucle** en Java.
Elle est très utilisée lorsque l’on **connaît à l’avance le nombre de répétitions**.

Exemples d’utilisation :

- Afficher les nombres de 1 à 10
- Parcourir un tableau
- Répéter une action un nombre précis de fois

## Structure de la boucle `for`

La boucle `for` est composée de **trois parties** :

```java
for (initialisation; condition; incrémentation) {
    // code répété
}
```

### Détail des trois composants :

1. **Initialisation**

   - S’exécute **une seule fois**, au début de la boucle
   - Sert à déclarer et initialiser la variable de contrôle

2. **Condition**

   - Testée **avant chaque itération**
   - Tant qu’elle est vraie, la boucle continue

3. **Incrémentation / décrémentation**

   - S’exécute **après chaque itération**
   - Sert à modifier la variable de contrôle

## Exemple simple de boucle `for`

```java
for (int i = 1; i <= 5; i++) {
    System.out.println(i);
}
```

Déroulement :

- `i` commence à 1
- Tant que `i <= 5`, le code s’exécute
- `i++` augmente la valeur de `i` de 1 à chaque tour

## Comparaison `while` vs `for`

```java
// avec while
int i = 1;
while (i <= 5) {
    System.out.println(i);
    i++;
}

// avec for
for (int i = 1; i <= 5; i++) {
    System.out.println(i);
}
```

La boucle `for` est **plus compacte et plus lisible** quand on connaît les bornes.

## Conditions et incrémentations personnalisées

La boucle `for` peut utiliser **n’importe quelle condition** et **n’importe quelle incrémentation**.

### Exemple : compter de 0 à 20 de 2 en 2

```java
for (int i = 0; i <= 20; i += 2) {
    System.out.println(i);
}
```

## Exemple : calculer une somme

```java
int somme = 0;

for (int i = 1; i <= 100; i++) {
    somme += i;
}

System.out.println("La somme est : " + somme);
```

La variable `somme` accumule la valeur à chaque itération.

## Le contrôle de boucle : `break`

L’instruction **`break`** permet de **quitter immédiatement la boucle**, même si la condition est encore vraie.

`break` fonctionne :

- dans les `switch`
- dans les boucles `while`, `do while` et `for`

### Exemple simple avec `break`

```java
for (int i = 1; i <= 10; i++) {
    if (i == 5) {
        break;
    }
    System.out.println(i);
}
```

Résultat :

```
1
2
3
4
```

La boucle s’arrête dès que `i == 5`.

## Exemple concret : calculatrice avec arrêt

Contexte : on additionne des nombres tant que l’utilisateur n’entre pas `-1`.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int somme = 0;

        while (true) {
            System.out.print("Entrez un nombre (-1 pour arrêter) : ");
            int nombre = sc.nextInt();

            if (nombre == -1) {
                break;
            }

            somme += nombre;
        }

        System.out.println("Somme totale : " + somme);
    }
}
```

Ici, `break` permet **d’arrêter la boucle volontairement**.

## L’instruction `continue`

L’instruction **`continue`** permet de :

- **sauter l’itération en cours**
- passer directement à la suivante

Contrairement à `break`, la boucle **ne s’arrête pas**.

### Exemple avec `continue`

```java
for (int i = 1; i <= 10; i++) {
    if (i % 2 == 0) {
        continue;
    }
    System.out.println(i);
}
```

Résultat :

```
1
3
5
7
9
```

Les nombres pairs sont ignorés.

## Les tableaux

## Introduction : pourquoi utiliser des tableaux ?

Imagine un programme qui doit stocker **l’âge de 10 utilisateurs**.

Sans tableau
Tu devrais créer :

```java
int age1, age2, age3, age4, age5, age6, age7, age8, age9, age10;
```

C’est **long**, **répétitif** et **peu efficace**.

Avec un tableau
Un **tableau** permet de stocker **plusieurs valeurs du même type dans une seule variable**.

## Qu’est-ce qu’un tableau ?

Un tableau :

- contient **plusieurs valeurs**
- toutes du **même type**
- accessibles grâce à un **index**

Exemple : un tableau d’âges

```java
int[] ages;
```

## Déclaration d’un tableau

Pour déclarer un tableau, on utilise des **crochets `[]`** après le type.

```java
int[] ages;
```

Cela signifie :

> `ages` est un tableau qui contiendra des entiers (`int`).

Il est aussi possible d’écrire :

```java
int ages[];
```

Mais la **bonne pratique recommandée** est :

```java
int[] ages;
```

## Création d’un tableau (mot-clé `new`)

Après la déclaration, il faut **créer le tableau** et préciser sa taille.

```java
int[] ages = new int[5];
```

Ici :

- le tableau peut stocker **5 entiers**
- les index vont de `0` à `4`

## 5️ Les index des tableaux

Très important :
Les index commencent **toujours à 0**

| Index | Position réelle |
| ----- | --------------- |
| 0     | 1er élément     |
| 1     | 2e élément      |
| 2     | 3e élément      |
| 4     | 5e élément      |

## Affecter des valeurs à un tableau

On accède aux éléments avec les **crochets et l’index**.

```java
int[] ages = new int[5];

ages[0] = 18;
ages[1] = 21;
ages[2] = 30;
ages[3] = 25;
ages[4] = 40;
```

`ages[2]` correspond au **troisième élément**.

## Lire une valeur dans un tableau

```java
System.out.println(ages[0]); // affiche 18
System.out.println(ages[3]); // affiche 25
```

## Initialisation directe d’un tableau

Si tu connais déjà les valeurs, tu peux créer et remplir le tableau **en une seule ligne**.

```java
int[] nombres = {4, 6, 2, 1};
```

Ici :

- taille du tableau = 4
- index de `0` à `3`

## Exemple complet

```java
public class Main {
    public static void main(String[] args) {

        int[] notes = {12, 15, 9, 18, 14};

        System.out.println("Première note : " + notes[0]);
        System.out.println("Troisième note : " + notes[2]);
    }
}
```

## Parcourir un tableau avec une boucle `for`

Très souvent, on utilise une **boucle for** avec les tableaux.

```java
int[] ages = {18, 20, 25, 30, 35};

for (int i = 0; i < ages.length; i++) {
    System.out.println("Âge : " + ages[i]);
}
```

`ages.length` donne la **taille du tableau**.

## Exemple : calculer la moyenne

```java
int[] notes = {10, 12, 15, 18};
int somme = 0;

for (int i = 0; i < notes.length; i++) {
    somme += notes[i];
}

double moyenne = (double) somme / notes.length;
System.out.println("Moyenne : " + moyenne);
```

## Erreur fréquente à éviter

Accéder à un index inexistant :

```java
ages[5] = 50; // ERREUR si le tableau a une taille de 5
```

Dernier index valide = `taille - 1`

**To be continued...**
