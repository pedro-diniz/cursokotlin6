fun testaAssociacaoAgrupamento() {
    val pedidos = listOf(
        Pedido(1, 20.0),
        Pedido(2, 60.0),
        Pedido(3, 30.0),
        Pedido(4, 70.0),
    )
    println(pedidos)

    // associate pode ser usado pra converter uma lista de objetos para um mapa
    val pedidosMapeados: Map<Int, Pedido> = pedidos.associate { pedido: Pedido ->
//        Pair(pedido.numero, pedido)
        pedido.numero to pedido
    }

    // associateBy pode ser usado pra facilitar a criação do Map com uma propriedade
    val pedidosMapeados1: Map<Int, Pedido> = pedidos.associateBy { pedido ->
        pedido.numero
    }

    val pedidosFreteGratis: Map<Pedido, Boolean> = pedidos.associateWith { pedido ->
        pedido.valor > 50.0
    }

    // imprime um mapa em que a Key é um pedido e o Value é um Boolean
    println(pedidosFreteGratis)

    // verifica se o pedido 1 tem frete grátis, o que não é muito prático
    println(pedidosFreteGratis[Pedido(1, 20.0)])

    println(pedidosMapeados)
    println(pedidosMapeados1)

//    val mapa:Map<Boolean, Pedido> = pedidos.associateBy { pedido ->
//        pedido.valor > 50
//    }
//
//    // só imprime 2 pedidos, pois as chaves só podem ser true ou false
//    println(mapa)

    // cria o mapa agrupando os pedidos dentro de uma lista no Value pelas Keys true e false
    val pedidosFreteGratisAgrupados: Map<Boolean, List<Pedido>> =
        pedidos.groupBy { pedido: Pedido ->
            pedido.valor > 50
        }
    println(pedidosFreteGratisAgrupados)

    // agora, conseguimos passar as Keys com os booleans
    println(pedidosFreteGratisAgrupados[true])
    println(pedidosFreteGratisAgrupados[false])

    val nomes = listOf(
        "Alex",
        "Fran",
        "Gui",
        "Ana",
        "Paulo",
        "Maria",
        "Mario",
        "Gisele"
    )

    val agenda: Map<Char, List<String>> = nomes.groupBy { nome ->
        nome.first() // outro cenário para o groupBy: organizar por ordem alfabética
    }
    println(agenda)
    println(agenda['A'])
}

data class Pedido(val numero: Int, val valor: Double)