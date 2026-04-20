package oop_117367_danielkurniag.week09

fun main() {
    val tradeHistory = listOf(
        TradeLog("Pair1", "Pos1", 20, 25.0, "OPEN"),
        TradeLog("Pair2", "Pos2", 30, -30.0, "OPEN"),
        TradeLog("Pair3", "Pos3", 40, -35.0, "CLOSED"),
        TradeLog("Pair4", "Pos4", 50, -40.0, "OPEN"),
        TradeLog("Pair5", "Pos5", 60, 45.0, "CLOSED"),
        TradeLog("Pair6", "Pos6", 70, 50.0, "CLOSED"),
    )

    val closedTrades = tradeHistory
        .filter { it.status == "CLOSED" }

    val winningTrades = closedTrades
        .filter { it.roe > 0 }

    val losingTrades = closedTrades
        .filter { it.roe <= 0 }

    val topPerformersString = winningTrades
        .sortedByDescending { it.roe }
        .map { "WIN [${it.pair} - ${it.position}]: +${it.roe}% ROE (Lev: ${it.leverage}x)" }

    val worstPerformerString = losingTrades
        .sortedBy { it.roe }
        .map {"LOSS [${it.pair} - ${it.position}]: ${it.roe}% ROE(Lev: ${it.leverage}x)" }

    val uniquePairs = tradeHistory
        .map { it.pair }.toSet()


}