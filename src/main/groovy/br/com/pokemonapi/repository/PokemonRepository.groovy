package br.com.pokemonapi.repository

import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

import br.com.pokemonapi.model.Pokemon

@Repository
interface PokemonRepository extends CrudRepository<Pokemon, Long> {
}
