package com.example.mymaps.models

import java.io.Serializable

data class UserMap(val title: String, val description: String?, val places: List<Place>) : Serializable