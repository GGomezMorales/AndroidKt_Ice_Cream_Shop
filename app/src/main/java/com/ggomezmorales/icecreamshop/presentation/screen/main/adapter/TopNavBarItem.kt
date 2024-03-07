package com.ggomezmorales.icecreamshop.presentation.screen.main.adapter

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import com.ggomezmorales.icecreamshop.presentation.ui.theme.NunitoFont

@Composable
fun TopNavBarItem() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        TextButton(onClick = { /*TODO*/ }) {
            Text(
                text = "all products",
                color = Color.DarkGray,
                fontFamily = NunitoFont,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                textDecoration = TextDecoration.Underline
            )
        }
        TextButton(onClick = { /*TODO*/ }) {
            Text(
                text = "ice cream",
                color = Color.DarkGray,
                fontFamily = NunitoFont,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                textDecoration = TextDecoration.Underline,
            )
        }
        TextButton(onClick = { /*TODO*/ }) {
            Text(
                text = "cups",
                color = Color.DarkGray,
                fontFamily = NunitoFont,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                textDecoration = TextDecoration.Underline
            )
        }
    }
}
