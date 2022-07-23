package com.example.zodiaclistapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.zodiaclistapp.data.SignDataSource
import com.example.zodiaclistapp.model.Sign

class SignAdapter(val ctxt: Context, private val items: ArrayList<Sign>):RecyclerView.Adapter<RecyclerView.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return SignViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.zodiac_item,parent,false)
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(holder){
            is SignViewHolder ->{
                holder.bind(items[position])
            }
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

//    fun setList(list: List<Sign>) {
//        this.items = list
//    }

    inner class SignViewHolder constructor(itemView: View): RecyclerView.ViewHolder(itemView){
        private val signName = itemView.findViewById<TextView>(R.id.sign)
        private val signDate = itemView.findViewById<TextView>(R.id.date)
        private val signElement = itemView.findViewById<TextView>(R.id.element)
        private val signImage = itemView.findViewById<ImageView>(R.id.image)

        fun bind(sign: Sign){
            signName.text = sign.name
            signDate.text = sign.date
            signElement.text = sign.element
            signImage.setImageDrawable(ContextCompat.getDrawable(ctxt, sign.image))
        }
    }
}