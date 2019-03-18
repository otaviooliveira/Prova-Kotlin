fun main(args: Array<String>) {

    val horaEscavadeira = Equipamentos(
        "escavadeira",
        240.0 * 80
    )
    val horaTrator = Equipamentos(
        "trator",
        180.0 * 70
    )
    val horaBetoneira = Equipamentos(
        "betoneira",
        200.0 * 90
    )
    val horaEngenheiro = MaoDeObra(
        "Engenheiro",
        120.0 * 300
    )
    val horaPedreiro = MaoDeObra(
        "Pedreiro",
        100.0 * 300
    )
    val horaServente = MaoDeObra(
        "Servente",
        80.0 * 300
    )
    val consumoAreia = Insumos(
        "areia",
        5.0 * 300
    )
    val consumoPedra = Insumos(
        "pedra",
        8.0 * 200
    )
    val consumoTijolo = Insumos(
        "tijolo",
        0.25 * 5000
    )
    val consumoCimento = Insumos(
        "Cimento",
        12.0 * 150
    )
    val feob = Obra("Feob")
    feob.quantidadeHorasTrabalhadas(horaEngenheiro)
    feob.quantidadeHorasTrabalhadas(horaPedreiro)
    feob.quantidadeHorasTrabalhadas(horaServente)
    feob.horasDeEquipamentosUtilizado(horaEscavadeira)
    feob.horasDeEquipamentosUtilizado(horaBetoneira)
    feob.horasDeEquipamentosUtilizado(horaTrator)
    feob.quantidadeInsumos(consumoAreia)
    feob.quantidadeInsumos(consumoCimento)
    feob.quantidadeInsumos(consumoPedra)
    feob.quantidadeInsumos(consumoTijolo)

    println("Total: ${feob.quantidadeUtilizadaDeMaoDeObra()}")
    println("Total: ${feob.horasTrabalhadasDeEquipamentos()}")
    println("Total: ${feob.quantidadeConsumidaDeInsumos()}")

}