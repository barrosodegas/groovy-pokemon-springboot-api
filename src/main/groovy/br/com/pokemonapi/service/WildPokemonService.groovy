package br.com.pokemonapi.service

import br.com.pokemonapi.model.WildPokemon

interface WildPokemonService extends ApiService<WildPokemon> {

    /**
     * Find wild pokemons by trainer ID.
     * @param trainerId Trainer ID
     * @return Result list.
     */
    public List<WildPokemon> findByTrainerId(Long trainerId);
}
