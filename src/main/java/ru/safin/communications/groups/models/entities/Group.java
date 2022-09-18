package ru.safin.communications.groups.models.entities;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.mongodb.core.mapping.Document;
import ru.safin.communications.common.base.BaseEntity;
import ru.safin.communications.groups.models.embedded.Rules;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Document
@EqualsAndHashCode(callSuper = true)
public class Group extends BaseEntity {
  private String creatorUserId;
  private List<String> participantsUserIds;
  private String name;
  private Rules rules;

  @CreatedDate
  private LocalDateTime creationDate;

}
