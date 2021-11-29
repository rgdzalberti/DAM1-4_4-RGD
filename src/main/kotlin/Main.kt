
class Pila<T>()
{
    var list = mutableListOf<T>()

    fun top(): T {
        return list.first()
    }
    fun push(something:T){
        list.add(0,something)
    }
    fun pop(){
        list.removeAt(0)
    }
    fun empty(): Boolean{
        return list.isEmpty()
    }

    fun reverse(list: List<T>):List<T>{
        val pila = Pila<T>()
        val sequence1 = list<T> { list.iterator() }
    }
}



fun main() {
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