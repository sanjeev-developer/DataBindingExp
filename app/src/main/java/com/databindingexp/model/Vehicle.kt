package com.databindingexp.model

import com.google.gson.annotations.SerializedName

data class Vehicle (

    @SerializedName("id") val id : Int,
    @SerializedName("make") val make : String,
    @SerializedName("plate") val plate : String,
    @SerializedName("model") val model : String,
    @SerializedName("year") val year : Int,
    @SerializedName("insurance") val insurance : Boolean,
    @SerializedName("type") val type : String
)