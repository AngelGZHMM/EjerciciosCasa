package com.example.boletines.EjerciciosRandoms

import android.annotation.SuppressLint
import android.provider.CalendarContract.Colors
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.luminance
import androidx.compose.ui.unit.dp

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun pantallaInicio(volver: () -> Unit) {
    Scaffold(floatingActionButton = { botonFlotante(volver) }) { margen ->




    var selectorColor by remember { mutableStateOf(Color.Black) }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(margen).padding(top=16.dp),
        horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Top
    ) {
        Box(
            modifier = Modifier
                .size(150.dp)
                .background(selectorColor)
        ) {

        }
        Spacer(modifier = Modifier.height(16.dp))

        ListColors(colores = listOf(
            Color.Red,
            Color.Green,
            Color.Blue,
            Color.Yellow,
            Color.Magenta,
            Color.Cyan
        ),
            onselectedColor = { selectorColor = it })
    }
}
}
@Composable
fun ListColors(colores: List<Color>, onselectedColor: (Color) -> Unit) {
    Column {
        colores.forEach { color ->
            Button(
                onClick = { onselectedColor(color) },
                modifier = Modifier.padding(8.dp),
                colors = ButtonDefaults.buttonColors(containerColor = color)
            ) {
                Text(
                    text = "Seleccionar",
                    color = if (color.luminance() > 0.5) Color.Black else Color.White
                )
            }
        }
    }

}