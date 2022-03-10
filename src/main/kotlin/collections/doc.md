**COLLECTIONS**
Une collection est un _groupe d'éléments liés_, comme une liste de mots ou un ensemble d'enregistrements d'employés.
La collection peut avoir des articles commandés ou non commandés, et les articles peuvent être uniques ou non.
Vous avez déjà entendu parler d'un type de collection, ***les listes***.

Kotlin fait la distinction entre les collections _mutables_ et _immuables_.

**TYPE DE COLLECTIONS**:
- **List**

- **Set**
  C'est un groupe d'éléments liés, mais contrairement à une liste, _il ne peut pas y avoir de doublons_ 
  et l'ordre n'a pas d'importance
  L'une des principales opérations que vous pouvez effectuer sur un ensemble consiste à vérifier si un élément particulier 
  est dans l'ensemble ou non avec la _contains()_ fonction.
  Comme pour les ensembles mathématiques, dans Kotlin, vous pouvez également effectuer des opérations telles que 
  l'intersection (∩) ou l'union (∪) de deux ensembles, en utilisant _intersect()_ ou _union()_.

- **Maps**
 C'est un ensemble de paire _clé-valeur_, conçues pour faciliter la recherche d'une valeur en fonction d'une clé particulière.
 _Les clés sont uniques et chaque clé correspond à exactement une valeur, mais les valeurs peuvent avoir des doublons_.
 Les valeurs d'une carte peuvent être des chaînes, des nombres ou des objets, voire une autre collection comme une liste ou un ensemble.


Bien qu'ils aient des qualités différentes, différents types de collections ont _beaucoup de comportements en commun_.
S'ils sont modifiables, vous pouvez ajouter ou supprimer des éléments.
Vous pouvez énumérer tous les éléments, rechercher un élément particulier ou parfois convertir un type de collection en un autre. 

**forEach()**
Cependant, _l'énumération_ de tous les objets d'une collection est une opération courante, donc Kotlin fournit forEach(),
qui _passe en revue tous les éléments pour vous et effectue une opération sur chacun._
C'est similaire à la for boucle, mais un peu plus compact. Au lieu de spécifier une variable pour l'élément actuel, 
le forEach utilise l'identifiant spécial _it_.

**map()**
La map() fonction qui ne doit pas être confondue avec une collection de Maps ou de dictionnaires applique une 
transformation à chaque élément d'une collection.
_joinToString()_ convertis les <E> d'une collection en String

**filter**
Une autre opération courante avec les collections consiste à rechercher les éléments qui correspondent à une condition particulière.
La filter() fonction renvoie les éléments d'une collection qui correspondent, en fonction d'une expression.


**LAMBDA :**
Le modèle de ce code ci-dessus vous semble-t-il familier ?
 _peopleAges.forEach { print("${it.key} is ${it.value}") }_
C'est comme si vous écriviez une petite fonction entre les accolades, mais il n'y a pas de nom de fonction.
Cette idée - une fonction sans nom qui peut être immédiatement utilisée comme expression - est un concept très utile 
appelé expression lambda, ou simplement lambda, en abrégé.

**Types de fonction**
vous pouvez définir un type de fonction spécifique en fonction de ses paramètres d'entrée et de sa valeur de retour.
Exemple de type de fonction : _(Int) -> Int_

**Fonctions d'ordre supérieur**
Cela signifie simplement passer une fonction (dans ce cas un lambda) à une autre fonction, ou renvoyer une fonction 
à partir d'une autre fonction.
Il s'avère que les fonctions _map, filter, et forEach_ sont toutes des exemples de _fonctions d'ordre supérieur_
car elles ont toutes pris une fonction comme paramètre.