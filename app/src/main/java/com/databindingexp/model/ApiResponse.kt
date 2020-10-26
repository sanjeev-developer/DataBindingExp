package com.databindingexp.model

import com.google.gson.annotations.SerializedName

data class ApiResponse (
    @SerializedName("jsondata") val jsondata : List<Jsondata>
)

