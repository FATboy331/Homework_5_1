package com.geektech.homework_5_1.presenter

import android.app.Activity
import android.widget.Toast
import com.geektech.homework_5_1.helper.Injector
import com.geektech.homework_5_1.model.CounterModel
import com.geektech.homework_5_1.view.CounterView

class Presenter {

    private val model = Injector.getModel()
    lateinit var view: CounterView
    lateinit var activity: Activity


    fun increment() {
        model.increment()
        view.showNewCount(model.count)
        if (model.isTen()){
            view.showToastIfTen(activity)
        }
        if(model.isFifTeen()){
            view.changeTextColor()
        }
    }


    fun attachActivity(activity: Activity){
        this.activity = activity
    }
    fun attachView(view: CounterView){
        this.view = view
    }



}