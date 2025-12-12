# Apprentisage Java - Débutante - Intermédiare

Ce dépot regroupe mes exercices pratiquues , mes notes et mes projet en Java
Objectif: progresser étape par étapeavec des exercice concrets .

## Sommaire

## Concepts de base

- [Introduction](#introduction)
- [Les variables](#les-variables)

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
`String nom = "Zam"; nom= "Moumin `
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

**_To be continued..._**
