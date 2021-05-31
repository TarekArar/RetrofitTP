package com.example.tp_s5_exo8

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var textViewResult: TextView = findViewById(R.id.todos)
        var retrofit : Retrofit = Retrofit.Builder()
            .baseUrl("https://jsonplaceholder.typicode.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        var jsonPlaceHolderApi : JsonPlaceHolderApi = retrofit.create(JsonPlaceHolderApi::class.java);

        var call : Call<List<Todo>> = jsonPlaceHolderApi.getTodos()

        call.enqueue(object : Callback<List<Todo>>{
            override fun onResponse(call: Call<List<Todo>>, response: Response<List<Todo>>) {

            }
            override fun onFailure(call: Call<List<Todo>>, t: Throwable) {
            }
        })

    }
}