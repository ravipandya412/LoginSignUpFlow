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
import com.example.loginsignupflow.components.CheckboxComponents
import com.example.loginsignupflow.components.ClickableLoginTextComponent
import com.example.loginsignupflow.components.CustomOutlineTextField
import com.example.loginsignupflow.components.DividerComponent
import com.example.loginsignupflow.components.HeadingTextComponent
import com.example.loginsignupflow.components.NormalTextComponent
import com.example.loginsignupflow.components.PasswordOutlineTextField
import com.example.loginsignupflow.navigation.PostOfficeAppRouter
import com.example.loginsignupflow.navigation.Screen
import com.example.loginsingnupflow.R

@Composable
fun SignUpScreen() {

    Surface(
        color = Color.White,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(28.dp)
    ) {
        Column(modifier = Modifier.fillMaxSize()) {
            NormalTextComponent(value = stringResource(id = R.string.hello))

            HeadingTextComponent(value = stringResource(id = R.string.create_account))

            Spacer(modifier = Modifier.height(height = 20.dp))

            CustomOutlineTextField(labelValue = stringResource(id = R.string.first_name))

            CustomOutlineTextField(labelValue = stringResource(id = R.string.last_name))

            CustomOutlineTextField(labelValue = stringResource(id = R.string.email))

            PasswordOutlineTextField(labelValue = stringResource(id = R.string.password))

            CheckboxComponents(value = stringResource(id = R.string.terms_and_condition),
                onTextSelected = {
                    PostOfficeAppRouter.navigateTo(Screen.TermsAndConditionsScreen)
                })

            Spacer(modifier = Modifier.height(40.dp))

            ButtonComponent(value = stringResource(id = R.string.register_label))

            DividerComponent()

            ClickableLoginTextComponent(true,onTextSelected = {
                PostOfficeAppRouter.navigateTo(Screen.LoginScreen)
            })
        }

    }

}

@Preview
@Composable
fun DefaultPreviewSignUpScreen() {
    SignUpScreen()
}