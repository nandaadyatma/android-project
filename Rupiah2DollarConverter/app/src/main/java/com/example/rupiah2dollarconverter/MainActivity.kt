package com.example.rupiah2dollarconverter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.text.NumberFormat
import java.util.Locale

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var mode: Int = 1
        var ButtonDollartoRupiah = findViewById<Button>(R.id.btnDollarToRupiah)
        var ButtonRupiahtoDollar = findViewById<Button>(R.id.btnRupiahToDollar)
        var ButtonConvert = findViewById<Button>(R.id.btnConvert)
        var result: Double
        var TextViewResult = findViewById<TextView>(R.id.NominalResult)
        var currency = findViewById<TextView>(R.id.currency)

        ButtonDollartoRupiah.setOnClickListener{
            mode = 1
            currency.text = "$"
        }
        ButtonRupiahtoDollar.setOnClickListener{
            mode = 2
            currency.text = "Rp"
        }

        ButtonConvert.setOnClickListener{
            if (mode == 1 || mode == 2){
                when (mode) {
                    1 -> {
                        var EditTextNominal = findViewById<EditText>(R.id.edtNominalFrom)
                        val nominal = EditTextNominal.text.toString().toDoubleOrNull()
                        if (nominal !=  null){
                            result = nominal*15000
                            TextViewResult.text = "Rp " + NumberFormat.getNumberInstance(Locale.US).format(result)
                        }
                        else {
                            TextViewResult.text = "input invalid"
                        }
                    }
                    2 -> {
                        var EditTextNominal = findViewById<EditText>(R.id.edtNominalFrom)
                        val nominal = EditTextNominal.text.toString().toDoubleOrNull()
                        if (nominal !=  null){
                            result = nominal/15000
                            TextViewResult.text = "$ " + NumberFormat.getNumberInstance(Locale.US).format(result)
                        }
                        else {
                            TextViewResult.text = "input invalid"
                        }
                    }
                }
            }
        }

    }
}