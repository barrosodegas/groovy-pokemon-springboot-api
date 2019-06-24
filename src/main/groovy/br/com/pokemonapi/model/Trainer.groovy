/**
 * All rights reserved to Softway - Thomson Reuters.
 *
 * Creation date: 24 de jun de 2019 13:36:33
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
@Table(name = "trainers")
class Trainer implements Serializable {

    /**
     * UID.
     */
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "trainer_id")
    private Long trainerId;

    @NotNull
    @Column(nullable = false)
    private String name;

    @NotNull
    @Column(nullable = false)
    private Integer level;


    /**
     * Gets the attribute trainerId.
     *
     * @return trainerId.
     */
    public Long getTrainerId() {
        return trainerId;
    }


    /**
     * Sets the attribute trainerId.
     *
     * @param trainerId to set the trainerId.
     */
    public void setTrainerId(Long trainerId) {
        this.trainerId = trainerId;
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


    /**
     * Gets the attribute level.
     *
     * @return level.
     */
    public Integer getLevel() {
        return level;
    }


    /**
     * Sets the attribute level.
     *
     * @param level to set the level.
     */
    public void setLevel(Integer level) {
        this.level = level;
    }
}