package com.example.the_chance_week1.sudoku_checker

import kotlin.math.sqrt

fun main(){
println("test")
}



fun isValidateSudokuPuzzle(board:List<List<Char>>) :Boolean{
    for (row in board) {
        if (!isValidUnit(row)) return false
    }
    for (col in board.indices) {
        val column = board.map { it[col] }
        if (!isValidUnit(column)) return false
    }
    val subGridSize = sqrt(board.size.toDouble()).toInt()
    for (i in board.indices step subGridSize) {
        for (j in board.indices step subGridSize) {
            val subgrid = mutableListOf<Char>()
            for (x in i until i + subGridSize) {
                for (y in j until j + subGridSize) {
                    subgrid.add(board[x][y])
                }
            }
            if (!isValidUnit(subgrid)) return false
        }
    }
    return true
}

fun isValidUnit(unit: List<Char>): Boolean {
    val seen = mutableSetOf<Char>()
    for (num in unit) {
        if (num != '-' && num in seen) return false
        seen.add(num)
    }
    return true
}