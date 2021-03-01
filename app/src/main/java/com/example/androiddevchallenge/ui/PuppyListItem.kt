package com.example.androiddevchallenge.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.navigate
import com.example.androiddevchallenge.data.Puppy

@Composable
fun PuppyListItem(puppy: Puppy, navController: NavController) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .padding(16.dp)
            .clickable {
                navController.navigate("details/${puppy.id}")
            }
    ) {
        PuppyImage(puppy = puppy)
        Column(modifier = Modifier.weight(1f)) {
            Text(
                text = puppy.name,
                style = MaterialTheme.typography.subtitle1,
                fontWeight = FontWeight.Bold
            )
            PuppyInfo("${puppy.sex.text},${puppy.age}")
            PuppyInfo(puppy.color)
            PuppyInfo(puppy.breed)
        }
    }
}

@Composable
fun PuppyImage(puppy: Puppy) {
    Image(
        bitmap = ImageBitmap.imageResource(id = puppy.image),
        puppy.name,
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .size(120.dp, 80.dp)
            .padding(end = 12.dp)
            .clip(MaterialTheme.shapes.medium)
    )
}

@Composable
fun PuppyInfo(info: String) {
    Text(
        info,
        style = MaterialTheme.typography.body2,
        maxLines = 1,
        overflow = TextOverflow.Ellipsis
    )
}