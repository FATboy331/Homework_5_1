package com.geektech.homework_5_1

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.content.ContextCompat
import com.geektech.homework_5_1.databinding.ActivityMainBinding
import com.geektech.homework_5_1.helper.Injector
import com.geektech.homework_5_1.presenter.Presenter
import com.geektech.homework_5_1.view.CounterView

class MainActivity : AppCompatActivity(), CounterView {
   private lateinit var binding: ActivityMainBinding
     private val presenter = Injector.getPresenter()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        presenter.attachView(this)
        initClickers()
        }


    private fun initClickers() {
        with(binding){
            incrementBtn.setOnClickListener{
                presenter.increment()
            }
        }
    }

    override fun showNewCount(count: Int) {
        binding.resultTv.text = count.toString()
    }

     override fun showToastIfTen() {
         Toast.makeText(applicationContext, "Поздравляю", Toast.LENGTH_SHORT).show()
        }

    override fun changeTextColor() {
        binding.resultTv.setTextColor(ContextCompat.getColor(this,R.color.green))
    }

}


