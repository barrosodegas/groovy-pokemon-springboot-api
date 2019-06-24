package br.com.pokemonapi.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

import br.com.pokemonapi.model.Pokemon
import br.com.pokemonapi.service.ApiService

@RestController
@RequestMapping("/pokemons")
class PokemonController {

    @Autowired
    private ApiService<Pokemon> service;

    @GetMapping("/{pokemonId}")
    public Pokemon findById(@PathVariable(name = "pokemonId", required = true) Long pokemonId) {

        return this.service.findById(pokemonId);
    }

    @GetMapping
    public List<Pokemon> findAll() {

        return this.service.findAll();
    }

    @DeleteMapping("/{pokemonId}")
    public boolean removeById(@PathVariable(name = "pokemonId", required = true) Long pokemonId) {

        return this.service.removeById(pokemonId);
    }

    @PostMapping
    public Pokemon save(@RequestBody(required = true) Pokemon pokemon) {

        return this.service.save(pokemon);
    }

    @PutMapping
    public boolean update(@RequestBody(required = true) Pokemon pokemon) {

        this.service.save(pokemon);
        return true;
    }
}
