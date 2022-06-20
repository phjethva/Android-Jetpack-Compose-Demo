package com.phjethva.android_jetpack_compose_demo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.phjethva.android_jetpack_compose_demo.ui.theme.MyAppTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HomePage()
        }
    }
}

@Composable
fun HomePage() {
    MyAppTheme {
        Column(
            modifier = Modifier.fillMaxSize(),
            //color = MaterialTheme.colors.background
            //verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Box(
                modifier = Modifier
                    .windowInsetsTopHeight(WindowInsets.systemBars)
                    .fillMaxWidth()
                    .background(color = Color.Transparent)
            )
            Text(
                text = "Hello World!",
                color = MaterialTheme.colors.onPrimary
            )
        }
    }
}

@Preview
@Composable
fun DefaultPreview() {
    HomePage()
}
