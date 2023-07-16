class Portaria {

    private val console: Console = Console()

    fun controle(){
        val idade = console.readInt("Digite sua idade")

        if (idade < 18) {
            println("Negado. Menores de 18 não são permitidos")
            return
        }
    }
}