package com.example.boletines.EjerciciosRandoms

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun FrmLogin(home: () -> Unit) {
    var nombre by remember { mutableStateOf("") }
    Box(
        modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center
    ) {

        Column {
            Text(text = "Login")
            TextField(value = nombre,
                onValueChange = { nombre= it },
                placeholder = { Text("Usuario") })
            Button(onClick = home,
                enabled = nombre.isNotEmpty()) {
                Text("Iniciar sesión")}

        }
    }
}


