package com.example.actividad_2.ui.composable

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

// Foto recortada con la forma que se le pase (círculo o esquinas redondeadas).
// Se usa en el avatar, el banner y las miniaturas de las tarjetas.
@Composable
fun Photo(
    @DrawableRes imageRes: Int,
    description: String?,
    modifier: Modifier = Modifier,
    shape: Shape = RoundedCornerShape(16.dp)
) {
    Image(
        painter = painterResource(id = imageRes),
        contentDescription = description,
        modifier = modifier.clip(shape),
        contentScale = ContentScale.Crop
    )
}