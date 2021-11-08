package com.anatame.cryptocurrency.presentation.coin_detail

import com.anatame.cryptocurrency.domain.model.Coin
import com.anatame.cryptocurrency.domain.model.CoinDetail

data class CoinDetailState(
    val isLoading: Boolean = false,
    val coin: CoinDetail? = null,
    val error: String = ""
)