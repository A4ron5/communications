package ru.safin.communications.groups;

import org.springframework.stereotype.Service;
import ru.safin.communications.common.base.BaseService;
import ru.safin.communications.groups.dto.GroupDto;
import ru.safin.communications.groups.models.entities.Group;

@Service
public class GroupService extends BaseService<Group, GroupRepository> {
  public GroupService(GroupRepository repository) {
    super(repository);
  }

  public Group create(GroupDto groupDto) {
    return super.create(
            Group.builder()
                    .creatorUserId(groupDto.userId)
                    .name(groupDto.name)
                    .open(groupDto.open)
                    .participantsUserIds(groupDto.playersIds)
                    .build()
    );
  }

}
