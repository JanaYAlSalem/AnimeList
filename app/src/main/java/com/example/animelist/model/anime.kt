package com.example.animelist.model

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class animeViewModel: ViewModel() {

    /*
     * create a objects with private type
     * then create a new objects for return the base a private objects
     */

    // Image of Anime
    private val _imge = MutableLiveData<Int>()
     val image : LiveData<Int> = _imge

    // Name of Anime
    private val _name = MutableLiveData<Int>()
     val name : LiveData<Int> = _name

    // Numbers of Anime Episode
    private val _numOfEp = MutableLiveData<Int>()
     val numberOfEpisode : LiveData<Int> = _numOfEp

    // Numbers of Anime Season
    private val _season = MutableLiveData<Int>()
    val season : LiveData<Int> = _season

    // The Type of Anime
    private val _type = MutableLiveData<Int>()
    val type : LiveData<Int> = _type



    /*
    * functions to Select items
     */
    fun setAnimeName (name: Int) { _name.value = name }

    fun setAnimeImage (imge: Int) { _imge.value = imge }

    fun setNumberofEpisodes (numberofEpisode: Int) { _numOfEp.value = numberofEpisode }

    fun setSeasone (seasonNum: Int) { _season.value = seasonNum }
 }