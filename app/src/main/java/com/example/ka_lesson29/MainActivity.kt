package com.example.ka_lesson29

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.ka_lesson29.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.bNav.selectedItemId = R.id.item3    //2. Если мы хотим, чтобы при открытии активити по-умолчанию был указан какой-то элемент из списка
        //1. Чтобы добраться к нижнему меню, пишем:(можно было сделать в отдельной функции)
        binding.bNav.setOnNavigationItemSelectedListener {
            when(it.itemId) {   //когда id нажатого элемента:
                R.id.item1 -> {
                    Toast.makeText(this, "Item 1", Toast.LENGTH_SHORT).show()
                }
                R.id.item2 -> {
                    Toast.makeText(this, "Item 2", Toast.LENGTH_SHORT).show()
                }
                R.id.item3 -> {
                    Toast.makeText(this, "Item 3", Toast.LENGTH_SHORT).show()
                }
                R.id.item4 -> {
                    Toast.makeText(this, "Item 4", Toast.LENGTH_SHORT).show()
                }
            }
            //функция должно возвращать boolean
            true
        }
    }


}