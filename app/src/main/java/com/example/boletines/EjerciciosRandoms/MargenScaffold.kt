package com.example.boletines.EjerciciosRandoms

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.FloatingActionButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp

@Composable
fun botonFlotante(volver:()->Unit){
    FloatingActionButton(onClick = volver,
        elevation =  FloatingActionButtonDefaults.elevation(15.dp)){
        Icon(
            Icons.Default.ArrowBack,
            contentDescription = "Volver"
        )
    }

}