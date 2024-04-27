package com.example.danson.ui.theme.screens.login

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Button
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.danson.R
import com.example.danson.data.AuthViewModel
import com.example.danson.navigation.ROUT_SIGNUP

@Composable
fun LoginScreen(navController: NavHostController) {
    Column(modifier = Modifier
        .fillMaxSize()
        , horizontalAlignment = Alignment.CenterHorizontally,) {

        Image(painter = painterResource(id = R.drawable.tm9),
            contentDescription = "TAHMEED COACH",
            modifier = Modifier
                .size(90.dp)
                .padding(start = 10.dp, top = 10.dp)
                .clip(shape = CircleShape),)

        Image(painter = painterResource(id = R.drawable.tm16),
            contentDescription = "",
            modifier = Modifier.size(480.dp))

        Text(text = "Login here")

        var email by remember { mutableStateOf(TextFieldValue("")) }
        var password by remember { mutableStateOf(TextFieldValue("")) }
        var context = LocalContext.current

        OutlinedTextField(value = email ,
            onValueChange = {email=it},
            placeholder = {Text(text = "Password")})

        Spacer(modifier = Modifier.height(5.dp))

        OutlinedTextField(value = password ,
            onValueChange = {password=it},
            placeholder ={ Text(text = "Password")}  )

        Button(onClick = {
            // HANDLE LOGIN LOGIC //
            var xyz = AuthViewModel(navController, context)
            xyz.login(email.text,password.text)

        }) {
            Text(text = "Login")
        }

        Button(onClick = {
            navController.navigate(ROUT_SIGNUP)
        }) {
            Text(text = "No account? Signup")
        }
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun LoginScreenPreview() {
    LoginScreen(rememberNavController())
}