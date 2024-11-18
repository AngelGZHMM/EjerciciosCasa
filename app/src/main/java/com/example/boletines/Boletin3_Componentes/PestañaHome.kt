package com.example.boletines.Boletin3_Componentes

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun Home(onNavigateBack:()->Unit){
    Box(modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center){
        Text(text = "Bienvenido")
        Button(onClick = onNavigateBack) {
            Text("Cerrar sesión")
        }


    }

}