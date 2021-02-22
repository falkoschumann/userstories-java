/*
 * User Stories - Backend
 * Copyright (c) 2021 Falko Schumann <falko.schumann@muspellheim.de>
 */

package de.muspellheim.userstories.backend;

import de.muspellheim.userstories.backend.messagehandlers.CreateUserCommandHandler;
import de.muspellheim.userstories.backend.messagehandlers.UserQueryHandler;
import de.muspellheim.userstories.contract.MessageHandling;
import de.muspellheim.userstories.contract.messages.commands.CommandStatus;
import de.muspellheim.userstories.contract.messages.commands.CreateUserCommand;
import de.muspellheim.userstories.contract.messages.queries.UserQuery;
import de.muspellheim.userstories.contract.messages.queries.UserQueryResult;

public class MessageHandler implements MessageHandling {
  private CreateUserCommandHandler createUserCommandHandler;
  private UserQueryHandler userQueryHandler;

  public MessageHandler(UserRepository userRepository) {
    createUserCommandHandler = new CreateUserCommandHandler(userRepository);
    userQueryHandler = new UserQueryHandler(userRepository);
  }

  @Override
  public CommandStatus handle(CreateUserCommand command) {
    return createUserCommandHandler.handle(command);
  }

  @Override
  public UserQueryResult handle(UserQuery query) {
    return userQueryHandler.handle(query);
  }
}
