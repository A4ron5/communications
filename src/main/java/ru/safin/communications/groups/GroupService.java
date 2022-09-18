package ru.safin.communications.groups;

import org.springframework.stereotype.Service;
import ru.safin.communications.common.base.BaseService;
import ru.safin.communications.groups.models.entities.Group;

@Service
public class GroupService extends BaseService<Group, GroupRepository> {
  public GroupService(GroupRepository repository) {
    super(repository);
  }

  public Group create(Group group) {
    return super.create(group);
  }

}
