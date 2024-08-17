package com.example.a30dyasapp.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.a30dyasapp.R

val Acme = FontFamily(
    Font(R.font.acme_regular)
)

// Set of Material typography styles to start with
val Typography = Typography(
    displayLarge = TextStyle(
        fontFamily = Acme,
        fontWeight = FontWeight.Normal,
        fontSize = 32.sp,
    ),
    displayMedium = TextStyle(
        fontFamily = Acme,
        fontWeight = FontWeight.Bold,
        fontSize = 20.sp,
    ),
    labelSmall = TextStyle(
        fontFamily = Acme,
        fontWeight = FontWeight.Bold,
        fontSize = 14.sp,
    ),
    labelLarge = TextStyle(
        fontFamily = Acme,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp,
    )
)