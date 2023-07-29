                         NULLABILITY
Nullability est la capacité d'une _variable_ à contenir une [null] valeur.  

**Nullable types and non-null types** :   
L'un des pièges les plus courants dans de nombreux langages de programmation, y compris Java, est que l'accès à un 
membre d'une référence nulle entraînera une exception de référence nulle [NPE](NullPointerException).   
Dans Kotlin, le système de type fait la distinction entre les références qui peuvent contenir [null] _(nullable references)_
et celles qui ne le peuvent pas _(non-null references)_.  
Les **Nullable types** dans Kotlin sont marqués d'un point d'interrogation *(?)*

**Safe calls (?.)** :  
Option pour accéder à une propriété sur une [variable nullable].  
Pour effectuer une certaine opération uniquement pour des [valeurs non nulles], vous pouvez utiliser l'opérateur d'appel sécurisé avec [let]


**Elvis operator (?:)** :   
Si l'expression à gauche de [?:] n'est pas null, l'opérateur Elvis la renvoie, sinon il renvoie l'expression à droite. 


**Not-Null Assertion Operator (!!)** :
convertit toute valeur en un type [non-nul] et lancera un [NPE] si la valeur est [null].
Cet opérateur est utilisé pour indiquer explicitement au compilateur que la propriété est [non null] et si elle est [null], veuillez lancer une exception de pointeur nul (NPE)
si vous êtes sûr que la valeur de la propriété [var] n'est pas nulle, utilisez[!!]  
La plupart du temps, il ne faut pas appliquer le [!!] opérateur en code Kotlin pur. 