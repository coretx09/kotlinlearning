fun main(args: Array<String>){
    //TERMINOLOGY
    /*
     Les classes sont des plans pour les objets.
     Les objets sont des instances de classes.
     Les proprieties sont des caractéristiques de classes
     Les méthodes , également appelées fonctions membres , sont la fonctionnalité de la classe.
     Une interface est une spécification qu'une classe peut implémenter.
     Les packages sont un moyen de regrouper le code associé pour le garder organisé ou de créer une bibliothèque de code

     Un module est un ensemble de fichiers Kotlin compilés ensemble, par exemple une bibliothèque ou une application.

     MODIFICATEURS DE VISIBILITE :
     Par défaut, tout dans Kotlin est public
      public: signifie visible en dehors de la classe
      internal: signifie qu'il ne sera visible que dans ce module
      private: signifie qu'il ne sera visible que dans cette classe (ou fichier source si vous travaillez avec des fonctions)
      protected: est identique à private, mais il sera également visible par toutes les sous-classes.


     GETTERS/SETTERS
      les getters et les setters sont facultatifs et sont générés automatiquement
      si vous ne les créez pas dans votre programme
      generes ----> {var name: String = "defaultValue"}
      definis par defaut -----> {var name: String = "defaultValue"
           // getter
           get() = field  ---->valeur renvoye
          // setter
         set(value) {
             field = value ---> definition de la valeur obtenue
       }


     CLASS INHERITANCE :
     FINAL(par defaut) / OPEN(class, methode et proprietes) for inheritance --> OVERRIDE(sous-class{meth. et prop.})

     open class SuperClass(open val prop) {} --->
       ---> class ClassInherit(override val prop): SuperClass(prop = prop) {}




     */

}