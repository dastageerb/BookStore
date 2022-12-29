package com.portfolio.bookstore.util

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonColors
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun ButtonLarge(text:String, modifier: Modifier, onclick:()-> Unit) {
    Button(modifier = modifier
        .fillMaxWidth()
        .padding(end = 16.dp, start = 16.dp)
        .clip(RoundedCornerShape(8.dp))
        .background(color = MaterialTheme.colors.primary),
        //colors = ButtonDefaults.buttonColors(MaterialTheme.colors.primary),
        onClick = { onclick() }) {
        ButtonText(text = text)
    }
}

