package com.example.loginsignupflow

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.loginsignupflow.app.PostOfficeApp
import com.example.loginsignupflow.screens.SignUpScreen


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PostOfficeApp()
        }
    }
}


@Preview
@Composable
fun DefaultPreviewSignUpScreen() {
    PostOfficeApp()
}
