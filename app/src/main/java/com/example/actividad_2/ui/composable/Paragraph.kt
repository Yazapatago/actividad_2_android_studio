package com.example.actividad_2.ui.composable

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp
import com.example.actividad_2.ui.theme.TextSoft

// Texto normal (subtítulos y descripciones)
@Composable
fun Paragraph(
    text: String,
    modifier: Modifier = Modifier,
    fontSize: TextUnit = 13.sp,
    color: Color = TextSoft,
    maxLines: Int = Int.MAX_VALUE
) {
    Text(
        text = text,
        modifier = modifier,
        fontSize = fontSize,
        color = color,
        maxLines = maxLines,
        overflow = TextOverflow.Ellipsis
    )
}