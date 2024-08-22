package com.example.jetpackcomposeauthui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.core.view.WindowCompat
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.jetpackcomposeauthui.ui.theme.JetpackComposeAuthUITheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val window = window
        WindowCompat.setDecorFitsSystemWindows(window, false)
        window.statusBarColor = Color.White.toArgb()
        window.navigationBarColor = Color.Black.toArgb()

        setContent {
            JetpackComposeAuthUITheme {
                NavigationView()
            }
        }
    }
}

@Composable
fun NavigationView() {

    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "welcome") {
        // also pass navController to each screen so we can use navController in there
        composable("trip") { TripScreen(navController) }
        composable("welcome") { WelcomeScreen(navController) }
        composable("login") { LoginScreen(navController) }
        composable("signup") { SignupScreen(navController) }
    }

}