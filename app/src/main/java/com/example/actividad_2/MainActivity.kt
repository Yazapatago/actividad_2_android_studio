package com.example.actividad_2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.example.actividad_2.ui.screen.Home
import com.example.actividad_2.ui.theme.Actividad2Theme
import com.example.actividad_2.ui.theme.Lavender

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Actividad2Theme {
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    containerColor = Lavender
                ) { innerPadding ->
                    Home(modifier = Modifier.padding(paddingValues = innerPadding))
                }
            }
        }
    }
}