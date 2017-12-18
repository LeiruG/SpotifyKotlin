package com.gelves.uriel.spotifykotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerview = findViewById<RecyclerView>(R.id.recyclerView1)
        recyclerview.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)
        val Songs = ArrayList<Music>()

        Songs.add(Music("Best Part(H.E.R.)", "Daniel Caesar", " • Freudian"))
        Songs.add(Music("Welcome to the Jungle", "Guns N' Roses", " • Appetite for Destruction"))
        Songs.add(Music("My Way", "Frank Sinatra", " • My Way"))
        Songs.add(Music("Tears in Heaven", "Eric Clapton", " • Rush"))
        Songs.add(Music("Basket Case", "Green Day", " • Dookie"))
        Songs.add(Music("Pink + Matter", "Frank Ocean", " • Channel Orange"))
        Songs.add(Music("Thinking About You", "Frank Ocean", " • Channel Orange"))

        var adapter = AdapterClass(Songs)

        recyclerview.adapter = adapter

    }
}
