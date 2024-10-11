package com.example.list1

import java.util.Scanner

fun main() {
    println(" 4. a): ")
    for (i in 1 .. 13 step 3)
        print(" $i ")
    println()
    println(" 4. b): ")
    var number = 32
    for(i in 1..5) {
        print("$number ")
        number /= 2
    }
    println()
    println(" 5. ")
    for(i in 1..5){
        var a = 0;
        for(j in 1..i) {
        print(++a)
            print(" ")
        }
        println()
        }
    println(" 6. ")
    val sc = Scanner(System.`in`)
    println("What's the number?")
    var factorial = sc.nextLine().trim().toInt();
    var result = 1;
    while(true) {
        if (factorial >= 0) {
            for (i in 1..factorial) {
                result *= i;
            }
        break;
        }
        else println("The value can't be negative! Choose different number: ")
        factorial = sc.nextLine().trim().toInt();
    }
    println("Factorial of $factorial is equal $result")
    println()
    println(" 7. a) ")
    var a = 10;
    while(a!=21)
        println(a++)
    println()
    println(" 7. b) ")
    a = 10;
    while(a!=41) {
        if (a % 2 == 1)
            println(a++)
    a++;
    }
    println()
    println(" 8. While loop")
    var CapLet = 65
    var SmaLet = 97
    while (CapLet != (65+26)) {
        println(CapLet.toChar() + " " + SmaLet.toChar())
        CapLet++
        SmaLet++
    }
    println()
    println(" 8. Do - While loop")
    CapLet = 65
    SmaLet = 97
    do {
        println(CapLet.toChar() + " " + SmaLet.toChar())
        CapLet++
        SmaLet++
    } while(CapLet != (65+26))
    println()
    println(" 9. Classic if")
    println("How many points the student receive? (0->50)")
    while(true) {
        var points = sc.nextLine().trim().toFloat()
        if ((points <= 0) or (points >= 50)) {
            println("Choose a value from 0 to 50!")
        } else {
            if (points * 2 >= 91)
                println("5.0")
            else if (points * 2 >= 81)
                println("4.5")
            else if (points * 2 >= 71)
                println("4.0")
            else if (points * 2 >= 61)
                println("3.5")
            else if (points * 2 >= 51)
                println("3.0")
            else println("2.0")
        break
        }
    }
    println()
    println(" 9. When")
    println("How many points the student receive? (0->50)")
    while(true) {
        var points = sc.nextLine().trim().toFloat()
        if ((points <= 0) or (points >= 50)) {
            println("Choose a value from 0 to 50!")
        } else {
            when(points*2){
                in 91F..100F -> println("5.0")
                in 81F..91F -> println("4.5")
                in 71F..80F -> println("4.0")
                in 61F..70F -> println("3.5")
                in 51F..60F -> println("3.0")
                else -> println("2.0")
            }
            break
        }
    }
}