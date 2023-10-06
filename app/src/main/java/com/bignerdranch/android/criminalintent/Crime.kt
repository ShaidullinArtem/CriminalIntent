package com.bignerdranch.android.criminalintent

import java.util.*

data class Crime(var id: UUID = UUID.randomUUID()) {
    var title : String = ""
    var date : Date = Date()
    var isSolved: Boolean = false

    constructor(id: UUID, title: String, date: Date=Date(), isSolver: Boolean): this(id){
        this.id = id
        this.title = title
        this.date = date
        this.isSolved = isSolver
    }
}
