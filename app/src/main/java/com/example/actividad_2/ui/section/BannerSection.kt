package com.example.actividad_2.ui.section

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.actividad_2.R
import com.example.actividad_2.ui.composable.Paragraph
import com.example.actividad_2.ui.composable.Title
import com.example.actividad_2.ui.theme.PurpleDark

@Composable
fun BannerSection() {
    // Un solo Column: la imagen es su fondo (paint) y encima
    // se pinta un degradado (background). Los textos van abajo.
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp)
            .height(170.dp)
            .clip(RoundedCornerShape(24.dp))
            .paint(
                painter = painterResource(id = R.drawable.montana),
                contentScale = ContentScale.Crop
            )
            .background(
                Brush.verticalGradient(
                    listOf(Color.Transparent, PurpleDark.copy(alpha = 0.8f))
                )
            )
            .padding(16.dp),
        verticalArrangement = Arrangement.Bottom
    ) {
        Title(text = "Explora", fontSize = 26.sp, color = Color.White)
        Paragraph(
            text = "Lugares increíbles cerca de ti",
            fontSize = 14.sp,
            color = Color.White
        )
    }
}
