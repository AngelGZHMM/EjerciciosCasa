package com.example.boletines.EjercicioManue.ui.productosScreen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.example.boletines.EjercicioManue.model.Producto

@Composable
fun ProductosScreen(
    navegarDetalleProducto:
        (
        nombre: String,
        precio: Float,
        imagen: String
    ) -> Unit
) {
    val listaproductos = listOf(
        Producto(
            nombre = "Producto 1",
            precio = 10.0f,
            imagen = "https://imgs.search.brave.com/V8xv1Z8PTlYCdVQ5LJpVo5IEKxsWTkwkCliB-EthReo/rs:fit:860:0:0:0/g:ce/aHR0cHM6Ly9pMC53/cC5jb20vdG9kb2Nv/b2tpbmcuY29tL3dw/LWNvbnRlbnQvdXBs/b2Fkcy8yMDE0LzA1/L1NlcnJhbml0bzIu/anBnP3Jlc2l6ZT04/MDAsNjAw"
        ),
        Producto(
            nombre = "Producto 2",
            precio = 20.0f,
            imagen = "https://imgs.search.brave.com/ut6VNWQBjK_y9GXIe97Rllq9umw590JvlCZZ3hRynaY/rs:fit:860:0:0:0/g:ce/aHR0cHM6Ly93d3cu/dG9wZ2FzdHJvbm9t/aWNvLmVzL3dwLWNv/bnRlbnQvdXBsb2Fk/cy8yMDIyLzA3L0Fk/b2JlU3RvY2tfMTUz/MTc0NzM5LTEwMjR4/NjgwLmpwZWc"
        ),
        Producto(
            nombre = "Producto 3",
            precio = 30.0f,
            imagen = "https://imgs.search.brave.com/H2jjcfQTqouFbleuqTICG4d4DNzqHrIgilimvTcFM2E/rs:fit:860:0:0:0/g:ce/aHR0cDovL2Jsb2dz/LnB1YmxpY28uZXMv/cmVjZXRhcy1jYXNl/cmFzLW51dHJpY2lv/bi1zYWx1ZGFibGUv/ZmlsZXMvMjAyMi8w/My9zZXJycmFuaXRv/LWJvY2FkaWxsby0z/MDB4MjAwLmpwZw"
        ),
        Producto(
            nombre = "Producto 4",
            precio = 40.5f,
            imagen = "https://imgs.search.brave.com/Bb0Rt2n7LgQWmVwtFWb_iK2SNVLjOQMicv9_J179-nQ/rs:fit:860:0:0:0/g:ce/aHR0cHM6Ly9jb250/ZW50LWNvY2luYS5s/ZWN0dXJhcy5jb20v/bWVkaW8vMjAyNC8x/MC8xNC9lbnNhbGFk/YV9kZV9uYXJhbmph/X3lfYmFjYWxhb18w/MDAwMDAwMF8yNDEw/MTQwMzAwNDhfNjAw/eDYwMC5qcGc"
        ),
        Producto(
            nombre = "Producto 5",
            precio = 50.9f,
            imagen = "https://imgs.search.brave.com/pcHeEuSCt8EQ1Hqeu3l7VthWmAYXcexPL4DJYLKI1u0/rs:fit:860:0:0:0/g:ce/aHR0cHM6Ly93d3cu/ZWxuYWNpb25hbC5j/YXQvdXBsb2Fkcy9z/MS8zNi81NS8wMC8w/Mi9lbnRyZXBhLXNl/cnJhbml0by1wYXM1/LmpwZWc"
        ),
        Producto(
            nombre = "Producto 6",
            precio = 60.4f,
            imagen = "https://imgs.search.brave.com/VAkY8YeTcvLENwezHehYIAHbQTjIzJYnXZRvEtvADW0/rs:fit:860:0:0:0/g:ce/aHR0cHM6Ly93d3cu/MTk2Zmxhdm9ycy5j/b20vd3AtY29udGVu/dC91cGxvYWRzLzIw/MjMvMDIvQm9jYWRp/bGxvLVNlcnJhbml0/by0xLmpwZw"
        )
    )

    Scaffold { paddingValue ->

        Column(
            modifier = Modifier.padding(paddingValue),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "Lista de productos")
            LazyColumn(modifier = Modifier.fillMaxSize()) {
                items(listaproductos) { producto ->
                    ProductoCard(producto,navegarDetalleProducto)
                }
            }
        }
    }
}

@Composable
fun ProductoCard(producto: Producto,navegarDetalleProducto:(nombre: String, precio: Float, imagen: String) -> Unit) {
    Card(modifier = Modifier.fillMaxWidth()) {
        //alinear los obtos de la columna en el centro horizontalmente
        Column( horizontalAlignment = Alignment.CenterHorizontally) {
            AsyncImage( model = producto.imagen, contentDescription = null
            ,modifier = Modifier.fillMaxWidth()
                    .height(200.dp))

            Text(text = producto.nombre)
            Text(text = producto.precio.toString())
            Button(onClick = {navegarDetalleProducto(producto.nombre, producto.precio, producto.imagen)}
            , modifier = Modifier.fillMaxWidth()) {
                Text(text = "Ver detalle")
            }

        }
    }
}