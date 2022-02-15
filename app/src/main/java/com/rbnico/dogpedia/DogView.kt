package com.rbnico.dogpedia

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import coil.compose.rememberImagePainter
import com.rbnico.dogpedia.data.Dog

@Composable
fun DogView(
    dog: Dog,
    volver: () -> Unit
) {
    Card (
        modifier = Modifier.padding(20.dp)
    ) {
        LazyColumn(
            modifier = Modifier.fillMaxWidth()
                .padding(all = 10.dp
                ),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            items(1) {
                Text(text = dog.name,
                    style = MaterialTheme.typography.h1,
                    fontWeight = FontWeight.Medium
                )
                Image(
                    painter = rememberImagePainter(data = dog.image),
                    contentDescription = "Foto perro",
                    modifier = Modifier
                        .padding(vertical = 47.dp)
                        .size(300.dp),

                    contentScale = ContentScale.Crop,
                )

                Button(onClick = volver,
                    modifier = Modifier.padding(40.dp)
                ) {
                    Text(text = "Volver")
                }
            }
        }
    }
}