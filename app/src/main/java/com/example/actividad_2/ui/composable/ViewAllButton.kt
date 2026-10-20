package com.example.actividad_2.ui.composable

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.actividad_2.ui.theme.LavenderSoft
import com.example.actividad_2.ui.theme.PurpleMain

// Botón "ver todos". Sin evento: onClick vacío (solo maquetación).
@Composable
fun ViewAllButton(text: String) {
    Button(
        onClick = { },
        colors = ButtonDefaults.buttonColors(containerColor = LavenderSoft),
        contentPadding = PaddingValues(horizontal = 14.dp, vertical = 4.dp)
    ) {
        Title(text = text, fontSize = 12.sp, color = PurpleMain)
    }
}
