package com.tmdhoon.project_506

import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface StudentList {
    @GET("user/search")
    fun requestList(
        @Path("userName") userName: String,
        @Query("dat
    )
}