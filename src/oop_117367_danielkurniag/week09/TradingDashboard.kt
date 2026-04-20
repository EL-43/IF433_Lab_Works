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
