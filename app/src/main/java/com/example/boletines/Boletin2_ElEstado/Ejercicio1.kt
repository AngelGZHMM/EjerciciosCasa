package com.example.boletines.Boletin2_ElEstado
import android.text.InputType
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

//Crea una aplicación simple con un contador que puede incrementarse y decrementar. La lógica
//del contador debe estar en un nivel superior y los botones de incremento y decremento en un
//nivel inferior.
@Preview(showBackground = true, widthDp = 400, heightDp = 400)
@Composable
fun mainContador(){
    var contador = remember { mutableStateOf(0) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(64.dp),
        verticalArrangement = Arrangement.Center
    ) {
        TextField(
            value=contador.value.toString(),
            onValueChange = {contador.value = it.toInt()},
            modifier = Modifier.fillMaxWidth(),
        )
        Row {
        Button(modifier = Modifier
        ,onClick = { contador.value++ }) {
            Text(text = "Incrementar")
        }
        Button(modifier = Modifier
            ,onClick = { contador.value-- }) {
            Text(text = "Decrementar")
        }
        }


    }
}



