package com.example.actividad_2.ui.composable

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.actividad_2.R
import com.example.actividad_2.ui.theme.PurpleMain

// Tarjeta: el Row exterior hace de tarjeta (clip + background)
// y separa el contenido (izquierda) de la flecha (derecha).
@Composable
fun DestinationCard(
    @DrawableRes imageRes: Int,
    name: String,
    category: String,
    rating: Double,
    description: String
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(20.dp))
            .background(Color.White)
            .padding(10.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        // Foto + textos
        Row(
            horizontalArrangement = Arrangement.spacedBy(12.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Photo(
                imageRes = imageRes,
                description = name,
                modifier = Modifier.size(84.dp),
                shape = RoundedCornerShape(14.dp)
            )
            Column(
                modifier = Modifier.width(180.dp),
                verticalArrangement = Arrangement.spacedBy(3.dp)
            ) {
                Title(text = name)
                Paragraph(
                    text = "$category • ★ $rating",
                    fontSize = 12.sp,
                    color = PurpleMain
                )
                Paragraph(text = description, maxLines = 2)
            }
        }
        Image(
            painter = painterResource(id = R.drawable.ic_flecha),
            contentDescription = "Ver detalle",
            modifier = Modifier.size(18.dp)
        )
    }
}