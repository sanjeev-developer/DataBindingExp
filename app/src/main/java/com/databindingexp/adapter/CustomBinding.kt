package com.databindingexp.adapter

import android.graphics.drawable.Drawable
import android.net.Uri
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.squareup.picasso.Picasso


    @BindingAdapter("image")
    fun loadImage(imgtest: ImageView, imageUri:String) {
       // Picasso.get().load(imageUri).into(imgtest)
        Glide.with(imgtest.context).load(imageUri).into(imgtest)
    }