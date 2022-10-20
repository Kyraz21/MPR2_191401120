package com.example.intent

import android.os.Parcel
import android.os.Parcelable


data class game(val name: String?,
                val publisher: String?
) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(name)
        parcel.writeString(publisher)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<game> {
        override fun createFromParcel(parcel: Parcel): game {
            return game(parcel)
        }

        override fun newArray(size: Int): Array<game?> {
            return arrayOfNulls(size)
        }
    }
}

