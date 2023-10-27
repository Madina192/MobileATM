package com.example.mobileatm.data

import android.content.Context
import android.content.SharedPreferences

class Preference(context: Context) {

    val sharedPreferences: SharedPreferences =
        context.getSharedPreferences("sharedPreferences", Context.MODE_PRIVATE)

    var balance: Float
        set(value) = sharedPreferences.edit().putFloat(BALANCE_KEY, value).apply()
        get() = sharedPreferences.getFloat(BALANCE_KEY, 0.0F)

    companion object {
        const val BALANCE_KEY = "balance_key"
    }
}