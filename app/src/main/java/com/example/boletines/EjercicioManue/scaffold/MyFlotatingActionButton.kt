package com.example.boletines.EjercicioManue.scaffold

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.SwitchAccessShortcutAdd
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.FloatingActionButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.example.boletines.EjercicioManue.Navegacion.navigation

@Composable
fun MyFlotatingActionButton(){
    FloatingActionButton( onClick = { /*TODO*/ }, ){
        Icon(
            Icons.Default.ArrowBack,
            contentDescription = "Volver"
        )
    }
}