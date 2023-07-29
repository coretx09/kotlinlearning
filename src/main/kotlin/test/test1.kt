package test


lateinit var task: Task
fun main() {


    fun taskInstance(): Task {
        return Task(1, "Ecology",  )
    }

    task = taskInstance()

    val task1 = Task(1, "uN")
    val task2 = Task(2, "deux")
    val task3 = Task(3, "trois")
    val listTask: List<Task> = listOf(task1, task2, task3)
    val listmodif = listTask.map { it.copy(title= it.title + "task") }
    println(listmodif.sortedBy { it.title })







}

data class Task(
    val id: Int,
    val title: String,

)


