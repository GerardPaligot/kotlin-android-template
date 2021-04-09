package com.ncorti.kotlin.template.app_compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.ncorti.kotlin.template.app_compose.ui.components.Factorial
import com.ncorti.kotlin.template.app_compose.ui.theme.KotlinAndroidTemplateTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            KotlinAndroidTemplateTheme {
                Scaffold(
                    topBar = {
                        TopAppBar(
                            title = { Text(text = "Kotlin Android Template") },
                            backgroundColor = MaterialTheme.colors.primary
                        )
                    },
                    backgroundColor = MaterialTheme.colors.background
                ) {
                    Box(
                        modifier = Modifier
                            .padding(it)
                            .fillMaxSize()
                            .wrapContentSize(align = Alignment.Center)
                            .padding(horizontal = 8.dp)
                    ) {
                        Factorial()
                    }
                }
            }
        }
    }
}
