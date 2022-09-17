package ru.safin.communications.common.base;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@NoArgsConstructor
@EqualsAndHashCode(exclude = "id")
public abstract class BaseEntity {
  @Id
  @Getter
  public String id;
}