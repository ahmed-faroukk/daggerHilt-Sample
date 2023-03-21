package com.example.daggerhiltimp.data.repository

import android.app.Application
import com.example.daggerhiltimp.R
import com.example.daggerhiltimp.data.remote.MyApi
import com.example.daggerhiltimp.domin.repository.MyRepository

class MyRepositoryImp(
    private val api: MyApi ,
    private val app : Application
) : MyRepository {

    init {
        val appName = app.getString(R.string.app_name)
        println("hello from $appName")
    }

    override suspend fun doNetworkCall() {
        TODO("Not yet implemented")
    }


}