package com.example.actividad_2.ui.section

import androidx.annotation.DrawableRes
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.actividad_2.R
import com.example.actividad_2.ui.composable.DestinationCard
import com.example.actividad_2.ui.composable.ViewAllButton
import com.example.actividad_2.ui.composable.Title

@Composable
fun PopularSection() {
    // Datos locales
    val destinations = listOf(
        Destination(
            imageRes = R.drawable.laguna,
            name = "Laguna Azul",
            category = "Naturaleza",
            rating = 4.8,
            description = "Un paraíso natural rodeado de montañas."
        ),
        Destination(
            imageRes = R.drawable.playa,
            name = "Playa del Sol",
            category = "Playa",
            rating = 4.6,
            description = "Aguas cristalinas y arena blanca."
        ),
        Destination(
            imageRes = R.drawable.centro_historico,
            name = "Centro Histórico",
            category = "Cultura",
            rating = 4.7,
            description = "Historia y arquitectura en un solo lugar."
        )
    )

    Column(
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        // Título a la izquierda, botón a la derecha
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Title(text = "Destinos populares", fontSize = 18.sp)
            ViewAllButton(text = "Ver Todos")
        }

        LazyColumn(
            contentPadding = PaddingValues(start = 16.dp, end = 16.dp, bottom = 16.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            items(destinations, key = { destination -> destination.name }) { destination ->
                DestinationCard(
                    imageRes = destination.imageRes,
                    name = destination.name,
                    category = destination.category,
                    rating = destination.rating,
                    description = destination.description
                )
            }
        }
    }
}

// Molde de los datos de un destino. Privado: solo se usa en este archivo.
private data class Destination(
    @DrawableRes val imageRes: Int,
    val name: String,
    val category: String,
    val rating: Double,
    val description: String
)