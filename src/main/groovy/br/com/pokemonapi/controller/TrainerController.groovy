package br.com.pokemonapi.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping

import br.com.pokemonapi.model.Trainer
import br.com.pokemonapi.model.WildPokemon
import br.com.pokemonapi.service.ApiService
import br.com.pokemonapi.service.WildPokemonService

@RequestMapping("/trainers")
class TrainerController {

    @Autowired
    private ApiService<Trainer> service;

    @Autowired
    private WildPokemonService wpService;

    @GetMapping("/{trainerId}")
    public Trainer findById(@PathVariable(name = "trainerId", required = true) Long trainerId) {

        return this.service.findById(trainerId).orElse(null);
    }

    @GetMapping
    public List<Trainer> findAll() {

        return this.service.findAll();
    }

    @GetMapping("/{trainerId}/pokemons")
    public List<WildPokemon> findWildPokemonsByTrainerId(@PathVariable(name = "trainerId", required = true) Long trainerId) {

        return this.wpService.findByTrainerId(trainerId);
    }

    @DeleteMapping("/{trainerId}")
    public boolean removeById(@PathVariable(name = "trainerId", required = true) Long trainerId) {

        return this.service.removeById(trainerId);
    }

    @PostMapping
    public Trainer save(@RequestBody(required = true) Trainer trainer) {

        return this.service.save(trainer);
    }

    @PutMapping
    public boolean update(@RequestBody(required = true) Trainer trainer) {

        this.service.save(trainer);
        return true;
    }
}
