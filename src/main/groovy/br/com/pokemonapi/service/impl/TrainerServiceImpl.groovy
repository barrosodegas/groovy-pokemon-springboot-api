package br.com.pokemonapi.service.impl

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

import br.com.pokemonapi.model.Trainer
import br.com.pokemonapi.repository.TrainerRepository
import br.com.pokemonapi.service.ApiService

@Service
class TrainerServiceImpl implements ApiService<Trainer> {

    @Autowired
    private TrainerRepository repository;

    @Override
    public Trainer findById(Long entityId) {

        return this.repository.findById(entityId).orElse(null);
    }

    @Override
    public List<Trainer> findAll() {

        return this.repository.findAll();
    }

    @Override
    public boolean removeById(Long entityId) {

        this.repository.deleteById(entityId);
        return true;
    }

    @Override
    public Trainer save(Trainer entity) {

        return this.repository.save(entity);
    }
}
