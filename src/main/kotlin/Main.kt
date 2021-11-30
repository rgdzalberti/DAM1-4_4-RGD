class Pila<T>() {
    override fun toString(): String {
        return list.toString()
    }

    var list = mutableListOf<T>()

    fun top(): T {
        return list.first()
    }

    fun push(something: T) {
        list.add(0, something)
    }

    fun pop() {
        list.removeFirstOrNull()
    }

    fun empty(): Boolean {
        return list.isEmpty()
    }


}

fun <T> reverse(list: List<T>): List<T> {
    val pila = Pila<T>()
    val iterator = list.iterator()
    while (iterator.hasNext()) pila.push(iterator.next())
    return list
}


fun main() {


    var numbers = listOf("one", "two", "three", "four")
    var numbersRev = reverse(numbers)
    if (!listOf("four", "three", "two", "one").equals(numbersRev)) {
        println("Error")
    }
    else {
        println("Correcto")
        println(numbersRev)
    }


}