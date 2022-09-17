package ru.safin.communications.common.base;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import ru.safin.communications.common.exceptions.BusinessException;

import java.util.List;

@RequiredArgsConstructor
@Slf4j
public abstract class BaseService<T extends BaseEntity, R extends BaseRepository<T>> {
  protected final R repository;

  public T get(String id) {
    log.info("Get entity with id={}", id);
    return repository.findById(id)
            .orElseThrow(() ->
                    BusinessException.create(String.format("not found entity with id %s", id))
            );
  }

  public T update(T object) {
    log.info("Update entity {}", object);
    return repository.save(object);
  }

  public T create(T object) {
    log.info("Create entity {}", object);

    String id = object.getId();
    if (repository.existsById(id)) {
      throw BusinessException.create(String.format("Entity with id=%s already exist", id));
    }

    return repository.save(object);
  }

  public void delete(String id) {
    var object = get(id);
    log.info("Delete entity {}", object);

    repository.delete(object);
  }

  public List<T> getAll() {
    log.info("Get all entities");
    return repository.findAll();
  }

}
