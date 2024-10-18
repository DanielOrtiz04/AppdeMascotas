package com.example.appdemascotas.ui.screen

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun HomeSceen() {
    Scaffold {
        Box(
            modifier = Modifier
                .background(Color(0xFF0D47A1)) // Profundo azul como un ejemplo
                .fillMaxSize()
        ) {
            LazyColumn {
                item {
                    Header()
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
                text = "Estamos Creando este programa para el Pryecto Final de Programacion , $name",
                style = MaterialTheme.typography.bodyLarge, // Cambié de h2 a bodyLarge
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp, // Puedes cambiar el tamaño de la fuente si es necesario
                color = Color.White
            )
        }
    }
}
