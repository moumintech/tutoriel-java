# Apprentisage Java - Débutante - Intermédiare

Ce dépot regroupe mes exercices pratiquues , mes notes et mes projet en Java
Objectif: progresser étape par étapeavec des exercice concrets .

## Sommaire

## Concepts de base

- [Introduction](#introduction)
- [Les variables](#les-variables)
- [Les opérateurs arithmétiques ](#Les-Opérateurs-arithmétiques)
- [Les commentaires ](#Les-commentaires)

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
**Exercice pratique : Stocker le titre d'un film** trouver la consigne ici  [INSTRUCTION](INSTRUCTION.md/)
**Les types de variables en Java**

En Java, il existe plusieurs types de données que l’on peut utiliser pour déclarer des variables.
Chaque type sert à stocker un genre précis de valeur.
*Le type int*

Le type int est utilisé pour stocker des nombres entiers (sans décimales), appelés integers en programmation.
`int prix = 5;`
**Les types pour les nombres décimaux**
Le type ***double***

Pour travailler avec des nombres décimaux, on utilise généralement le type double.
`double prix = 5.5;`
Le type ***float***

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

###  Addition (`+`)

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


###  Soustraction (`-`)

L’opérateur `-` permet de soustraire une valeur à une autre.

```java
int salaire = 9000;
int taxe = 500;
int resultat = salaire - taxe;
System.out.println(resultat);
```

Résultat affiché : `8500`



###  Multiplication (`*`)

L’astérisque `*` permet de multiplier deux valeurs.

Exemple : calculer 20 % d’un prix.

```java
int prix = 1200;
System.out.println(prix * 0.2);
```

 Résultat affiché : `240.0`



###  Division (`/`)

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



###  Modulo (`%`)

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

## Les commentaires en Java



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


 
be continued..._**
