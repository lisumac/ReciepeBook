package com.lisa.reciepebook.model.retrofit

import com.lisa.reciepebook.model.pojo.*
import retrofit2.http.Query
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET
interface FoodApi {
    @GET("categories.php")
    fun getCategories(): Response<CategoryResponse>

    @GET("filter.php?")
    fun getMealsByCategory(@Query("i") category:String):Response<MealsResponse>

    @GET ("random.php")
    fun getRandomMeal():Response<RandomMealResponse>

    @GET("lookup.php?")
    fun getMealById(@Query("i") id:String):Response<RandomMealResponse>

    @GET("search.php?")
    fun getMealByName(@Query("s") s:String):Response<RandomMealResponse>
}