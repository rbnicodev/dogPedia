package com.rbnico.dogpedia

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import coil.annotation.ExperimentalCoilApi
import com.rbnico.dogpedia.data.DataProvider
import com.rbnico.dogpedia.*
import com.rbnico.dogpedia.data.Dog

@ExperimentalCoilApi
@Composable
fun NavigationHost() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Destinations.dogList.route){
        composable(Destinations.dogList.route) {
            DogList(
                DataProvider.dogList
            ) {
                navController.navigate(Destinations.dogView.route)
                DataProvider.dog = it
            }
        }
        composable(Destinations.dogView.route) {
            DogView(
                dog = DataProvider.dog,
                volver = {
                    navController.navigate(Destinations.dogList.route)
                }
            )
        }
    }
}