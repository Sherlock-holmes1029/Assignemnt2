package com.example.rami_assignemnt2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        val inflater =menuInflater
        inflater.inflate(R.menu.mymenu,menu)
    return true


       // return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val addition=addition()
        val subtraction=subtraction()

        when(item.itemId){

            R.id.add-> supportFragmentManager.beginTransaction().apply {
                replace(R.id.frame,addition)
                    .commit()
            }
            R.id.sub-> supportFragmentManager.beginTransaction().apply {
                replace(R.id.frame,subtraction)
                    .commit()
            }

        }


        return super.onOptionsItemSelected(item)
    }
}