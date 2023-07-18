package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var Hasil: Double
        val BtnPlus = findViewById<Button>(R.id.btnPlus)
        val BtnMinus = findViewById<Button>(R.id.btnMinus)
        val BtnDivide = findViewById<Button>(R.id.btnDivide)
        val BtnTimes = findViewById<Button>(R.id.btnTimes)
        var TvHasil = findViewById<TextView>(R.id.tvHasil)



        BtnPlus.setOnClickListener{
            val edt1 = findViewById<EditText>(R.id.edtBilangan1)
            val edt2 = findViewById<EditText>(R.id.edtBilangan2)

            val bilangan1 = edt1.text.toString().toDoubleOrNull()
            val bilangan2 = edt2.text.toString().toDoubleOrNull()


            if (bilangan1 != null && bilangan2 != null){
                Hasil = bilangan1 + bilangan2
                TvHasil.text = "$Hasil"
            }
            else{
                TvHasil.text = "Input tidak valid"
            }
        }

        BtnMinus.setOnClickListener{
            val edt1 = findViewById<EditText>(R.id.edtBilangan1)
            val edt2 = findViewById<EditText>(R.id.edtBilangan2)

            val bilangan1 = edt1.text.toString().toDoubleOrNull()
            val bilangan2 = edt2.text.toString().toDoubleOrNull()


            if (bilangan1 != null && bilangan2 != null){
                Hasil = bilangan1 - bilangan2
                TvHasil.text = "$Hasil"
            }
            else{
                TvHasil.text = "Input tidak valid"
            }
        }

        BtnDivide.setOnClickListener{
            val edt1 = findViewById<EditText>(R.id.edtBilangan1)
            val edt2 = findViewById<EditText>(R.id.edtBilangan2)

            val bilangan1 = edt1.text.toString().toDoubleOrNull()
            val bilangan2 = edt2.text.toString().toDoubleOrNull()


            if (bilangan1 != null && bilangan2 != null && bilangan2 != 0.0){
                Hasil = bilangan1 / bilangan2
                TvHasil.text = "$Hasil"
            }
            else{
                TvHasil.text = "Input tidak valid"
            }
        }

        BtnTimes.setOnClickListener{
            val edt1 = findViewById<EditText>(R.id.edtBilangan1)
            val edt2 = findViewById<EditText>(R.id.edtBilangan2)

            val bilangan1 = edt1.text.toString().toDoubleOrNull()
            val bilangan2 = edt2.text.toString().toDoubleOrNull()


            if (bilangan1 != null && bilangan2 != null){
                Hasil = bilangan1 * bilangan2
                TvHasil.text = "$Hasil"
            }
            else{
                TvHasil.text = "Input tidak valid"
            }
        }
    }
}