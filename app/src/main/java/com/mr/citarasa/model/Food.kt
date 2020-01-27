package com.mr.citarasa.model

data class Food(
    var name: String = "",
    var description: String = "",
    var ingredient: String = "",
    var place: String = "",
    var recipe: String = "",
    var photo: Int = 0,
    var cal: String = "",
    var carb : String = "",
    var protein: String = "",
    var fat: String = ""
)