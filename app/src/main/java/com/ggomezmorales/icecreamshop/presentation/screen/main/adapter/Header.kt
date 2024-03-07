package com.ggomezmorales.icecreamshop.presentation.screen.main.adapter

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.ggomezmorales.icecreamshop.presentation.ui.theme.NunitoFont

@Composable
fun Header(
    title: String = "Products",
    color: Color,
    icons: @Composable () -> Unit
) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = title,
            color = color,
            fontSize = 32.sp,
            fontFamily = NunitoFont,
            fontWeight = FontWeight.Bold,
            letterSpacing = 1.sp
        )
        Row(
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            icons()
        }
    }
}
