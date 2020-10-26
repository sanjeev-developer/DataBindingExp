package com.databindingexp.model

import android.graphics.drawable.Drawable
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.google.gson.annotations.SerializedName
import com.squareup.picasso.Picasso

data class Jsondata(

    @SerializedName("uiden") val uiden: String,
    @SerializedName("id") val id: Int,
    @SerializedName("name") val name: String,
    @SerializedName("age") val age: Int,
    @SerializedName("image") val image: String,
    @SerializedName("vehicle") val vehicle: Vehicle,
    @SerializedName("schoolName") val schoolName: String,
    @SerializedName("type") val type: String,

    )


