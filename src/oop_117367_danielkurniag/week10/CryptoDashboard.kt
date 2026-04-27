package oop_117367_danielkurniag.week10

fun main(){
    val coinRepo = WalletRepository<Coin>()

    coinRepo.add(Coin("BTC", 67000.0))
    coinRepo.add(Coin("ETH", 43000.0))
    coinRepo.add(Coin("USDT", 17000.0))

    val response = ApiResponse("200 OK", coinRepo.getAll())
    response.data.forEach {
        println(it)
    }

    val txRepo = WalletRepository<Transaction>()

    txRepo.add(Transaction("001", 43.0))
    txRepo.add(Transaction("002", 67.0))
    txRepo.add(Transaction("003", 69.0))
}