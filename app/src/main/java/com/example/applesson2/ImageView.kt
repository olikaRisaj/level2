package com.example.applesson2

import android.widget.ImageView
import com.bumptech.glide.Glide

fun ImageView.downloadImage(imageAddress: String) {
    Glide
        .with(this)
        .load(imageAddress)
        .circleCrop()
        .into(this)
}