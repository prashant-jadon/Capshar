package com.chandra.capshar.android.imagepainter

import android.icu.text.CaseMap.Title
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.DrawModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun imageCard(
    painter: Painter,

    title: String,
    modifier: Modifier = Modifier
){
    Box(modifier = modifier
        .fillMaxWidth()
        .height(500.dp)
    ){
        Box(modifier = Modifier.height(500.dp)){
            Image(painter = painter, contentDescription = "")
            Box(modifier = Modifier
                .fillMaxSize()
                .padding(12.dp),
                contentAlignment = Alignment.BottomStart){
                Text(text = title,
                    textAlign = TextAlign.Center,
                    style = TextStyle(color = Color.Black),
                    fontSize = 20.sp,
                    fontFamily = FontFamily.Monospace)
            }
        }
    }
}