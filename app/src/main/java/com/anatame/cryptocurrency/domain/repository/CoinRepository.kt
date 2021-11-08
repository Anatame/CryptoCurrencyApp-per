package com.anatame.cryptocurrency.domain.repository

import com.anatame.cryptocurrency.data.remote.dto.CoinDetailDto
import com.anatame.cryptocurrency.data.remote.dto.CoinDto
import dagger.Provides

interface CoinRepository {
    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoinById(coinId: String): CoinDetailDto
}