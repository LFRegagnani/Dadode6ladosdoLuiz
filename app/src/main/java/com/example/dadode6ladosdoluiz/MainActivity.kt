package com.example.dadode6ladosdoluiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botao: Button = findViewById(R.id.botão1)
        botao.setOnClickListener { meuDado() }

    }


    private fun meuDado() {
        val meusLados = 6
        val rolaDado = Dado(meusLados)
        val resultado = rolaDado.rolar()
        val imagemDado: ImageView = findViewById(R.id.dadoImagem)

        when (resultado) {
            1 -> imagemDado.setImageResource(R.drawable.dice_1)
            2 -> imagemDado.setImageResource(R.drawable.dice_2)
            3 -> imagemDado.setImageResource(R.drawable.dice_3)
            4 -> imagemDado.setImageResource(R.drawable.dice_4)
            5 -> imagemDado.setImageResource(R.drawable.dice_5)
            6 -> imagemDado.setImageResource(R.drawable.dice_6)
        }

    }
}



class Dado(var lados: Int) {

    fun rolar(): Int {
        return (1..lados).random()
    }

}