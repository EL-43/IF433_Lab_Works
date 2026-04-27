package oop_117367_danielkurniag.week10

fun main(){
    val coinRepo = WalletRepository<Coin>()

    coinRepo.add(Coin("BTC", 67000.0))
    coinRepo.add(Coin("ETH", 43000.0))
    coinRepo.add(Coin("USDT", 17000.0))

}