package com.example.assantos.estudy

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.widget.LinearLayout
import com.example.assantos.estudy.R.layout.activity_main
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(activity_main)

        val livros = ArrayList<Livro>()

        for (i in 1..50){
            livros.add(Livro("Livro "+ i,"Autor "+i,i*100))
        }

        reclycleView.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL,false)
        reclycleView.adapter =  AdapterCustomizado(livros)
    }

}
