/*
 * User Stories - Contract
 * Copyright (c) 2021 Falko Schumann <falko.schumann@muspellheim.de>
 */

package de.muspellheim.userstories.contract.messages.queries;

import de.muspellheim.userstories.contract.data.User;
import lombok.Value;

@Value
public class UserQueryResult {
  User user;
}
