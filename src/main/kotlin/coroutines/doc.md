# Multithreading and concurrency:
Jusqu'à présent, nous avons traité une application Android comme un programme avec un seul chemin d'exécution.
Vous pouvez faire beaucoup avec ce chemin d'exécution unique, mais à mesure que votre application se développe, vous 
devez penser à la [concurrency]

[concurrency] permet à plusieurs unités de code de s'exécuter dans le désordre ou apparemment en parallèle, 
ce qui permet une utilisation plus efficace des ressources.
Le système d'exploitation peut utiliser les caractéristiques du système, le _langage de programmation_ et le _concurrency unit_
pour gérer le _multitasking_.

[Thread] est la plus petite unité de code qui peut être planifiée et exécutée dans les limites d'un programme.
Vous pouvez créer un thread simple en fournissant un lambda.
le thread n'est pas exécuté tant que la fonction n'a pas atteint  start() appel de fonction. 

[currentThread()] renvoie une Thread instance qui est convertie en sa représentation sous forme de chaîne qui renvoie le nom, la priorité et le groupe de threads du thread.

Alors qu'une application en cours d'exécution aura plusieurs threads, chaque application aura un thread dédié, spécifiquement 
responsable de l'UI  de votre application. Ce fil est souvent appelé fil principal ou fil d'interface utilisateur.

# COROUTINES:
La création et l'utilisation de _threads_ pour les tâches en arrière-plan ont directement leur place dans Android, 
mais Kotlin propose également des _coroutines_ qui offrent un moyen plus flexible et plus simple de gérer la simultanéité.

Les coroutines permettent le multitâche, mais offrent un autre niveau d'abstraction par rapport au simple travail avec les threads.
Une caractéristique clé des coroutines est la capacité de stocker l'état, afin qu'elles puissent être arrêtées et reprises. 
Une coroutine peut ou non s'exécuter.

L'état, représenté par _continuations_, permet à des portions de code de signaler quand elles doivent passer le contrôle 
ou attendre qu'une autre coroutine termine son travail avant de reprendre. Ce flux est appelé multitâche coopératif.

[CoroutineScope] est un contexte qui applique l'annulation et d'autres règles à ses enfants et à leurs enfants de manière récursive.

[Dispatcher] gère le thread de sauvegarde que la coroutine utilisera pour son exécution, supprimant la responsabilité du développeur
quant au moment et à l'endroit où utiliser un nouveau thread.
