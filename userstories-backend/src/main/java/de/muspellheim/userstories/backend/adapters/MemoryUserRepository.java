/*
 * User Stories - Backend
 * Copyright (c) 2021 Falko Schumann <falko.schumann@muspellheim.de>
 */

package de.muspellheim.userstories.backend.adapters;

import de.muspellheim.userstories.backend.UserRepository;
import de.muspellheim.userstories.contract.data.User;

public class MemoryUserRepository implements UserRepository {
  private User currentUser;

  @Override
  public void setCurrentUser(User user) {
    currentUser = user;
  }

  @Override
  public User getCurrentUser() {
    return currentUser;
  }
}
