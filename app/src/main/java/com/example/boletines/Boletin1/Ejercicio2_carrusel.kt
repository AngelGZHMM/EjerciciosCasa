package com.example.boletines.Boletin1

//Ejercicio 2: Carrusel de Imágenes
//Objetivo: Crear un carrusel de imágenes usando LazyRow.
//1. Define una lista de URLs de imágenes.
//2. Usa LazyRow para mostrar las imágenes en un carrusel.
//3. Cada elemento del carrusel debe ser una AsyncImage.


import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage

val imageUrls = listOf(
    "https://loremflickr.com/400/400/seville?lock=1",
    "https://loremflickr.com/400/400/seville?lock=2",
    "https://loremflickr.com/400/400/seville?lock=3"
)

@Composable
fun CarruselDeImagenes() {
    LazyRow(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        items(imageUrls) { imageUrl ->
            AsyncImage(
                model = imageUrl,
                contentDescription = null,
                modifier = Modifier.padding(end = 8.dp)
            )
        }
    }
}

@Composable
fun mainCarrusel() {
    CarruselDeImagenes()
}