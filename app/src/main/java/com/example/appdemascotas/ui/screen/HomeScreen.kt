package com.example.appdemascotas.ui.screen

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.appdemascotas.R
import java.time.format.TextStyle
import androidx.compose.material3.Text as Text
import androidx.compose.ui.unit.dp as dp1

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun HomeSceen() {
    Scaffold {
        Box(
            modifier = Modifier
                .background(Color(0xFF0D47A1)) // Profundo azul como un ejemplo
                .padding(24.dp1)
                .fillMaxSize()
        ) {
            LazyColumn {
                item {
                    Header()
                    Spacer(modifier = Modifier.height(24.dp))
                    SearchField()
                    Spacer(modifier = Modifier.height(24.dp))
                }
            }
        }
    }
}

@Composable
fun Header(name: String = "Mascotas") {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically, // Usar Alignment en lugar de Layout
        modifier = Modifier.fillMaxWidth()
    ) {
        Column(verticalArrangement = Arrangement.Center) {
            Text(
                text = "Felicidades, $name",
                style = MaterialTheme.typography.headlineLarge, // Cambié de h2 a headlineLarge
                fontWeight = FontWeight.Bold,
                fontSize = 30.sp,
                color = Color.White
            )
            Text(
                text = "Estamos Creando este programa para el Pryecto Final de Programacion",
                style = MaterialTheme.typography.bodyLarge, // Cambié de h2 a bodyLarge
                color = Color.White
            )
        }

        //Ahora agregaremos un icono
        Icon(
            painter = painterResource(id = R.drawable.baseline_pets_24),
            contentDescription = " icono de mascota" ,
            tint = Color.White,
            modifier = Modifier
                .size(32.dp)
                .rotate(-45.0f)
            )
    }
}

//Ahora crearemos el campo de texto
@Composable
fun SearchField(){
    val textFieldValue = remember { mutableStateOf("") }
    TextField(
        value = textFieldValue.value ,
        onValueChange = { value -> textFieldValue.value = value },
        textStyle = androidx.compose.ui.text.TextStyle(
            fontSize = 24.sp,
            color = Color.White,
        ),
        placeholder = {
            Text(
                text = "Escribe el nombre de tu mascota"
            )
        }
    )
}