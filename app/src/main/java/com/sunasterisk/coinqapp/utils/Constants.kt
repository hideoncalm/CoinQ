package com.sunasterisk.coinqapp.utils

object CoinConstant {
    const val COIN_ID = "id"
    const val COIN_NAME = "name"
    const val COIN_SYMBOL = "symbol"
    const val COIN_IMAGE = "image"
    const val COIN_PRICE = "current_price"
    const val DAY_CHANGE = "price_change_percentage_24h"
    const val MARKET_CAP = "market_cap"
    const val COIN_RANK = "market_cap_rank"
    const val COIN_VOLUME = "total_volume"
    const val COIN_HIGH = "high_24h"
    const val COIN_LOW = "low_24h"
    const val COIN_MAX_HIGH = "ath"
    const val SPARKLINE_WEEK = "sparkline_in_7d"
    const val SPARKLINE_PRICE = "price"
}

object ExchangeConstant {
    const val EXCHANGE_ID = "id"
    const val EXCHANGE_NAME = "name"
    const val EXCHANGE_IMAGE = "image"
    const val EXCHANGE_VOLUME = "trade_volume_24h_btc"
    const val EXCHANGE_TRUST = "trust_score"
}

object RequestConstant{
    const val REQUEST_PERPAGE = 100
    const val REQUEST_PAGE = 1
}
