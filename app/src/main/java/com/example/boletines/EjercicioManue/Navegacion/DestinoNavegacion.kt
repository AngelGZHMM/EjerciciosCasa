package com.example.boletines.EjercicioManue.Navegacion

import kotlinx.serialization.Serializable

@Serializable
object Productos
@Serializable
data class dDetalleProducto(
    val nombre: String,
    val precio: Float,
    val imagen: String)