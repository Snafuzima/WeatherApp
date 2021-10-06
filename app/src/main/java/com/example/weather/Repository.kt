package com.example.weather

object Repository {

    private val testData = Note("Tittle Repository", "Note Repository", 1)

    val newCopy = testData.copy(tittle = "Tittle Copy Test", note = "Note Copy Test", color = 2)
}