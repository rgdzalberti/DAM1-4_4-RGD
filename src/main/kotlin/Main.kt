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
    val lista = mutableListOf<T>()
    for(i in 0..list.size) {lista.add(pila.push(iterator.next()))}
    //val lista =
    return lista
}


fun main() {

    var numbers = listOf("one", "two", "three", "four")
    println(reverse(numbers))

    /*
    var numbers = listOf("one", "two", "three", "four")
    var numbersRev = reverse(numbers)
    if (!listOf("four", "three", "two", "one").equals(numbersRev))
        println("Error")
    else
        println("Correcto")
    println(numbersRev)

     */

}