package ru.safin.communications.common.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
public abstract class DomainRules {
  enum Distribution {
    RANDOM,
    SELF,
    LEADER,
    BIDDING
  }

  @Setter
  @Getter
  private Distribution lootDistribution;
}
