/*
 * User Stories - Backend
 * Copyright (c) 2021 Falko Schumann <falko.schumann@muspellheim.de>
 */

package de.muspellheim.userstories.backend;

import de.muspellheim.userstories.contract.data.User;

public interface UserRepository {
  void setCurrentUser(User user) throws Exception;

  User getCurrentUser() throws Exception;
}
