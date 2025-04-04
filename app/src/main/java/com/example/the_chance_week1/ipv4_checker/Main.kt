package com.example.the_chance_week1.ipv4_checker

fun main(){
    println("test check check")
}



fun isValidIPv4(ip: String): Boolean {
    val segments = ip.split(".")
    if (segments.size != 4) return false
    for (segment in segments) {
        val num = segment.toIntOrNull() ?: return false
        if (num !in 0..255) return false
        if (segment.length > 1 && segment.startsWith("0")) return false
    }
    return true
}