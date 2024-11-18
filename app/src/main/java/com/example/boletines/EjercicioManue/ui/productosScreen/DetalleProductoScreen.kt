package com.example.boletines.EjercicioManue.ui.productosScreen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage

@Composable
fun ScreenDetalleProducto(nombre:String, precio: Float, imagen: String){
    Box(modifier = Modifier.fillMaxSize()
        ,contentAlignment= Alignment.Center) {
        AsyncImage(model = imagen, contentDescription = null
        ,modifier = Modifier.width(200.dp).height(200.dp))
        Text(text = nombre, modifier = Modifier.fillMaxWidth())
    }
}