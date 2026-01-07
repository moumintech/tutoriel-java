# Mon Apprentisage en Java

Ce dépot regroupe mes leçons , mes exercices pratiquues et mes projet en Java.
Objectif : progresser étape par étape avec des exercice concrets .

## Sommaire

## Java fondamentale

- [Découvrir Java](#Découvrir-Java)
  - [Comment fonctionne un programme Java ?](#Comment-fonctionne-un-programme-Java-?)
  - [Différence Java vs JavaScript ](#Différence-Java-vs-JavaScript)
  - [Compilation vs Interprétation](#Compilation-vs-Interprétation)
  - [Installer Java (JDK) et un IDE](<#Installer-Java-(JDK)-et-un-IDE>)
- [La structure des programmes Java](#La-structure-des-programmes-Java)
  - [La classe](#La-classe)
  - [La methode main](#La-methode-main)
  - [Afficher un message](#Afficher-un-message)
  - [Les Commentaires](#Les-commentaire)
  - [Les conventions de nommage en Java](#Les-conventions-de-nommage-en-Java)
  - [Exercice pratique](./INSTRUCTION.md)
- [Les variables et les types en Java ](#Les-variables-et-les-types-en-Java)
  - [Les types primitifs](#Les-types-primitifs)
  - [Le type String](#Le-type-String)
  - [La constante final](#La-constante-final)
  - [Convertion-de-type](#La-constante-final)
  - [Exercice pratique](./INSTRUCTION.md)
- [Les opérateurs en Java](#Les-opérateurs-en-Java)

  - [Les opérateurs arithmétiques](#Les-opérateurs-arithmétiques)
  - [Les opérateurs de comparaison](#Les-opérateurs-de-comparaison)
  - [Les opérateurs de logiques](#Les-opérateurs-de-comparaison)
  - [Exercice pratique](#Java_Fondamentale/Exercices/Consignes_Exercices.md)

- [Projet](./INSTRUCTION.md)

## Logique et contrôle du programme

- [Les structures conditionnelles en Java](#Les-structures-conditionnelles-en-Java)

  - [L'instruction if](#L'-instruction-if)
  - [L'instruction if ... else](#L'instruction-if-...-else)
  - [Tester plusieurs cas avec else if](#Tester-plusieurs-cas-avec-else-if)
  - [L'instruction switch](#L'instruction-switch)
  - [Exercice pratique](./INSTRUCTION.md)

- [Les boucles en Java ](#Les-boucles-en-Java)

  - [La boucle while](#La-boucle-while)
  - [La boucle do while](#La-boucle-do-while)
  - [Différence entre while et do while](#Différence-entre-while-et-do-while)
  - [La boucle for ](#La-boucle-for)
  - [Comparaison while vs for](#Comparaison-while-vs-for)
  - [Le contrôle de boucle break](#Le-contrôle-de-boucle-break)
  - [Le contrôle de boucle continue](#Le-contrôle-de-boucle-continue)
  - [Exercice pratique](./INSTRUCTION.md)

- [Les tableaux en Java](#Les-tableaux-en-Java)

  - [Parcours un tableau avec for](#Parcours-un-tableau-avec-for)
  - [Parcours un tableau avec for-each](#Parcours-un-tableau-avec-for-each)
  - [Les tableaux à deux dimensions(2D)](<#Les-tableaux-à-deux-dimensions(2D)>)
  - [Exercice pratique](./INSTRUCTION.md)

- [Projet](./INSTRUCTION.md)

## Programmation Orienté Objet (POO)

- [Les classes et les objets en Java](#Les-classes-et-les-objets-en-Java)

  - [Les attributs (caractéristiques)](<#Les-attributs-(caractéristiques)>>)
  - [Les méthodes (comportement)](<#Les-méthodes-(comportement)>)
  - [Le constructeur](#Le-constructeur)

- [L'encapsulation en Java](#L'encapsulation-en-Java)

  - [private](#private)
  - [public](#public)
  - [Les getters](#Les-getters)
  - [Les setters](#Les-setters)
  - [L'Héritage et le polymorphisme en Java](#L'Héritage-et-le-polymorphisme-en-Java)

  - [L'héritage extends](#L'héritage-extends)
  - [Le mot-clé super](#Le-mot-clé-super)
  - [Rédéfinition de méthodes(@Override)](<#Rédéfinition-de-méthodes(@Override)>)

- [L'abstration en Java](#L'abstration-en-Java)
  - [Les classes abstraites](#Les-classes-abstraites)
  - [Les Interfaces](#Les-Interfaces)
  - [Implémenter une interface : implements](#Implémenter-une-interface-:-implements)

## Structures avancées

- [Les collections en Java](Les-collections-en-Java)

  - [ArrayList (implémentation de List)](<#ArrayList-(implémentation-de-List)>)
  - [HashSet(implémentation de Set)](<#HashSet-(implémentation-de-Set)>)
  - [HashMap(implémentation de Map)](<#HashSet-(implémentation-de-Map)>)
  - [Parcourir une collection avec Iterator](#Parcourir-une-collection-avec-Iterator)
  - [Comparaison List/Set/Map](#Comparaison-List/Set/Map)

- [Les exeption en Java](#Les-exeption-en-Java)
  - [Le bloc try/catch](#Le-bloc-try/catch)
  - [Le bloc finally](#Le-bloc-finally)
  - [le mot clés throws](#le-mot-clés-throws)
  - [les exception personnalisées](#les-exception-personnalisées)
  - [Différence entre throw et throws](#Différence-entre-throw-et-throws)
- [Entrée utilisateur et fichier Java](#Entrée-utilisateur-et-fichier-en-Java)
  - [Entrée utilisateur avec Scanner](#Entrée-utilisateur-avec-Scanner)
  - [La classe File](#La-classe-File)
  - [Lecture d'un fichier avec BufferredReader](#Lecture-d'un-fichier-avec-BufferredReader)

## Java moderne et bonne pratiques

- [Java moderne : concepts essentiels](#Java-moderne-:-concepts-essentiels)
  - [var : l'inférence de type](#var-:-l'inférence-de-type)
  - [Optional : éviter les null](#Optional-:-éviter-les-null)
  - [Introduction aux Streams](#Introduction-aux-Streams)
  - [Lien entre lambda et Stream](#Lien-entre-lambda-et-Stream)
- [Les bonnes pratiques en Java](#Les-bonnes-pratiques-en-Java)
  - [Le Clean Code ](#Le-Clean-Code)
  - [Organisation des packages](#Organisation-des-packages)
  - [La JavaDoc](#La-JavaDoc)
  - [Debug avec IDE](#Debug-avec-IDE)

## Découvrir Java

Java est un **langage de programmation** utilisé pour créer des logiciels capables de fonctionner sur différents types de machines et de systèmes d’exploitation (Windows, Linux, macOS, etc.).

Il est largement utilisé dans de nombreux domaines :

- applications desktop,
- applications web,
- applications mobiles (notamment Android),
- logiciels bancaires et industriels,
- systèmes embarqués.

Java est connu pour sa portabilité, résumée par son slogan célèbre :

> **“Write once, run anywhere”** > _(Écrire une fois, exécuter partout)_

Cela signifie qu’un programme Java peut être exécuté sur différentes plateformes sans être réécrit.

## Comment fonctionne un programme Java ?

Contrairement à certains langages, un programme Java **n’est pas exécuté directement par le système d’exploitation**.

Le code Java est d’abord :

1. **écrit** par le développeur,
2. **compilé** en un format intermédiaire appelé _bytecode_,
3. **exécuté** par un environnement spécifique à Java.

C’est ce fonctionnement qui rend Java portable et indépendant du système.

### La JVM (Java Virtual Machine)

La **JVM** est la **machine virtuelle Java**.

Son rôle est fondamental :

- elle exécute le _bytecode_ Java,
- elle fait le lien entre le programme Java et le système d’exploitation,
- elle gère automatiquement la mémoire,
- elle assure la sécurité de l’exécution.

Chaque système d’exploitation possède sa propre JVM, mais **le programme Java reste le même**, ce qui permet à Java de fonctionner partout.

### Le JRE (Java Runtime Environment)

Le **JRE** est l’**environnement nécessaire pour exécuter un programme Java**.

Il contient :

- la **JVM**,
- les bibliothèques Java indispensables au fonctionnement des applications.

Le JRE permet **d’utiliser** un programme Java,
mais **pas de le créer**.

Un utilisateur final a généralement seulement besoin du JRE.

### Le JDK (Java Development Kit)

Le **JDK** est l’**outil destiné aux développeurs Java**.

Il contient :

- le **JRE**,
- le compilateur Java (`javac`),
- des outils pour développer, tester et déboguer des programmes.

Le JDK est indispensable pour :

- écrire du code Java,
- compiler les fichiers `.java`,
- créer des applications Java.

### Écriture des premières instructions Java

En Java :

- un programme est composé d’instructions,
- chaque instruction se termine par un **point-virgule (`;`)**,
- Java est **sensible à la casse** :
  `main`, `Main` et `MAIN` sont différents.

Pour afficher un message à l’écran, on utilise par exemple :

```java
System.out.println("Bonjour Java !");
```

- **Java** : langage de programmation portable et orienté objet
- **JVM** : exécute le programme Java
- **JRE** : permet d’exécuter une application Java
- **JDK** : permet de développer des applications Java

## Différence Java vs JavaScript

Même si leurs noms se ressemblent, **Java et JavaScript n’ont aucun lien technique**.

La confusion vient uniquement du nom.

**Différence clé :**

- **Java** → utilisé pour des applications complètes (logiciels, backend, Android)
- **JavaScript** → utilisé pour rendre les pages web interactives

Ils ne s’exécutent pas dans le même environnement et n’ont pas le même rôle.

- Java ≠ JavaScript
- Apprendre Java **ne signifie pas** apprendre JavaScript
- Ce sont deux parcours techniques différents

### Compilation vs Interprétation

Un programme doit être **traduit** pour être compris par l’ordinateur.
Il existe deux approches principales.

#### Compilation

- Le code est **traduit avant l’exécution**
- Les erreurs sont détectées plus tôt
- Le programme est plus structuré

Java utilise **une compilation en bytecode**, puis une exécution.

#### Interprétation

- Le code est **exécuté directement**
- Les erreurs apparaissent à l’exécution
- Approche plus souple et rapide à tester

JavaScript fonctionne principalement de cette manière.

- **Compilation** → préparation avant exécution
- **Interprétation** → exécution immédiate
- **Java** → compilation (modèle hybride)
- **JavaScript** → interprétation

## Installer Java (JDK) et un IDE

### Installer le JDK (Java 17 ou Java 21)

Pour développer en Java, il faut installer le **JDK**.

**Java 17** et **Java 21** sont des versions **LTS** (Long Term Support).

- **Java 17** : très répandue, stable, souvent utilisée en formation
- **Java 21** : plus récente, recommandée si ton environnement l’accepte

#### Étapes générales

1. Télécharger le **JDK 17 ou 21**
2. Lancer l’installateur
3. Vérifier l’installation dans le terminal

Commande de vérification :

```bash
java --version
```

Si une version s’affiche, Java est bien installé

![Image](https://utho.com/docs/windows/how-to-install-java-development-kit-on-windows-server/images/Screenshot_3-26.png)

![Image](https://www.scaler.com/topics/images/checking-java-version-on-windows.webp)

![Image](https://i.sstatic.net/3Atvv.jpg)

### Choisir un IDE (environnement de développement)

Un **IDE** permet d’écrire, organiser et exécuter du code Java plus facilement.

#### IntelliJ IDEA

- Très intelligent et moderne
- Excellente assistance au code
- Version Community gratuite (suffisante pour Java)

Idéal si tu veux un confort maximal

#### Eclipse IDE

- Spécialisé Java
- Très utilisé en entreprise
- Gratuit et robuste

Bon choix académique et professionnel

#### Visual Studio Code

- Éditeur léger (pas un IDE Java natif)
- Nécessite des extensions Java
- Très polyvalent (HTML, CSS, JS, Python…)

Intéressant si tu travailles sur **plusieurs langages**

![Image](https://resources.jetbrains.com/help/img/idea/2025.3/new_ui_dark_theme.png)

![Image](https://math.hws.edu/eck/cs124/s21/eclipse-setup/textio-setup.png)

![Image](https://code.visualstudio.com/assets/docs/java/extensions/extensions.png)

#### Quel choix faire ?

**Recommandation simple** :

- Débutant·e Java pur → **IntelliJ IDEA** ou **Eclipse**
- Projet multi-langages / web → **VS Code**

- Installer **JDK 17 ou 21**
- Vérifier avec `java --version`
- Choisir un IDE :

  - IntelliJ → confort
  - Eclipse → classique Java
  - VS Code → polyvalent

**Excercice pratique [INSTRUCTION](INSTRUCTION.md/)**

## La structure des programmes Java

### La classe

En Java, **tout programme commence par une classe**.

```java
class Meteo {
}
```

- `class` permet de définir une classe
- `Meteo` est le nom de la classe
- les accolades `{ }` délimitent son contenu

  **Toute ligne de code exécutable en Java doit se trouver à l’intérieur d’une classe.**

### La méthode `main`

La méthode `main` est le **point d’entrée du programme**.
C’est la première méthode exécutée lorsque le programme démarre.

```java
public static void main(String[] args) {
}
```

- `public` : la méthode est accessible
- `static` : elle peut être exécutée sans créer d’objet
- `void` : elle ne retourne aucune valeur
- `main` : nom spécial reconnu par Java
- `String[] args` : paramètres passés au programme

Sans méthode `main`, un programme Java **ne peut pas s’exécuter**.

### Afficher un message à l’écran

Pour afficher un texte dans la console, on utilise :

```java
System.out.println("Salut");
```

- `System.out` : sortie standard (console)
- `println` : affiche le texte et passe à la ligne suivante

Cette instruction est exécutée **lorsque le programme démarre**, car elle se trouve dans `main`.

### Les commentaires

Les commentaires servent à **expliquer le code**.
Ils ne sont **jamais exécutés**.

#### Commentaire sur une ligne

```java
// Ceci est un commentaire
```

#### Commentaire sur plusieurs lignes

```java
/*
Ceci est
un commentaire
sur plusieurs lignes
*/
```

Les commentaires améliorent la lisibilité du code.

### Les conventions de nommage en Java

Java suit des conventions strictes pour améliorer la clarté du code.

- **Classes** :

  - commencent par une majuscule
  - exemple : `Meteo`, `Application`, `Utilisateur`

- **Méthodes et variables** :

  - commencent par une minuscule
  - utilisent le _camelCase_
  - exemple : `main`, `temperatureActuelle`

Respecter ces conventions est une **bonne pratique essentielle** en Java.

### Exemple

```java
class Meteo {

    public static void main(String[] args) {
        System.out.println("Salut");
    }

}
```

Lors de l’exécution, le message **Salut** s’affiche à l’écran.

- Une **classe** contient le programme
- `main` est le point de départ
- `System.out.println()` affiche un message
- Les commentaires expliquent le code
- Les conventions de nommage rendent le code lisible

**Excercice pratique: Debug & fix la consigne ici [INSTRUCTION](INSTRUCTION.md/)**

## Variables et types en Java

Dans un programme, on manipule constamment des **valeurs** : nombres, texte, états logiques, etc.
Une **variable** permet de **stocker une valeur** en lui donnant un nom afin de la réutiliser plus tard dans le programme.

### Déclarer une variable

En Java, une variable est toujours définie avec un **type**.

```java
int points = 10;
```

- `int` → type de la variable
- `points` → nom de la variable
- `10` → valeur stockée

Une variable peut être modifiée au cours du programme.

### Les types primitifs

Les types primitifs représentent des valeurs simples.

### `int` — nombre entier

```java
int age = 25;
```

#### `double` — nombre décimal

```java
double temperature = 18.5;
```

**Différence entre float et double**

**float** :

- Utilise moins de mémoire

- Est moins précis

- Les calculs sont légèrement plus rapides

**double** :

- Utilise plus de mémoire

- Est plus précis

- Recommandé pour la majorité des cas

Règle générale :

Utilisez float lorsque la mémoire est critique.

Utilisez double pour des calculs précis, par exemple pour des devises ou des calculs financiers.

#### `boolean` — vrai ou faux

```java
boolean estConnecte = true;
```

#### `char` — un seul caractère

```java
char initiale = 'A';
```

Un `char` utilise des **apostrophes simples** (`' '`).

### Le type `String` (texte)

Le type `String` permet de stocker du texte.

```java
String prenom = "Zam";
```

- Le texte est entouré de **guillemets doubles** (`" "`)
- `String` n’est **pas un type primitif**, mais il est utilisé très fréquemment

### La constante `final`

Une variable déclarée avec `final` **ne peut plus être modifiée**.

```java
final int ANNEE = 2025;
```

Une constante :

- est souvent écrite en **MAJUSCULES**
- protège une valeur fixe du programme

### Conversions de type (casting)

Parfois, il est nécessaire de **convertir un type vers un autre**.

#### Conversion automatique (implicite)

```java
int x = 10;
double y = x; // int → double
```

Aucun risque de perte de données.

##### Conversion forcée (casting explicite)

```java
double a = 9.7;
int b = (int) a;
```

- La partie décimale est **perdue**
- `b` vaudra `9`

Le casting explicite peut entraîner une perte de précision.

### Exemple

```java
int score = 100;
double moyenne = 14.5;
boolean gagne = true;
char niveau = 'A';
String message = "Bravo";

final int MAX_SCORE = 200;

int valeur = (int) moyenne;

System.out.println(message);
```

- Une variable stocke une valeur
- Chaque variable a un type
- Types primitifs : `int`, `double`, `boolean`, `char`
- Texte : `String`
- `final` crée une constante
- Le casting permet de convertir des types

**Exercice pratique : Stocker le titre d'un film trouver la consigne ici [INSTRUCTION](INSTRUCTION.md/)**

# Les opérateurs en Java

Les opérateurs permettent de **manipuler des valeurs** : faire des calculs, comparer des données ou combiner des conditions.

On distingue principalement :

- les **opérateurs arithmétiques**
- les **opérateurs de comparaison**
- les **opérateurs logiques**

## Les opérateurs arithmétiques

Ils servent à effectuer des calculs mathématiques.

### Addition (`+`)

```java
int x = 5;
int y = 3;
System.out.println(x + y); // 8
```

### Soustraction (`-`)

```java
int salaire = 9000;
int taxe = 500;
System.out.println(salaire - taxe); // 8500
```

### Multiplication (`*`)

```java
int prix = 1200;
System.out.println(prix * 0.2); // 240.0
```

Lorsqu’un calcul implique un `double`, le résultat est un `double`.

### Division (`/`)

```java
int montant = 9000;
int prix = 49;
System.out.println(montant / prix); // 183
```

Avec des `int`, la division **supprime la partie décimale**.

Pour un résultat précis :

```java
double resultat = (double) montant / prix;
System.out.println(resultat);
```

### Modulo (`%`)

L’opérateur `%` retourne le **reste de la division**.

```java
int items = 23;
System.out.println(items % 5); // 3
```

### Concaténation de chaînes (`+`)

L’opérateur `+` permet aussi d’assembler des chaînes de caractères.

```java
String nom = "John";
String prenom = "Doe";
System.out.println(nom + " " + prenom);
```

## Les opérateurs de comparaison

Ils permettent de **comparer deux valeurs**.
Le résultat est toujours un `boolean` (`true` ou `false`).

| Opérateur | Signification     |
| --------- | ----------------- |
| `==`      | égal à            |
| `!=`      | différent de      |
| `>`       | supérieur à       |
| `<`       | inférieur à       |
| `>=`      | supérieur ou égal |
| `<=`      | inférieur ou égal |

Exemple :

```java
int age = 20;
System.out.println(age >= 18); // true
```

## Les opérateurs logiques

Ils servent à **combiner plusieurs conditions**.

| Opérateur | Signification |     |     |
| --------- | ------------- | --- | --- |
| `&&`      | ET            |     |     |
| `         |               | `   | OU  |
| `!`       | NON           |     |     |

### Exemple avec `&&` (ET)

```java
int age = 20;
boolean permis = true;

System.out.println(age >= 18 && permis); // true
```

### Exemple avec `||` (OU)

```java
System.out.println(age < 18 || permis); // true
```

### Exemple avec `!` (NON)

```java
boolean estConnecte = false;
System.out.println(!estConnecte); // true
```

- Les opérateurs arithmétiques font des calculs (`+`, `-`, `*`, `/`, `%`)
- Les opérateurs de comparaison comparent des valeurs
- Les opérateurs logiques combinent des conditions
- Les comparaisons retournent toujours un `boolean`

## Les entrées utilisateur

### Qu’est-ce qu’une entrée utilisateur ?

Certains programmes ont besoin de **données fournies par l’utilisateur** pour fonctionner.

Exemples :

- Un **jeu** peut demander un pseudo au joueur.
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

## Les structures conditionnelles en Java

Les structures conditionnelles permettent d’**exécuter différents blocs de code selon une situation donnée**.
Elles contrôlent le **chemin d’exécution** du programme.

### L’instruction `if`

`if` permet d’exécuter un bloc de code **uniquement lorsque la condition est vraie**.

```java
if (condition) {
    // code exécuté si la condition est vraie
}
```

Exemple

```java
int age = 18;

if (age >= 18) {
    System.out.println("Accès autorisé");
}
```

Si la condition est fausse, le bloc est simplement ignoré.

### L’instruction `if ... else`

`else` permet de définir un **comportement alternatif**.

```java
if (condition) {
    // code si vrai
} else {
    // code si faux
}
```

Exemple

```java
int note = 9;

if (note >= 10) {
    System.out.println("Admis");
} else {
    System.out.println("Ajourné");
}
```

**Un seul bloc** est exécuté.

### Tester plusieurs cas avec `else if`

`else if` permet d’enchaîner plusieurs conditions **sans imbriquer plusieurs `if`**.

```java
if (condition1) {
    // code
} else if (condition2) {
    // code
} else {
    // cas par défaut
}
```

Exemple

```java
int heure = 15;

if (heure <= 0) {
    System.out.println("Erreur");
} else if (heure <= 16) {
    System.out.println("Welcome");
} else {
    System.out.println("Too late");
}
```

Les conditions sont évaluées **dans l’ordre**, une seule branche s’exécute.

## L’instruction `switch`

`switch` est utilisée lorsque l’on compare **une même variable** à **plusieurs valeurs précises**.

```java
switch (variable) {
    case valeur1:
        // code
        break;
    case valeur2:
        // code
        break;
    default:
        // cas par défaut
}
```

Exemple

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
        System.out.println("Quitter");
        break;
    default:
        System.out.println("Choix invalide");
}
```

### Le rôle du `break`

`break` **interrompt l’exécution du `switch`**.

Sans `break`, les instructions suivantes s’exécutent également, ce qui est rarement souhaité.

En pratique : **un `break` par `case`**.

#### Choisir entre `if` et `switch`

- `if / else` → logique conditionnelle générale
- `switch` → sélection basée sur des valeurs fixes

Le choix dépend surtout de la **lisibilité du code**.

- `if` → exécute un bloc si la condition est vraie
- `else` → alternative
- `else if` → plusieurs cas
- `switch` → choix parmi plusieurs valeurs
- `break` → stoppe le `switch`

Parfait. Voici une **leçon claire, concise et non répétitive**, centrée **uniquement sur les boucles en Java**.
On part du principe que les **conditions** et les **opérateurs** sont déjà acquis.

## Les boucles en Java

Les boucles permettent de **répéter un bloc de code** tant qu’une condition reste vraie ou selon un nombre de répétitions donné.

Java propose principalement :

- `while`
- `do while`
- `for`

### La boucle `while`

La boucle `while` répète un bloc **tant que la condition est vraie**.
La condition est testée **avant chaque itération**.

```java
int i = 1;

while (i <= 5) {
    System.out.println(i);
    i++;
}
```

Si la condition est fausse dès le départ, la boucle **ne s’exécute pas**.

### La boucle `do while`

La boucle `do while` fonctionne comme `while`, mais la condition est testée **après** l’exécution du bloc.

```java
int i = 1;

do {
    System.out.println(i);
    i++;
} while (i <= 5);
```

Le bloc s’exécute **au moins une fois**, même si la condition est fausse.

### Différence entre `while` et `do while`

| `while`                   | `do while`                  |
| ------------------------- | --------------------------- |
| Condition testée avant    | Condition testée après      |
| Peut ne jamais s’exécuter | S’exécute au moins une fois |

### La boucle `for`

La boucle `for` est utilisée lorsque le **nombre de répétitions est connu** à l’avance.

#### Structure

```java
for (initialisation; condition; incrémentation) {
    // code répété
}
```

Exemple simple

```java
for (int i = 1; i <= 5; i++) {
    System.out.println(i);
}
```

`for` regroupe en une seule ligne :

- l’initialisation
- la condition
- la modification de la variable

---

### Comparaison `while` vs `for`

```java
// while
int i = 1;
while (i <= 5) {
    System.out.println(i);
    i++;
}

// for
for (int i = 1; i <= 5; i++) {
    System.out.println(i);
}
```

`for` est plus **compact** quand les bornes sont connues.

### Incrémentations personnalisées

La boucle `for` permet une grande flexibilité.

### Exemple : compter de 2 en 2

```java
for (int i = 0; i <= 20; i += 2) {
    System.out.println(i);
}
```

---

Exemple : calculer une somme

```java
int somme = 0;

for (int i = 1; i <= 100; i++) {
    somme += i;
}

System.out.println("La somme est : " + somme);
```

La variable accumule une valeur à chaque itération.

### Le contrôle de boucle : `break`

`break` permet de **quitter immédiatement une boucle**, même si elle pourrait continuer.

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

### Le contrôle de boucle : `continue`

`continue` permet de **sauter l’itération en cours** et de passer à la suivante.

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

La boucle continue, mais certaines valeurs sont ignorées.

- `while` → condition testée avant
- `do while` → exécution au moins une fois
- `for` → nombre de répétitions connu
- `break` → arrêt immédiat de la boucle
- `continue` → saute une itération

## Les tableaux en Java

Un **tableau** permet de stocker **plusieurs valeurs du même type** dans une seule variable.
Il est particulièrement utile lorsque l’on manipule des **listes de données**.

### Déclarer et créer un tableau (1D)

Un tableau se déclare avec des **crochets `[]`**.

```java
int[] ages = new int[5];
```

- le tableau contient **5 entiers**
- les index vont de `0` à `4`

La taille d’un tableau est **fixe**.

### Les index des tableaux

Les éléments d’un tableau sont accessibles grâce à un **index**, qui commence toujours à `0`.

| Index | Élément |
| ----- | ------- |
| 0     | 1er     |
| 1     | 2e      |
| 2     | 3e      |

```java
ages[0] = 18;
ages[1] = 21;
ages[2] = 30;
```

### Lire une valeur dans un tableau

```java
System.out.println(ages[0]);
System.out.println(ages[2]);
```

`ages[2]` correspond au **troisième élément**.

### Initialisation directe

Si les valeurs sont connues à l’avance, on peut initialiser le tableau directement.

```java
int[] nombres = {4, 6, 2, 1};
```

- taille : 4
- index : de `0` à `3`

### Parcourir un tableau avec `for`

La boucle `for` est très utilisée pour parcourir un tableau.

```java
int[] ages = {18, 20, 25, 30};

for (int i = 0; i < ages.length; i++) {
    System.out.println(ages[i]);
}
```

length` donne la **taille du tableau**.

### Parcourir un tableau avec `for-each`

Java propose une syntaxe simplifiée pour parcourir un tableau.

```java
int[] ages = {18, 20, 25, 30};

for (int age : ages) {
    System.out.println(age);
}
```

`for-each` est :

- plus lisible
- idéal quand on n’a pas besoin de l’index

### Exemple : calculer une moyenne

```java
int[] notes = {10, 12, 15, 18};
int somme = 0;

for (int note : notes) {
    somme += note;
}

double moyenne = (double) somme / notes.length;
System.out.println("Moyenne : " + moyenne);
```

### Les tableaux à deux dimensions (2D)

Un tableau 2D est un **tableau de tableaux**.

```java
int[][] grille = new int[2][3];
```

- 2 lignes
- 3 colonnes

#### Initialisation directe

```java
int[][] matrice = {
    {1, 2, 3},
    {4, 5, 6}
};
```

### Accéder à un tableau 2D

```java
System.out.println(matrice[0][1]); // 2
System.out.println(matrice[1][2]); // 6
```

- premier index → ligne
- second index → colonne

### Parcourir un tableau 2D

```java
for (int i = 0; i < matrice.length; i++) {
    for (int j = 0; j < matrice[i].length; j++) {
        System.out.println(matrice[i][j]);
    }
}
```

Erreur fréquente

Accéder à un index inexistant :

```java
ages[5] = 40; // ERREUR si le tableau a une taille de 5
```

Dernier index valide = `length - 1`

- Un tableau stocke plusieurs valeurs du même type
- Les index commencent à `0`
- `length` donne la taille
- `for` et `for-each` servent au parcours
- Les tableaux 2D représentent lignes et colonnes

## Les classes et les objets en Java

Java est un langage **orienté objet**.
Cela signifie que les programmes sont construits à partir de **classes** et d’**objets**.

### La classe : le modèle

Une **classe** est un **modèle** (ou un plan) qui décrit ce qu’un objet **est** et ce qu’il **peut faire**.

Elle définit :

- des **attributs** → ce que l’objet possède
- des **méthodes** → ce que l’objet peut faire

### Exemple de classe

```java
class Voiture {
}
```

Cette classe ne fait encore rien, mais elle définit un **type**.

### Les attributs (caractéristiques)

Les **attributs** sont des **variables déclarées dans une classe**.
Ils décrivent l’état de l’objet.

Exemple

```java
class Voiture {
    String marque;
    int vitesse;
}
```

Ici :

- `marque` et `vitesse` sont des **attributs**
- chaque objet `Voiture` aura **ses propres valeurs**

### Les méthodes (comportements)

Les **méthodes** sont des **fonctions définies dans une classe**.
Elles décrivent les **actions** que l’objet peut réaliser.

Exemple

```java
class Voiture {
    String marque;
    int vitesse;

    void accelerer() {
        vitesse += 10;
    }
}
```

La méthode `accelerer` modifie l’état de l’objet.

### L’objet : une instance de classe

Un **objet** est une **instance concrète** d’une classe.

La classe est le plan, l’objet est le résultat.

#### Création d’un objet

```java
Voiture v1 = new Voiture();
```

- `Voiture` → type
- `v1` → objet
- `new` → création en mémoire

### Utiliser les attributs et méthodes d’un objet

On accède aux membres d’un objet avec le **point `.`**.

```java
v1.marque = "Toyota";
v1.vitesse = 50;

v1.accelerer();
```

Chaque objet possède **son propre état**.

### Le constructeur

Un **constructeur** est une méthode spéciale :

- appelée automatiquement lors de la création d’un objet
- sert à **initialiser les attributs**

Règles importantes

- le constructeur porte **le même nom que la classe**
- il n’a **pas de type de retour**

Exemple

```java
class Voiture {
    String marque;
    int vitesse;

    Voiture(String m, int v) {
        marque = m;
        vitesse = v;
    }
}
```

### Créer un objet avec un constructeur

```java
Voiture v1 = new Voiture("Toyota", 50);
Voiture v2 = new Voiture("BMW", 80);
```

Chaque objet est créé avec des valeurs différentes.

`this` : référence à l’objet courant

Le mot-clé `this` permet de faire référence à **l’objet en cours**.

Exemple

```java
class Voiture {
    String marque;

    Voiture(String marque) {
        this.marque = marque;
    }
}
```

`this.marque` désigne l’attribut
`marque` désigne le paramètre

Exemple complet

```java
class Voiture {
    String marque;
    int vitesse;

    Voiture(String marque, int vitesse) {
        this.marque = marque;
        this.vitesse = vitesse;
    }

    void accelerer() {
        vitesse += 10;
    }
}
```

Utilisation :

```java
Voiture v = new Voiture("Toyota", 50);
v.accelerer();
```

- **Classe** → modèle
- **Objet** → instance de la classe
- **Attributs** → caractéristiques
- **Méthodes** → actions
- **Constructeur** → initialise l’objet
- **this** → référence à l’objet courant

## L’encapsulation en Java

L’**encapsulation** est un principe fondamental de la programmation orientée objet.
Elle consiste à **protéger les données** d’une classe et à **contrôler leur accès**.

L’idée clé :
**les attributs ne doivent pas être accessibles directement depuis l’extérieur**.

### Pourquoi l’encapsulation ?

Sans encapsulation :

- les données peuvent être modifiées n’importe comment
- le code devient difficile à maintenir
- les erreurs sont plus fréquentes

Avec encapsulation :

- les données sont protégées
- les règles sont centralisées
- le code est plus sûr et plus lisible

### Les modificateurs d’accès

Java utilise des **modificateurs d’accès** pour contrôler la visibilité.

#### `private`

- accessible **uniquement dans la classe**
- utilisé pour les **attributs**

#### `public`

- accessible **depuis n’importe quelle classe**
- utilisé pour les **méthodes**
  Règle générale :

> **Attributs → `private`
> Méthodes → `public`**

Exemple sans encapsulation (à éviter)

```java
class Compte {
    double solde;
}
```

Ici, n’importe qui peut modifier `solde` librement.

### Encapsulation avec `private`

On rend les attributs **privés**.

```java
class Compte {
    private double solde;
}
```

L’attribut n’est plus accessible directement depuis l’extérieur.

### Les getters

Un **getter** est une méthode qui permet de **lire** la valeur d’un attribut privé.

#### Syntaxe

```java
public type getNomAttribut() {
    return attribut;
}
```

Exemple

```java
class Compte {
    private double solde;

    public double getSolde() {
        return solde;
    }
}
```

Le getter donne un **accès contrôlé en lecture**.

### Les setters

Un **setter** est une méthode qui permet de **modifier** la valeur d’un attribut privé.

#### Syntaxe

```java
public void setNomAttribut(type valeur) {
    attribut = valeur;
}
```

```java
class Compte {
    private double solde;

    public void setSolde(double solde) {
        this.solde = solde;
    }
}
```

Le setter permet d’ajouter des **règles de validation**.

Exemple avec contrôle

```java
class Compte {
    private double solde;

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        if (solde >= 0) {
            this.solde = solde;
        }
    }
}
```

Le solde ne peut jamais être négatif.

### Utilisation depuis une autre classe

```java
Compte c = new Compte();

c.setSolde(1000);
System.out.println(c.getSolde());
```

On **ne touche jamais directement** à l’attribut.

### Convention de nommage

- Getter → `getNomAttribut`
- Setter → `setNomAttribut`
- Attributs → `private`
- Méthodes → `public`

Ces conventions sont **standard en Java**.

- L’encapsulation protège les données
- Les attributs sont `private`
- Les méthodes sont `public`
- Les getters lisent les valeurs
- Les setters modifient les valeurs
- Les règles sont centralisées dans la classe

## L’héritage et le polymorphisme en Java

L’**héritage** permet de créer une nouvelle classe à partir d’une classe existante.
Le **polymorphisme** permet d’utiliser un même comportement de manière différente selon l’objet.

Ces deux notions vont toujours **ensemble**.

### L’héritage : `extends`

L’héritage permet à une classe **enfant** de récupérer :

- les attributs
- les méthodes
  d’une classe **parent**.

Syntaxe

```java
class Enfant extends Parent {
}
```

Exemple

```java
class Animal {
    void manger() {
        System.out.println("L'animal mange");
    }
}

class Chien extends Animal {
}
```

`Chien` hérite automatiquement de la méthode `manger()`.

### Utilisation d’une classe héritée

```java
Chien c = new Chien();
c.manger();
```

Résultat :

```
L'animal mange
```

La classe enfant peut utiliser le comportement du parent **sans le réécrire**.

### Le mot-clé `super`

`super` permet de faire référence à la **classe parente**.

Il est utilisé :

- pour appeler le **constructeur du parent**
- pour accéder à une **méthode du parent**

#### Appeler le constructeur parent

```java
class Animal {
    String nom;

    Animal(String nom) {
        this.nom = nom;
    }
}

class Chien extends Animal {
    Chien(String nom) {
        super(nom);
    }
}
```

`super(nom)` appelle le constructeur de `Animal`.

#### Appeler une méthode du parent

```java
class Chien extends Animal {
    void manger() {
        super.manger();
        System.out.println("Le chien mange des croquettes");
    }
}
```

### Redéfinir une méthode : `@Override`

Une classe enfant peut **modifier le comportement** d’une méthode héritée.
C’est ce qu’on appelle la **redéfinition**.

Exemple

```java
class Animal {
    void crier() {
        System.out.println("L'animal fait un bruit");
    }
}

class Chien extends Animal {
    @Override
    void crier() {
        System.out.println("Le chien aboie");
    }
}
```

La méthode du parent est remplacée par celle de l’enfant.

### Le polymorphisme

Le **polymorphisme** permet d’utiliser une référence du type parent pour manipuler un objet enfant.

Exemple

```java
Animal a = new Chien();
a.crier();
```

Résultat :

```
Le chien aboie
```

Java appelle **la version de l’objet réel**, pas celle du type de référence.

### Pourquoi le polymorphisme est puissant

- le code est plus flexible
- plus facile à étendre
- moins dépendant des classes concrètes

Exemple :

```java
Animal[] animaux = {
    new Chien(),
    new Chat()
};

for (Animal a : animaux) {
    a.crier();
}
```

Chaque objet réagit différemment.

- `extends` → hériter d’une classe
- une classe ne peut hériter que **d’une seule classe**
- `super` → accéder au parent
- `@Override` → redéfinir une méthode
- le polymorphisme dépend de l’objet réel

- L’héritage permet de réutiliser du code
- `extends` crée une relation parent/enfant
- `super` appelle le parent
- `@Override` modifie un comportement
- Le polymorphisme adapte le comportement selon l’objet

## L’abstraction en Java

L’**abstraction** consiste à **définir ce qu’un objet doit faire**, sans imposer **comment il le fait**.

On décrit des **comportements attendus**, et on laisse les classes concrètes fournir l’implémentation.

### Les classes abstraites

Une **classe abstraite** est une classe :

- qui **ne peut pas être instanciée**
- qui peut contenir :

  - des méthodes **abstraites** (sans code)
  - des méthodes **concrètes** (avec code)

#### Déclaration

```java
abstract class Animal {
}
```

#### Méthode abstraite

Une méthode abstraite :

- n’a **pas de corps**
- doit être implémentée par les classes enfants

```java
abstract class Animal {
    abstract void crier();
}
```

#### Héritage d’une classe abstraite

```java
class Chien extends Animal {
    @Override
    void crier() {
        System.out.println("Le chien aboie");
    }
}
```

Toute classe qui hérite d’une classe abstraite **doit implémenter toutes ses méthodes abstraites**.

#### Méthodes concrètes dans une classe abstraite

```java
abstract class Animal {
    void dormir() {
        System.out.println("L'animal dort");
    }

    abstract void crier();
}
```

Le code peut être **partiellement défini**.

### Les interfaces

Une **interface** définit un **contrat** :

- ce que la classe **doit faire**
- sans fournir d’implémentation (par défaut)

### Déclaration

```java
interface Volant {
    void voler();
}
```

Une interface :

- ne contient que des méthodes abstraites (par défaut)
- ne contient **pas d’attributs d’instance**
- ne possède **pas de constructeur**

### Implémenter une interface : `implements`

Une classe utilise le mot-clé `implements` pour appliquer une interface.

```java
class Avion implements Volant {
    @Override
    public void voler() {
        System.out.println("L'avion vole");
    }
}
```

La classe **s’engage à implémenter toutes les méthodes** de l’interface.

### Une classe peut implémenter plusieurs interfaces

Contrairement à l’héritage de classes, Java autorise **plusieurs interfaces**.

```java
interface Volant {
    void voler();
}

interface Nageant {
    void nager();
}

class Canard implements Volant, Nageant {
    @Override
    public void voler() {
        System.out.println("Le canard vole");
    }

    @Override
    public void nager() {
        System.out.println("Le canard nage");
    }
}
```

### Classe abstraite vs Interface

| Classe abstraite         | Interface               |
| ------------------------ | ----------------------- |
| `extends`                | `implements`            |
| Peut contenir du code    | Pas de code métier      |
| Héritage simple          | Implémentation multiple |
| Peut avoir des attributs | Pas d’état              |

**Classe abstraite** → partage de code
**Interface** → contrat de comportement

### L’abstraction et le polymorphisme

```java
Volant v = new Avion();
v.voler();
```

On manipule l’objet via son **abstraction**, pas sa classe concrète.

- L’abstraction définit **le quoi**, pas le comment
- `abstract` → classe partiellement définie
- Méthode abstraite → sans implémentation
- `interface` → contrat
- `implements` → engagement à respecter le contrat
- Une classe peut implémenter **plusieurs interfaces**

## Les collections en Java

Les **collections** permettent de stocker et manipuler **des groupes d’objets** de manière flexible.
Contrairement aux tableaux, leur taille peut **changer dynamiquement**.

### Les trois grandes familles de collections

Java distingue **trois types principaux** de collections.

#### Liste (`List`)

- éléments **ordonnés**
- **doublons autorisés**
- accès par index

Exemple : une liste de notes

#### Ensemble (`Set`)

- **pas de doublons**
- pas d’accès par index
- ordre non garanti (selon l’implémentation)

Exemple : des emails uniques

#### Dictionnaire (`Map`)

- fonctionne avec des **paires clé / valeur**
- clés **uniques**
- accès par clé

Exemple : `id → utilisateur`

### `ArrayList` (implémentation de List)

`ArrayList` est une liste dynamique.

#### Création

```java
ArrayList<String> noms = new ArrayList<>();
```

#### Ajouter des éléments

```java
noms.add("Alice");
noms.add("Bob");
noms.add("Alice"); // autorisé
```

#### Accéder à un élément

```java
System.out.println(noms.get(0));
```

#### Taille

```java
System.out.println(noms.size());
```

`ArrayList` est idéale quand :

- l’ordre est important
- les doublons sont autorisés

### `HashSet` (implémentation de Set)

`HashSet` stocke des éléments **sans doublons**.

#### Création

```java
HashSet<String> emails = new HashSet<>();
```

#### Ajouter des éléments

```java
emails.add("a@mail.com");
emails.add("b@mail.com");
emails.add("a@mail.com"); // ignoré
```

Les doublons sont automatiquement refusés.

### `HashMap` (implémentation de Map)

`HashMap` associe une **clé** à une **valeur**.

#### Création

```java
HashMap<Integer, String> utilisateurs = new HashMap<>();
```

#### Ajouter des paires

```java
utilisateurs.put(1, "Alice");
utilisateurs.put(2, "Bob");
```

#### Accéder à une valeur

```java
System.out.println(utilisateurs.get(1));
```

Chaque clé est **unique**.

### Parcourir une collection avec `Iterator`

Un **Iterator** permet de parcourir une collection **sans index**.

##### Exemple avec `ArrayList`

```java
ArrayList<String> noms = new ArrayList<>();
noms.add("Alice");
noms.add("Bob");

Iterator<String> it = noms.iterator();

while (it.hasNext()) {
    System.out.println(it.next());
}
```

`Iterator` est souvent utilisé avec les `Set`.

### Comparaison List / Set / Map

| Type | Doublons     | Ordre       | Accès   |
| ---- | ------------ | ----------- | ------- |
| List | Oui          | Oui         | index   |
| Set  | Non          | Non garanti | élément |
| Map  | Clés uniques | Non garanti | clé     |

---

### Quand utiliser quoi ?

- **ArrayList** → liste ordonnée avec doublons
- **HashSet** → éléments uniques
- **HashMap** → association clé / valeur
- **Iterator** → parcours sécurisé

- Les collections sont dynamiques
- `ArrayList` → liste
- `HashSet` → ensemble sans doublons
- `HashMap` → clé / valeur
- `Iterator` → parcours générique

## Les exceptions en Java

Une **exception** représente une **erreur qui survient pendant l’exécution** d’un programme.
Java permet de **détecter, gérer et contrôler** ces erreurs afin d’éviter l’arrêt brutal du programme.

Objectif : **sécuriser l’exécution** et gérer les cas imprévus.

### Le bloc `try / catch`

Le bloc `try` contient le code **susceptible de provoquer une erreur**.
Le bloc `catch` permet de **traiter cette erreur**.

### Syntaxe

```java
try {
    // code à risque
} catch (ExceptionType e) {
    // gestion de l’erreur
}
```

Exemple simple

```java
try {
    int result = 10 / 0;
} catch (ArithmeticException e) {
    System.out.println("Erreur : division par zéro");
}
```

Le programme continue son exécution.

## Plusieurs `catch`

Il est possible de gérer **plusieurs types d’exceptions**.

```java
try {
    int[] tab = {1, 2, 3};
    System.out.println(tab[5]);
} catch (ArithmeticException e) {
    System.out.println("Erreur arithmétique");
} catch (ArrayIndexOutOfBoundsException e) {
    System.out.println("Index hors limites");
}
```

Le `catch` correspondant à l’erreur rencontrée est exécuté.

### Le bloc `finally`

Le bloc `finally` s’exécute **dans tous les cas**, qu’une exception ait lieu ou non.

Il est utilisé pour :

- fermer des ressources
- libérer de la mémoire
- exécuter un nettoyage final

Exemple

```java
try {
    System.out.println("Traitement en cours");
} catch (Exception e) {
    System.out.println("Erreur");
} finally {
    System.out.println("Fin du traitement");
}
```

## Le mot-clé `throws`

`throws` permet de **déclarer qu’une méthode peut provoquer une exception**, sans la gérer elle-même.

Exemple

```java
void lireFichier() throws Exception {
    // code pouvant lever une exception
}
```

La gestion de l’exception est **déléguée** à la méthode appelante.

#### Utilisation avec `try / catch`

```java
try {
    lireFichier();
} catch (Exception e) {
    System.out.println("Erreur lors de la lecture");
}
```

### Lancer une exception : `throw`

Le mot-clé `throw` permet de **déclencher volontairement une exception**.

Exemple

```java
if (age < 0) {
    throw new IllegalArgumentException("Âge invalide");
}
```

Utile pour vérifier des règles métier.

### Les exceptions personnalisées

Il est possible de créer **ses propres exceptions** pour des cas spécifiques.

#### Création d’une exception personnalisée

```java
class AgeInvalideException extends Exception {
    public AgeInvalideException(String message) {
        super(message);
    }
}
```

#### Utilisation

```java
void verifierAge(int age) throws AgeInvalideException {
    if (age < 0) {
        throw new AgeInvalideException("Âge négatif interdit");
    }
}
```

Appel :

```java
try {
    verifierAge(-5);
} catch (AgeInvalideException e) {
    System.out.println(e.getMessage());
}
```

Les exceptions personnalisées rendent le code **plus explicite et plus lisible**.

## Différence entre `throw` et `throws`

- `throw` → **lance** une exception
- `throws` → **déclare** une exception possible

- `try` → code à risque
- `catch` → gestion de l’erreur
- `finally` → exécuté quoi qu’il arrive
- `throws` → délègue la gestion
- `throw` → déclenche une exception
- Exception personnalisée → règles métier claires

## Entrée utilisateur et fichiers en Java

Java permet :

- de **lire des données saisies par l’utilisateur**
- de **lire et écrire des données dans des fichiers**

Ces opérations sont essentielles pour créer des programmes interactifs et persistants.

### L’entrée utilisateur avec `Scanner`

La classe `Scanner` permet de lire des données depuis différentes sources, notamment le **clavier**.

### Création d’un Scanner

```java
Scanner sc = new Scanner(System.in);
```

`System.in` représente l’entrée standard (le clavier).

#### Lire des données

```java
System.out.print("Entrez votre âge : ");
int age = sc.nextInt();

System.out.print("Entrez votre prénom : ");
String prenom = sc.next();
```

Méthodes courantes :

- `nextInt()` → entier
- `nextDouble()` → nombre décimal
- `next()` → mot
- `nextLine()` → ligne complète

#### Fermer le Scanner

```java
sc.close();
```

Bonne pratique pour libérer les ressources.

### La classe `File`

La classe `File` représente un **fichier ou un dossier** sur le disque.
Elle ne lit pas le contenu : elle décrit **l’emplacement**.

#### Créer un objet File

```java
File fichier = new File("data.txt");
```

#### Vérifier l’existence d’un fichier

```java
if (fichier.exists()) {
    System.out.println("Le fichier existe");
}
```

### Lecture d’un fichier avec `BufferedReader`

`BufferedReader` permet de **lire un fichier ligne par ligne**.

#### Étapes de lecture

1. créer un `FileReader`
2. l’envelopper dans un `BufferedReader`
3. lire avec `readLine()`
   Exemple

```java
File fichier = new File("data.txt");

BufferedReader reader = new BufferedReader(new FileReader(fichier));
String ligne;

while ((ligne = reader.readLine()) != null) {
    System.out.println(ligne);
}

reader.close();
```

`readLine()` retourne `null` à la fin du fichier.

### Écriture dans un fichier avec `FileWriter`

`FileWriter` permet d’**écrire du texte dans un fichier**.

### Exemple simple

```java
FileWriter writer = new FileWriter("data.txt");
writer.write("Bonjour Java");
writer.close();
```

Le contenu précédent est **écrasé**.

#### Ajouter du contenu (mode append)

```java
FileWriter writer = new FileWriter("data.txt", true);
writer.write("\nNouvelle ligne");
writer.close();
```

Exemple complet : saisie utilisateur + fichier

```java
Scanner sc = new Scanner(System.in);

System.out.print("Entrez un message : ");
String message = sc.nextLine();

FileWriter writer = new FileWriter("message.txt", true);
writer.write(message + "\n");
writer.close();

sc.close();
```

Le message saisi est stocké dans un fichier.

- `Scanner` → entrée utilisateur
- `File` → représentation d’un fichier
- `BufferedReader` → lecture efficace
- `FileWriter` → écriture dans un fichier
- Toujours **fermer les ressources**

- `Scanner` lit les entrées clavier
- `File` décrit un fichier
- `BufferedReader` lit ligne par ligne
- `FileWriter` écrit du texte
- Les fichiers permettent de sauvegarder des données

## Java moderne : concepts essentiels

Le Java moderne introduit des outils qui rendent le code :

- plus **lisible**
- plus **expressif**
- plus **sécurisé**

Ces fonctionnalités ne changent pas les bases de Java, elles les **améliorent**.

### `var` : inférence de type

Le mot-clé `var` permet à Java de **déduire automatiquement le type** d’une variable à partir de sa valeur.

Exemple

```java
var nombre = 10;
var texte = "Bonjour";
var liste = new ArrayList<String>();
```

Le type est connu **à la compilation**, pas à l’exécution.

#### Règles importantes

- `var` doit être **initialisé immédiatement**
- il ne remplace pas les types partout
- il améliore surtout la lisibilité

Interdit :

```java
var x; // erreur
```

### `Optional` : éviter les `null`

`Optional` est une **boîte** qui peut contenir :

- une valeur
- ou rien

Objectif : **éviter les erreurs liées à `null`**.

#### Création

```java
Optional<String> nom = Optional.of("Zam");
Optional<String> vide = Optional.empty();
```

#### Vérifier la présence d’une valeur

```java
if (nom.isPresent()) {
    System.out.println(nom.get());
}
```

#### Valeur par défaut

```java
String resultat = nom.orElse("Inconnu");
```

`Optional` force à **gérer explicitement l’absence de valeur**.

### Les expressions lambda

Une **lambda** est une **fonction courte**, sans nom, utilisée pour exprimer un comportement.

### Syntaxe

```java
(paramètres) -> expression
```

Exemple

```java
(x) -> x * 2
```

Les lambdas sont très utilisées avec les **collections** et les **streams**.

### Introduction aux Streams

Les **Streams** permettent de traiter des collections de façon **déclarative**.

On décrit **ce que l’on veut**, pas comment le faire.

#### Exemple de base

```java
List<Integer> nombres = List.of(1, 2, 3, 4, 5);

nombres.stream()
       .forEach(n -> System.out.println(n));
```

### Opérations courantes sur les Streams

### `filter` : filtrer des éléments

```java
nombres.stream()
       .filter(n -> n % 2 == 0)
       .forEach(System.out::println);
```

#### `map` : transformer des éléments

```java
nombres.stream()
       .map(n -> n * 2)
       .forEach(System.out::println);
```

#### `collect` : récupérer le résultat

```java
List<Integer> doubles =
    nombres.stream()
           .map(n -> n * 2)
           .toList();
```

### Lien entre lambda et Stream

Les Streams **utilisent massivement les lambdas** pour :

- filtrer
- transformer
- parcourir les données

Exemple combiné :

```java
List<String> noms = List.of("Ana", "Bob", "Zam");

noms.stream()
    .filter(n -> n.length() > 3)
    .map(String::toUpperCase)
    .forEach(System.out::println);
```

- `var` → type déduit automatiquement
- `Optional` → alternative sûre à `null`
- Lambda → fonction courte et expressive
- Stream → traitement moderne des collections
- Java moderne → code plus lisible et plus sûr

## Les bonnes pratiques en Java

Écrire du code qui fonctionne est une chose.
Écrire du **code propre, lisible et maintenable** en est une autre.

Les bonnes pratiques permettent :

- de mieux comprendre le code
- de faciliter la maintenance
- de travailler efficacement en équipe

### Le Clean Code

Le **Clean Code** désigne un code :

- simple à lire
- facile à comprendre
- facile à modifier

#### Principes essentiels

##### Noms explicites

```java
int a;      // mauvais
int age;    // bon
```

Un nom doit expliquer **ce que fait la variable**, sans commentaire.

##### Méthodes courtes et claires

```java
void calculerTotal() {
    // une seule responsabilité
}
```

Une méthode = **une action précise**.

##### Éviter les valeurs magiques

```java
if (age >= 18) { }        // acceptable
```

Ou mieux :

```java
final int MAJORITE = 18;
if (age >= MAJORITE) { }
```

### Organisation des packages

Les **packages** servent à organiser le code en dossiers logiques.

#### Pourquoi utiliser des packages ?

- structurer le projet
- éviter les conflits de noms
- améliorer la lisibilité

Exemple d’organisation

```
com.app
 ├─ model
 ├─ service
 ├─ controller
 └─ utils
```

Chaque package a **un rôle clair**.

### Déclaration d’un package

```java
package com.app.model;
```

Toujours placer la déclaration **en haut du fichier**.

### La JavaDoc

La **JavaDoc** permet de documenter le code **directement dans les classes et méthodes**.

#### Pourquoi utiliser la JavaDoc ?

- expliquer l’utilité du code
- générer une documentation automatique
- faciliter la compréhension pour les autres développeurs

Exemple de JavaDoc

```java
/**
 * Représente un utilisateur.
 */
class Utilisateur {

    /**
     * Retourne l'âge de l'utilisateur.
     * @return âge
     */
    public int getAge() {
        return age;
    }
}
```

La JavaDoc décrit **le pourquoi**, pas le comment.

### Le débogage avec l’IDE

Le **debug** permet de comprendre **ce que fait réellement le programme** à l’exécution.

### Outils de base dans un IDE

- points d’arrêt (breakpoints)
- exécution pas à pas
- inspection des variables

#### Breakpoint

Un **point d’arrêt** stoppe le programme à une ligne précise.

- permet de voir les valeurs des variables
- aide à comprendre les erreurs logiques

#### Exécution pas à pas

- **Step Over** → passe à la ligne suivante
- **Step Into** → entre dans une méthode
- **Step Out** → sort de la méthode

Le debug est **plus efficace que les `System.out.println`**.

### Bonnes habitudes à adopter

- nommer clairement classes, méthodes et variables
- structurer le projet avec des packages cohérents
- commenter intelligemment avec la JavaDoc
- utiliser le debugger plutôt que multiplier les affichages
- garder le code simple et lisible

- Clean Code → lisible et maintenable
- Packages → organisation logique
- JavaDoc → documentation intégrée
- Debug → compréhension réelle du programme
- Bon code = code compréhensible
