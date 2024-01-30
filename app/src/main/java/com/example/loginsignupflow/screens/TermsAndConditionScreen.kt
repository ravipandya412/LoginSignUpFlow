package com.example.loginsignupflow.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.loginsignupflow.components.HeadingTextComponent
import com.example.loginsignupflow.navigation.PostOfficeAppRouter
import com.example.loginsignupflow.navigation.Screen
import com.example.loginsignupflow.navigation.SystemBackButtonHandler
import com.example.loginsingnupflow.R


@Composable
fun TermsAndConditionsScreen() {
    Surface(
        color = Color.White,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(16.dp)
    ) {
        HeadingTextComponent(value = stringResource(id = R.string.terms_and_condition))
    }

    SystemBackButtonHandler {
        PostOfficeAppRouter.navigateTo(Screen.SignupScreen)
    }

}

@Preview
@Composable
fun DefaultPreviewTermsAndConditionsScreen() {
    TermsAndConditionsScreen()
}