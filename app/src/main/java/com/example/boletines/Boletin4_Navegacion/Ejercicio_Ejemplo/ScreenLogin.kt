package com.example.boletines.Boletin4_Navegacion.Ejercicio_Ejemplo

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import  androidx.compose.*
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.unit.dp

@Composable
fun screenLogin(onLoginClick: () -> Unit){
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Button(onClick = { onLoginClick() }) {
            Text("Iniciar sesión")
        }
    }
    Spacer(modifier = Modifier.padding(16.dp))
    Column(modifier = Modifier
        .fillMaxSize()) {
        TextField(value = "Usuario"
            , onValueChange = { /*TODO*/ }
        )
        Button(onClick = { /*TODO*/ }) {
            Text(text = "Login")
        }
    }

}


