package ru.safin.communications.groups.dto;

import lombok.*;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

@Getter
@Setter
@EqualsAndHashCode
@ToString
@NoArgsConstructor
public class GroupDto {
  @NotNull
  public String userId;

  @NotEmpty
  public List<String> playersIds;

  @Min(3)
  @Max(12)
  public String name;
}
