//package com.example.pokedex.data.di
//
//import dagger.Module
//import dagger.Provides
//import dagger.hilt.InstallIn
//import dagger.hilt.components.SingletonComponent
//import javax.inject.Singleton
//
//@Module
//@InstallIn(SingletonComponent::class)
//object RepositoryModule {
//
//    @Provides
//    @Singleton
//    fun providesPokemonsRepository():
//}

package com.example.pokedex.data.di

import com.example.pokedex.data.DataSource.PokemonsDataSource
import com.example.pokedex.data.repositories.PokemonsRepository
import com.example.pokedex.data.responses.PokeApiResponse
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

//    @Provides
//    @Singleton
//    fun provideApiService(): ApiService {
//        return Retrofit.Builder()
//            .baseUrl("https://pokeapi.co/api/v2/")
//            .addConverterFactory(GsonConverterFactory.create())
//            .build()
//            .create(ApiService::class.java)
//    }

    @Provides
    @Singleton
    fun providesCharactersRepository(
        pokemonsRepository: PokemonsDataSource
    ): PokemonsRepository {
        return PokemonsRepository(pokemonsRepository)
    }
}

