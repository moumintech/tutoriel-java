
# Apprentisage Java - Débutante

Ce dépot regroupe mes leçons , mes exercices pratiquues et mes projet en Java.
Objectif : progresser étape par étape avec des exercice concrets .

## Sommaire

## Concepts de base

- [Introduction](#introduction)
  - [Comment fonctionne un programme Java](##Comment-fonctionne-un-programme-Java)
  - [Java vs JavaScript](#Java-vs-JavaScript)
  - [Compilation vs Interprétation](#Compilation-vs-Interprétation)
  - [Installer Java et un IDE](#Installer-Java-et-un-IDE)
- [La structure des programmes Java](#La-structure-des-programmes-Java)
- [Les variables](#les-variables)
- [Les opérateurs arithmétiques](#Les-Opérateurs-arithmétiques)
- [Les commentaires](#Les-commentaires)

## Logique et exécution du programme

- [Les entrées utilisateur](#Les-entrées-utilisateurs)
- [Les structures conditionnelles](#Les-structures-conditionnelles)
- [Les structures conditionnelles itéraction](#Les-structures-conditionnelles-itéraction)
- [Les tableaux](#Les-tableaux)



## Introduction

Java est un **langage de programmation** utilisé pour créer des logiciels capables de fonctionner sur différents types de machines et de systèmes d’exploitation (Windows, Linux, macOS, etc.).

Il est largement utilisé dans de nombreux domaines :

* applications desktop,
* applications web,
* applications mobiles (notamment Android),
* logiciels bancaires et industriels,
* systèmes embarqués.

Java est connu pour sa portabilité, résumée par son slogan célèbre :

> **“Write once, run anywhere”**
> *(Écrire une fois, exécuter partout)*

Cela signifie qu’un programme Java peut être exécuté sur différentes plateformes sans être réécrit.


## Comment fonctionne un programme Java ?

Contrairement à certains langages, un programme Java **n’est pas exécuté directement par le système d’exploitation**.

Le code Java est d’abord :

1. **écrit** par le développeur,
2. **compilé** en un format intermédiaire appelé *bytecode*,
3. **exécuté** par un environnement spécifique à Java.

C’est ce fonctionnement qui rend Java portable et indépendant du système.


### La JVM (Java Virtual Machine)

La **JVM** est la **machine virtuelle Java**.

Son rôle est fondamental :

* elle exécute le *bytecode* Java,
* elle fait le lien entre le programme Java et le système d’exploitation,
* elle gère automatiquement la mémoire,
* elle assure la sécurité de l’exécution.

Chaque système d’exploitation possède sa propre JVM, mais **le programme Java reste le même**, ce qui permet à Java de fonctionner partout.


### Le JRE (Java Runtime Environment)

Le **JRE** est l’**environnement nécessaire pour exécuter un programme Java**.

Il contient :

* la **JVM**,
* les bibliothèques Java indispensables au fonctionnement des applications.

 Le JRE permet **d’utiliser** un programme Java,
mais **pas de le créer**.

Un utilisateur final a généralement seulement besoin du JRE.



### Le JDK (Java Development Kit)

Le **JDK** est l’**outil destiné aux développeurs Java**.

Il contient :

* le **JRE**,
* le compilateur Java (`javac`),
* des outils pour développer, tester et déboguer des programmes.

Le JDK est indispensable pour :

* écrire du code Java,
* compiler les fichiers `.java`,
* créer des applications Java.



### Écriture des premières instructions Java

En Java :

* un programme est composé d’instructions,
* chaque instruction se termine par un **point-virgule (`;`)**,
* Java est **sensible à la casse** :
  `main`, `Main` et `MAIN` sont différents.

Pour afficher un message à l’écran, on utilise par exemple :

```java
System.out.println("Bonjour Java !");
```


* **Java** : langage de programmation portable et orienté objet
* **JVM** : exécute le programme Java
* **JRE** : permet d’exécuter une application Java
* **JDK** : permet de développer des applications Java


##  Java vs JavaScript 

Même si leurs noms se ressemblent, **Java et JavaScript n’ont aucun lien technique**.

La confusion vient uniquement du nom.

**Différence clé :**

* **Java** → utilisé pour des applications complètes (logiciels, backend, Android)
* **JavaScript** → utilisé pour rendre les pages web interactives

 Ils ne s’exécutent pas dans le même environnement et n’ont pas le même rôle.


* Java ≠ JavaScript
* Apprendre Java **ne signifie pas** apprendre JavaScript
* Ce sont deux parcours techniques différents



##  Compilation vs Interprétation 

Un programme doit être **traduit** pour être compris par l’ordinateur.
Il existe deux approches principales.


### Compilation

* Le code est **traduit avant l’exécution**
* Les erreurs sont détectées plus tôt
* Le programme est plus structuré

Java utilise **une compilation en bytecode**, puis une exécution.



### Interprétation

* Le code est **exécuté directement**
* Les erreurs apparaissent à l’exécution
* Approche plus souple et rapide à tester

 JavaScript fonctionne principalement de cette manière.

* **Compilation** → préparation avant exécution
* **Interprétation** → exécution immédiate
* **Java** → compilation (modèle hybride)
* **JavaScript** → interprétation


## Installer Java (JDK) et un IDE

###  Installer le JDK (Java 17 ou Java 21)

Pour développer en Java, il faut installer le **JDK**.

 **Java 17** et **Java 21** sont des versions **LTS** (Long Term Support).

* **Java 17** : très répandue, stable, souvent utilisée en formation
* **Java 21** : plus récente, recommandée si ton environnement l’accepte

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



###  Choisir un IDE (environnement de développement)

Un **IDE** permet d’écrire, organiser et exécuter du code Java plus facilement.


#### IntelliJ IDEA

* Très intelligent et moderne
* Excellente assistance au code
* Version Community gratuite (suffisante pour Java)

Idéal si tu veux un confort maximal



#### Eclipse IDE

* Spécialisé Java
* Très utilisé en entreprise
* Gratuit et robuste

Bon choix académique et professionnel


####  Visual Studio Code

* Éditeur léger (pas un IDE Java natif)
* Nécessite des extensions Java
* Très polyvalent (HTML, CSS, JS, Python…)

 Intéressant si tu travailles sur **plusieurs langages**

![Image](https://resources.jetbrains.com/help/img/idea/2025.3/new_ui_dark_theme.png)

![Image](https://math.hws.edu/eck/cs124/s21/eclipse-setup/textio-setup.png)

![Image](https://code.visualstudio.com/assets/docs/java/extensions/extensions.png)


#### Quel choix faire ?

 **Recommandation simple** :

* Débutant·e Java pur → **IntelliJ IDEA** ou **Eclipse**
* Projet multi-langages / web → **VS Code**



* Installer **JDK 17 ou 21**
* Vérifier avec `java --version`
* Choisir un IDE :

  * IntelliJ → confort
  * Eclipse → classique Java
  * VS Code → polyvalent



**Excercice pratique [INSTRUCTION](INSTRUCTION.md/)**

## La structure des programmes Java :


### La classe

En Java, **tout programme commence par une classe**.

```java
class Meteo {
}
```

* `class` permet de définir une classe
* `Meteo` est le nom de la classe
* les accolades `{ }` délimitent son contenu

 **Toute ligne de code exécutable en Java doit se trouver à l’intérieur d’une classe.**


### La méthode `main`

La méthode `main` est le **point d’entrée du programme**.
C’est la première méthode exécutée lorsque le programme démarre.

```java
public static void main(String[] args) {
}
```

* `public` : la méthode est accessible
* `static` : elle peut être exécutée sans créer d’objet
* `void` : elle ne retourne aucune valeur
* `main` : nom spécial reconnu par Java
* `String[] args` : paramètres passés au programme

Sans méthode `main`, un programme Java **ne peut pas s’exécuter**.


###  Afficher un message à l’écran

Pour afficher un texte dans la console, on utilise :

```java
System.out.println("Salut");
```

* `System.out` : sortie standard (console)
* `println` : affiche le texte et passe à la ligne suivante

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



###  Les conventions de nommage en Java

Java suit des conventions strictes pour améliorer la clarté du code.

* **Classes** :

  * commencent par une majuscule
  * exemple : `Meteo`, `Application`, `Utilisateur`

* **Méthodes et variables** :

  * commencent par une minuscule
  * utilisent le *camelCase*
  * exemple : `main`, `temperatureActuelle`

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



* Une **classe** contient le programme
* `main` est le point de départ
* `System.out.println()` affiche un message
* Les commentaires expliquent le code
* Les conventions de nommage rendent le code lisible



**Excercice pratique: Debug & fix la consigne ici  [INSTRUCTION](INSTRUCTION.md/)**




## Variables et types en Java

Dans un programme, on manipule constamment des **valeurs** : nombres, texte, états logiques, etc.
Une **variable** permet de **stocker une valeur** en lui donnant un nom afin de la réutiliser plus tard dans le programme.



### Déclarer une variable

En Java, une variable est toujours définie avec un **type**.

```java
int points = 10;
```

* `int` → type de la variable
* `points` → nom de la variable
* `10` → valeur stockée

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

* Le texte est entouré de **guillemets doubles** (`" "`)
* `String` n’est **pas un type primitif**, mais il est utilisé très fréquemment



### La constante `final`

Une variable déclarée avec `final` **ne peut plus être modifiée**.

```java
final int ANNEE = 2025;
```

 Une constante :

* est souvent écrite en **MAJUSCULES**
* protège une valeur fixe du programme



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

* La partie décimale est **perdue**
* `b` vaudra `9`

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



* Une variable stocke une valeur
* Chaque variable a un type
* Types primitifs : `int`, `double`, `boolean`, `char`
* Texte : `String`
* `final` crée une constante
* Le casting permet de convertir des types



**Exercice pratique : Stocker le titre d'un film trouver la consigne ici [INSTRUCTION](INSTRUCTION.md/)**



# Les opérateurs en Java

Les opérateurs permettent de **manipuler des valeurs** : faire des calculs, comparer des données ou combiner des conditions.

On distingue principalement :

* les **opérateurs arithmétiques**
* les **opérateurs de comparaison**
* les **opérateurs logiques**



## Les opérateurs arithmétiques

Ils servent à effectuer des calculs mathématiques.

### Addition (`+`)

```java
int x = 5;
int y = 3;
System.out.println(x + y); // 8
```

---

### Soustraction (`-`)

```java
int salaire = 9000;
int taxe = 500;
System.out.println(salaire - taxe); // 8500
```

---

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


##  Les opérateurs de comparaison

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


##  Les opérateurs logiques

Ils servent à **combiner plusieurs conditions**.

| Opérateur | Signification |   |    |
| --------- | ------------- | - | -- |
| `&&`      | ET            |   |    |
| `         |               | ` | OU |
| `!`       | NON           |   |    |

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




* Les opérateurs arithmétiques font des calculs (`+`, `-`, `*`, `/`, `%`)
* Les opérateurs de comparaison comparent des valeurs
* Les opérateurs logiques combinent des conditions
* Les comparaisons retournent toujours un `boolean`



 Suite logique possible (toujours courte et cohérente) :
# Les commentaires



### Qu’est-ce qu’un commentaire ?

Les commentaires sont des **annotations écrites dans le code** pour expliquer ce que fait le programme.

Le **code** est destiné à l’ordinateur.
Les **commentaires** sont destinés aux humains .

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

## Les structures conditionnelles



### La prise de décision en programmation


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
/*
résultat
   5
   4
   3
   2
   1
*/
   

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
/*
0
2
4
6
8
10
*/
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

//Lasomme est : 5050
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

## La boucle `for` en Java

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

## Pourquoi utiliser des tableaux ?

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
