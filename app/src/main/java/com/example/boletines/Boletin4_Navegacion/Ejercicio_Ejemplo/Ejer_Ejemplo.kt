package com.example.boletines.Boletin4_Navegacion.Ejercicio_Ejemplo

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController



@Composable
fun MyApp() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "login") {
        composable("login") {
            screenLogin {
                navController.navigate("home")
            }
        }
        composable("home") {
            screenHome{}
        }
    }
}
