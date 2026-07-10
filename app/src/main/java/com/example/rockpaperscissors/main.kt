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
                if(playerChoice.lowercase() == "rock" || playerChoice.lowercase() == "paper" || playerChoice.lowercase() == "scissors") {
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

            println("Player Choice: ${playerChoice.lowercase()}\nComputer Choice: ${computerChoice.lowercase()}")

            winner = when {
                playerChoice.lowercase() == computerChoice.lowercase() -> "Tie"
                playerChoice.lowercase() == "rock" && computerChoice.lowercase() == "scissors" -> "Player"
                playerChoice.lowercase() == "paper" && computerChoice.lowercase() == "rock" -> "Player"
                playerChoice.lowercase() == "scissors" && computerChoice.lowercase() == "paper" -> "Player"
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