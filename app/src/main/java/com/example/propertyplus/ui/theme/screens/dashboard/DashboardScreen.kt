package com.example.propertyplus.ui.theme.screens.dashboard

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.propertyplus.R
import com.example.propertyplus.navigation.ADD_PRODUCTS_URL
import com.example.propertyplus.navigation.ROUT_HOME
import com.example.propertyplus.navigation.ROUT_PROPERTY
import com.example.propertyplus.navigation.VIEW_PRODUCTS_URL
import com.example.propertyplus.ui.theme.Babypink
import com.example.propertyplus.ui.theme.Mypurple


@Composable
fun DashboardScreen(navController: NavController) {

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        Text(
            text = "PropertyPlus",
            fontSize = 60.sp,
            fontFamily = FontFamily.Cursive,
            color = Color.Magenta
        )
        Spacer(modifier = Modifier.height(5.dp))

        Image(
            painter = painterResource(id = R.drawable.img_6),
            contentDescription = "home",
            modifier = Modifier
                .size(100.dp),
            contentScale = ContentScale.Crop
        )

        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "Manage your properties with ease",
            fontSize = 18.sp,
            fontFamily = FontFamily.SansSerif,
            color = Color.Black
        )

        Spacer(modifier = Modifier.height(10.dp))

        Column {
            //Start of main card
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(700.dp),
                shape = RoundedCornerShape(topStart = 60.dp, topEnd = 60.dp),
                colors = CardDefaults.cardColors(Babypink)
            ) {
                //Row1
                Row(modifier = Modifier.padding(20.dp))
                {
                    //card
                    Card(
                        modifier = Modifier
                            .width(160.dp)
                            .height(180.dp)
                            .clickable {
                                navController.navigate(ROUT_HOME)
                            },
                        elevation = CardDefaults.cardElevation(10.dp)
                    ) {
                        Column {

                            Spacer(modifier = Modifier.height(10.dp))

                            Box(
                                modifier = Modifier.fillMaxWidth(),
                                contentAlignment = Alignment.Center
                            )
                            {
                                Image(
                                    painter = painterResource(id = R.drawable.img_7),
                                    contentDescription = "home",
                                    modifier = Modifier.size(60.dp)
                                )

                            }

                            Spacer(modifier = Modifier.height(10.dp))
                            Text(
                                text = "Home",
                                fontSize = 18.sp,
                                modifier = Modifier.fillMaxWidth(),
                                textAlign = TextAlign.Center

                            )

                        }

                    }
                    //End of card

                    //card2
                    Spacer(modifier = Modifier.height(20.dp))
                    Card(
                        modifier = Modifier
                            .width(160.dp)
                            .height(180.dp)
                            .clickable {
                                navController.navigate(ROUT_PROPERTY)
                            },
                        elevation = CardDefaults.cardElevation(10.dp)
                    ) {
                        Column {

                            Spacer(modifier = Modifier.height(10.dp))

                            Box(
                                modifier = Modifier.fillMaxWidth(),
                                contentAlignment = Alignment.Center
                            )
                            {
                                Image(
                                    painter = painterResource(id = R.drawable.img_8),
                                    contentDescription = "profile",
                                    modifier = Modifier.size(60.dp)
                                )


                            }

                            Spacer(modifier = Modifier.height(10.dp))
                            Text(
                                text = "Profile",
                                fontSize = 18.sp,
                                modifier = Modifier.fillMaxWidth(),
                                textAlign = TextAlign.Center

                            )

                        }

                    }
                    //End of Card

                } //End of Row1

                //Row2
                Row(modifier = Modifier.padding(20.dp))
                {
                    //card
                    Card(
                        modifier = Modifier
                            .width(160.dp)
                            .height(180.dp),
                        elevation = CardDefaults.cardElevation(10.dp)
                    ) {
                        Column {

                            Spacer(modifier = Modifier.height(10.dp))

                            Box(
                                modifier = Modifier.fillMaxWidth(),
                                contentAlignment = Alignment.Center
                            )
                            {
                                Image(
                                    painter = painterResource(id = R.drawable.img_9),
                                    contentDescription = "settings",
                                    modifier = Modifier.size(60.dp)
                                )

                            }

                            Spacer(modifier = Modifier.height(10.dp))
                            Text(
                                text = "Settings",
                                fontSize = 18.sp,
                                modifier = Modifier.fillMaxWidth(),
                                textAlign = TextAlign.Center

                            )

                        }

                    }
                    //End of card

                    //card
                    Card(
                        modifier = Modifier
                            .width(160.dp)
                            .height(180.dp)
                    ) {
                        Column {

                            Spacer(modifier = Modifier.height(10.dp))

                            Box(
                                modifier = Modifier.fillMaxWidth(),
                                contentAlignment = Alignment.Center
                            )
                            {
                                Image(
                                    painter = painterResource(id = R.drawable.img_10),
                                    contentDescription = "search",
                                    modifier = Modifier.size(60.dp)
                                )

                            }

                            Spacer(modifier = Modifier.height(10.dp))
                            Text(
                                text = "Search",
                                fontSize = 18.sp,
                                modifier = Modifier.fillMaxWidth(),
                                textAlign = TextAlign.Center

                            )

                        }

                    }
                    //End of Card

                }
            //End of Row2


                //Row3
                Row(modifier = Modifier.padding(20.dp))
                {
                    Spacer(modifier = Modifier.height(20.dp))
                    //card
                    Card(
                        modifier = Modifier
                            .width(160.dp)
                            .height(180.dp)
                            .clickable {
                                navController.navigate(ADD_PRODUCTS_URL)
                            }

                    ) {
                        Column {

                            Spacer(modifier = Modifier.height(10.dp))

                            Box(
                                modifier = Modifier.fillMaxWidth(),
                                contentAlignment = Alignment.Center
                            )
                            {
                                Image(
                                    painter = painterResource(id = R.drawable.img_11),
                                    contentDescription = "property",
                                    modifier = Modifier.size(60.dp)
                                )

                            }

                            Spacer(modifier = Modifier.height(10.dp))
                            Text(
                                text = "Add Products",
                                fontSize = 18.sp,
                                fontFamily = FontFamily.SansSerif,
                                color = Color.Black,
                                modifier = Modifier.fillMaxWidth(),
                                textAlign = TextAlign.Center

                            )

                        }

                    }
                    //End of card

                    Spacer(modifier = Modifier.height(20.dp))
                    //card
                    Card(
                        modifier = Modifier
                            .width(160.dp)
                            .height(180.dp)
                            .clickable {
                                navController.navigate(VIEW_PRODUCTS_URL)
                            }
                    ) {
                        Column {

                            Spacer(modifier = Modifier.height(10.dp))

                            Box(
                                modifier = Modifier.fillMaxWidth(),
                                contentAlignment = Alignment.Center
                            )
                            {
                                Image(
                                    painter = painterResource(id = R.drawable.img_12),
                                    contentDescription = "property",
                                    modifier = Modifier.size(60.dp)
                                )

                            }

                            Spacer(modifier = Modifier.height(10.dp))
                            Text(
                                text = "View Products",
                                fontSize = 18.sp,
                                fontFamily = FontFamily.SansSerif,
                                color = Color.Black,
                                modifier = Modifier.fillMaxWidth(),
                                textAlign = TextAlign.Center

                            )

                        }

                    }
                    //End of Card

                }
                //End of Row3


            }
        }

    }

}
@Composable
@Preview(showBackground = true)
fun DashboardScreenPreview() {
    DashboardScreen(rememberNavController())
}



