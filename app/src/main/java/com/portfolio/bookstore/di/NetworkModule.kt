package com.portfolio.bookstore.di

import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.json.Json
import okhttp3.MediaType
import okhttp3.OkHttpClient
import retrofit2.Retrofit

@Module
@InstallIn(SingletonComponent::class)
class NetworkModule {

    @Provides
    @ExperimentalSerializationApi
    fun retrofit(okHttpClient: OkHttpClient): Retrofit {
        val contentType = "application/json"
        val converterFactory = Json.asConverterFactory(MediaType.get(contentType))
        return Retrofit.Builder()
            .client(okHttpClient)
            .addConverterFactory(converterFactory)
            .baseUrl("BASE_URL")
            .build()
    }

}