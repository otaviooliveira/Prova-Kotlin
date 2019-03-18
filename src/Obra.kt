class Obra (nome: String){

    var insumosUtilizados = arrayListOf<Insumos>()

    fun quantidadeInsumos(quantidade: Insumos){
        insumosUtilizados.add(quantidade)
    }

    var maoDeObraUtilizada = arrayListOf<MaoDeObra>()

    fun quantidadeHorasTrabalhadas(horasTrabalhadas: MaoDeObra){
        maoDeObraUtilizada.add(horasTrabalhadas)
    }

    var equipamentosUtilizado = arrayListOf<Equipamentos>()

    fun horasDeEquipamentosUtilizado(horas: Equipamentos){
        equipamentosUtilizado.add(horas)

    }

    fun quantidadeConsumidaDeInsumos(): Double{
        var total = 0.0
        for(i in insumosUtilizados){
            val areia = insumosUtilizados[+1]
            val pedra = insumosUtilizados[+1]
            val cimento = insumosUtilizados[+1]
            val tijolo = insumosUtilizados[+1]
            total += areia.Insuumo()

        }
        return total
    }

    fun quantidadeUtilizadaDeMaoDeObra(): Double{
        var total = 0.0
        for(i in maoDeObraUtilizada){
            val engenheiro = maoDeObraUtilizada[+1]
            val pedreiro = maoDeObraUtilizada[+1]
            val servente = maoDeObraUtilizada[+1]
            total += engenheiro.Trabalhadores()
            total += pedreiro.Trabalhadores()
            total += servente.Trabalhadores()
        }
        return total
    }

    fun horasTrabalhadasDeEquipamentos(): Double{
        var total = 0.0
        for(i in equipamentosUtilizado){
            val trator = equipamentosUtilizado[+1]
            val escavadeira = equipamentosUtilizado[+1]
            val betoneira = equipamentosUtilizado[+1]
            
            total += escavadeira.Maquinario()
            total += trator.Maquinario()
            total += betoneira.Maquinario()
            

        }
        return total
    }

}

private operator fun Double.plusAssign(insuumo: Unit) {

}
