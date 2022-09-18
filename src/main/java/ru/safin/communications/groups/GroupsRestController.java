package ru.safin.communications.groups;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.safin.communications.groups.dto.GroupDto;
import ru.safin.communications.groups.models.entities.Group;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/groups")
public class GroupsRestController {

  @PostMapping("/create")
  public ResponseEntity<Group> createGroup(@Valid @RequestBody GroupDto groupDto) {
    return null;
  }

  @PutMapping ("/add/{id}")
  public ResponseEntity<Group> addToGroup(@PathVariable String id, @RequestBody GroupDto groupDto) {
    return null;
  }

  @DeleteMapping("delete/{id}")
  public ResponseEntity<Group> deleteFromGroup(@PathVariable String id, @RequestBody GroupDto groupDto) {
    return null;
  }
}
