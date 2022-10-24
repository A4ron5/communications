package ru.safin.communications.groups;

import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import ru.safin.communications.common.exceptions.BusinessException;

@Component
@RequiredArgsConstructor
public class GroupsValidator {
    private final GroupRepository groupRepository;

    public void canUserCreateGroup(String userId) {
        var userAlreadyInGroup = groupRepository.findByCreatorUserId(userId);

        if (userAlreadyInGroup.isPresent()) {
            throw BusinessException.create("User already in group");
        }
    }
}
