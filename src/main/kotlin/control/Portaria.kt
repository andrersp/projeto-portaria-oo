package control

import business.ConvdadoBusiness
import entity.Convidado

class Portaria {

    val convidadoBusiness: ConvdadoBusiness = ConvdadoBusiness()

    init {
        println("Portaria inicializada.")
        println(this.controle())
    }

    private fun controle(): String {
        val idade = Console.readInt("Digite sua idade: ")

        val convidado: Convidado = Convidado(idade, "", "")

        if (!convidadoBusiness.maiorIdade(convidado.idade)) {
            return "Negado. Menores de 18 não são permitidos"
        }


        convidado.tipo = Console.readString("Qual é o tipo de convite? ")

        if (!convidadoBusiness.tipoValido(convidado.tipo)) {
            return "Convite inválido"
        }

        convidado.codigo = Console.readString("Qual o código do convite? ")



        if (!convidadoBusiness.codigoValido(convidado)) {
            return "Convite inválido"
        }

        return "Bem vindo"
    }
}