package com.example.the_chance_week1.sudoku_checker

fun main() {
    test(
        description = "when have sudoku with no duplicate in row, column or subgrid should return true",
        result = isValidateSudokuPuzzle(
            listOf(
                listOf('5', '3', '-', '-', '7', '-', '-', '-', '-'),
                listOf('6', '-', '-', '1', '9', '5', '-', '-', '-'),
                listOf('-', '9', '8', '-', '-', '-', '-', '6', '-'),
                listOf('8', '-', '-', '-', '6', '-', '-', '-', '3'),
                listOf('4', '-', '-', '8', '-', '3', '-', '-', '1'),
                listOf('7', '-', '-', '-', '2', '-', '-', '-', '6'),
                listOf('-', '6', '-', '-', '-', '-', '2', '8', '-'),
                listOf('-', '-', '-', '4', '1', '9', '-', '-', '5'),
                listOf('-', '-', '-', '-', '8', '-', '-', '7', '9')
            )
        ), correctResult = true
    )
    test(
        description = "when have sudoku with duplicate '3' in first row should return false",
        result = isValidateSudokuPuzzle(
            listOf(
                listOf('5', '3', '3', '-', '7', '-', '-', '-', '-'),
                listOf('6', '-', '-', '1', '9', '5', '-', '-', '-'),
                listOf('-', '9', '8', '-', '-', '-', '-', '6', '-'),
                listOf('8', '-', '-', '-', '6', '-', '-', '-', '3'),
                listOf('4', '-', '-', '8', '-', '3', '-', '-', '1'),
                listOf('7', '-', '-', '-', '2', '-', '-', '-', '6'),
                listOf('-', '6', '-', '-', '-', '-', '2', '8', '-'),
                listOf('-', '-', '-', '4', '1', '9', '-', '-', '5'),
                listOf('-', '-', '-', '-', '8', '-', '-', '7', '9')
            )
        ), correctResult = false
    )
    test(
        description = "when have sudoku with duplicate '5' in first column should return false",
        result = isValidateSudokuPuzzle(
            listOf(
                listOf('5', '3', '-', '-', '7', '-', '-', '-', '-'),
                listOf('6', '-', '-', '1', '9', '5', '-', '-', '-'),
                listOf('-', '9', '8', '-', '-', '-', '-', '6', '-'),
                listOf('8', '-', '-', '-', '6', '-', '-', '-', '3'),
                listOf('4', '-', '-', '8', '-', '3', '-', '-', '1'),
                listOf('7', '-', '-', '-', '2', '-', '-', '-', '6'),
                listOf('-', '6', '-', '-', '-', '-', '2', '8', '-'),
                listOf('-', '-', '-', '4', '1', '9', '-', '-', '5'),
                listOf('5', '-', '-', '-', '8', '-', '-', '7', '9')
            )
        ), correctResult = false
    )
    test(
        description = "when have sudoku with duplicate in 3x3 subgrid should return false",
        result = isValidateSudokuPuzzle(
            listOf(
                listOf('5', '3', '-', '-', '7', '-', '-', '-', '-'),
                listOf('6', '-', '-', '1', '9', '5', '-', '-', '-'),
                listOf('-', '9', '8', '-', '-', '-', '-', '6', '-'),
                listOf('8', '-', '-', '-', '6', '-', '-', '-', '3'),
                listOf('4', '-', '-', '8', '-', '3', '-', '-', '1'),
                listOf('7', '-', '-', '-', '5', '2', '-', '-', '6'),
                listOf('-', '6', '-', '-', '-', '-', '2', '8', '-'),
                listOf('-', '-', '-', '4', '1', '9', '-', '5', '-'),
                listOf('-', '-', '-', '-', '8', '-', '-', '7', '5')
            )
        ), correctResult = false
    )
    test(
        description = "when have dynamic sudoku with 4x4 grid and no duplicate in 2x2 subgrid should return true",
        result = isValidateSudokuPuzzle(
            listOf(
                listOf('1', '2', '-', '3'),
                listOf('3', '4', '1', '2'),
                listOf('2', '1', '4', '-'),
                listOf('4', '3', '2', '1')
            )
        ), correctResult = true
    )
}


private fun test(description: String, result: Boolean, correctResult: Boolean) {
    if (result == correctResult) {
        println("Success:$description")
    } else {
        println("Failure:$description")
    }
}