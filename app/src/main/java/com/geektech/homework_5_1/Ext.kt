package com.geektech.homework_5_1

import android.app.Activity
import android.widget.Toast

fun Activity.createToast(msg : String){
    Toast.makeText(applicationContext, msg, Toast.LENGTH_SHORT).show()
}