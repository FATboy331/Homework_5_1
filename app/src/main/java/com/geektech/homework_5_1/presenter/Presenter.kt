package com.geektech.homework_5_1.presenter

import android.app.Activity
import android.widget.Toast
import com.geektech.homework_5_1.helper.Injector
import com.geektech.homework_5_1.model.CounterModel
import com.geektech.homework_5_1.view.CounterView

class Presenter {

    private val model = Injector.getModel()
    lateinit var view: CounterView



    fun increment() {
        model.increment()
        view.showNewCount(model.count)
        if (model.isTen()){
            view.showToastIfTen()
        }
        if(model.isFifTeen()){
            view.changeTextColor()
        }
    }


    fun attachView(view: CounterView){
        this.view = view
    }



}