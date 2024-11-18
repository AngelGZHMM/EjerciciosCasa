package com.example.boletines.Boletin3_Componentes

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun MainApp() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "login" ) {

        composable ("login"){
            FormularioRegistro(onNavigateToHome = {
                navController.navigate("home")
            })
        }

        composable ("home"){
            Home(onNavigateBack = {
                navController.popBackStack()
            })
        }

    }

}