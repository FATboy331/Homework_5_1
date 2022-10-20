package com.geektech.homework_5_1.helper

import com.geektech.homework_5_1.model.CounterModel
import com.geektech.homework_5_1.presenter.Presenter

class Injector {

    companion object {
        fun getModel(): CounterModel {
            return CounterModel()
        }

        fun getPresenter(): Presenter {
            return Presenter()
        }
    }




}