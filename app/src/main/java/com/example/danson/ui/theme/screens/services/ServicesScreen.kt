package com.example.danson.ui.theme.screens.services

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Composable
fun ServicesScreen(navController: NavHostController){

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ServicesScreenPreview(){
    ServicesScreen(rememberNavController())
}