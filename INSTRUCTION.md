# 🌤️ Exercice : Météo

Cette excercice fait parti de Java fondamentale de la section **Les structures des programme Java** faire ici ->  [Meteo](Concepts-base/Meteo.java).



###  Objectif

Créer un **programme Java très simple** qui affiche des informations météo fictives dans la console.

Cet exercice permet de pratiquer les **bases fondamentales de Java** à travers un cas concret.



### Contexte

Tu développes une petite application appelée **MeteoApp**.

Elle ne fait aucun calcul complexe et ne demande aucune interaction utilisateur.  
Son rôle est simplement d’**afficher une météo lisible** dans la console.



### Travail demandé

###  Classe

- Créer une classe nommée **MeteoApp**
- Respecter les conventions Java (nom clair, majuscule)


### Variables

Dans la méthode `main`, créer des variables pour :

- le **nom de la ville**
- la **température**
- le **type de météo** (soleil, pluie, nuages, etc.)

Les noms doivent être :
- explicites
- écrits en **camelCase**


###  Affichage

Afficher dans la console :

- un message de démarrage du programme
- le nom de la ville
- la température
- le type de météo

L’affichage doit être clair et compréhensible.



### Commentaires

- Ajouter un **commentaire multi-ligne** en haut du fichier pour décrire le programme
- Ajouter au moins **deux commentaires sur une ligne** pour expliquer certaines parties du code



##  Résultat attendu

À l’exécution, la console affiche une **mini météo propre et lisible**, avec un code simple, bien structuré et facile à comprendre.


# 🧩 Exercice Java — Fiche d’abonnement Internet

Cette excercice fait parti de Java fondamentale de la section **Les variables et les types en Java** faire ici ->  [abonnement Internet](Concepts-base/abonnementInternet.java).
##  Objectif

Créer un **programme Java simple** qui affiche les informations d’un abonnement Internet.

Cet exercice permet de pratiquer :
- les **variables**
- les **types**
- les **constantes (`final`)**
- l’**affichage**
- les **conventions Java**


##  Contexte

Tu développes une petite application appelée **AbonnementInternet**.

Elle représente une **fiche client** d’un abonnement Internet.
Le programme sert uniquement à **stocker et afficher des informations** dans la console.



##  Travail demandé

###  Classe

- Créer une classe nommée **AbonnementInternet**
- Respecter les conventions Java (PascalCase)



### Variables

Dans la méthode `main`, créer des variables pour :

- le **nom du client** (`String`)
- la **vitesse de connexion en Mbps** (`int`)
- le **prix mensuel** (`double`)
- l’**état de l’abonnement** (`boolean`)

Les noms doivent être :
- clairs
- explicites
- écrits en **camelCase**



###  Constante

Créer une **constante** représentant :
- la **durée d’engagement** (en mois)

Elle doit :
- utiliser `final`
- être écrite en **MAJUSCULES** avec `_`



###  Affichage

Afficher dans la console :

- un titre (ex : fiche abonnement)
- toutes les informations stockées dans les variables
- la valeur de la constante

L’affichage doit être **lisible et compréhensible**.



###  Commentaires

- Ajouter un **commentaire multi-ligne** en haut du fichier
- Ajouter des **commentaires simples** pour expliquer les variables




# 🧩 Exercice Java — Validation d’un achat en ligne

Cette excercice fait parti de Java fondamentale de la section **Les opérateurs en Java** faire ici ->  [Commande en ligne](Concepts-base/CommandeEnLigne.java).

## Objectif

Créer un **programme Java simple** qui valide ou refuse un achat en ligne.

Cet exercice permet de pratiquer :
- les **opérateurs arithmétiques**
- les **opérateurs de comparaison**
- les **opérateurs logiques**
- la **logique de décision**



##  Contexte

Tu développes une application appelée **CommandeEnLigne**.

Elle simule la validation d’un achat :
le programme calcule un prix total, vérifie certaines conditions, puis indique si l’achat est possible.


##  Travail demandé

###  Classe

- Créer une classe nommée **CommandeEnLigne**
- Respecter les conventions Java (PascalCase)


###  Variables

Dans la méthode `main`, créer des variables pour :

- le **prix d’un produit** (`double`)
- la **quantité commandée** (`int`)
- le **solde du client** (`double`)
- le **statut client premium** (`boolean`)



###  Calcul

- Calculer le **prix total** de la commande
- Stocker le résultat dans une variable



###  Vérifications

Vérifier :
- si le solde du client permet de payer la commande
- si la quantité est valide

Utiliser des **opérateurs de comparaison**.



###  Logique

Déterminer si l’achat est accepté selon la règle suivante :

- l’achat est possible si :
  - le client a assez d’argent **ET** la quantité est valide  
  **OU**
  - le client est premium

Utiliser des **opérateurs logiques** (`&&`, `||`, `!` si nécessaire).



###  Affichage

Afficher dans la console :
- le prix total
- le solde du client
- si l’achat est **accepté ou refusé**

L’affichage doit être clair et compréhensible.


