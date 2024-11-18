package com.example.boletines.EjercicioManue.Navegacion

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.example.boletines.EjercicioManue.model.Producto
import com.example.boletines.EjercicioManue.ui.productosScreen.ProductosScreen
import com.example.boletines.EjercicioManue.ui.productosScreen.ScreenDetalleProducto

@Composable
fun navigation(){

    val navController = rememberNavController()
    //al final ponemos la primera pantalla que queremos que se muestre
    NavHost(navController = navController, startDestination = Productos){
    composable<Productos> {
        ProductosScreen { nombreProducto, precio, imagen -> navController.navigate(dDetalleProducto(nombreProducto, precio, imagen)) } }
    composable<dDetalleProducto> { P ->
       val detalleProducto = P.toRoute<dDetalleProducto>()
        ScreenDetalleProducto(detalleProducto.nombre,
            detalleProducto.precio,
            detalleProducto.imagen)
    }
    }

}

