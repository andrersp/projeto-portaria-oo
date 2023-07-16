package control

import business.ConviteBusiness
import entity.Convite

class Portaria {

    val conviteBusiness: ConviteBusiness = ConviteBusiness()

    init {
        println("Portaria inicializada.")
        println(this.controle())
    }

    private fun controle(): String {
        val idade = Console.readInt("Digite sua idade: ")

        if (idade < 18) {
            return "Negado. Menores de 18 não são permitidos"

        }

        val tipoConvite = Console.readString("Qual é o tipo de convite? ")

        if (!conviteBusiness.tipoValido(tipoConvite)) {
            return "Convite inválido"
        }

        val codigoConvite = Console.readString("Qual o código do convite? ")

        val convite: Convite = Convite(tipoConvite, codigoConvite)

        if (!conviteBusiness.codigoValido(convite)) {
            return "Convite inválido"
        }

        return "TODO"
    }
}