fun main(){
    //validação de idade
  println("Digite sua idade:")
    val idade = readLine()

    if(idade !=null && idade != ""){
        if(idade.toInt() < 18){
            println("negado, voce não possui idade minima")
            return
        }


    }
    //validação de convite
    println("Digite qual seu convite")
    var convite = readLine()

    if(convite != null && convite != ""){
        convite = convite.lowercase()
        if(convite != "comum" && convite != "premium" && convite != "luxo"){
            println("Convite invalido")
        }
    }
    //validação do codigo do convite
    println("Qual o codigo do seu convite?")
    var codConvite= readLine()

    if(codConvite != null && codConvite != ""){
        codConvite = codConvite.lowercase()
        if(codConvite.startsWith("xt") && convite == "comum" ){
            println("Bem vindo :>")
        }
        else if(codConvite.startsWith("xl") && (convite == "luxo" || convite == "premium")){
            println("Bem vindo :>")
        }else{
            println("Seu convite não é valido")
        }
    }




}
