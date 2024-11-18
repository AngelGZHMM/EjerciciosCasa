package com.example.boletines.Boletin3_Componentes

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController


@Composable
fun FormularioRegistro(onNavigateToHome: () -> Unit) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier.fillMaxSize()
    ) {
        Column {
            Text(text = "Pon tu nombre")
            TextField(value = "", onValueChange =  {  })
            Button(onClick = onNavigateToHome) {
                Text("Iniciar sesión")
            }
        }
    }
}






