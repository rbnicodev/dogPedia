package com.rbnico.dogpedia

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.unit.dp
import coil.annotation.ExperimentalCoilApi
import com.rbnico.dogpedia.data.DataProvider
import com.rbnico.dogpedia.data.Dog

@ExperimentalCoilApi
@Composable
fun DogList(
    dogs: List<Dog>,
    click: (Dog) -> Unit
) {

    LazyColumn(
        contentPadding = PaddingValues(horizontal = 16.dp, vertical = 16.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)) {
            items(dogs) {
                dog -> DogItem(dog = dog, click)
            }
    }
}