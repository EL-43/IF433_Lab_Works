package oop_117367_danielkurniag.week07

fun processEvent(event: BattleState){
    when(event){
        is GameOver -> {
            println("Game over! Reason: ${event.reason}. Respawning...")
        }
        is LootDropped -> {
            println("Obtained ${event.item.name}, a ${event.item.rarity} weapon dealing ${event.item.damage} damage.")
        }
        is MonsterEncounter -> {
            println("${event.monsterName} attacks!")
        }
        is SafeZone -> {
            println("Entered Safe Zone.")
        }
    }
}