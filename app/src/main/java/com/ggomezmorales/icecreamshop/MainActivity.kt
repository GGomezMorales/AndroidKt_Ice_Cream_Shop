package com.ggomezmorales.icecreamshop

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.material.icons.outlined.FilterAlt
import androidx.compose.material.icons.outlined.Menu
import androidx.compose.material.icons.outlined.PermIdentity
import androidx.compose.material.icons.outlined.PushPin
import androidx.compose.material.icons.outlined.Search
import androidx.compose.material.icons.outlined.Send
import androidx.compose.material.icons.outlined.ShoppingBag
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
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

@Preview(showSystemUi = true)
@Composable
fun MainScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFFFD538))
//            .padding(start = 24.dp, top = 24.dp, end = 24.dp, bottom = 18.dp),
            .padding(16.dp),
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

@Composable
fun ProductsItem(
    name: String = "Oreo",
    description: String = "Description",
//    image: Painter
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 16.dp),
        shape = RoundedCornerShape(corner = CornerSize(42.dp)),
        colors = CardDefaults.cardColors(
            containerColor = Color(0xFF29292B)
        )
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(24.dp),
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column(
                    modifier = Modifier.fillMaxWidth(0.8f),
                    verticalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        text = name,
                        color = Color.White,
                        fontSize = 28.sp,
                        fontFamily = NunitoFont,
                        fontWeight = FontWeight.Black
                    )
                    Spacer(modifier = Modifier.height(16.dp))
                    Text(

                        text = description,
                        color = Color.White,
                        fontSize = 16.sp,
                        fontFamily = NunitoFont,
                    )
                }
                Column(
                    modifier = Modifier.padding(vertical = 16.dp),
                    verticalArrangement = Arrangement.SpaceBetween
                ) {
                    IconButton(
                        modifier = Modifier.size(24.dp),
                        onClick = { }
                    ) {
                        Icon(
                            imageVector = Icons.Outlined.FavoriteBorder,
                            contentDescription = null,
                            tint = Color.White
                        )
                    }
                    Spacer(modifier = Modifier.height(10.dp))
                    IconButton(
                        modifier = Modifier
                            .size(24.dp)
                            .graphicsLayer {
                                rotationZ = 45f
                            },
                        onClick = { }
                    ) {
                        Icon(
                            imageVector = Icons.Outlined.PushPin,
                            contentDescription = null,
                            tint = Color.White
                        )
                    }
                    Spacer(modifier = Modifier.height(8.dp))
                    IconButton(
                        modifier = Modifier
                            .size(24.dp)
                            .graphicsLayer {
                                rotationZ = -45f
                            },
                        onClick = { }
                    ) {
                        Icon(
                            modifier = Modifier.size(18.dp),
                            imageVector = Icons.Outlined.Send,
                            contentDescription = null,
                            tint = Color.White
                        )
                    }
                }
            }
            Image(
                painter = painterResource(id = R.drawable.image1),
                contentDescription = null,
                contentScale = ContentScale.Fit
            )
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column {
                    Text(
                        text = "in stock",
                        color = Color.White,
                        fontFamily = NunitoFont,
                        fontWeight = FontWeight.Bold
                    )
                    Text(
                        text = "$ 8.99",
                        color = Color.White,
                        fontSize = 28.sp,
                        fontFamily = NunitoFont,
                        fontWeight = FontWeight.Black
                    )
                }
                Button(
                    modifier = Modifier.size(width = 132.dp, height = 56.dp),
                    onClick = { },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFFFFD538)
                    ),
                    shape = RoundedCornerShape(corner = CornerSize(16.dp))
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(
                            text = "To cart",
                            color = Color(0xFF29292B),
                            fontSize = 16.sp,
                            fontFamily = NunitoFont,
                            fontWeight = FontWeight.Bold
                        )
                        Spacer(modifier = Modifier.width(10.dp))
                        Icon(
                            imageVector = Icons.Outlined.ShoppingBag,
                            contentDescription = "Shopping",
                            tint = Color(0xFF29292B)
                        )
                    }
                }
            }
        }
    }
}

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
