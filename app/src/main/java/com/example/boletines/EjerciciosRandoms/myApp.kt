package com.example.boletines.EjerciciosRandoms

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController


@Composable
fun MYApp2_0(){
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "Registro"){
        composable("Registro"){
            //nombre de la funcion a llamar o vista
            FrmLogin {
                navController.navigate("Home")
            }
        }
        composable("Home"){
            pantallaInicio{
                navController.navigate("Registro")
            }
        }

    }


}