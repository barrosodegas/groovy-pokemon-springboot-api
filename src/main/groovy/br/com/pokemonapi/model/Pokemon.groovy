/**
 * All rights reserved to Softway - Thomson Reuters.
 *
 * Creation date: 24 de jun de 2019 13:36:18
 */
package br.com.pokemonapi.model

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
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
@Table(name = "pokemons")
class Pokemon implements Serializable {

    /**
     * UID.
     */
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pokemon_id")
    private Long pokemonId;

    @NotNull
    @Column(nullable = false)
    private String name;

    /**
     * Gets the attribute pokemonId.
     *
     * @return pokemonId.
     */
    public Long getPokemonId() {
        return pokemonId;
    }


    /**
     * Sets the attribute pokemonId.
     *
     * @param pokemonId to set the pokemonId.
     */
    public void setPokemonId(Long pokemonId) {
        this.pokemonId = pokemonId;
    }


    /**
     * Gets the attribute name.
     *
     * @return name.
     */
    public String getName() {
        return name;
    }


    /**
     * Sets the attribute name.
     *
     * @param name to set the name.
     */
    public void setName(String name) {
        this.name = name;
    }
}
