package com.Rakesh.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlin.properties.Delegates
import android.widget.EditText
import android.widget.Toast
import android.view.View


class MainActivity : AppCompatActivity() {

    lateinit var name:String
    private var edittext1: EditText? = null
    private  var edittext2:EditText? = null
    private var buttonSum: Button? = null


    //first method to call
    //initilize our callses or varialble here
    //when your activity or screen gets created
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        name = "test"
        addListenerOnButton()

    }

    fun addListenerOnButton() {
        edittext1 = findViewById<EditText>(R.id.editText1)
        edittext2 = findViewById<EditText>(R.id.editText2)
        buttonSum = findViewById<Button>(R.id.button)
        buttonSum?.setOnClickListener {
            val value1 = edittext1?.text.toString()
            val value2 = edittext2?.text.toString()
            val a = value1.toInt()
            val b = value2.toInt()
            val sum = a + b
            Toast.makeText(applicationContext, sum.toString(), Toast.LENGTH_LONG).show()
        }
    }


    //cmd + o
    //when screen becomes visible to user
    override fun onStart() {
        super.onStart()
    }

    //when you screen will get interactive
    //when we get focus control
    override fun onResume() {
        super.onResume()
    }


    //when we loose control
    override fun onPause() {
        super.onPause()
    }

    //when screen is not visible to user
    override fun onStop() {
        super.onStop()
    }


    //this will release all your garbage
    override fun onDestroy() {
        super.onDestroy()
    }
}