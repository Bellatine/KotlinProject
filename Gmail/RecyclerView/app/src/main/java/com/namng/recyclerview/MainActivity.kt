package com.namng.recyclerview

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity: AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val mails = arrayOf(
            "namng@is.viettel.com",
            "Edurila.com",
            "Chris Abad",
            "Tuto.com",
            "support",
            "Matt from lonic"
        )
        val contents = arrayOf(
            "Are you looking to Learn Web Designin....",
            "Let us know your thoughts! No Images...",
            "Photoshop, SEO, Blender, CSS, WordPr...",
            "SAS OVH-http://www.ovh.com 2 rue K...",
            "Announcing the all-new Creator, buil...",
            "Welcome to my android application. H..."
        )
        val subjects = arrayOf(
            "\$19 Only (First 10 spots) - Bestselling...",
            "Help make Campaign Monitor b",
            "8h de formation gratuite et les nouvea...",
            "Société Ovh: suivi de vos services - hp...",
            "The New lonic Creator Is Here!",
            "New application!"
        )
        val items = arrayListOf<ItemModel>()
        repeat(10) {
            val index = (it + 1) % 6
            items.add(
                ItemModel(
                    mails[index],
                    resources.getIdentifier("icon$index", "drawable", packageName),
                    "5:$index$index AM",
                    subjects[index],
                    contents[index]
                )
            )
        }

        val adapter = ItemAdapter(items, object : ItemAdapter.ItemClickListener {
            override fun ItemClick(position: Int) {
                TODO("Not yet implemented")

            }
        })

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter

    }
}