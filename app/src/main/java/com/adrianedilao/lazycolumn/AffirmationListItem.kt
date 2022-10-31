package com.adrianedilao.lazycolumn

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.adrianedilao.lazycolumn.data.Affirmation
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource

@Composable
fun AffirmationListItem(affirmation: Affirmation) {
    Card(
        shape = RoundedCornerShape(15.dp),
        elevation = 5.dp,
        modifier = Modifier.fillMaxWidth()
    ) {
        Column(modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth()) {

            AffirmationImage(affirmation = affirmation)

            Spacer(
                modifier = Modifier.height(15.dp))

            Text(
                text = affirmation.contentDescription,
                style = TextStyle(color = Color.Black, fontSize = 16.sp)
            )

        }
    }
    Spacer(
        modifier = Modifier.height(15.dp))
}

@Composable
private fun AffirmationImage(affirmation: Affirmation){
    Image(
        painter = painterResource(id = affirmation.affirmationImageId),
        contentDescription = null,
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .fillMaxWidth()
            .height(194.dp)
            .clip(RoundedCornerShape(corner = CornerSize(16.dp)))
    )
}