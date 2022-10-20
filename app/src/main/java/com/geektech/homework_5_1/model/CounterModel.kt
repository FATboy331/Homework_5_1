package com.geektech.homework_5_1.model

import android.widget.Toast


class CounterModel {
    var count = 0


    fun increment(){
        count++
    }

    fun decrement(){
        count--
    }

    fun  isTen() : Boolean{
       return count == 10
    }


    fun  isFifTeen() : Boolean{
        return count == 15
    }


}




