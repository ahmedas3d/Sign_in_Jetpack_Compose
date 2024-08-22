package com.example.jetpackcomposeauthui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController


//===================Task==========================
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TripScreen(onBackPressed: NavHostController) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Trip Details") },
                navigationIcon = {
                    IconButton(onClick = {}) {
                        Icon(
                            imageVector = Icons.Default.ArrowBack,
                            contentDescription = "Back",
                            tint = Color.Black
                        )
                    }
                },
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                    containerColor = Color.White,
                    titleContentColor = Color.Black
                )
            )
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .padding(paddingValues)
                .padding(top = 8.dp)
                .background(color = Color.LightGray)
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            TripCard()
            TripCard()
        }
    }
}

@Composable
fun TripCard() {
    Card(
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color.White
        ),
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth()
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(160.dp),
            contentAlignment = Alignment.Center,
        ) {
            Column(
                modifier = Modifier
                    .wrapContentSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.Start
            ) {
                Row(
                    modifier = Modifier
                        .wrapContentSize(),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Column {
                        Text(text = "11:34 AM", Modifier.padding(top = 8.dp, end = 8.dp, bottom = 5.dp))
                        Text(text = "12:17 PM", )
                    }
                    Divider(
                        color = Color.Gray,
                        modifier = Modifier
                            .width(1.5.dp)
                            .height(80.dp)
                    )
                    Row {
                        Column {
                            Row {
                                Icon(
                                    imageVector = Icons.Default.LocationOn,
                                    tint = Color.LightGray,
                                    contentDescription = "Running Icon",
                                    modifier = Modifier
                                        .padding(start = 12.dp)
                                        .size(18.dp)
                                )
                                Text(
                                    text = "22 min",
                                    color = Color.LightGray,
                                )
                            }
                            Text(
                                text = "Abo Rawash Toll Station",
                                Modifier.padding(start = 15.dp, bottom = 8.dp)
                            )
                            Text(
                                text = "Zamzam Mall(Other Side) Has...",
                                Modifier.padding(start = 15.dp)
                            )
                            Row {
                                Icon(
                                    imageVector = Icons.Default.LocationOn,
                                    tint = Color.LightGray,
                                    contentDescription = "Running Icon",
                                    modifier = Modifier
                                        .padding(start = 12.dp)
                                        .size(18.dp)
                                )
                                Text(
                                    text = "3 min",
                                    color = Color.LightGray,
                                )
                            }
                        }
                    }
                }
                Row(
                    modifier = Modifier
                        .wrapContentSize()
                        .padding(top = 20.dp),
                ) {
                    Row(
                        modifier = Modifier
                            .clip(shape = RoundedCornerShape(20.dp))
                            .background(Color.Black.copy(alpha = 0.10f))
                    ) {
                        Text(
                            text = "Premium ",
                            color = Color.Green,
                            modifier = Modifier.padding(start = 5.dp)
                        )
                        Text(
                            text = "* Bus",
                            color = Color.Gray,
                        )
                        Text(
                            text = "* AC",
                            color = Color.Gray,
                            modifier = Modifier.padding(end = 5.dp)
                        )
                    }
                    Spacer(modifier = Modifier.width(100.dp))
                    Row {
                        Text(
                            text = "39 EGP",
                            color = Color.Green,
                        )
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewTripScreen() {
    TripScreen(rememberNavController())
}


