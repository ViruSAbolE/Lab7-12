package com.hfad.attributes

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.TypedValue
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textField = findViewById<View>(R.id.EditText) as EditText
        val blackColorButton = findViewById<Button>(R.id.BlackText)
        val redColorButton = findViewById<Button>(R.id.RedText)
        val size8Btn = findViewById<Button>(R.id.Size8)
        val size24Btn = findViewById<Button>(R.id.Size24)
        val whiteBackgroundBtn = findViewById<Button>(R.id.WhiteBackground)
        val yellowBackgroundBtn = findViewById<Button>(R.id.YellowBackground)

        blackColorButton.setOnClickListener {
            textField.setTextColor(Color.BLACK)
        }
        redColorButton.setOnClickListener {
            textField.setTextColor(Color.RED)
        }
        size8Btn.setOnClickListener {
            textField.setTextSize(TypedValue.COMPLEX_UNIT_SP, 8F)
        }

        size24Btn.setOnClickListener {
            textField.setTextSize(TypedValue.COMPLEX_UNIT_SP, 24F)
        }

        whiteBackgroundBtn.setOnClickListener {
            textField.setBackgroundColor(Color.WHITE)
        }

        yellowBackgroundBtn.setOnClickListener {
            textField.setBackgroundColor(Color.YELLOW)
        }

    }
}