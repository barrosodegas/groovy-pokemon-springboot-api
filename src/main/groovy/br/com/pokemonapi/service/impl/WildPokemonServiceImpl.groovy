package br.com.pokemonapi.service.impl

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

import br.com.pokemonapi.model.WildPokemon
import br.com.pokemonapi.repository.WildPokemonRepository
import br.com.pokemonapi.service.WildPokemonService

@Service
class WildPokemonServiceImpl implements WildPokemonService {

    @Autowired
    private WildPokemonRepository repository;

    @Override
    public WildPokemon findById(Long entityId) {

        return this.repository.findById(entityId);
    }

    @Override
    public List<WildPokemon> findAll() {

        return this.repository.findAll();
    }

    @Override
    public boolean removeById(Long entityId) {

        this.repository.deleteById(entityId);
        return true;
    }

    @Override
    public WildPokemon save(WildPokemon entity) {

        return this.repository.save(entity);
    }

    @Override
    public List<WildPokemon> findByTrainerId(Long trainerId) {

        return this.repository.findByTrainerId(trainerId);
    }
}
