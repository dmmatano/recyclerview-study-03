package com.example.zodiaclistapp.data

import com.example.zodiaclistapp.R
import com.example.zodiaclistapp.model.Sign

class SignDataSource {

    companion object{

        fun createDataset(): ArrayList<Sign>{
            val list = ArrayList<Sign>()
            list.add(
                Sign(
                    "Aquário",
                    "21/01 - 19/02",
                    "Ar - fixo",
                    R.drawable.ic_aquarius
                )
            )
            list.add(
                Sign(
                    "Peixes",
                    "19/02 - 21/03",
                    "Água - mutável",
                    R.drawable.ic_pisces
                )
            )
            list.add(
                Sign(
                    "Capricórnio",
                    "20/03 - 19/04",
                    "Terra - cardinal",
                    R.drawable.ic_capricornio
                )
            )
            list.add(
                Sign(
                    "Touro",
                    "20/04 - 21/05",
                    "Terra - fixo",
                    R.drawable.ic_taurus
                )
            )
            return list
        }

    }

}