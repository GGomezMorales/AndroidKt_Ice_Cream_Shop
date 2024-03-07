package com.ggomezmorales.icecreamshop.presentation.screen.main.adapter

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.material.icons.outlined.PushPin
import androidx.compose.material.icons.outlined.Send
import androidx.compose.material.icons.outlined.ShoppingBag
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ggomezmorales.icecreamshop.R
import com.ggomezmorales.icecreamshop.presentation.ui.theme.NunitoFont

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
                        modifier = Modifier.size(42.dp),
                        onClick = { }
                    ) {
                        Icon(
                            imageVector = Icons.Outlined.FavoriteBorder,
                            contentDescription = null,
                            tint = Color.White
                        )
                    }
                    IconButton(
                        modifier = Modifier
                            .size(42.dp)
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
                    IconButton(
                        modifier = Modifier
                            .size(42.dp)
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
