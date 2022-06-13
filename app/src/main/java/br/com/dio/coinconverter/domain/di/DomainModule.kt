package br.com.dio.coinconverter.domain.di

import br.com.dio.coinconverter.domain.ListExchangeUseCase
import br.com.dio.coinconverter.domain.SaveExchangeUseCase
import org.koin.core.context.loadKoinModules
import org.koin.core.module.Module
import org.koin.dsl.module

object DomainModule {
    fun load(){
        loadKoinModules(useCasesModules())
    }

    private fun useCasesModules(): Module {
        return module{
            factory { ListExchangeUseCase(get()) }
            factory { SaveExchangeUseCase(get()) }
            factory { GetExchangeValueUseCases(get()) }
        }

    }
}