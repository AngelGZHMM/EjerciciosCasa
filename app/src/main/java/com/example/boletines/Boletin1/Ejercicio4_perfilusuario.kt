package com.example.boletines.Boletin1

import android.widget.Space
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage

//Ejercicio 4: Perfil de Usuario
//Objetivo: Crear una pantalla de perfil de usuario que muestre una imagen de perfil, el
//nombre del usuario y una breve biografía.
//1. Crea una Column que contenga:
//o Una AsyncImage para la imagen de perfil.
//o Un Text para el nombre del usuario.
//o Un Text para la biografía del usuario.

data class Usuario(
    val nombre: String,
    val biografia: String,
    val imagen: String
)
@Composable
fun PerfilUsuario(){
    val usuario1 = Usuario("Juan","Estudia kotlin","https://imgs.search.brave.com/GMic2FovS881UiRwvbGokNBpEVsu8xUX8y84YA63dlc/rs:fit:500:0:0:0/g:ce/aHR0cHM6Ly9jb250/ZW50LnNlbWFuYS5l/cy9tZWRpby8yMDI0/LzA4LzIxL2tpa28t/cml2ZXJhLWVuLXVu/YS1mb3RvLWRlLWFy/Y2hpdm9fZmU5YTJi/YWRfMjQwODIxMTE0/MTA2XzEyODB4NzIw/LmpwZw")

    Column(

    ){
        Spacer(modifier = Modifier.padding(16.dp))
        AsyncImage(
            model=usuario1.imagen
            , contentDescription = null
        )
        Text(
            text = usuario1.nombre
        )
        Text(
            text = usuario1.biografia
        )

    }

}
@Composable
fun mainPerfilUsuario(){
    PerfilUsuario()
}