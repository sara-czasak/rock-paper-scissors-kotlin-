package com.example.rockpaperscissors

fun main() {

    var play = true

    while(play) {
        var playerScore = 0
        var computerScore = 0
        var rounds = 0
        println("Best out of 3 wins!\n")
        while(rounds < 3) {
            var computerChoice = ""
            var playerChoice = ""

            var choiceMade = false

            while(!choiceMade) {
                println("Rock, Paper or Scissors?\nEnter your choice: ")
                playerChoice = readln()
                if(playerChoice == "Rock" || playerChoice == "Paper" || playerChoice == "Scissors") {
                    choiceMade = true
                } else {
                    println("Invalid choice, please try again")
                }
            }
            // Get random number
            val randomNum = (1..3).random()

            var winner = ""

            when(randomNum) {
                1 -> {
                    computerChoice = "Rock"
                }
                2 -> {
                    computerChoice = "Paper"
                }
                3 -> {
                    computerChoice = "Scissors"
                }
            }

            println("Player Choice: $playerChoice\nComputer Choice: $computerChoice")

            winner = when {
                playerChoice == computerChoice -> "Tie"
                playerChoice == "Rock" && computerChoice == "Scissors" -> "Player"
                playerChoice == "Paper" && computerChoice == "Rock" -> "Player"
                playerChoice == "Scissors" && computerChoice == "Paper" -> "Player"
                else -> "Computer"
            }

            if(winner == "Player") {
                playerScore++
            } else if(winner == "Computer") {
                computerScore++
            }

            rounds++
        }

        println("Player Score: $playerScore\nComputer Score: $computerScore")

        var finalWinner = ""

        when {
            playerScore > computerScore -> println("Player Wins!")
            computerScore > playerScore -> println("Computer Wins!")
            else -> println("It's a draw")
        }

        println("Do you want to play again? y/n")
        var input = readln()
        play = when {
            input == "y" -> true
            else -> false
        }
    }
}