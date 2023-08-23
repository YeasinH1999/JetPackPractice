package com.yhproject.jetpackpractice.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import com.yhproject.jetpackpractice.models.ListItem

@Composable
fun RandomColorBox(item: ListItem) {

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(item.height)
            .clip(RoundedCornerShape(10.dp))
            .background(item.color),
    )

}