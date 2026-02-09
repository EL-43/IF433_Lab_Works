package oop_117367_danielkurniag.week02

import java.util.Scanner

fun attack(name: String, targetName: String) = "$name attacks $targetName!"

fun takeDamage(hp: Int, damage: Int) = hp - damage

fun isAlive(hp: Int)  = if (hp > 0) true else false

fun main(){
    val scanner = Scanner(System.`in`)
    var enemyHp = 100
    val enemyName = "Monster"

    println("Enter Hero Name: ")
    val name = scanner.nextLine()

    print("Enter Base Damage Stat: ")
    val baseDamage = scanner.nextInt()
    scanner.nextLine()

    val hero = Hero(name, baseDamage)

    println("An Enemy Appears!")
    while (isAlive(hero.hp) && enemyHp > 0){
        println("1. Attack, 2. Flee")
        val input = scanner.nextInt()
        scanner.nextLine()
        if (input == 1) {
            println("Fight!")
            attack(hero.name, enemyName)
            println("$enemyName takes $baseDamage damage.")
            enemyHp -= baseDamage
            if (enemyHp < 0) enemyHp = 0
            println("$enemyName has $enemyHp HP.")
        }
        else if (input == 2){
            println("Ran away.")
            break
        }
        println("$enemyName Attacks!")
        hero.hp = takeDamage(hero.hp, (10 .. 20).random())
        if (hero.hp < 0) hero.hp = 0
        println("${hero.name} has ${hero.hp} HP remaining")
    }
    println("$enemyName has $enemyHp HP, ${hero.name} has ${hero.hp} HP")
    if (hero.hp > enemyHp) {
        print("${hero.name} wins!")
    } else if (hero.hp < enemyHp){
        print("$enemyName wins!")
    } else
        print("Its a Draw!")
}