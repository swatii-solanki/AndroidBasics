package com.example.activites.module

import com.example.activites.remote.MyApi
import com.example.activites.repo.MyRepo
import com.example.activites.repo.MyRepoImpl
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideMyAPI(): MyApi {
        return Retrofit.Builder()
            .baseUrl("https://text.com")
            .build().create(MyApi::class.java)
    }
}