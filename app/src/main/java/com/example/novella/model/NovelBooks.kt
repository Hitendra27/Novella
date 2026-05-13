//package com.example.novella.model
//
//import androidx.annotation.DrawableRes
//import androidx.annotation.StringRes
//
//data class NovelBooks(
//    val id: Int,
//    @StringRes val novelTitle: Int,
//    @StringRes val novelAuthor: Int,
//    @StringRes val novelDateOfPublication: Int,
//    @StringRes val isbnNumber: Int
//)

package com.example.novella.model

import androidx.annotation.StringRes

data class NovelBooks(

    val id: Int,

    @StringRes
    val novelTitle: Int,

    @StringRes
    val novelAuthor: Int,

    @StringRes
    val novelDateOfPublication: Int,

    val isbnNumber: String
)