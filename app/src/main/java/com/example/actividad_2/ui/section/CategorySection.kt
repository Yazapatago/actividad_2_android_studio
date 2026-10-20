package com.example.actividad_2.ui.section

import androidx.annotation.DrawableRes
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.actividad_2.R
import com.example.actividad_2.ui.composable.CategoryItem
import com.example.actividad_2.ui.theme.LilacBg
import com.example.actividad_2.ui.theme.MintBg
import com.example.actividad_2.ui.theme.PeachBg
import com.example.actividad_2.ui.theme.PinkBg
import com.example.actividad_2.ui.theme.SkyBg

@Composable
fun CategorySection() {
    // Datos locales
    val categories = listOf(
        Category(R.drawable.ic_montana, "Montaña", LilacBg),
        Category(R.drawable.ic_bosque, "Bosque", MintBg),
        Category(R.drawable.ic_playa, "Playa", SkyBg),
        Category(R.drawable.ic_ciudad, "Ciudad", PeachBg),
        Category(R.drawable.ic_favoritos, "Favoritos", PinkBg)
    )

    LazyRow(
        contentPadding = PaddingValues(horizontal = 16.dp),
        horizontalArrangement = Arrangement.spacedBy(14.dp)
    ) {
        items(categories, key = { category -> category.name }) { category ->
            CategoryItem(
                iconRes = category.iconRes,
                name = category.name,
                background = category.background
            )
        }
    }
}

// Molde de los datos de una categoría. Privado: solo se usa en este archivo.
private data class Category(
    @DrawableRes val iconRes: Int,
    val name: String,
    val background: Color
)