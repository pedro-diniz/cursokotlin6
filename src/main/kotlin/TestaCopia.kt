fun testaCopia() {
    val banco = BancoDeNomes()

    println(banco.nomes)

    banco.salva("Alex")

    // 1 - A princípio, essa é a Collection de nomes, e ela é imutável.
    println(banco.nomes)

    // 2 - Mas é possível burlar a lista por meio de um casting, já que o mesmo objeto é referenciado. E agora?
    // 4 - esse código quebra após a alteração no // 3, não permitindo mais a gambiarra para modificar
//    val nomesSalvos = banco.nomes as MutableCollection<String>
//    nomesSalvos.add("Paulo")
//    println(nomesSalvos)
    println(banco.nomes)
}

class BancoDeNomes {

    // 3 - aqui, retorno uma NOVA lista, cópia dos dados originais.
    val nomes : Collection<String> get() = dados.toList()

    fun salva(nome : String) {
        dados.add(nome)
    }

    // 0 - um private set não resolvia? o.O
    // NÃO! pq daria pra fazer .get.add(), ou será que não?
    companion object {
        private val dados = mutableListOf<String>()
    }
}