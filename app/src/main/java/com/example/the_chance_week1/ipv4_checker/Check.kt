package com.example.the_chance_week1.ipv4_checker

fun main(){
   test(
       description = "when have ip with four segments separated by . and in range 0:255,it should return true",
       result = isValidIPv4("192.168.1.1"),
         correctResult = true
   )
    test(
        description = "when have ip with four segments separate by . and equal 0,it should return true",
        result = isValidIPv4("0.0.0.0"),
        correctResult = true
    )
    test(
        description = "when have ip with four segments separate by . and equal 255,it should return true",
        result = isValidIPv4("255.255.255.255"),
        correctResult = true
    )
    test(
        description = "when have ip with three segments separated by . and in range 0:255,it should return false",
        result = isValidIPv4("192.168.1"),
        correctResult = false
    )
    test(
        description = "when have ip with two segments separated by . and in range 0:255,it should return false",
        result = isValidIPv4("192.168"),
        correctResult = false
    )
    test(
        description = "when have ip with one segment separated by . and in range 0:255,it should return false",
        result = isValidIPv4("192"),
        correctResult = false
    )
    test(
        description = "when have ip with five segments separated by . and in range 0:255,it should return false",
        result = isValidIPv4("192.168.1.1.1"),
        correctResult = false
    )
    test(
        description = "when have ip with Letter in segment, it should return false",
        result = isValidIPv4("192.168.a.1"),
        correctResult = false
    )
    test(
        description = "when have ip with space in segment, it should return false",
        result = isValidIPv4("192. 168.1.1"),
        correctResult = false
    )
    test(
        description = "when have ip with special character in segment, it should return false",
        result = isValidIPv4("192.168.#.1"),
        correctResult = false
    )
    test(
        description = "when have ip with leading zero in segment,it should return false",
        result = isValidIPv4("192.168.01.1"),
        correctResult = false
    )
    test(
        description = "when have ip with leading zeros in segment,it should return false",
        result = isValidIPv4("192.168.001.1"),
        correctResult = false
    )
    test(
        description = "when have ip with segment higher than 255,it should return false",
        result = isValidIPv4("192.168.256.1"),
        correctResult = false
    )
    test(
        description = "when have ip with negative number in segment,it should return false",
        result = isValidIPv4("192.168.-1.1"),
        correctResult = false
    )
    test(
        description = "when have ip with empty string,it should return false",
        result = isValidIPv4(""),
        correctResult = false
    )
}




private fun test(description:String, result:Boolean, correctResult:Boolean){
    if(result==correctResult){
        println("Success:$description")
    }else{
        println("Failure:$description")
    }
}