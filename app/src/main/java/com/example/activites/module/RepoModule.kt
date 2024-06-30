package com.example.activites.module

import com.example.activites.repo.MyRepo
import com.example.activites.repo.MyRepoImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepoModule {

    @Binds
    @Singleton
    abstract fun bindRepo(myRepoImpl: MyRepoImpl) : MyRepo
}