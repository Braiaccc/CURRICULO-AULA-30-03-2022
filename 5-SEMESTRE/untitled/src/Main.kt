//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val numeros = listOf(1, 2, 3, 4, 5, 6)

    val numerosPares = numeros.filter (::filtraNumerosPares)
    println(numerosPares)
}

fun filtraNumerosPares(numeros: Int): Boolean {
    return numeros % 2 == 0
}

