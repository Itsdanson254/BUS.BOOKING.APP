package com.example.danson.ui.theme.screens.Clothing
import android.widget.Toast
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
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.danson.ui.theme.Blue1
import com.example.danson.R
import com.example.danson.navigation.ROUT_CLOTHING

@Composable
fun ClothingScreen(navController: NavHostController) {
    Column(modifier = Modifier.fillMaxSize()) {

        //Top app bar
        TopAppBar(
            title = { Text(text = "SUPER PREMIUM BOOKING") },
            backgroundColor = Blue1
        )
        //end of Top app bar
        val mContext = LocalContext.current

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(150.dp),
            contentAlignment = Alignment.Center
        ) {
            val mContext = LocalContext.current
            Image(
                painter = painterResource(id = R.drawable.bus33),
                contentDescription = "",
                modifier = Modifier
                    .clickable {
                        navController.navigate(ROUT_CLOTHING)
                        Toast.makeText(mContext,"Go to winter collection !",
                            Toast.LENGTH_SHORT).show() }
                    .fillMaxSize(),
                contentScale = ContentScale.Crop
            )
            Column {



            }

        }
        Spacer(modifier = Modifier.height(10.dp))

        Column (modifier = Modifier
            .verticalScroll(rememberScrollState())
            .padding(start = 20.dp)){
            Row {

                //CARD1
                Card(
                    modifier = Modifier
                        .height(275.dp)
                        .width(180.dp)
                ) {

                    Column {
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(180.dp),
                            contentAlignment = Alignment.Center
                        )
                        {
                            Image(
                                painter = painterResource(id = R.drawable.bus2),
                                contentDescription = "Shirt",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.Crop
                            )
                        }

                        Spacer(modifier = Modifier.height(10.dp))
                        Text(
                            text = "Shirt",
                            fontSize = 20.sp,
                            modifier = Modifier.fillMaxWidth(),
                            fontWeight = FontWeight.Bold

                        )
                        Spacer(modifier = Modifier.height(3.dp))

                        Row {

                            Text(text = "Ksh. 500", textAlign = TextAlign.Center)

                            TextButton(onClick = { val simToolKitLaunchIntent =
                                mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                                simToolKitLaunchIntent?.let { mContext.startActivity(it)} }, ){
                                Text(text = "Pay", color = Color.Blue)

                            }
                        }

                    }

                }
                //END CARD1

                Spacer(modifier = Modifier.width(15.dp))

                //CARD2
                Card(
                    modifier = Modifier
                        .height(275.dp)
                        .width(180.dp)
                ) {

                    Column {
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(180.dp),
                            contentAlignment = Alignment.Center
                        )
                        {
                            Image(
                                painter = painterResource(id = R.drawable.bus33),
                                contentDescription = "Sweater",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.Crop
                            )
                        }

                        Spacer(modifier = Modifier.height(10.dp))
                        Text(
                            text = "Sweater",
                            fontSize = 20.sp,
                            modifier = Modifier.fillMaxWidth(),
                            fontWeight = FontWeight.Bold

                        )
                        Spacer(modifier = Modifier.height(3.dp))

                        Row {

                            Text(text = "Ksh. 750", textAlign = TextAlign.Center)

                            TextButton(onClick = { val simToolKitLaunchIntent =
                                mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                                simToolKitLaunchIntent?.let { mContext.startActivity(it)} },
                            ) {
                                Text(text = "Pay", color = Color.Blue)

                            }
                        }

                    }

                }
                //END CARD2
            }
            //end row1

            Spacer(modifier = Modifier.height(3.dp))


            Row {

                //CARD1
                Card(
                    modifier = Modifier
                        .height(275.dp)
                        .width(180.dp)
                ) {

                    Column {
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(180.dp),
                            contentAlignment = Alignment.Center
                        )
                        {
                            Image(
                                painter = painterResource(id = R.drawable.bus2),
                                contentDescription = "coat",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.Crop
                            )
                        }

                        Spacer(modifier = Modifier.height(10.dp))
                        Text(
                            text = "coat",
                            fontSize = 20.sp,
                            modifier = Modifier.fillMaxWidth(),
                            fontWeight = FontWeight.Bold

                        )
                        Spacer(modifier = Modifier.height(3.dp))

                        Row {

                            Text(text = "Ksh. 1500", textAlign = TextAlign.Center)

                            TextButton(onClick = { val simToolKitLaunchIntent =
                                mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                                simToolKitLaunchIntent?.let { mContext.startActivity(it)} },
                            ) {
                                Text(text = "Pay", color = Color.Blue)

                            }
                        }

                    }

                }
                //END CARD1

                Spacer(modifier = Modifier.width(15.dp))

                //CARD2
                Card(
                    modifier = Modifier
                        .height(275.dp)
                        .width(180.dp)
                ) {

                    Column {
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(180.dp),
                            contentAlignment = Alignment.Center
                        )
                        {
                            Image(
                                painter = painterResource(id = R.drawable.bus44),
                                contentDescription = "dress",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.Crop
                            )
                        }

                        Spacer(modifier = Modifier.height(10.dp))
                        Text(
                            text = "Dress",
                            fontSize = 20.sp,
                            modifier = Modifier.fillMaxWidth(),
                            fontWeight = FontWeight.Bold

                        )
                        Spacer(modifier = Modifier.height(3.dp))

                        Row {

                            Text(text = "Ksh. 1500", textAlign = TextAlign.Center)

                            TextButton(onClick = { val simToolKitLaunchIntent =
                                mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                                simToolKitLaunchIntent?.let { mContext.startActivity(it)} },
                            ) {
                                Text(text = "Pay", color = Color.Blue)

                            }
                        }

                    }

                }
                //END CARD2
            }
            //end row2

            Spacer(modifier = Modifier.height(3.dp))

            Row {

                //CARD1
                Card(
                    modifier = Modifier
                        .height(275.dp)
                        .width(180.dp)
                ) {

                    Column {
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(180.dp),
                            contentAlignment = Alignment.Center
                        )
                        {
                            Image(
                                painter = painterResource(id = R.drawable.bus1),
                                contentDescription = "watch",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.Crop
                            )
                        }

                        Spacer(modifier = Modifier.height(10.dp))
                        Text(
                            text = "Watch",
                            fontSize = 20.sp,
                            modifier = Modifier.fillMaxWidth(),
                            fontWeight = FontWeight.Bold

                        )
                        Spacer(modifier = Modifier.height(3.dp))

                        Row {

                            Text(text = "Ksh. 2000", textAlign = TextAlign.Center)

                            TextButton(onClick = { val simToolKitLaunchIntent =
                                mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                                simToolKitLaunchIntent?.let { mContext.startActivity(it)} },
                            ) {
                                Text(text = "Pay", color = Color.Blue)

                            }
                        }

                    }

                }
                //END CARD1

                Spacer(modifier = Modifier.width(15.dp))

                //CARD2
                Card(
                    modifier = Modifier
                        .height(275.dp)
                        .width(180.dp)
                ) {

                    Column {
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(180.dp),
                            contentAlignment = Alignment.Center
                        )
                        {
                            Image(
                                painter = painterResource(id = R.drawable.bus44),
                                contentDescription = "Suit",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.Crop
                            )
                        }

                        Spacer(modifier = Modifier.height(10.dp))
                        Text(
                            text = "Ladies Suit",
                            fontSize = 20.sp,
                            modifier = Modifier.fillMaxWidth(),
                            fontWeight = FontWeight.Bold

                        )
                        Spacer(modifier = Modifier.height(3.dp))

                        Row {

                            Text(text = "Ksh. 3500", textAlign = TextAlign.Center)

                            TextButton(onClick = { val simToolKitLaunchIntent =
                                mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                                simToolKitLaunchIntent?.let { mContext.startActivity(it)} },
                            ) {
                                Text(text = "Pay", color = Color.Blue)

                            }
                        }

                    }

                }
                //END CARD2
            }
            //end row3


        }


    }
}

@Preview(showBackground = true)
@Composable
fun ClothingScreenPreview(){
    ClothingScreen(rememberNavController())
}