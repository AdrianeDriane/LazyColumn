package com.adrianedilao.lazycolumn

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.unit.dp

import com.adrianedilao.lazycolumn.data.DataProvider

@Composable
fun AppHomeContent(){
    val affirmations = remember { DataProvider.affirmationsList }
    
    LazyColumn(
        contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp)
    ){
        items(
            items = affirmations,
            itemContent = {
                AffirmationListItem(affirmation = it)
            }
        )
    }
}