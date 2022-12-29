package com.portfolio.bookstore.data

interface DashboardApiService {
    suspend fun getBanners()
    suspend fun getProducts()
}