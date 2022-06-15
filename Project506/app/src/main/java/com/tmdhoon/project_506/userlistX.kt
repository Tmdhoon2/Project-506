package com.tmdhoon.project_506

data class userlistX(
    val user_list: List<User>
) {
    data class User(
        val account_id: String,
        val name: String,
        val student_id: Int
    )
}