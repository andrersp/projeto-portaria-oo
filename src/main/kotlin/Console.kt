class Console {
    private val respostaIdadeInvalida: String = "Idade informada é inválida ou menor que 1"
    fun readInt(msg: String): Int {
        var idade: Int = 0


        do {
            println(msg)
            val info = readLine()

            if (info == null) {
                println(respostaIdadeInvalida)
                continue
            }

            if (info == "") {
                println(respostaIdadeInvalida)
                continue
            }

            val resposta: Int? = info.toIntOrNull()

            if (resposta != null && resposta > 0) {
                idade += resposta
            } else {
                println(respostaIdadeInvalida)
            }


        } while (idade <= 0)

        return idade
    }

    private fun checkNumbers(str: String): Boolean {
        return str.all { char -> char.isDigit() }
    }


}