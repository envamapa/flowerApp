package com.envamapa.custom.floweapp

import android.graphics.Bitmap
import android.graphics.ImageDecoder
import android.graphics.drawable.BitmapDrawable
import android.graphics.drawable.Drawable
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.AndroidPaint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.envamapa.custom.floweapp.entities.Flower
import com.envamapa.custom.floweapp.ui.theme.FloweAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FloweAppTheme {
                FlowerCard(flower = Flower("Angle", "$570.00"))
            }
        }
    }
}

@Composable
fun FlowerCard(flower: Flower) {
    Card(
        shape = RoundedCornerShape(14.dp),
        backgroundColor = Color.White,
        modifier = Modifier
            .padding(10.dp)
            .width(180.dp)
    ) {
        Row(
            modifier = Modifier.padding(20.dp)
        ) {
            Column {
                Text(
                    text = flower.name,
                    style = TextStyle(
                        color = Color.Gray,
                        fontSize = 16.sp
                    )
                )
                Text(
                    text = flower.price,
                    style = TextStyle(
                        color = Color.Green,
                        fontSize = 16.sp
                    )
                )
            }
            IconButton(
                onClick = { /*TODO*/ },
                modifier = Modifier.background(
                    color = Color.Green,
                    shape = RoundedCornerShape(10.dp)
                )
            ) {
                Icon(
                    Icons.Default.Add,
                    contentDescription = "Add",
                    tint = Color.White
                )
            }
        }
    }
}

fun imageResource(id: Int): Any {

}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    FloweAppTheme {
        FlowerCard(flower = Flower("Angle", "$570.00"))
    }
}
