package oop_117367_danielkurniag.week13

import java.io.File
import java.io.FileNotFoundException

data class TradeRecord(val id: Int, val symbol: String, val type: String, val margin: Double, val pnl: Double)

fun TradeRecord.toCsv(): String = "$id,$symbol,$type,$margin,$pnl"

fun fromCsvTrade(line: String): TradeRecord? {
    val parts = line.split(",")
    try {
        return TradeRecord(parts[0].toInt(), parts[1], parts[2], parts[3].toDouble(), parts[4].toDouble())
    } catch (e: NumberFormatException) {
        println("(LOG) data korup di baris $line")
        return null
    } catch (e: IndexOutOfBoundsException) {
        println("(LOG) data korup di baris $line")
        return null
    } catch (e: Exception) {
        println("(LOG) data korup di baris $line")
        return null
    }
}

fun saveTrades(trades: List<TradeRecord>, path: String) {
    File(path).printWriter().use { out ->
        trades.forEach {out.println(it.toCsv())}
    }
}

fun loadTrades(path: String): List<TradeRecord> {
    try {
        return File(path).readLines().mapNotNull { fromCsvTrade(it) }
    } catch (e: FileNotFoundException){
        println("(LOG) error: $e")
        return emptyList()
    }
}

fun main(){
    val trades = listOf(
        TradeRecord(1, "BTCUDST", "LONG", 100.0, 25.0),
        TradeRecord(2, "BTCUDST", "SHORT", 50.0, -25.0),
        TradeRecord(3, "ETHUSDT", "LONG", 150.0, 50.0)
    )

    saveTrades(trades, "crypto_trades.csv")

    File("crypto_trades.csv").appendText("CORRUPT_ID, DOGEUSDT, Hold, XX, YY\n")
}
