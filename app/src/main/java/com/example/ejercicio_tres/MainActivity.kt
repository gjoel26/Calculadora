package com.example.ejercicio_tres

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var tvResultado: TextView
    lateinit var edNum1: EditText
    lateinit var edNum2: EditText

    lateinit var rdSuma: RadioButton
    lateinit var rdResta: RadioButton
    lateinit var rdMultiplicacion: RadioButton
    lateinit var rdDivicion: RadioButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvResultado = findViewById(R.id.tvResultado)
        edNum1 = findViewById(R.id.edNum1)
        edNum2 = findViewById(R.id.edNum2)

        rdSuma = findViewById(R.id.rdSuma)
        rdResta = findViewById(R.id.rdResta)
        rdMultiplicacion = findViewById(R.id.rdMultiplicacion)
        rdDivicion = findViewById(R.id.rdDivicion)
    }

    fun accionClik(view: View) {

        val num1 = edNum1.text.toString().toInt()
        val num2 = edNum2.text.toString().toInt()

        var result = 0

        if (rdSuma.isChecked) {
            result = num1 + num2
        } else if (rdResta.isChecked) {
            result = num1 - num2
        } else if (rdDivicion.isChecked) {
            result = num1 / num2
        } else if (rdMultiplicacion.isChecked) {
            result = num1 * num2
        }

        tvResultado.text = "$result"

    }

}