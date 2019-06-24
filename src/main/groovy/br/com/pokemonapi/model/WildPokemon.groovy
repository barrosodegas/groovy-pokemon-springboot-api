/**
 * All rights reserved to Softway - Thomson Reuters.
 *
 * Creation date: 24 de jun de 2019 13:38:52
 */
package br.com.pokemonapi.model

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne
import javax.persistence.Table
import javax.validation.constraints.NotNull

/**
 * <p>
 * TODO Lack include a comment for this class.
 * </p>
 *
 * @author <a href="mailto:U6070066@thomsonreuters.com">U6070066</a>
 *
 */
@Entity
@Table(name = "wild_pokemons")
class WildPokemon implements Serializable {

    /**
     * UID.
     */
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "wild_pokemon_id")
    private Long wildPokemonId;

    @NotNull
    @Column(nullable = false)
    private Integer combatPower;

    @ManyToOne
    @JoinColumn(name = "pokemon_id",  referencedColumnName = "pokemon_id", nullable = false)
    private Pokemon pokemon;

    @ManyToOne
    @JoinColumn(name = "trainer_id",  referencedColumnName = "trainer_id", nullable = false)
    private Trainer trainer;


    /**
     * Gets the attribute wildPokemonId.
     *
     * @return wildPokemonId.
     */
    public Long getWildPokemonId() {
        return wildPokemonId;
    }


    /**
     * Sets the attribute wildPokemonId.
     *
     * @param wildPokemonId to set the wildPokemonId.
     */
    public void setWildPokemonId(Long wildPokemonId) {
        this.wildPokemonId = wildPokemonId;
    }


    /**
     * Gets the attribute combatPower.
     *
     * @return combatPower.
     */
    public Integer getCombatPower() {
        return combatPower;
    }


    /**
     * Sets the attribute combatPower.
     *
     * @param combatPower to set the combatPower.
     */
    public void setCombatPower(Integer combatPower) {
        this.combatPower = combatPower;
    }


    /**
     * Gets the attribute pokemon.
     *
     * @return pokemon.
     */
    public Pokemon getPokemon() {
        return pokemon;
    }


    /**
     * Sets the attribute pokemon.
     *
     * @param pokemon to set the pokemon.
     */
    public void setPokemon(Pokemon pokemon) {
        this.pokemon = pokemon;
    }


    /**
     * Gets the attribute trainer.
     *
     * @return trainer.
     */
    public Trainer getTrainer() {
        return trainer;
    }


    /**
     * Sets the attribute trainer.
     *
     * @param trainer to set the trainer.
     */
    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }
}
