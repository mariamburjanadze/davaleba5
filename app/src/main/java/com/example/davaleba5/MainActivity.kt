package com.example.davaleba5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {



    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        recyclerView = findViewById(R.id.recycle)

        val webList = ArrayList<photos>()

        webList.add(photos("https://i.pinimg.com/originals/d8/43/e7/d843e762bbf040f0073f36d98d217da1.jpg"))
        webList.add(photos("https://static.wikia.nocookie.net/barbie-movies/images/a/a4/Princess_Graciella.jpg/revision/latest/scale-to-width-down/627?cb=20130816030035"))
        webList.add(photos("https://i.pinimg.com/originals/c9/fa/9e/c9fa9e1eb3430c8ab26b87e1475dcb3f.jpg"))
        webList.add(photos("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTupXbfNzWKQLOdI-56jk3N4Yu3OyCp6xfVCQ&usqp=CAU"))
        webList.add(photos("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT6DLqkbtAoE4siS7S54XeZMOzjfVyclq1eKQ&usqp=CAU"))
        webList.add(photos("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR2pmru57xYkr-6nI0SpIiW7ud-x6n1eITKAg&usqp=CAU"))
        webList.add(photos("https://static.wikia.nocookie.net/barbie-movies/images/2/2c/Alexa.png/revision/latest/top-crop/width/360/height/450?cb=20120504133703"))
        webList.add(photos("https://pbs.twimg.com/profile_images/504890326121607168/BwVss1MX.jpeg"))
        val adapter = adapter(webList, this)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = GridLayoutManager(this, 2)

    }
}