package com.example.actividad_2.ui.composable

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp
import com.example.actividad_2.ui.theme.TextDark

// Texto en negrita. Se usa en header, banner, sección, tarjeta y botón.
@Composable
fun Title(
    text: String,
    modifier: Modifier = Modifier,
    fontSize: TextUnit = 16.sp,
    color: Color = TextDark
) {
    Text(
        text = text,
        modifier = modifier,
        fontSize = fontSize,
        fontWeight = FontWeight.Bold,
        color = color
    )
}