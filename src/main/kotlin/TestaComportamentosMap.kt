fun testaComportamentosMap() {
    val pedidos: MutableMap<Int, Double> = mutableMapOf(
        Pair(1, 20.0), // par de chave/valor (key/value)
        Pair(2, 34.0),
        3 to 50.0, // infix para Pair(k, v), performance ruim, deve ser usado para mapas pequenos
        4 to 100.0,
        5 to 150.0,
        6 to 300.0
    )

    val valorPedido = pedidos[0]
    println(valorPedido)

    // .getValue é mais confiável que .get() para nullables, pois nos avisa quando um valor não existe ao invés de retornar nulo
//    val valorPedido1 = pedidos.getValue(0)
//    println(valorPedido1)

    // Executa uma lambda expression se a Key informada não existir
    println(pedidos.getOrElse(0, {
        "Não tem o pedido"
    }))

    // Retorna um valor padrão se a Key informado não existir
    println(pedidos.getOrDefault(0, -1.0))

    // Podemos imprimir apenas as Keys ou Values
    println(pedidos.keys)
    println(pedidos.values)

    for (valor in pedidos.values) {
        println("Valor de pedido: $valor")
    }

    // filtro por Key e Value
    val pedidosFiltrados = pedidos.filter { (numero, valor) ->
        numero % 2 == 0 && valor > 50.0
    }

    val pedidosAcimaDe = pedidos.filterValues { valor -> valor > 70 }
    println(pedidosAcimaDe)

    val pedidosPares = pedidos.filterKeys { numero -> numero % 2 == 0 }
    println(pedidosPares)

    println(pedidos + Pair(7, 90.0)) // gera um novo Map, não modifica o Map original
    println(pedidos + mapOf(8 to 270.0, 9 to 1000.0)) // gera um novo Map, não modifica o Map original
    println(pedidos)
    println(pedidos - 6) // gera um novo Map sem o elemento
    println(pedidos - listOf(6, 5, 2))

    pedidos.putAll(
        setOf(
            8 to 270.0,
            9 to 1000.0
        )
    ) // adiciona todos os elementos de uma Collection ao Map, modificando-o
    println(pedidos)

    pedidos += setOf(10 to 270.0, 11 to 1000.0) // adiciona todos os elementos de uma Collection ao Map, modificando-o
    println(pedidos)

    pedidos.keys.remove(1) // remove uma key
    println(pedidos)

    pedidos.values.remove(50.0) // remove um valor
    println(pedidos)

    pedidos.values.remove(270.0) // remove um único valor. Se o valor for repetido, a primeira ocorrência é removida
    println(pedidos)

    pedidos -= 6 // remove pela Key
    println(pedidos)
}