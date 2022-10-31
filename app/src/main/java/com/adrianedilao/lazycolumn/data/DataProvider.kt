package com.adrianedilao.lazycolumn.data

import com.adrianedilao.lazycolumn.R


object DataProvider{

    val affirmation = Affirmation(
        id = 1,
        contentDescription = "I am strong.",
        affirmationImageId = R.drawable.image1
    )

    val affirmationsList = listOf(
        affirmation,
        Affirmation(
            id = 2,
            contentDescription = "I believe in myself.",
            affirmationImageId = R.drawable.image2
        ),
        Affirmation(
            id = 3,
            contentDescription = "Each day is a new opportunity to grow and be a better version of myself.",
            affirmationImageId = R.drawable.image3
        ),
        Affirmation(
            id = 4,
            contentDescription = "Every challenge in my life is an opportunity to learn from.",
            affirmationImageId = R.drawable.image4
        ),
        Affirmation(
            id = 5,
            contentDescription = "I have so much to be grateful for.",
            affirmationImageId = R.drawable.image5
        ),
        Affirmation(
            id = 6,
            contentDescription = "Good things are always coming into my life.",
            affirmationImageId = R.drawable.image6
        ),
        Affirmation(
            id = 7,
            contentDescription = "New opportunities await me at every turn.",
            affirmationImageId = R.drawable.image7
        ),
        Affirmation(
            id = 8,
            contentDescription = "I have the courage to follow my heart.",
            affirmationImageId = R.drawable.image8
        ),
        Affirmation(
            id = 9,
            contentDescription = "Things will unfold at precisely the right time.",
            affirmationImageId = R.drawable.image9
        ),
        Affirmation(
            id = 10,
            contentDescription = "I will be present in all the moments that this day brings.",
            affirmationImageId = R.drawable.image10
        )
    )
}