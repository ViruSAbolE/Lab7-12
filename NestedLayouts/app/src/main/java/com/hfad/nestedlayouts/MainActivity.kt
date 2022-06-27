package com.hfad.nestedlayouts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val horizText1 = findViewById<View>(R.id.textView1) as TextView
        val vertText1 = findViewById<View>(R.id.textView2) as TextView
        val constrText1 = findViewById<View>(R.id.textView3) as TextView
        val horizText2 = findViewById<View>(R.id.textView4) as TextView
        val vertText2 = findViewById<View>(R.id.textView5) as TextView
        val constrText2 = findViewById<View>(R.id.textView6) as TextView
        val horizText3 = findViewById<View>(R.id.textView7) as TextView
        val vertText3 = findViewById<View>(R.id.textView8) as TextView
        val constrText3 = findViewById<View>(R.id.textView9) as TextView


        val button = findViewById<Button>(R.id.button)
        var count = 1
        button.setOnClickListener {

            count += 1
            when (count % 3) {
                0 -> {

                    horizText1.text = ""
                    vertText1.text = ""
                    constrText1.text = count.toString()
                    horizText2.text = ""
                    vertText2.text = ""
                    constrText2.text = count.toString()
                    horizText3.text = ""
                    vertText3.text = count.toString()
                    constrText3.text = ""
                }
                1 -> {
                    horizText1.text = count.toString()
                    vertText1.text = ""
                    constrText1.text = ""
                    horizText2.text = count.toString()
                    vertText2.text = ""
                    constrText2.text = ""
                    horizText3.text = count.toString()
                    vertText3.text = ""
                    constrText3.text = ""
                }
                2 -> {
                    horizText1.text = ""
                    vertText1.text = count.toString()
                    constrText1.text = ""
                    horizText2.text = ""
                    vertText2.text = count.toString()
                    constrText2.text = ""
                    horizText3.text = ""
                    vertText3.text = ""
                    constrText3.text = count.toString()

                }
            }
        }
    }
}