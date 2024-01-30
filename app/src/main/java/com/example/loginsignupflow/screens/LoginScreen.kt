package com.example.loginsignupflow.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.loginsignupflow.components.ButtonComponent
import com.example.loginsignupflow.components.ClickableLoginTextComponent
import com.example.loginsignupflow.components.CustomOutlineTextField
import com.example.loginsignupflow.components.DividerComponent
import com.example.loginsignupflow.components.HeadingTextComponent
import com.example.loginsignupflow.components.NormalTextComponent
import com.example.loginsignupflow.components.PasswordOutlineTextField
import com.example.loginsignupflow.components.UnderlinedTextComponent
import com.example.loginsignupflow.navigation.PostOfficeAppRouter
import com.example.loginsignupflow.navigation.Screen
import com.example.loginsignupflow.navigation.SystemBackButtonHandler
import com.example.loginsingnupflow.R

@Composable
fun LoginScreen() {
    Surface(
        color = Color.White,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(28.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
        ) {
            NormalTextComponent(value = stringResource(id = R.string.login))

            HeadingTextComponent(value = stringResource(id = R.string.welcome_back))

            Spacer(modifier = Modifier.height(20.dp))

            CustomOutlineTextField(labelValue = stringResource(id = R.string.email))

            Spacer(modifier = Modifier.height(10.dp))

            PasswordOutlineTextField(labelValue = stringResource(id = R.string.password))

            Spacer(modifier = Modifier.height(40.dp))

            UnderlinedTextComponent(value = stringResource(id = R.string.forgot_password))

            Spacer(modifier = Modifier.height(40.dp))

            ButtonComponent(value = stringResource(id = R.string.login))

            Spacer(modifier = Modifier.height(20.dp))

            DividerComponent()

            ClickableLoginTextComponent(false, onTextSelected = {
                PostOfficeAppRouter.navigateTo(Screen.SignupScreen)
            })
        }


    }

    SystemBackButtonHandler {
        PostOfficeAppRouter.navigateTo(Screen.SignupScreen)
    }

}

@Preview
@Composable
fun DefaultPreviewLoginScreen() {
    LoginScreen()
}