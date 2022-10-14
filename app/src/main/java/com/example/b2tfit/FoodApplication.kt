package com.example.b2tfit

import android.app.Application


class FoodApplication : Application() {
    val db by lazy { AppDatabase.getInstance(this) }
}