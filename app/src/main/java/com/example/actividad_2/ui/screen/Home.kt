package com.example.actividad_2.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.actividad_2.ui.section.BannerSection
import com.example.actividad_2.ui.section.CategorySection
import com.example.actividad_2.ui.section.HeaderSection
import com.example.actividad_2.ui.section.PopularSection
import com.example.actividad_2.ui.theme.Lavender

// Column principal: apila las secciones de arriba hacia abajo.
// PopularSection va de última y su LazyColumn usa el alto que queda.
@Composable
fun Home(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Lavender),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        HeaderSection()
        BannerSection()
        CategorySection()
        PopularSection()
    }
}

@Preview(showBackground = true, heightDp = 800)
@Composable
fun HomePreview() {
    Home()
}