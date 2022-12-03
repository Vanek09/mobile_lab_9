package com.chisw.lab7

/**
 * This class describe student
 * The method toString override automatically because our class is data class
 */
data class Student(
    val name: String,
    val faculty: String,
    val group: String
) {

    fun getInfo() = "$name has mark ${getMark()} in $UNIVERSITY_NAME university"

    private fun getMark() = 99

    companion object {
        const val UNIVERSITY_NAME = "KPI"
    }
}
