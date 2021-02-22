/*
 * User Stories - Contract
 * Copyright (c) 2021 Falko Schumann <falko.schumann@muspellheim.de>
 */

package de.muspellheim.userstories.contract;

import de.muspellheim.userstories.contract.messages.commands.CommandStatus;
import de.muspellheim.userstories.contract.messages.commands.CreateUserCommand;
import de.muspellheim.userstories.contract.messages.queries.UserQuery;
import de.muspellheim.userstories.contract.messages.queries.UserQueryResult;

public interface MessageHandling {
  CommandStatus handle(CreateUserCommand command);

  UserQueryResult handle(UserQuery query);
}
