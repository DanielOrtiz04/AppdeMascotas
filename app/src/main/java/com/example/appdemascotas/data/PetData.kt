package com.example.appdemascotas.data

import com.example.appdemascotas.R

data class PetData(
    val id:Int,
    val name:String,
    val sex:String,
    val age:Int,
    val weight:Double,
    val imagePath:Int
)
var PetList = mutableListOf(
    PetData(0, "Bobby", "Male", 2, 1.3, R.drawable.puppy1),
    PetData(1, "Leia", "Female", 1, 1.1, R.drawable.puppy2),
    PetData(2, "Rex", "Male", 4, 3.0, R.drawable.puppy3),
    PetData(3, "Melo", "Male", 2, 2.8, R.drawable.puppy4),
    PetData(4, "Shuya", "Male", 1, 1.8, R.drawable.puppy5),
    PetData(5, "Maki", "Female", 1, 1.0, R.drawable.puppy6),
    PetData(6, "Kiba", "Male", 2, 1.0, R.drawable.puppy7),
    PetData(7, "Kurama", "Male", 2, 1.0, R.drawable.puppy8)
)
