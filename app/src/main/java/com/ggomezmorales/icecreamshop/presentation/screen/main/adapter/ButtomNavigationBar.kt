package com.ggomezmorales.icecreamshop.presentation.screen.main.adapter

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Menu
import androidx.compose.material.icons.outlined.PermIdentity
import androidx.compose.material.icons.outlined.ShoppingBag
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ggomezmorales.icecreamshop.presentation.ui.theme.NunitoFont

@Composable
fun BottomNavigationBar() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(
                color = Color(0XFFFFEEAF),
                shape = RoundedCornerShape(corner = CornerSize(16.dp))
            )
            .clip(shape = RoundedCornerShape(corner = CornerSize(16.dp))),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceAround
    ) {
        TextButton(onClick = { /*TODO*/ }) {
            Icon(imageVector = Icons.Outlined.Menu, contentDescription = "menu", tint = Color(0xFF29292B))
            Spacer(modifier = Modifier.width(4.dp))
            Text(
                text = "menu",
                color = Color(0xFF29292B),
                fontSize = 16.sp,
                fontFamily = NunitoFont,
                fontWeight = FontWeight.Bold
            )
        }
        TextButton(onClick = { /*TODO*/ }) {
            Icon(imageVector = Icons.Outlined.ShoppingBag, contentDescription = "cart", tint = Color(0xFF29292B))
            Spacer(modifier = Modifier.width(4.dp))
            Text(
                text = "cart",
                color = Color(0xFF29292B),
                fontSize = 16.sp,
                fontFamily = NunitoFont,
                fontWeight = FontWeight.Bold
            )
        }
        TextButton(onClick = { /*TODO*/ }) {
            Icon(imageVector = Icons.Outlined.PermIdentity, contentDescription = "user", tint = Color(0xFF29292B))
            Spacer(modifier = Modifier.width(4.dp))
            Text(
                text = "user",
                color = Color(0xFF29292B),
                fontSize = 16.sp,
                fontFamily = NunitoFont,
                fontWeight = FontWeight.Bold
            )
        }
    }
}
