package com.chandra.capshar.android

import android.view.animation.OvershootInterpolator
import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import kotlinx.coroutines.delay

//SplashScreen
@Composable
fun SplashScreen(navController: NavController){
    val scale = remember {
        Animatable(0f)
    }

    LaunchedEffect(key1 = true){
        scale.animateTo(targetValue = 0.9f,
            animationSpec = tween(
                durationMillis = 400,
                easing = {
                    OvershootInterpolator(1f).getInterpolation(it)
                }
            )
        )
        delay(400L)
        navController.navigate("onboard_screen1")
    }

    val fontFamLex = FontFamily(Font(R.font.lexend))
    //Animation
    BoxWithConstraints(modifier = Modifier
        .fillMaxSize()
        .scale(scale.value)
        .background(Color.White),
        contentAlignment = Alignment.Center){
        Column (modifier = Modifier,
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,){
            Text(text = buildAnnotatedString {

            })
            Text( text = "CAPSHAR", fontFamily = fontFamLex, fontSize = 50.sp)
            Text(modifier = Modifier
                .padding(bottom = 16.dp)
                .align(Alignment.CenterHorizontally),
                text = "Connect - Share - Reconnect",
                fontFamily = FontFamily.Monospace,
                fontSize = 15.sp, fontStyle = FontStyle.Normal,
                fontWeight = FontWeight.SemiBold
            )
        }


        Text(text = "A Product By Chandra Corporation",modifier = Modifier
            .align(Alignment.BottomCenter)
            .padding(bottom = 30.dp), fontFamily = FontFamily.Monospace
            , fontSize = 16.sp, fontWeight = FontWeight.Light
        )

    }
}