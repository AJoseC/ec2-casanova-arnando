package pe.edu.idat.ec2

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Checkbox
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun header() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "AppIDAT") },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color.Blue,
                    titleContentColor = Color.White
                )
            )
        },
        content = { initialPadding ->
            Box(modifier = Modifier.padding(initialPadding))
        }
    )
}

@Composable
fun espacio(tamanio: Int) {
    Spacer(modifier = Modifier.height(tamanio.dp))
}

@Composable
fun texto() {
    Box(
        Modifier
            .fillMaxSize()
            .padding(top = 30.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp)
        ) {
            Text(
                text = "INFORMACIÓN",
                textAlign = TextAlign.Center,
                modifier = Modifier.fillMaxWidth()
            )
            espacio(tamanio = 8)
            TextField(
                value = "",
                onValueChange = {},
                modifier = Modifier.fillMaxWidth(),
                label = { Text("DNI") }
            )
            espacio(tamanio = 8)
            TextField(
                value = "",
                onValueChange = {},
                modifier = Modifier.fillMaxWidth(),
                label = { Text("Nombre") }
            )
            espacio(tamanio = 8)
            TextField(
                value = "",
                onValueChange = {},
                modifier = Modifier.fillMaxWidth(),
                label = { Text("Apellidos") }
            )
            espacio(tamanio = 8)
            TextField(
                value = "",
                onValueChange = {},
                modifier = Modifier.fillMaxWidth(),
                label = { Text("Email") }
            )
            espacio(tamanio = 8)
            TextField(
                value = "",
                onValueChange = {},
                modifier = Modifier.fillMaxWidth(),
                label = { Text("Password") },
            )
        }
    }
}

@Composable
fun radio(nombre: String, onItemSelected: (String) -> Unit) {
    Column(Modifier.fillMaxWidth()) {
        Text(
            text = "Sexo:",
            textAlign = TextAlign.Left,
            modifier = Modifier.fillMaxWidth()
        )
        Row(
            Modifier
                .fillMaxWidth()
                .padding(5.dp)
        ) {
            RadioButton(selected = nombre == "Hombre", onClick = { onItemSelected("Hombre") })
            Text(text = "Hombre", Modifier.padding(top = 10.dp))
        }
        Row(
            Modifier
                .fillMaxWidth()
                .padding(5.dp)
        ) {
            RadioButton(selected = nombre == "Mujer", onClick = { onItemSelected("Mujer") })
            Text(text = "Mujer", Modifier.padding(top = 10.dp))
        }
    }
}

@Composable
fun hobbies() {
    Box(
        Modifier
            .fillMaxSize()
            .padding(top = 30.dp)
    )

    Text(
        text = "Hobbies:",
        textAlign = TextAlign.Left,
        modifier = Modifier.fillMaxWidth()
    )
    Row(
        Modifier
            .fillMaxWidth()
            .padding(5.dp)
    ){
        Checkbox(
            checked = false, onCheckedChange = {},
            modifier = Modifier.padding(end = 8.dp)
        )
        Text("Deporte")
    }
    espacio(tamanio = 8)
    Row(
        Modifier
            .fillMaxWidth()
            .padding(5.dp)
    ){
        Checkbox(
            checked = false, onCheckedChange = {},
            modifier = Modifier.padding(end = 8.dp)
        )
        Text("Pintura")
    }
    Row(
        Modifier
            .fillMaxWidth()
            .padding(5.dp)
    ){
        Checkbox(
            checked = false, onCheckedChange = {},
            modifier = Modifier.padding(end = 8.dp)
        )
        Text("Otro")
    }
}