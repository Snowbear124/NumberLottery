package com.snowbear.numberlottery

import java.util.*
import kotlin.collections.HashMap

class GuessLottery() {
    var lotteryChiceMap = HashMap<Int, Int> () //HashMap<>內要填k,v的類別
    var chiceNumber = 0

    fun littleLottery(Int :Int) {
        var scanMap = 0

        while (scanMap <= (Int-1)) {
            var flag = 0
            var N = Random().nextInt(Int) + 1
            lotteryChiceMap.put(scanMap, N)

            if (scanMap != 0)   {
                for (i in 0..(scanMap-1)) {
                    if (N == lotteryChiceMap.get(i)) {
                        flag = 0
                        break
                    }
                    flag = 1
                }
                if (flag == 1) scanMap++
            }else scanMap++
        }
    }

    fun printMap(Int :Int) {
        for(i in 0..(Int-1)) {
            print("${lotteryChiceMap.get(i)}, ")
        }
    }
}

fun main() {
    val guessLottery = GuessLottery()
    var lotteryNumber = 6
    guessLottery.littleLottery(lotteryNumber)
    guessLottery.printMap(lotteryNumber)
}
