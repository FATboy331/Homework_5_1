package com.geektech.homework_5_1.view

import android.app.Activity
import android.widget.Toast

interface CounterView {

fun showNewCount(count : Int)
fun showToastIfTen(activity: Activity)
fun changeTextColor()
}