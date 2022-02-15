package com.rbnico.dogpedia

import android.view.View
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil.annotation.ExperimentalCoilApi
import coil.compose.rememberImagePainter
import com.rbnico.dogpedia.data.DataProvider
import com.rbnico.dogpedia.data.Dog
import com.rbnico.dogpedia.*

@ExperimentalCoilApi
@Composable
fun DogItem(
    dog: Dog,
    click: (Dog) -> Unit
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .clickable {
                click(dog)
            }
    ) {
        val backgrounColor = MaterialTheme.colors.background
        val onBackground = MaterialTheme.colors.onBackground
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(backgrounColor)
                .padding(vertical = 20.dp, horizontal = 20.dp)
        ) {
            Image(
                painter = rememberImagePainter(data = dog.image),
                contentDescription = "Foto perro",
                modifier = Modifier
                    .size(150.dp)
                    .clip(CircleShape)
                    .border(2.dp, onBackground, CircleShape),
                contentScale = ContentScale.Crop,
            )
            Column(
                modifier = Modifier.padding(start = 35.dp)
            ) {
                Text(
                    color = onBackground,
                    text = dog.name,
                    style = MaterialTheme.typography.h5
                )
                Text(
                    color = onBackground,
                    text = dog.breed,
                    modifier = Modifier.padding(vertical = 24.dp),
                    style = MaterialTheme.typography.h5)
                Text(
                    color = onBackground,
                    text = "Edad: " + dog.years.toString(),
                    style = MaterialTheme.typography.button
                )
            }
        }
    }
}