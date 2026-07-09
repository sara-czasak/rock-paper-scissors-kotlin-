package com.example.rockpaperscissors

fun main() {
    var playerScore = 0
    var computerScore = 0
    var rounds = 0

    println("Best out of 3 wins!\n")

    while(rounds < 3) {
        var computerChoice = ""
        var playerChoice = ""

        println("Rock, Paper or Scissors?\nEnter your choice: ")
        playerChoice = readln()

        // Get random number
        val randomNum = (1..3).random()


        if (randomNum == 1) {
            computerChoice = "Rock"
        } else if (randomNum == 2) {
            computerChoice = "Paper"
        } else {
            computerChoice = "Scissors"
        }

        println("Player Choice: $playerChoice\nComputer Choice: $computerChoice")

        if (playerChoice == computerChoice) {
            println("It's a draw!")
        } else if ((playerChoice == "Rock" && computerChoice == "Scissors") || (playerChoice == "Paper" && computerChoice == "Rock") || playerChoice == "Scissors" && computerChoice == "Paper") {
            println("Player wins!")
            playerScore++
        } else {
            println("Computer wins!")
            computerScore++
        }
        rounds++
    }

    println("Player Score: $playerScore\nComputer Score: $computerScore")

    if(playerScore > computerScore) {
        println("Player WINS")
    } else if (computerScore > playerScore) {
        println("Computer WINS")
    } else {
        println("It's a draw!")
    }
}