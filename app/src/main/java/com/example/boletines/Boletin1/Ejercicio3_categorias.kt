package com.example.boletines.Boletin1

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage

//Ejercicio 3: Cuadrícula de Categorías
//Objetivo: Crear una cuadrícula que muestre categorías de productos usando
//LazyVerticalGrid.
//1. Define una data class Category con name y imageUrl.
//2. Usa LazyVerticalGrid para mostrar la lista de categorías.
//3. Cada elemento de la cuadrícula debe mostrar una AsyncImage y un Text.

data class Category(
    val nombre: String = "",
    val imagen: String = ""
)

@Composable
fun listaCategorias() {
    val categorias = listOf(
        Category("Electronics", "https://loremflickr.com/400/400/electronics"),
        Category("Clothing", "https://loremflickr.com/400/400/clothing"),
        Category("Home", "https://loremflickr.com/400/400/home"),
        Category("Electronics", "https://loremflickr.com/400/400/electronics"),
        Category("Clothing", "https://loremflickr.com/400/400/clothing")
    )
    LazyVerticalGrid(
        contentPadding = PaddingValues(4.dp),
        columns = GridCells.Fixed(2),
        modifier = Modifier.padding(top = 30.dp)
    ) {
        items(categorias.size) { index ->
            val category = categorias[index]
            AsyncImage(
                model = category.imagen,
                contentDescription = null,
                modifier = Modifier.padding(4.dp)
            )
            Text(
                text = category.nombre,
                modifier = Modifier.padding(4.dp)
                .background(color = Color.Gray)

             )
        }
    }
}

@Composable
fun mainCategorias() {
    listaCategorias()
}

