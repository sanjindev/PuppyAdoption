package com.example.androiddevchallenge.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.androiddevchallenge.data.Puppy

@Composable
fun PuppyDetailsScreen(puppy: Puppy?, navController: NavController) {
    puppy?.let {
        val isAdopt = mutableStateOf(puppy.isAdopt)
        Scaffold(
            topBar = {
                TopAppBar(
                    title = { Text(text = "My name is ${puppy.name}") },
                    navigationIcon = {
                        Icon(
                            imageVector = Icons.Default.ArrowBack,
                            contentDescription = "back",
                            tint = Color.White,
                            modifier = Modifier
                                .padding(16.dp)
                                .clickable {
                                    navController.navigateUp()
                                }
                        )
                    }
                )
            },
            floatingActionButton = {
                FloatingActionButton(
                    onClick = { isAdopt.value = !isAdopt.value },
                    backgroundColor = MaterialTheme.colors.background,
                    contentColor = MaterialTheme.colors.primary
                ) {
                    Icon(
                        if (isAdopt.value) Icons.Default.Favorite else Icons.Default.FavoriteBorder,
                        "Love dog",
                        tint = Color.Red
                    )
                }
            }
        ) {
            LazyColumn {
                item {
                    Image(
                        bitmap = ImageBitmap.imageResource(id = puppy.image),
                        contentDescription = puppy.name,
                        contentScale = ContentScale.FillWidth,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(12.dp)
                            .clip(RoundedCornerShape(12.dp))
                    )
                }
                item {
                    Row {
                        Text(
                            text = puppy.name,
                            modifier = Modifier.padding(start = 16.dp),
                            fontSize = 28.sp,
                            fontWeight = FontWeight.Bold
                        )
                        Icon(
                            imageVector = puppy.sex.flag,
                            contentDescription = puppy.sex.text,
                            tint = puppy.sex.color,
                            modifier = Modifier.align(Alignment.CenterVertically)
                        )
                    }
                    Divider(
                        Modifier.padding(12.dp),
                        color = MaterialTheme.colors.onSurface.copy(alpha = 0.08f)
                    )
                    ProfileItem("Breed:", puppy.breed)
                    ProfileItem("Age:", puppy.age)
                    ProfileItem("Color:", puppy.color)
                    Divider(
                        Modifier.padding(12.dp),
                        color = MaterialTheme.colors.onSurface.copy(alpha = 0.08f)
                    )
                    Text(
                        text = "My Story",
                        Modifier.padding(start = 16.dp),
                        fontFamily = FontFamily.SansSerif,
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Spacer(modifier = Modifier.height(12.dp))
                    Text(
                        text = puppy.story,
                        Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 16.dp)
                            .padding(bottom = 16.dp)
                    )
                }
            }
        }
    }
}

@Composable
fun ProfileItem(title: String, content: String) {
    Row(
        Modifier
            .padding(horizontal = 16.dp)
            .padding(top = 4.dp)
    ) {
        Text(title, Modifier.width(65.dp), fontWeight = FontWeight.Bold)
        Text(content)
    }
}