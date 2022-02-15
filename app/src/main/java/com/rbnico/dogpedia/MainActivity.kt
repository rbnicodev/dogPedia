package com.rbnico.dogpedia

import android.os.Bundle
import android.provider.ContactsContract
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.rbnico.dogpedia.data.DataProvider
import com.rbnico.dogpedia.ui.theme.DogPediaTheme
import com.rbnico.dogpedia.*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DogPediaTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    color = Color.LightGray,
                    modifier = Modifier.fillMaxSize()
                ) {
                    NavigationHost()
                    }
                }
            }
        }
    }

    @Preview(showBackground = true)
    @Composable
    fun DefaultPreview() {
        Surface(
            color = Color.LightGray,
            modifier = Modifier.fillMaxSize()
        ) {
            DogList(
                DataProvider.dogList,
                click = {

                }
            )
        }
    }
