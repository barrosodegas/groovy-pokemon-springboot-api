package br.com.pokemonapi.service.impl

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

import br.com.pokemonapi.model.Pokemon
import br.com.pokemonapi.repository.PokemonRepository
import br.com.pokemonapi.service.ApiService

@Service
class PokemonServiceImpl implements ApiService<Pokemon> {

    @Autowired
    private PokemonRepository repository;

    @Override
    public Pokemon findById(Long entityId) {

        return this.repository.findById(entityId).orElse(null);
    }

    @Override
    public List<Pokemon> findAll() {

        return this.repository.findAll();
    }

    @Override
    public boolean removeById(Long entityId) {

        this.repository.deleteById(entityId);
        return true;
    }

    @Override
    public Pokemon save(Pokemon entity) {

        return this.repository.save(entity);
    }
}
