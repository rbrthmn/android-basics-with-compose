package com.example.androidbasics.unit1

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.androidbasics.R
import com.example.androidbasics.ui.theme.AndroidBasicsTheme

class BirthdayCard {

    @Composable
    fun GreetingsImage(message: String, from: String, modifier: Modifier = Modifier) {
        val image = painterResource(id = R.drawable.androidparty)
        Box(modifier) {
            Image(
                painter = image,
                contentDescription = null,
                contentScale = ContentScale.Crop,
                alpha = 0.5F
            )
            GreetingText(
                message, from, modifier
                    .fillMaxSize()
                    .padding(8.dp)
            )
        }
    }

    @Composable
    fun GreetingText(message: String, from: String, modifier: Modifier) {
        Column(
            verticalArrangement = Arrangement.Center,
            modifier = modifier
                .padding(8.dp)
                .background(Color.Transparent)
        ) {
            Text(
                text = message,
                fontSize = 80.sp,
                lineHeight = 116.sp,
                textAlign = TextAlign.Center,
                color = Color.Black
            )
            Text(
                text = from,
                fontSize = 36.sp,
                color = Color.Black,
                modifier = Modifier
                    .padding(16.dp)
                    .align(Alignment.CenterHorizontally)
            )
        }
    }

    @Preview(showBackground = false)
    @Composable
    fun BirthdateCardPreview() {
        AndroidBasicsTheme {
            GreetingsImage(
                message = "Happy Birthday Rob!", from = "From Android"
            )
        }
    }
}