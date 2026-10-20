package com.example.actividad_2.ui.section

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.actividad_2.R
import com.example.actividad_2.ui.composable.Paragraph
import com.example.actividad_2.ui.composable.Photo
import com.example.actividad_2.ui.composable.Title
import com.example.actividad_2.ui.theme.LavenderSoft
import com.example.actividad_2.ui.theme.PurpleDark

@Composable
fun HeaderSection() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(bottomStart = 28.dp, bottomEnd = 28.dp))
            .background(PurpleDark)
            .padding(horizontal = 20.dp, vertical = 20.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column {
            Title(text = "Descubre", fontSize = 26.sp, color = Color.White)
            Paragraph(
                text = "Nuevos destinos, nuevas historias",
                fontSize = 14.sp,
                color = LavenderSoft
            )
        }
        Photo(
            imageRes = R.drawable.destino,
            description = "Foto de perfil",
            modifier = Modifier
                .size(54.dp)
                .border(2.dp, Color.White, CircleShape),
            shape = CircleShape
        )
    }
}
