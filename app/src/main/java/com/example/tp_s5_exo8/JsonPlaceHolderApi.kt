package com.example.tp_s5_exo8

    import retrofit2.Call
import retrofit2.http.GET

interface JsonPlaceHolderApi {

    @GET("todos")
    fun getTodos(): Call<List<Todo>>

}