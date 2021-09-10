fun testaColecao() {
    val nomes1: Iterable<String> = listOf("Alex", "Fran", "Gui", "Maria", "Ana") // mais genérico
    val nomes2: Collection<String> = listOf("Alex", "Fran", "Gui", "Maria", "Ana") // menos genérico
    val nomes: Collection<String> = mutableListOf("Alex", "Fran", "Gui", "Maria", "Ana") // menos genérico ainda
    println(nomes)
    println(nomes1)
    println(nomes2)

    println("Tem o nome Alex? ${nomes.contains("Alex")}")
    println("Tamanho da coleção: ${nomes.size}") // não tem no Iterable
    // funções da MutableList, mas não da Collection.
//    nomes.add("Paulo")
//    println(nomes)
//    nomes.remove("Alex")
//    println(nomes)
}