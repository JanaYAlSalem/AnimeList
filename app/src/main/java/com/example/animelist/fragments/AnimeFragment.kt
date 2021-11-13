package com.example.animelist.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.example.animelist.R
import com.example.animelist.databinding.FragmentAnimeBinding
import com.example.animelist.model.animeViewModel

class AnimeFragment : Fragment() {


    /*
     * Binding object instance corresponding to the fragment_anime.xml layout
     * This property is non-null between the onCreateView() and onDestroyView() lifecycle callbacks,
     * when the view hierarchy is attached to the fragment.
     */
    private var binding: FragmentAnimeBinding? = null

    /*
     * create a reference object with OrderViewModel type
     * the reference object from activityViewModels
     */
    private val AnimeDViewModel: animeViewModel by activityViewModels()



    /*
     * the second fun of Fragment -> onCreateView()
     * Inflate the layout XML file and return a binding object instance
     */
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val fragmentBinding = FragmentAnimeBinding.inflate(inflater, container, false)
        binding = fragmentBinding
        return fragmentBinding.root
    }


    /*
     * the third fun of Fragment -> onViewCreated()
     * call the functions to display on UI
     * Update the UI
     */
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding?.animeFragment = this
    }

    /*
     * FUN_S
     */



    /**
     * DestroyView
     */
    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

} // end Fragment