fun main() {
    val list2 = mutableListOf(1, 2, 3, 4, 5)
    list2.removeAll { it > 2 }
    println(list2) // Output: [1, 2]

    // Alternative solution using an iterator
    val list3 = mutableListOf(1, 2, 3, 4, 5)
    val iterator = list3.iterator()
    while (iterator.hasNext()) {
        val item = iterator.next()
        if (item > 2) {
            iterator.remove()
        }
    }
    println(list3) // Output: [1, 2]
} 