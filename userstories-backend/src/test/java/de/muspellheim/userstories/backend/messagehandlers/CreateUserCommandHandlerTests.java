/*
 * User Stories - Backend
 * Copyright (c) 2021 Falko Schumann <falko.schumann@muspellheim.de>
 */

package de.muspellheim.userstories.backend.messagehandlers;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.any;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertEquals;

import de.muspellheim.userstories.backend.adapters.MemoryUserRepository;
import de.muspellheim.userstories.contract.messages.commands.CreateUserCommand;
import de.muspellheim.userstories.contract.messages.commands.Success;
import org.junit.jupiter.api.Test;

class CreateUserCommandHandlerTests {
  @Test
  void handleSuccessfully() {
    var repository = new MemoryUserRepository();
    var handler = new CreateUserCommandHandler(repository);

    var status = handler.handle(new CreateUserCommand("Alice"));

    assertEquals(new Success(), status);
    assertThat(repository.getCurrentUser().getId(), is(any(String.class)));
    assertEquals("Alice", repository.getCurrentUser().getName());
  }
}
