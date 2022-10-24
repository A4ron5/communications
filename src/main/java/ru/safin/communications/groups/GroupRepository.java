package ru.safin.communications.groups;

import org.springframework.stereotype.Repository;
import ru.safin.communications.common.base.BaseRepository;
import ru.safin.communications.groups.models.entities.Group;

import java.util.Optional;

@Repository
public interface GroupRepository extends BaseRepository<Group> {
    public Optional<Boolean> findByCreatorUserId(String userId);
}
