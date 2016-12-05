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

        val book2 = Book2("12345", 45.0f, 5, "", "")
        book2.description = "desc";

        maintextview.setOnClickListener({ view -> Toast.makeText(this, "Showing Toast", Toast.LENGTH_SHORT).show(); })
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_activity2, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        val id = item!!.getItemId()

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true
        }

        return super.onOptionsItemSelected(item)
    }
}
