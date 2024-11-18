package com.example.boletines.Boletin2_ElEstado

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.tooling.preview.Preview

// Define una data class llamada Task con dos propiedades: id y name.
data class Task(val id: Int, val name: String)

// Composable principal que maneja la lista de tareas.
@Composable
fun listaTareas() {
    // Define un estado mutable para la lista de tareas.
    var tasks by remember { mutableStateOf(listOf<Task>()) }
    // Define un estado mutable para el contador de IDs de tareas.
    var taskIdCounter by remember { mutableStateOf(0) }

    // Función para agregar una nueva tarea a la lista.
    fun addTask(taskName: String) {
        tasks = tasks + Task(taskIdCounter++, taskName)
    }

    // Función para eliminar una tarea de la lista por su ID.
    fun removeTask(taskId: Int) {
        tasks = tasks.filter { it.id != taskId }
    }

    // Estructura de la interfaz de usuario.
    Column(modifier = Modifier.padding(16.dp)) {
        // Componente para agregar nuevas tareas.
        AddTaskComponent(onAddTask = { taskName -> addTask(taskName) })
        Spacer(modifier = Modifier.height(16.dp))
        // Componente que muestra la lista de tareas.
        listaTareasComponentes(tasks = tasks, onRemoveTask = { taskId -> removeTask(taskId) })
    }
}

// Componente que permite agregar nuevas tareas.
@Composable
fun AddTaskComponent(onAddTask: (String) -> Unit) {
    // Define un estado mutable para el nombre de la tarea.
    var taskName by remember { mutableStateOf("") }

    // Estructura de la interfaz de usuario.
    Column {
        // Campo de texto para ingresar el nombre de la tarea.
        TextField(
            value = taskName,
            onValueChange = { taskName = it },
            label = { Text("Task Name") },
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(8.dp))
        // Botón para agregar la tarea.
        Button(onClick = {
            if (taskName.isNotBlank()) {
                onAddTask(taskName)
                taskName = ""
            }
        }) {
            Text("Add Task")
        }
    }
}

// Componente que muestra la lista de tareas y permite eliminarlas.
@Composable
fun listaTareasComponentes(tasks: List<Task>, onRemoveTask: (Int) -> Unit) {
    // Estructura de la interfaz de usuario.
    Column {
        // Itera sobre la lista de tareas y crea una fila para cada tarea.
        tasks.forEach { task ->
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 4.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                // Muestra el nombre de la tarea.
                Text(task.name)
                // Botón para eliminar la tarea.
                Button(onClick = { onRemoveTask(task.id) }) {
                    Text("Remove")
                }
            }
        }
    }
}

// Función de vista previa para mostrar cómo se verá la interfaz de usuario.
@Preview(showBackground = true)
@Composable
fun ListaTareasPreview() {
    listaTareas()
}