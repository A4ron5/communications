package ru.safin.communications.groups.dto;

import lombok.*;

import javax.validation.constraints.*;
import java.util.List;

@Getter
@Setter
@EqualsAndHashCode
@ToString
@NoArgsConstructor
public class GroupDto {
  @NotBlank
  @Size(min = 3, max = 8)
  public String userId;

  @NotEmpty
  public List<String> playersIds;

  @Min(3)
  @Max(12)
  public String name;

  @NotNull
  public Boolean open;
}
