package com.example.kalkulatorsederhana

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        operasiTambah()
        operasiKurang()
        operasiBagi()
        operasiKali()

        btnClear.setOnClickListener {
            text_result.text = ""
            input_value1.text = null
            input_value2.text = null
        }
    }

    fun operasiTambah () {
        btnPlus.setOnClickListener {
            val inputSatu = input_value1.text.toString()
            val inputDua = input_value2.text.toString()

            if (inputSatu == "" || inputDua == "") {
                Toast.makeText(this@MainActivity, "Inputan belum diisi", Toast.LENGTH_SHORT).show()
            } else {

                val hasilSatu = inputSatu.toDouble()
                val hasilDua = inputDua.toDouble()

                val tambah = hasilSatu + hasilDua
                text_result.text = "$tambah" //???
            }
        }
    }

    fun operasiKurang () {
        btnMin.setOnClickListener {
            val inputSatu = input_value1.text.toString()
            val inputDua = input_value2.text.toString()

            if (inputSatu == "" || inputDua == "") {
                Toast.makeText(this@MainActivity, "Inputan belum diisi", Toast.LENGTH_SHORT).show()
            } else {

                val hasilSatu = inputSatu.toDouble()
                val hasilDua = inputDua.toDouble()

                val kurang = hasilSatu - hasilDua
                text_result.text = "$kurang" //???
            }
        }
    }

    fun operasiBagi () {
        btnDiv.setOnClickListener {
            val inputSatu = input_value1.text.toString()
            val inputDua = input_value2.text.toString()

            if (inputSatu == "" || inputDua == "") {
                Toast.makeText(this@MainActivity, "Inputan belum diisi", Toast.LENGTH_SHORT).show()
            } else {

                val hasilSatu = inputSatu.toDouble()
                val hasilDua = inputDua.toDouble()

                val bagi = hasilSatu / hasilDua
                text_result.text = "$bagi" //???
            }
        }
    }
    fun operasiKali () {
        btnMulti.setOnClickListener {
            val inputSatu = input_value1.text.toString()
            val inputDua = input_value2.text.toString()

            if (inputSatu == "" || inputDua == "") {
                Toast.makeText(this@MainActivity, "Inputan belum diisi", Toast.LENGTH_SHORT).show()
            } else {

                val hasilSatu = inputSatu.toDouble()
                val hasilDua = inputDua.toDouble()

                val kali = hasilSatu * hasilDua
                text_result.text = "$kali" //???
            }
        }
    }
}