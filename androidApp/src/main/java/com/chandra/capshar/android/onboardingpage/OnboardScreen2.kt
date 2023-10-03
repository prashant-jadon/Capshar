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
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.chandra.capshar.android.R
import com.chandra.capshar.android.imagepainter.imageCard

@Preview
@Composable
fun OnboardScreen2(){

    val painter = painterResource(id = R.drawable.firstonboard)
    val title = "Share a piece of your history with the world. Upload old photos, videos, or even audio clips, and let your friends and family add their own memories to the mix."
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
                    Text(textAlign = TextAlign.Center, text = "Create Your Nostalgic Post", fontFamily = fontFamLex, fontSize = 30.sp)
                }
            }
            imageCard(painter = painter, title = title)

            Row(modifier = Modifier.fillMaxWidth().
            height(100.dp)
                .padding(top = 50.dp),
                horizontalArrangement = Arrangement.SpaceAround,
                verticalAlignment = Alignment.CenterVertically) {
                Button(modifier = Modifier.width(100.dp).height(50.dp),
                    shape = RoundedCornerShape(size = 25.dp)
                    , colors = ButtonDefaults.buttonColors(
                        backgroundColor = Color(0xFFFFB36D)
                    ),
                    onClick = { /*TODO*/ }) {
                    Text(text = "SKIP", fontSize = 20.sp)
                }

                Button(modifier = Modifier.width(100.dp).height(50.dp),
                    shape = RoundedCornerShape(size = 25.dp)
                    , colors = ButtonDefaults.buttonColors(
                        backgroundColor = Color(0xFF61D0FF)
                    ),
                    onClick = {

                    }) {
                    Text(text = "NEXT", fontSize = 20.sp)
                }

            }

        }


    }
}