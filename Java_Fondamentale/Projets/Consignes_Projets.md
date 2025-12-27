# Gestion de Budget Mensuel

Ce projet fait parti de **Java fondamental** faire ici -> [Gestion de Budget Mensuel](Concepts-base/BudgetMensuel.java).

## Objectif

Créer un programme Java qui aide un utilisateur à analyser son **budget mensuel** à partir de saisies au clavier.

Ce mini-projet permet de pratiquer ensemble :

- variables + types
- constantes (`final`)
- opérateurs (arithmétiques, comparaison, logique)
- `Scanner`
- `if / else`
- affichage clair
- commentaires + conventions Java

## Contexte

L’utilisateur saisit :

- son revenu mensuel
- ses dépenses fixes
- ses dépenses variables

Le programme calcule ce qu’il reste et indique si la situation est correcte, limite, ou problématique.

## Travail demandé

### Classe

- Créer une seule classe (nom explicite, PascalCase)

### Saisies utilisateur (Scanner)

Dans `main`, demander et lire :

- **revenu mensuel** (`double`)
- **dépenses fixes** (`double`)
- **dépenses variables** (`double`)

### Constante

Créer une constante `final` :

- **SEUIL_SECURITE** (argent minimum à garder)

Respecter la convention : **MAJUSCULES + `_`**

### Calculs

Calculer :

- **totalDepenses** = fixes + variables
- **reste** = revenu - totalDepenses

### Vérifications + logique

Avec des comparaisons et de la logique, déterminer un message final selon la situation :

- budget OK
- budget limite
- budget insuffisant

(Utiliser `>`, `<`, `>=`/`<=`, et aussi `&&` / `||` si nécessaire)

### Affichage

Afficher clairement :

- revenu
- total des dépenses
- reste
- message final de situation
