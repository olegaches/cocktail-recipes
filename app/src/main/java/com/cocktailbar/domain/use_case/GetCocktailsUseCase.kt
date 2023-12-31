package com.cocktailbar.domain.use_case

import com.cocktailbar.domain.repository.CocktailRepository
import com.cocktailbar.domain.model.Cocktail
import kotlinx.coroutines.flow.Flow
import me.tatarka.inject.annotations.Inject

@Inject
class GetCocktailsUseCase(
    private val repository: CocktailRepository
) {
    operator fun invoke(): Flow<List<Cocktail>> {
        return repository.getCocktailList()
    }
}