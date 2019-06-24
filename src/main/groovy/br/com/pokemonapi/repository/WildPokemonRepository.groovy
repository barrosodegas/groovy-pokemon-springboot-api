package br.com.pokemonapi.repository

import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository

import br.com.pokemonapi.model.WildPokemon

@Repository
interface WildPokemonRepository extends CrudRepository<WildPokemon, Long> {

    /**
     * Find wild pokemons by trainer ID.
     * @param trainerId Trainer ID
     * @return Result list.
     */
    @Query("select wp from WildPokemon wp where wp.trainer.trainerId = :trainerId")
    public List<WildPokemon> findByTrainerId(@Param("trainerId") Long trainerId);
}
