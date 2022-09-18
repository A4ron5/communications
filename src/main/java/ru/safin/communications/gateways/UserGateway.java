package ru.safin.communications.gateways;

import org.springframework.stereotype.Component;
import ru.safin.communications.groups.dto.gateway.UserWithName;

import java.util.Map;

@Component
public class UserGateway {

  final private Map<String, String> users = Map.of(
          "X142o", "Ivan",
          "L1d3f", "Oleg",
          "O4fm4m2", "Anna",
          "L3d0f", "Maria",
          "0l3dmkk", "Max",
          "kK38jn4", "Elena"
  );


  public UserWithName getUser(String userId) {
    final var userName = users.get(userId);

    if (null == userName) {
    }

    return UserWithName.builder()
            .name(userName)
            .userId(userId)
            .build();
  };
}
