package com.example.danson.ui.theme.screens.dashboard


import android.content.Intent
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
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.danson.InsertActivity
import com.example.danson.R
import com.example.danson.navigation.ROUT_CLOTHING
import com.example.danson.ui.theme.Blue1

@Composable
fun DashboardScreen(navController: NavHostController) {

    Column (modifier = Modifier.fillMaxSize()){

        //topappbar
        TopAppBar(
            title = { Text(text = "Amazon Shop") },
            backgroundColor = Blue1
        )
        //end of topappbar

        Spacer(modifier = Modifier.height(30.dp))

        Row (modifier = Modifier.padding(start = 20.dp)){

            Column {
                Text(text = "Amazon", fontSize = 35.sp, color = Blue1, fontWeight = FontWeight.ExtraBold, fontFamily = FontFamily.Serif)
                Text(text = "Shop from A to Z", fontSize = 15.sp)
            }

            Spacer(modifier = Modifier.width(80.dp))

            Image(
                painter = painterResource(id = R.drawable.bus4),
                contentDescription ="" ,
                modifier = Modifier.size(100.dp))

        }
        //end of row

        Spacer(modifier = Modifier.height(30.dp))

        Column (modifier = Modifier.padding(start = 20.dp)){

            Row {
                val mContext = LocalContext.current
                Card(modifier = Modifier.size(width = 150.dp, height = 100.dp)

                    //CODE FOR NAVIGATION FROM DASHBOARD
                    .clickable {
                        navController.navigate(ROUT_CLOTHING)
                        Toast.makeText(mContext,"Go to clothing screen !",
                            Toast.LENGTH_SHORT).show()
                    })
                //END OF CODE FOR NAVIGATION TO RESPECTIVE SCREEN
                {
                    Column {
                        Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
                            Image(
                                painter = painterResource(id = R.drawable.bus3),
                                contentDescription ="" ,
                                modifier = Modifier.size(50.dp))
                        }
                        Text(text = "Clothing",
                            fontSize = 15.sp,
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center)
                    }
                }
                Spacer(modifier = Modifier.width(20.dp))
                val context= LocalContext.current
                Card(modifier = Modifier
                    .clickable { mContext.startActivity(Intent(mContext,InsertActivity::class.java))
                    }
                    .size(width = 150.dp, height = 100.dp)) {
                    Column {
                        Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
                            Image(
                                painter = painterResource(id = R.drawable.bus2),
                                contentDescription ="" ,
                                modifier = Modifier.size(50.dp))
                        }
                        Text(text = "Electronics",
                            fontSize = 15.sp,
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center)
                    }
                }


            }
            //end of row

            Spacer(modifier = Modifier.height(30.dp))

            Row {
                Card(modifier = Modifier.size(width = 150.dp, height = 100.dp)) {
                    Column {
                        Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
                            Image(
                                painter = painterResource(id = R.drawable.bus3),
                                contentDescription ="" ,
                                modifier = Modifier.size(50.dp))
                        }
                        Text(text = "Home",
                            fontSize = 15.sp,
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center)
                    }
                }
                Spacer(modifier = Modifier.width(20.dp))

                Card(modifier = Modifier.size(width = 150.dp, height = 100.dp)) {
                    Column {
                        Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
                            Image(
                                painter = painterResource(id = R.drawable.bus4),
                                contentDescription ="" ,
                                modifier = Modifier.size(50.dp))
                        }
                        Text(text = "Beauty",
                            fontSize = 15.sp,
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center)
                    }
                }


            }
            //end of row

            Spacer(modifier = Modifier.height(30.dp))


            Row {
                Card(modifier = Modifier.size(width = 150.dp, height = 100.dp)) {
                    Column {
                        Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
                            Image(
                                painter = painterResource(id = R.drawable.bus1),
                                contentDescription ="" ,
                                modifier = Modifier.size(50.dp))
                        }
                        Text(text = "Pharmacy",
                            fontSize = 15.sp,
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center)
                    }
                }
                Spacer(modifier = Modifier.width(20.dp))

                Card(modifier = Modifier.size(width = 150.dp, height = 100.dp)) {
                    Column {
                        Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
                            Image(
                                painter = painterResource(id = R.drawable.bus3),
                                contentDescription ="" ,
                                modifier = Modifier.size(50.dp))
                        }
                        Text(text = "Groceries",
                            fontSize = 15.sp,
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center)
                    }
                }


            }
            //end of row


        }



    }

}

@Preview(showBackground = true)
@Composable
fun DashboardScreenPreview() {
    DashboardScreen(rememberNavController())
}