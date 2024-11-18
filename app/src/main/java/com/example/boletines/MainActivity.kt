package com.example.boletines

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.boletines.Boletin3_Componentes.MainApp
import com.example.boletines.EjercicioManue.Navegacion.navigation
import com.example.boletines.EjerciciosRandoms.MYApp2_0

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
           navigation()



        }
    }
}
