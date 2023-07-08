package com.example.themoviedb_wahyu.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class TelevisionResponse(
    @SerializedName("result")
    val television: List<Television>
): Parcelable {
    constructor(): this(mutableListOf())
}