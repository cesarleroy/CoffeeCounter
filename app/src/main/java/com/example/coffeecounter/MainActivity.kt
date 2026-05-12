/*
* Carmona González César Leroy
* Programación de Dispositivos Móviles - 5CV51
* IPN - UPIICSA
* */

package com.example.coffeecounter

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.coffeecounter.ui.theme.CoffeeCounterTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    CoffeeCounterApp()
                }
            }
        }
    }
}
// Botón Añadir
val Coffee = Color(0xFFA06A45)
// Fondo
val BackgroundColor = Color(0xFFFCF9F6)
// Botón Reiniciar
val LightBrown = Color(0xFFE8E0D5)
// Alerta
val Alert = Color(0xFFE20000)

@Composable
fun CoffeeCounterApp() {
    var count by remember { mutableStateOf(0) }

    CoffeeCounterScreen(
        count = count,
        onIncrement = { count++ },
        onReset = { count = 0 }
    )
}

@Composable
fun CoffeeCounterScreen(
    count: Int,
    onIncrement: () -> Unit,
    onReset: () -> Unit
) {
    Column(
        modifier = Modifier.fillMaxSize()
            .background(BackgroundColor),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Tazas de café: $count",
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 24.dp)
        )

        val imageRes = if (count >= 10) {
            R.drawable.cat
        } else {
            R.drawable.coffee
        }

        Image(
            painter = painterResource(id = imageRes),
            contentDescription = "Estado de la cafeína",
            modifier = Modifier.size(250.dp)
        )

        Spacer(modifier = Modifier.height(24.dp))

        if (count >= 10) {
            Text(
                text = "¡Demasiada cafeína!",
                color = Alert,
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(bottom = 16.dp)
            )
        } else {
            Spacer(modifier = Modifier.height(44.dp))
        }

        Row(
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            if (count < 10) {
                Button(onClick = onIncrement,
                    colors = ButtonColors(
                        Coffee,
                        LightBrown,
                        Color.LightGray,
                        Color.Black
                    ),
                ) {
                    Text("Añadir taza")
                }
            }

            Button(onClick = onReset,
                colors = ButtonColors(
                    LightBrown,
                    Coffee,
                    Color.LightGray,
                    Color.Black
                ),) {
                Text("Reiniciar")
            }
        }
    }
}