package com.example.recipeapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.imageFromResource
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.setContent
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            ScrollableColumn(
                modifier = Modifier
                    .fillMaxSize()
                    .background(color = Color(0xFFF2F2f2)),
            ){
                Image(
                    bitmap = imageFromResource(
                        res = resources,
                        resId = R.drawable.happy_meal_small,
                    ),
                    modifier = Modifier.height(300.dp),
                    contentScale = ContentScale.Crop,
                )
                Column(modifier = Modifier.padding(16.dp)) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                    ) {
                        Text(
                            text = "Happy meal",
                            style = TextStyle(
                                fontSize = TextUnit.Sp(26),
                            ),
                        )
                        Text(
                            text = "$5.99",
                            style = TextStyle(
                                fontSize = TextUnit.Sp(17),
                                color = Color.Magenta,
                            ),
                            modifier = Modifier.align(Alignment.CenterVertically)
                        )
                    }
                    Spacer(modifier = Modifier.padding(10.dp))
                    Text(
                        text = "800 calories",
                        style = TextStyle(
                            fontSize = TextUnit.Sp(17),
                        ),
                    )
                    Button(
                        onClick = {},
                        modifier = Modifier.align(Alignment.CenterHorizontally),
                    ) {
                        Text(text = "Order now")
                    }
                }
            }
        }
    }
}