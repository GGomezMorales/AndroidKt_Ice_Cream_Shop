package com.ggomezmorales.icecreamshop.presentation.screen.main

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.FilterAlt
import androidx.compose.material.icons.outlined.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ggomezmorales.icecreamshop.R
import com.ggomezmorales.icecreamshop.presentation.screen.main.adapter.BottomNavigationBar
import com.ggomezmorales.icecreamshop.presentation.screen.main.adapter.Header
import com.ggomezmorales.icecreamshop.presentation.screen.main.adapter.ProductsItem
import com.ggomezmorales.icecreamshop.presentation.screen.main.adapter.TopNavBarItem

@Preview(showSystemUi = true)
@Composable
fun MainScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFFFD538))
            .padding(start = 24.dp, top = 24.dp, end = 24.dp, bottom = 18.dp),
//            .padding(16.dp),
    ) {
        Header(title = "Products", color = Color(0xFF29292B)) {
            IconButton(onClick = { }) {
                Icon(
                    imageVector = Icons.Outlined.FilterAlt,
                    contentDescription = "filter",
                    tint = Color(0xFF29292B)
                )
            }
            IconButton(onClick = { }) {
                Icon(
                    painter = painterResource(id = R.drawable.rounded_grid_view_24),
                    contentDescription = "view",
                    tint = Color(0xFF29292B)
                )
            }
            IconButton(onClick = { }) {
                Icon(
                    imageVector = Icons.Outlined.Search,
                    contentDescription = "search",
                    tint = Color(0xFF29292B)
                )
            }
        }
        TopNavBarItem()
        ProductsItem(
            name = "Vanilla Ice Cream",
            description = "Vanilla ice cream, dark chocolate chips and crunchy nuts."
        )
        Spacer(modifier = Modifier.weight(1f))
        BottomNavigationBar()
    }
}
