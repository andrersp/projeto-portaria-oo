package business

import entity.Convidado

class ConvdadoBusiness {

    private val tiposValidos: Set<String> = setOf("comum", "premium", "luxo")

    private val codigosValidos: Set<String> = setOf("xt", "xl")

    fun tipoValido(tipo: String): Boolean {
        return tipo in tiposValidos
    }

    fun codigoValido(convidado: Convidado) = when (convidado.tipo) {
        "comum" -> convidado.codigo.startsWith("xt")
        "premium", "luxo" -> convidado.codigo.startsWith("xl")
        else -> false
    }

    fun maiorIdade(idade: Int): Boolean {
        return idade >= 18

    }


}