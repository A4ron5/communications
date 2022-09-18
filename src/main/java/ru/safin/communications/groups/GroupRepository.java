package ru.safin.communications.groups;

import org.springframework.stereotype.Repository;
import ru.safin.communications.common.base.BaseRepository;
import ru.safin.communications.groups.models.entities.Group;

@Repository
public interface GroupRepository extends BaseRepository<Group> {
}
