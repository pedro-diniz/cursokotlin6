fun testaMap() {
    val pedidos = mutableMapOf(
        Pair(1, 20.0), // par de chave/valor (key/value)
        Pair(2, 34.0),
        3 to 50.0 // infix para Pair(k, v), performance ruim, deve ser usado para mapas pequenos
    )
    println(pedidos)

    // Nos Maps, buscamos um par por sua chave, não pela posição no array
    println(pedidos[1])
    val pedido = pedidos[4]
    pedido?.let {
        println("pedido $it")
    }
    for (p: Map.Entry<Int, Double> in pedidos) {
        println("número do pedido: ${p.key}")
        println("valor do pedido: ${p.value}")
    }
    // Métodos de adição em um Map
    pedidos[4] = 70.0
    println(pedidos)
    pedidos.put(5, 80.0)
    println(pedidos)
    pedidos[1] = 100.0

    // Atualização
    println(pedidos)

    // Adiciona só se inexistente
    pedidos.putIfAbsent(6, 200.0)
    pedidos.putIfAbsent(6, 200.0)

    println(pedidos)

    // Remoção
    pedidos.remove(6)
    println(pedidos)

    // Só remove o Pair daquela Key se o valor bater com o informado.
    pedidos.remove(3, 100.0)
}