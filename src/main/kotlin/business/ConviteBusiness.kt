package business

import entity.Convite

class ConviteBusiness {

    private val tiposValidos: Set<String> = setOf("comum", "premium", "luxo")

    private val codigosValidos: Set<String> = setOf("xt", "xl")

    fun tipoValido(tipo: String): Boolean {
        return tipo in tiposValidos
    }

    fun codigoValido(convite: Convite) = when (convite.tipo) {
        "comum" -> convite.codigo.startsWith("xt")
        "premium", "luxo" -> convite.codigo.startsWith("xl")
        else -> false
    }


}