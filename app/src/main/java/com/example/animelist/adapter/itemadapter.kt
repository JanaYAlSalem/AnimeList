package com.example.animelist.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.animelist.R
import com.example.animelist.model.anime

class itemadapter(val context: Context ,
                  val dataset : List<anime>): RecyclerView.Adapter<itemadapter.ItemViewHolder>()
{



    class ItemViewHolder(val view: View): RecyclerView.ViewHolder(view) {
        val ImgAnimme: ImageView = view.findViewById(R.id.animeImage) // place of img on list item
        val NameOfAnime: TextView = view.findViewById(R.id.animeName) // place of text on list item
        val NumOfEip  : TextView = view.findViewById(R.id.Episodes)

    } // End class sup

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context).inflate(R.layout.anime_list, parent, false)
        return ItemViewHolder(adapterLayout)

    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
var x = dataset[position] // to know where i'm in list
        holder.ImgAnimme.setImageResource(x.imge)
        holder.NameOfAnime.text = context.getText(x.name)
        holder.NumOfEip.text = x.numOfEp.toString()




    }

    override fun getItemCount(): Int {
       return dataset.size
    }

}