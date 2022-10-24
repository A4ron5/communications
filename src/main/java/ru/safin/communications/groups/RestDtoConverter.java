package ru.safin.communications.groups;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import ru.safin.communications.groups.dto.GroupDto;
import ru.safin.communications.groups.models.entities.Group;

@Mapper(componentModel = "spring")
public interface RestDtoConverter {

    Group convertFromGroupDto(GroupDto groupDto);

}
