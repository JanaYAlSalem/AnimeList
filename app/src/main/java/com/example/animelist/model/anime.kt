package com.example.animelist.model

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class animeViewModel ()
      {
    private val _imge = MutableLiveData<Int>()
     val image : LiveData<Int> = _imge
    private val _name = MutableLiveData<Int>()
     val name : LiveData<Int> = _name
    private val _numOfEp = MutableLiveData<Int>()
     val numberOfEpisode : LiveData<Int> = _numOfEp
    private val _season = MutableLiveData<Int>()
    val season : LiveData<Int> = _season
    private val _type = MutableLiveData<Int>()
    val type : LiveData<Int> = _type

    fun setAnimeName (name: Int) {
        _name.value = name
     }
     fun setAnimeImage (imge: Int) {
        _imge.value = imge
     }
     fun setNumberofEpisodes (numberofEpisode: Int) {
        _numOfEp.value = numberofEpisode
     }
     fun setSeasone (seasonNum: Int) {
        _season.value = seasonNum
     }
 }