package com.example.boletines.Boletin2_ElEstado

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
@Composable
fun setColor() {

var color by remember { mutableStateOf(Color.Red) }
    Column {
        Box(
            modifier = Modifier
                .size(100.dp)
                .background(color)
        )
        Spacer(modifier = Modifier.padding(16.dp))
        LazyColumn {
            items (10) { index ->
                Box(modifier = Modifier
                    .height(2.5.dp)
                    .width(10.dp)
                    .background(Color.Red)
                    .clickable(onClick = { color = Color.Red })
                )
                Box(modifier = Modifier
                    .height(2.5.dp)
                    .width(10.dp)
                    .background(Color.Blue)
                    .clickable(onClick = { color = Color.Blue })
                )
            }

        }
    }
}

@Preview
@Composable
fun mainColores() {
    setColor()
}

