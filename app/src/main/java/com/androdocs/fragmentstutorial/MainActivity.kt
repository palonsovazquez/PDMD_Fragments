package com.androdocs.fragmentstutorial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
// variable para gestionar los fragnemtos
    private val fragmentManager = supportFragmentManager
    // objetos con los distintos fragments
    private val firstFragment = FirstFragment()
    private val secondFragment = SecondFragment()
    private val itemFragment = BlankFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /* Muestra el primer fragmento de forma inicial*/
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.myFragment, firstFragment)
        fragmentTransaction.commit()

    }

    fun btnOne(v:View){
// codigo para cargar el primer fragmento
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.myFragment, firstFragment)
        fragmentTransaction.commit()
    }

    fun btnTwo(v:View){
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.myFragment, secondFragment)
        fragmentTransaction.commit()
    }
    fun btnTree(v:View){
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.myFragment, itemFragment)
        fragmentTransaction.commit()
    }
}
