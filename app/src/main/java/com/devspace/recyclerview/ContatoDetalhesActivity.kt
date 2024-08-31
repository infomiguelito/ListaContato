package com.devspace.recyclerview

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ContatoDetalhesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contato_detalhes)
        val tvName = findViewById<TextView>(R.id.tv_name)
        val tvPhone = findViewById<TextView>(R.id.tv_phone)
        val img = findViewById<ImageView>(R.id.image)
        val tvCompartilhar = findViewById<TextView>(R.id.tv_compartilhar)


        val name  = intent.getStringExtra("nome")
        val phone  = intent.getStringExtra("phone")
        val icno  = intent.getIntExtra("icon",R.drawable.sample1)

        tvName.text = name
        tvPhone.text = phone
        img.setImageResource(icno)


        tvCompartilhar.setOnClickListener {
            val sendIntent: Intent = Intent().apply {
                action = Intent.ACTION_SEND
                putExtra(Intent.EXTRA_TEXT, "$name $phone")
                type = "text/plain"
            }

            val shareIntent = Intent.createChooser(sendIntent,null)
            startActivity(shareIntent)

        }

    }
}