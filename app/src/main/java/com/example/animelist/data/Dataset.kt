package com.example.animelist.data

import com.example.animelist.R
import com.example.animelist.model.anime

object Dataset {
    // object to return data
    val item: List<anime> = listOf(
        //val imge: Int ,val name : String ,val numOfEp : Int ,val Season: Int)
        anime(R.drawable.anime7, R.string.anime2, 20, 2, R.string.shonen),
        anime(R.drawable.anime9, R.string.anime3, 20, 2, R.string.shojo),
        anime(R.drawable.anime2, R.string.anime4, 20, 2, R.string.kodomomuke),
        anime(R.drawable.anime6, R.string.anime5, 20, 2, R.string.shonen),
        anime(R.drawable.anime1, R.string.anime6, 20, 2, R.string.shojo),
        anime(R.drawable.anime5, R.string.anime7, 20, 2, R.string.seinen),
        anime(R.drawable.anime8, R.string.anime8, 20, 2, R.string.shonen),
        anime(R.drawable.anime10, R.string.anime9, 20, 2, R.string.seinen),
        anime(R.drawable.anime10, R.string.anime10, 20, 2, R.string.josei)
    )
} // end Dataset