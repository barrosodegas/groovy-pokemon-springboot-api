package br.com.pokemonapi.service

interface ApiService<T> {

    public T findById(Long entityId);

    public List<T> findAll();

    public boolean removeById(Long entityId);

    public T save(T entity);
}
