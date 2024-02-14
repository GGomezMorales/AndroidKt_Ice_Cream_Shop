package com.ggomezmorales.icecreamshop

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.FilterAlt
import androidx.compose.material.icons.outlined.GridView
import androidx.compose.material.icons.outlined.Search
import androidx.compose.material.icons.rounded.CancelScheduleSend
import androidx.compose.material.icons.rounded.FavoriteBorder
import androidx.compose.material.icons.rounded.PushPin
import androidx.compose.material.icons.rounded.ShoppingBag
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ggomezmorales.icecreamshop.ui.theme.NunitoFont

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainScreen()
        }
    }
}

@Composable
fun MainScreen() {
    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color(0xFFFFD538))
        .padding(24.dp)) {
        Column {
            Header(title = "Products", color = Color.DarkGray) {
                IconButton(onClick = { }) {
                    Icon(imageVector = Icons.Outlined.FilterAlt, contentDescription = "filter", tint = Color.DarkGray)
                }
                IconButton(onClick = { }) {
                    Icon(imageVector = Icons.Outlined.GridView, contentDescription = "view", tint = Color.DarkGray)
                }
                IconButton(onClick = { }) {
                    Icon(imageVector = Icons.Outlined.Search, contentDescription = "search", tint = Color.DarkGray)
                }
            }
            TopNavBarItem()
        }
    }
}

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
            fontWeight = FontWeight.Bold
        )
        Row(
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            icons()
        }
    }
}

@Composable
fun TopNavBarItem() {
    Row(
        modifier = Modifier.fillMaxWidth()
            .padding(top = 16.dp),
        horizontalArrangement = Arrangement.Start
    ) {
        Text(
            modifier = Modifier.padding(end = 24.dp),
            text = "all products",
            color = Color.DarkGray,
            fontFamily = NunitoFont,
            fontWeight = FontWeight.Bold
        )
        Text(
            modifier = Modifier.padding(horizontal = 24.dp),
            text = "ice cream",
            color = Color.DarkGray,
            fontFamily = NunitoFont,
            fontWeight = FontWeight.Bold
        )
        Text(
            modifier = Modifier.padding(horizontal = 24.dp),
            text = "cups",
            color = Color.DarkGray,
            fontFamily = NunitoFont,
            fontWeight = FontWeight.Bold
        )
    }
}

@Composable
fun ProductItem(
    name: String,
    description: String,
    icons: @Composable () -> Unit
) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
            .background(color = Color.DarkGray.copy(alpha = 0.5f))
            .clip(shape = RoundedCornerShape(16.dp))
            .padding(16.dp),
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceAround
        ) {
            Row(
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Column(
                    verticalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(text = name)
                    Text(text = description)
                }
                Column {
                    IconButton(onClick = { }) {
                        Icon(
                            imageVector = Icons.Rounded.FavoriteBorder,
                            contentDescription = null,
                            tint = Color.White
                        )
                    }
                    IconButton(onClick = { }) {
                        Icon(
                            imageVector = Icons.Rounded.PushPin,
                            contentDescription = null,
                            tint = Color.White
                        )
                    }
                    IconButton(onClick = { }) {
                        Icon(
                            imageVector = Icons.Rounded.CancelScheduleSend,
                            contentDescription = null,
                            tint = Color.White
                        )
                    }
                }
//                Image(painter = painterResource(id =), contentDescription =)
                Row {
                    Column {
                        Text(text = "")
                        Text(text = "Price")
                    }
                    Button(onClick = { }) {
                        Row {
                            Text(text = "To car")
                            Icon(
                                imageVector = Icons.Rounded.ShoppingBag,
                                contentDescription = "Shopping"
                            )
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun BottomNavigationBar() {

}