package com.example.androiddevchallenge.screens

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.androiddevchallenge.ui.PuppyListItem
import com.example.androiddevchallenge.data.PuppyData

@Composable
fun PuppyListScreen(navController: NavController) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "Puppy Adoption") },
            )
        },
    ) {
        LazyColumn {
            items(PuppyData.puppyList) { item ->
                PuppyListItem(puppy = item, navController = navController)
                Divider(
                    Modifier.padding(horizontal = 12.dp),
                    color = MaterialTheme.colors.onSurface.copy(alpha = 0.08f)
                )
            }
        }
    }
}