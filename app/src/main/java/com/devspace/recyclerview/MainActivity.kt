package com.devspace.recyclerview

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val rvList = findViewById<RecyclerView>(R.id.rv_list)
        val adapter = Contato_Adapter()

        rvList.adapter=adapter
        rvList.layoutManager = LinearLayoutManager(this)
        adapter.submitList(classContato)

    }
}

val classContato = listOf(
    class_contato(
        name = "Miguel",
        phone = "(55) 47 98823-2445",
        R.drawable.sample8

    ),
    class_contato(
        name = "Stheffany",
        phone = "(55) 47 98898-2385",
        R.drawable.sample3
    ),
    class_contato(
        name = "João",
        phone = "(55) 47 95663-1015",
        R.drawable.sample9

    ),
    class_contato(
        name = "Kely",
        phone = "(55) 47 98723-2202",
        R.drawable.sample1

    ),  class_contato(
        name = "Fernando",
        phone = "(55) 47 98343-6756",
        R.drawable.sample2

    ),  class_contato(
        name = "Yasmim",
        phone = "(55) 47 97843-2009",
        R.drawable.sample4

    ),  class_contato(
        name = "Lara",
        phone = "(55) 47 98845-2245",
        R.drawable.sample5

    ),  class_contato(
        name = "Feranda",
        phone = "(55) 47 98829-3035",
        R.drawable.sample6

    ),  class_contato(
        name = "Melissa",
        phone = "(55) 47 98867-3405",
        R.drawable.sample7

    ),  class_contato(
        name = "Ótavio",
        phone = "(55) 47 98803-1145",
        R.drawable.sample10

    ),  class_contato(
        name = "Larissa",
        phone = "(55) 47 98800-5655",
        R.drawable.sample11

    ),
    class_contato(
        name = "Rodrigo",
        phone = "(55) 47 67843-3445",
        R.drawable.sample12

    ),  class_contato(
        name = "Claudia",
        phone = "(55) 47 08086-1099",
        R.drawable.sample13

    ),  class_contato(
        name = "Beatriz",
        phone = "(55) 47 98845-2445",
        R.drawable.sample15

    ),  class_contato(
        name = "Enzo",
        phone = "(55) 47 98812-5645",
        R.drawable.sample14

    ),  class_contato(
        name = "Clara",
        phone = "(55) 47 98805-2390",
        R.drawable.sample16

    )


)