package com.chandra.capshar.android.onboardingpage

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.chandra.capshar.android.R
import com.chandra.capshar.android.imagepainter.imageCard

@Composable
fun OnboardScreen4(){

    val painter = painterResource(id = R.drawable.firstonboard)
    val title = "Capshar is all about connections. Invite your loved ones to contribute to your memories and resources. Reconnect with old friends and create new memories together."
    val fontFamLex = FontFamily(Font(R.font.lexend))

    //SCREEN BOX
    BoxWithConstraints(modifier = Modifier
        .fillMaxSize()
        .background(Color.White)) {

        Column (modifier = Modifier.padding(top= 50.dp)){
            //INSIDE BOX 1
            BoxWithConstraints(modifier = Modifier
                .fillMaxWidth()
                .height(80.dp)
                .padding(top = 40.dp),
                contentAlignment = Alignment.Center){
                Row(
                    modifier = Modifier,
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Text(textAlign = TextAlign.Center, text = "Connect and Reconnect", fontFamily = fontFamLex, fontSize = 30.sp)
                }
            }
            imageCard(painter = painter, title = title)

            Row(modifier = Modifier.fillMaxWidth().
            height(100.dp)
                .padding(top = 50.dp),
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically) {
                Button(onClick = { /*TODO*/ }) {
                    Text(text = "SKIP")

                }

                Button(onClick = { /*TODO*/ }) {
                    Text(text = "NEXT")
                }

            }

        }


    }
}