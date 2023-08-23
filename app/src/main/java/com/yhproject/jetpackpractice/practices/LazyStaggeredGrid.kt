package com.yhproject.jetpackpractice.practices

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
import androidx.compose.foundation.lazy.staggeredgrid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.yhproject.jetpackpractice.components.RandomColorBox
import com.yhproject.jetpackpractice.models.ListItem
import kotlin.random.Random

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun LazyStaggeredGrid() {

    val items = (1..200).map {
        ListItem(
            height = Random.nextInt(100, 300).dp,
            color = Color(
                Random.nextLong(0xFFFFFFFF)
            ).copy(alpha = 1f)
        )
    }
    
    LazyVerticalStaggeredGrid(
        columns = StaggeredGridCells.Fixed(2),
        modifier = Modifier.fillMaxSize(),
        contentPadding = PaddingValues(16.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        verticalItemSpacing = 16.dp,

    ){

        items(items){
            RandomColorBox(item = it)
        }

    }
    
}