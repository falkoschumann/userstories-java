/*
 * User Stories - Backend
 * Copyright (c) 2021 Falko Schumann <falko.schumann@muspellheim.de>
 */

package de.muspellheim.userstories.backend.messagehandlers;

import de.muspellheim.userstories.backend.UserRepository;
import de.muspellheim.userstories.contract.data.User;
import de.muspellheim.userstories.contract.messages.commands.CommandStatus;
import de.muspellheim.userstories.contract.messages.commands.CreateUserCommand;
import de.muspellheim.userstories.contract.messages.commands.Failure;
import de.muspellheim.userstories.contract.messages.commands.Success;

public class CreateUserCommandHandler {
  private final UserRepository repository;

  public CreateUserCommandHandler(UserRepository repository) {
    this.repository = repository;
  }

  public CommandStatus handle(CreateUserCommand command) {
    try {
      repository.setCurrentUser(new User(command.getName()));
      return new Success();
    } catch (Exception e) {
      return new Failure(e.getLocalizedMessage());
    }
  }
}
