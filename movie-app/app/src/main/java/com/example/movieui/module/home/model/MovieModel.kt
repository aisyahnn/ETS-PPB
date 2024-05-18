package com.example.movieui.module.home.model

import com.example.movieui.R

data class MovieModel(
    val id:String,
    val title: String,
    val assetImage: Int,
    val type: String,
    val duration: String,
    val rating: String,
    val synopsis: String,
    val isPlaying: Boolean
)


val newcoming = listOf(
    MovieModel(
        id= "1",
        title = "Kung Fu Panda 4",
        assetImage = R.drawable.kungfupanda,
        type = "Animation",
        duration = "1h 27m",
        rating = "9/10",
        synopsis = "A fanboy of a supervillain supergroup known as the Vicious 6, Gru hatches a plan to become evil enough to join them, with the backup of his followers, the Minions.",
        isPlaying = true
    ),
    MovieModel(
        id= "2",
        title = "The Architecture of Love (TAOL)",
        assetImage = R.drawable.taol,
        type = "Drama",
        duration = "1h 59m",
        rating = "8/10",
        synopsis = "After his retirement is interrupted by Gorr the God Butcher, a galactic killer who seeks the extinction of the gods, Thor enlists the help of King Valkyrie, Korg, and ex-girlfriend Jane Foster, who now inexplicably wields Mjolnir as the Mighty Thor. Together they embark upon a harrowing cosmic adventure to uncover the mystery of the God Butcher's vengeance and stop him before it's too late.",
        isPlaying = true
    ),
    MovieModel(
        id= "3",
        title = "Godzilla x Kong: The New Empire",
        assetImage = R.drawable.godzilla,
        type = "Action",
        duration = "1h 55m",
        rating = "8.0/10",
        synopsis = "Four years after Isla Nublar was destroyed, dinosaurs now live—and hunt—alongside humans all over the world. This fragile balance will reshape the future and determine, once and for all, whether human beings are to remain the apex predators on a planet they now share with history's most fearsome creatures.",
        isPlaying = true
    )
)

val upcoming = listOf(
    MovieModel(
        id= "4",
        title = "Kupu-Kupu Kertas",
        assetImage = R.drawable.kkkertas,
        type = "Drama",
        duration = "1h 46m",
        rating = "N/A",
        synopsis = "When Superman and the rest of the Justice League are kidnapped, Krypto the Super-Dog must convince a rag-tag shelter pack - Ace the hound, PB the potbellied pig, Merton the turtle and Chip the squirrel - to master their own newfound powers and help him rescue the superheroes.",
        isPlaying = false
    ),
    MovieModel(
        id= "5",
        title = "Spiderman 4",
        assetImage = R.drawable.spiderman4,
        type = "Action",
        duration = "2h 11m",
        rating = "N/A",
        synopsis = "Residents in a lonely gulch of inland California bear witness to an uncanny, chilling discovery.",
        isPlaying = false
    ),
    MovieModel(
        id= "6",
        title = "Mufasa: The Lion King",
        assetImage = R.drawable.mufasa,
        type = "Adventure",
        duration = "1h 46m",
        rating = "N/A",
        synopsis = "A dramatization of the rescue of a boys soccer team from an underground cave in Thailand.",
        isPlaying = false
    )
)

