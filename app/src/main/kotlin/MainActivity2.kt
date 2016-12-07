package com.kotlineffiecienttechniques

import android.support.v7.app.ActionBarActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main_activity2.*


public class MainActivity2 : ActionBarActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_activity2)
        maintextview.text = "Hello Static Import!"

        val book1 = Book("123456", 43.0f, 4, "Kotlin for you", "Book on Kotlin")
        book1.ISBN = "998";
        val book2 = Book2("12345", 45.0f, 5, "", "")
        book2.description = "desc";


        maintextview.setOnClickListener({ view -> Toast.makeText(this, "Showing Toast", Toast.LENGTH_SHORT).show(); })
    }

}
