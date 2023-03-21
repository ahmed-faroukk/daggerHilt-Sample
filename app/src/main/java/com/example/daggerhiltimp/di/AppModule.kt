package com.example.daggerhiltimp.di

import android.app.Application
import com.example.daggerhiltimp.data.remote.MyApi
import com.example.daggerhiltimp.data.repository.MyRepositoryImp
import com.example.daggerhiltimp.domin.repository.MyRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.create
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    fun provideMyApi() : MyApi{
        return Retrofit.Builder()
            .baseUrl("https://rest.com")
            .build().create(MyApi::class.java)
    }
    @Provides
    @Singleton
    fun provideMyRepository(api : MyApi , app : Application) : MyRepository{
            return MyRepositoryImp(api ,app)
    }

}