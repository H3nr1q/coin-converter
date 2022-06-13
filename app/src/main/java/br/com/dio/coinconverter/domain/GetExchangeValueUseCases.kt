package br.com.dio.coinconverter.domain.di

import br.com.dio.coinconverter.core.UseCase
import br.com.dio.coinconverter.data.model.ExchangeResponseValue
import br.com.dio.coinconverter.data.repository.CoinRepository
import kotlinx.coroutines.flow.Flow

class GetExchangeValueUseCases(
    private val repository : CoinRepository
) : UseCase<String, ExchangeResponseValue>() {
    override suspend fun execute(param: String): Flow<ExchangeResponseValue> {
        return repository.getExchangeValue(param)
    }
}