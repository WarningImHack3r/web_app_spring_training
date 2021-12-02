package fr.lernejo.todo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class TodoRepository implements CrudRepository<TodoIdentity, Long> {

	@Override
	public <S extends TodoIdentity> S save( S entity) {
		return null;
	}

	@Override
	public <S extends TodoIdentity> Iterable<S> saveAll(Iterable<S> entities) {
		return null;
	}

	@Override
	public Optional<TodoIdentity> findById(Long aLong) {
		return Optional.empty();
	}

	@Override
	public boolean existsById(Long aLong) {
		return false;
	}

	@Override
	public Iterable<TodoIdentity> findAll() {
		return null;
	}

	@Override
	public Iterable<TodoIdentity> findAllById(Iterable<Long> longs) {
		return null;
	}

	@Override
	public long count() {
		return 0;
	}

	@Override
	public void deleteById(Long aLong) {

	}

	@Override
	public void delete(TodoIdentity entity) {

	}

	@Override
	public void deleteAllById(Iterable<? extends Long> longs) {

	}

	@Override
	public void deleteAll(Iterable<? extends TodoIdentity> entities) {

	}

	@Override
	public void deleteAll() {

	}
}
