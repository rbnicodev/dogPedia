package com.rbnico.dogpedia

sealed class Destinations (
    val route: String
        ) {
    object dogList: Destinations("dogList")
    object dogView: Destinations("dogView")
}