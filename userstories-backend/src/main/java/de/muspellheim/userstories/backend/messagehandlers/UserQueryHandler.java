/*
 * User Stories - Backend
 * Copyright (c) 2021 Falko Schumann <falko.schumann@muspellheim.de>
 */

package de.muspellheim.userstories.backend.messagehandlers;

import de.muspellheim.userstories.backend.UserRepository;
import de.muspellheim.userstories.contract.messages.queries.UserQuery;
import de.muspellheim.userstories.contract.messages.queries.UserQueryResult;

public class UserQueryHandler {
  private final UserRepository repository;

  public UserQueryHandler(UserRepository repository) {
    this.repository = repository;
  }

  public UserQueryResult handle(UserQuery query) {
    try {
      var user = repository.getCurrentUser();
      return new UserQueryResult(user);
    } catch (Exception e) {
      return new UserQueryResult(null);
    }
  }
}
