private fun Int.resultado(): String{
    println("Você tirou $this")
    return when (this){
        in 0..6-> "Se deu mal, reprovou"
        in 7..8-> "Passou"
        in 9..10-> "Nerd"
        else-> "O professor ainda não corrigiu a prova"
    }
}

fun main(){
    val notas = (0..10).random()
    println(notas.resultado())
}