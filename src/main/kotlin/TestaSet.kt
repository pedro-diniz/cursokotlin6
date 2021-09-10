fun testaSet() {
    val assistiramCursoAndroid = listOf("Alex", "Fran", "Gui", "Maria")
    val assistiramCursoKotlin = listOf("Alex", "Paulo", "Maria")
//    val assistiramAmbos = mutableListOf<String>()
//    assistiramAmbos.addAll(assistiramCursoAndroid)
//    assistiramAmbos.addAll(assistiramCursoKotlin)

    // trará elementos repetidos comuns às 2 listas
    val assistiramAmbos = assistiramCursoAndroid + assistiramCursoKotlin
    println(assistiramAmbos.distinct())

    // Sets são Collections de elementos QUE NÃO SE REPETEM
    val setAssistiramCursoAndroid = setOf("Alex", "Fran", "Gui", "Maria")
    val listAssistiramCursoKotlin = listOf("Alex", "Paulo", "Maria")

    // retorna um SET, pq o primeiro elemento da soma é um set
    val setAssistiramAmbos = setAssistiramCursoAndroid + listAssistiramCursoKotlin
    println(setAssistiramAmbos)

    // retorna um LIST, pq o primeiro elemento da soma é uma list
    val listAssistiramAmbos = listAssistiramCursoKotlin + setAssistiramCursoAndroid
    println(listAssistiramAmbos)

    // A ordem não importa em Sets. Sendo assim, não podemos acessar elementos pelo índice.
//    println(setAssistiramAmbos[0])
    println(listAssistiramAmbos[0])

    // todas as variáveis provenientes da soma de collection são imutáveis por padrão
    // para obtermos collections mutáveis, precisamos declarar explicitamente

    val mutableSetAssistiramAmbos = mutableSetOf<String>()
    mutableSetAssistiramAmbos.addAll(setAssistiramCursoAndroid)
    mutableSetAssistiramAmbos.addAll(listAssistiramCursoKotlin)
    println(mutableSetAssistiramAmbos)
    mutableSetAssistiramAmbos.add("Amanda")
    println(mutableSetAssistiramAmbos)

    val mutableListAssistiramAmbos = mutableListOf<String>()
    mutableListAssistiramAmbos.addAll(setAssistiramCursoAndroid)
    mutableListAssistiramAmbos.addAll(listAssistiramCursoKotlin)
    println(mutableListAssistiramAmbos)
    mutableListAssistiramAmbos.add("Amanda")
    println(mutableListAssistiramAmbos)

    // lembrando que se o primeiro elemento da soma é um set, retorna um set
    println(assistiramCursoAndroid + assistiramCursoKotlin) // operação implícita de união de conjuntos
    println(assistiramCursoAndroid union assistiramCursoKotlin) // operação explícita com infix de união de conjuntos
    println(assistiramCursoAndroid.union(assistiramCursoKotlin)) // operação explícita de união de conjuntos

    // no subtract, a ordem importa
    println(assistiramCursoAndroid - assistiramCursoKotlin) // operação implícita de subtração de conjuntos
    println(assistiramCursoAndroid subtract assistiramCursoKotlin) // operação explícita com infix de subtração de conjuntos
    println(assistiramCursoKotlin.subtract(assistiramCursoAndroid)) // operação explícita de subtração de conjuntos

    // obtém a interseção, elementos em comum
    println(assistiramCursoKotlin intersect assistiramCursoAndroid)

    // na hora que você converte uma List para Set, a filtragem de elementos iguais é feita automagicamente
    val assistiramAmbosList = assistiramAmbos.toMutableList()
    assistiramAmbosList.add("Alex")
    println(assistiramAmbosList)
    println(assistiramAmbosList.toSet())
}