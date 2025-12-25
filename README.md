
# Apprentisage Java - Débutante

Ce dépot regroupe mes leçons , mes exercices pratiquues et mes projet en Java.
Objectif : progresser étape par étape avec des exercice concrets .

## Sommaire

## Java fondamentale

- [Decouvrir Java](#Decouvrir-Java)
  - [Comment fonctionne un programme Java](#Comment-fonctionne-un-programme-Java)
  - [Difference Java vs JavaScript ](#Difference-Java-vs-JavaScript)
  - [Compilation vs Interprétation](#Compilation-vs-Interprétation)
  - [Installer Java et un IDE](#Installer-Java-et-un-IDE)
    
- [La structure des programmes Java](#La-structure-des-programmes-Java)
  - [La classe](#La-classe)
  - [La methode main](#La-methode-main)
  - [Afficher un message](#Afficher-un-message)
  - [Les Commentaires](#Les-commentaire)
  - [Les conventions de nommage en Java](#Les-conventions-de-nommage-en-Java)
    
- [Les variables et les types en Java ](#Les-variables-et-les-types-en-Java)
  - [Les types primitifs](#Les-types-primitifs)
  - [Le type String](#Le-type-String)
  - [La constante final](#La-constante-final)
  - [Convertioon-de-type](#La-constante-final)
    
- [Les opérateurs en Java](#Les-opérateurs-en-Java)
  - [Les opérateurs arithmétiques](#Les-opérateurs-arithmétiques)
  - [Les opérateurs de comparaison](#Les-opérateurs-de-comparaison)
  - [Les opérateurs de logiques](#Les-opérateurs-de-comparaison)


## Logique et contrôle  du programme
- [Les entrées utilisateur](#Les-entrées-utilisateurs)
- [Les structures conditionnelles](#Les-structures-conditionnelles)
- [Les structures conditionnelles itéraction](#Les-structures-conditionnelles-itéraction)
- [Les tableaux](#Les-tableaux)



## Decouvrir Java

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


##  Différence Java vs JavaScript 

Même si leurs noms se ressemblent, **Java et JavaScript n’ont aucun lien technique**.

La confusion vient uniquement du nom.

**Différence clé :**

* **Java** → utilisé pour des applications complètes (logiciels, backend, Android)
* **JavaScript** → utilisé pour rendre les pages web interactives

 Ils ne s’exécutent pas dans le même environnement et n’ont pas le même rôle.


* Java ≠ JavaScript
* Apprendre Java **ne signifie pas** apprendre JavaScript
* Ce sont deux parcours techniques différents



###  Compilation vs Interprétation 

Un programme doit être **traduit** pour être compris par l’ordinateur.
Il existe deux approches principales.


#### Compilation

* Le code est **traduit avant l’exécution**
* Les erreurs sont détectées plus tôt
* Le programme est plus structuré

Java utilise **une compilation en bytecode**, puis une exécution.



#### Interprétation

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

## La structure des programmes Java 


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

* `if / else` → logique conditionnelle générale
* `switch` → sélection basée sur des valeurs fixes

 Le choix dépend surtout de la **lisibilité du code**.


* `if` → exécute un bloc si la condition est vraie
* `else` → alternative
* `else if` → plusieurs cas
* `switch` → choix parmi plusieurs valeurs
* `break` → stoppe le `switch`


Parfait. Voici une **leçon claire, concise et non répétitive**, centrée **uniquement sur les boucles en Java**.
On part du principe que les **conditions** et les **opérateurs** sont déjà acquis.



## Les boucles en Java

Les boucles permettent de **répéter un bloc de code** tant qu’une condition reste vraie ou selon un nombre de répétitions donné.

Java propose principalement :

* `while`
* `do while`
* `for`



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

* l’initialisation
* la condition
* la modification de la variable

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


* `while` → condition testée avant
* `do while` → exécution au moins une fois
* `for` → nombre de répétitions connu
* `break` → arrêt immédiat de la boucle
* `continue` → saute une itération


## Les tableaux en Java

Un **tableau** permet de stocker **plusieurs valeurs du même type** dans une seule variable.
Il est particulièrement utile lorsque l’on manipule des **listes de données**.



### Déclarer et créer un tableau (1D)

Un tableau se déclare avec des **crochets `[]`**.

```java
int[] ages = new int[5];
```

* le tableau contient **5 entiers**
* les index vont de `0` à `4`

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

* taille : 4
* index : de `0` à `3`

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

* plus lisible
* idéal quand on n’a pas besoin de l’index


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

* 2 lignes
* 3 colonnes

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

* premier index → ligne
* second index → colonne


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


* Un tableau stocke plusieurs valeurs du même type
* Les index commencent à `0`
* `length` donne la taille
* `for` et `for-each` servent au parcours
* Les tableaux 2D représentent lignes et colonnes

