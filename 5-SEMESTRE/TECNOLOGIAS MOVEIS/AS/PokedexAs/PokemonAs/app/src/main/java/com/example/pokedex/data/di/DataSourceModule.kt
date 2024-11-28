package com.example.pokedex.data.di

import com.example.pokedex.data.DataSource.PokemonsDataSource
import com.example.pokedex.data.api.ApiService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DataSourceModule {

    @Provides
    @Singleton
    fun providesDataSourceModule(
        api: ApiService
    ): PokemonsDataSource {
        return PokemonsDataSource(api)
    }
}